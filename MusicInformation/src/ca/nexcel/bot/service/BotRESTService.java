package ca.nexcel.bot.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ca.nexcel.bot.model.Request;
import ca.utoronto.music.model.Track;

@Path("/bot")
public class BotRESTService {
	private BotService botService = new BotServiceImpl();
	
	@GET
	@Path("ping")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Track> getTrack() {
		Track track = new Track("test","it");
		List list = new ArrayList();
		list.add(track);
		return list;
	}
 
	@POST
	@Path("/send")
	@Consumes("text/plain")
	public void receiveMessage(String text) {
		String result = botService.send("Hello, World");
		System.out.println(text);
		System.out.println(result);
		//return Response.status(201).entity(result).build();
	}
	
}

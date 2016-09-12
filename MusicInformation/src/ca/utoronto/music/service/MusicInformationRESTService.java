package ca.utoronto.music.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.PathParam;

import ca.nexcel.bot.model.Request;
import ca.nexcel.bot.service.BotService;
import ca.nexcel.bot.service.BotServiceImpl;
import ca.utoronto.music.model.Track;

@Path("/json")
public class MusicInformationRESTService {
	
	private MusicInformationService musicInformationService = new MusicInformationServiceImpl();
	private BotService botService = new BotServiceImpl();

	@GET
	@Path("{singer}/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrack(@PathParam("singer") String singer) {
		return musicInformationService.getTrack(singer);
	}
	
	@GET
	@Path("getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Track> getTrack() {
		return musicInformationService.getAllTracks();
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrack(Track track) {
		musicInformationService.createTrack(track);
		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
	}
	
	

	
	@GET
	@Path("ping")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Track> ping() {
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

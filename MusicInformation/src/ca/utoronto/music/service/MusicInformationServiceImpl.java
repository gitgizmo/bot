package ca.utoronto.music.service;

	import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ca.utoronto.music.model.Track;

	public class MusicInformationServiceImpl implements MusicInformationService {
		
		private Map<String,Track> data = new HashMap<String,Track>();
		
		
		public MusicInformationServiceImpl () {
			data.put ("Bruce", new Track("The River", "Bruce"));
			data.put ("Kaleo", new Track("Way Down We Go", "Kaleo"));
			data.put ("Vance", new Track("Riptine", "Vance"));
			data.put ("Bram", new Track("Rinky Dinky Spider", "Bram"));
			data.put ("Metallica", new Track("Enter Sandman", "Metallica"));
		}
		
		

		public Track getTrack(String singer) {
			Track track =  data.get(singer);
			if (null == track) {
				track = new Track("Get it right!","Wacko");
			}
			
			return track;
		}

		public void createTrack(Track track) {
			System.out.println("Track saved : " + track);
		}



		@Override
		public List<Track> getAllTracks() {
			return new ArrayList<Track>(data.values());
		}
		
	}


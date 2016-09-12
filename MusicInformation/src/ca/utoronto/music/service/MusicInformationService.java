package ca.utoronto.music.service;

import java.util.List;

import ca.utoronto.music.model.Track;

public interface MusicInformationService {
	public abstract Track getTrack(String singer);
	public abstract List<Track> getAllTracks();
	public abstract void createTrack(Track track);
}
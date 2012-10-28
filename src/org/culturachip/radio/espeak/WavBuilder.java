package org.culturachip.radio.espeak;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.culturachip.radio.soundcloud.beans.Track;

public class WavBuilder {
	private String artistHeaderFile;
	private String trackHeaderFile;
	private String albumHeaderFile;

	public String getArtistHeaderFile() {
		return artistHeaderFile;
	}

	public void setArtistHeaderFile(String artistHeaderFile) {
		this.artistHeaderFile = artistHeaderFile;
	}

	public String getTrackHeaderFile() {
		return trackHeaderFile;
	}

	public void setTrackHeaderFile(String trackHeaderFile) {
		this.trackHeaderFile = trackHeaderFile;
	}

	public String getAlbumHeaderFile() {
		return albumHeaderFile;
	}

	public void setAlbumHeaderFile(String albumHeaderFile) {
		this.albumHeaderFile = albumHeaderFile;
	}

	public static void makeIntro(Track track) throws InterruptedException,
			IOException {
		List<String> command = new ArrayList<String>();
		command.add("espeak");
		command.add("-f " + buildIntroFile(track) + " ");
		command.add("-w " + buildWavFile(track) + " ");
		ProcessBuilder builder = new ProcessBuilder(command);
		builder.directory(new File(System.getProperty("user.home")));

		final Process godot = builder.start();

		godot.waitFor();
	}

	/**
	 * 
	 * @param track
	 *            Tema a listar
	 * @return path to audiofile
	 */
	public static String buildIntroFile(Track track) {
		return "";
	}

	public static String buildWavFile(Track track) {
		StringBuilder strb = new StringBuilder();
		strb.append("");
		return strb.toString();
	}
}

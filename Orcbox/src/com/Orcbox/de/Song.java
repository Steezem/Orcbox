package com.Orcbox.de;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class Song {
	private String title;
	private String interpret;
	private String album;

	private int length;
	private int size;

	public void play(String filename) {
		File file = new File(filename);
		try {
			AudioInputStream in = AudioSystem.getAudioInputStream(file);
			AudioInputStream din = null;
			AudioFormat baseFormat = in.getFormat();
			AudioFormat decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, baseFormat.getSampleRate(), 16,
					baseFormat.getChannels(), baseFormat.getChannels() * 2, baseFormat.getSampleRate(), false);
			din = AudioSystem.getAudioInputStream(decodedFormat, in);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getLength() {
		return length;
	}

	public int getSize() {
		return size;
	}

	public String title() {
		return title;
	}

	public String getInterpret() {
		return interpret;
	}

	public String getAlbum() {
		return album;
	}
}

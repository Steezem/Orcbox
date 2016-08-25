package com.Orcbox.de;

import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Orcbox {
	JFileChooser library = new JFileChooser();
	JFileChooser song = new JFileChooser();
	
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orcbox window = new Orcbox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Orcbox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		library.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		song.setFileSelectionMode(JFileChooser.FILES_ONLY);

		JButton btnPlay = new JButton("Play random song");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlay.setBounds(10, 126, 153, 23);
		frame.getContentPane().add(btnPlay);

		JButton btnBurnCd = new JButton("Burn CD");
		btnBurnCd.setBounds(331, 93, 93, 23);
		frame.getContentPane().add(btnBurnCd);

		JButton btnLibrary = new JButton("Open Library");
		btnLibrary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int status = library.showOpenDialog(null);
			}
		});
		btnLibrary.setBounds(10, 58, 118, 23);
		frame.getContentPane().add(btnLibrary);

		JButton btnCurrent = new JButton("Show current Song");
		btnCurrent.setBounds(10, 160, 153, 23);
		btnCurrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		frame.getContentPane().add(btnCurrent);

		JButton btnSong = new JButton("Open Song");
		btnSong.setBounds(10, 93, 118, 23);
		btnSong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int status = song.showOpenDialog(null);
			}
		});

		frame.getContentPane().add(btnSong);

		List list = new List();
		list.setBounds(259, 248, 129, 129);
		frame.getContentPane().add(list);
	}
}

package com.Orcbox.de;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Interface extends JFrame {
    JFileChooser library = new JFileChooser();
    JFileChooser song = new JFileChooser();

    /**
     * Launch the application.
     */

    public Interface() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	this.setBounds(100, 100, 450, 600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.getContentPane().setLayout(null);
	this.setVisible(true);
	library.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	song.setFileSelectionMode(JFileChooser.FILES_ONLY);
	
	JButton btnPlay = new JButton("Play random song");
	btnPlay.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnPlay.setBounds(10, 126, 153, 23);
	this.getContentPane().add(btnPlay);
	
	JButton btnBurnCd = new JButton("Burn CD");
	btnBurnCd.setBounds(331, 93, 93, 23);
	this.getContentPane().add(btnBurnCd);
	
	JButton btnLibrary = new JButton("Open Library");
	btnLibrary.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    int status = library.showOpenDialog(null);
		}
	});
	btnLibrary.setBounds(10, 58, 118, 23);
	this.getContentPane().add(btnLibrary);
	
	JButton btnCurrent = new JButton("Show current Song");
	btnCurrent.setBounds(10, 160, 153, 23);
	btnCurrent.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		ArrayList2D list = new ArrayList2D();
		list.InputSongdetails();
	    }
	});
	
	this.getContentPane().add(btnCurrent);
	
	JButton btnSong = new JButton("Open Song");
	btnSong.setBounds(10, 93, 118, 23);
	btnSong.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		int status = song.showOpenDialog(null);
	    
	    	}
	});
	
	getContentPane().add(btnSong);
	ArrayList2D list = new ArrayList2D();
	list.printList();
    }
}

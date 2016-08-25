package com.Orcbox.de;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;

public class Interface extends JFrame {
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
	
	JButton btnPlay = new JButton("Play random song");
	btnPlay.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnPlay.setBounds(10, 93, 118, 23);
	this.getContentPane().add(btnPlay);
	
	JButton btnBurnCd = new JButton("Burn CD");
	btnBurnCd.setBounds(331, 93, 93, 23);
	this.getContentPane().add(btnBurnCd);
	
	JButton btnLibrary = new JButton("Open Library");
	btnLibrary.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    int status = song.showOpenDialog(null);
		}
	});
	btnLibrary.setBounds(10, 67, 118, 23);
	this.getContentPane().add(btnLibrary);
	
	JButton btnCurrent = new JButton("Show current Song");
	btnCurrent.setBounds(10, 127, 131, 23);
	btnCurrent.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		ArrayList2D list = new ArrayList2D();
		list.InputSongdetails();
	    }
	});
	
	this.getContentPane().add(btnCurrent);
	
	JLabel lblSongdetails = new JLabel("Songdetails");
	lblSongdetails.setBounds(10, 175, 264, 68);
	getContentPane().add(lblSongdetails);
	ArrayList2D list = new ArrayList2D();
	list.printList();
    }
}

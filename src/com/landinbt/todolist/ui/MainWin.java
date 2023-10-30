package com.landinbt.todolist.ui;

import javax.swing.JFrame;

public class MainWin {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public MainWin() {
		initialize();
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

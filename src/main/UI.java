package main;


//UI Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 5996031708138701431L;
		//Stuff to create
		JPanel panel = new JPanel();
		JButton open_cmd_stream_button = new JButton("Open Command Line Stream Window");
		JButton open_file_stream_button = new JButton("Open File Stream Window");
		
	  UI() {
		  //Create window
		  super("Super Streamer");
		  setBounds(100,100,300,100); //position x, position y, size x, size y
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  Container con = this.getContentPane();
		  //Hey! Listen!
		  open_cmd_stream_button.addActionListener(this);
		  open_file_stream_button.addActionListener(this);
		  //Add stuff to create
		  con.add(panel);
		  panel.add(open_cmd_stream_button);
		  panel.add(open_file_stream_button);
		  //Request some focus
		  open_cmd_stream_button.requestFocus();
		  open_file_stream_button.requestFocus();
		  //Show my hard work
		  setVisible(true);
	  }

	public void actionPerformed(ActionEvent event) {
		//Where did you come from, where did you go? Where did you come from, Cotton eye Joe.
		Object source = event.getSource();
		//Do some magic
		if(source == open_cmd_stream_button) {
			new CMDS();
		} else if(source == open_file_stream_button) {
			new FS();
		}
	}
}

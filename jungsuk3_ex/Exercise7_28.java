package jungsuk3_ex;

import java.awt.*;
import java.awt.event.*;

class Exercise7_28 {
	public static void main(String[] args) {
		Frame f = new Frame();
//		EventHandler l = new EventHandler() ; 
		f.addWindowListener(new EventHandler());
//		f.addWindowListener(l);
	}
} 

class EventHandler extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0); 
	}
}

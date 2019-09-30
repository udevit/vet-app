package com.mx.cvi;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.mx.cvi.interfaz.LoginWindow;
import com.mx.cvi.interfaz.MainMenuWindow;

/**
 * 
 * @author OCG
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		//new LoginWindow().initComponents();
		new MainMenuWindow().initComponents();
	}
}

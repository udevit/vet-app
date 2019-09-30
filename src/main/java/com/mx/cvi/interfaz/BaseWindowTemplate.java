package com.mx.cvi.interfaz;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

/**
 * 
 * @author OCG
 *
 */
public class BaseWindowTemplate extends JFrame{

	private JDesktopPane desktop = new JDesktopPane();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public BaseWindowTemplate(){
		setTitle("Centro Veterinario Ixtepec");
		add(desktop);
	}
	
	/**
	 * @return the desktop
	 */
	public JDesktopPane getDesktop() {
		return desktop;
	}

	/**
	 * @param desktop the desktop to set
	 */
	public void setDesktop(JDesktopPane desktop) {
		this.desktop = desktop;
	}
	
}

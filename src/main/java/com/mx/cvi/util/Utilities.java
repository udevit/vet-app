package com.mx.cvi.util;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.mx.cvi.interfaz.LoginWindow;

public class Utilities {

	/**
	 * 
	 * @param imgPath
	 * @param width
	 * @param height
	 * @return
	 */
	public static ImageIcon getResizedImage(String imgPath, int width, int height){
		ImageIcon iconLogo = new ImageIcon(LoginWindow.class.getResource(imgPath));
	    Image scaleImage = iconLogo.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT);
	    return new ImageIcon(scaleImage);
	}
	
}

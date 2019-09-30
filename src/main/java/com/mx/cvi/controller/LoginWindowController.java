package com.mx.cvi.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.mx.cvi.interfaz.LoginWindow;
import com.mx.cvi.interfaz.MainMenuWindow;

public class LoginWindowController implements ActionListener{

	private LoginWindow login;
	
	/**
	 * 
	 * @param login
	 */
	public LoginWindowController(LoginWindow login){
		this.login = login;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == login.getLoginBtn()){
			if(!login.getUserTxt().getText().trim().isEmpty() && !new String(login.getPasswordTxt().getPassword()).trim().isEmpty()){
				login.dispose();
				new MainMenuWindow().initComponents();
			}else{
				JOptionPane.showMessageDialog(login, "Usuario o Contrasena estan vacios", "Centro Veterinario Ixtepec", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}

}

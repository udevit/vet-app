package com.mx.cvi.interfaz;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mx.cvi.controller.LoginWindowController;
import com.mx.cvi.util.Utilities;

/**
 * 
 * @author OCG
 *
 */
public class LoginWindow extends BaseWindowTemplate{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JInternalFrame form;
	private BufferedImage background;
	private JDesktopPane desktop;
	private JLabel userIconLbl;
	private JLabel passwordIconLbl;
	private JTextField userTxt;
	private JPasswordField passwordTxt;
	private JButton loginBtn;
	
	private JLabel version;
	
	/**
	 * 
	 */
	public LoginWindow(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//setUndecorated(true);
		setVisible(true);
	}
	
	public void initComponents(){
		form = new JInternalFrame("Bienvenido - Centro Veterinario Ixtepec", true, true, true, true );
		form.setClosable(false);
		form.setMaximizable(false);
		form.setResizable(false);
	    form.setSize(350,200);
	    
	    form.setLayout(null);
	    
	    userIconLbl = new JLabel(Utilities.getResizedImage("/com/mx/cvi/images/user_icon.png", 32, 32));
	    userIconLbl.setBounds(40, 20, 32, 32);
	    form.add(userIconLbl);
	    
	    userTxt = new JTextField();
	    userTxt.setBounds(100, 23, 160, 25);
	    form.add(userTxt);
	    
	    passwordIconLbl = new JLabel(Utilities.getResizedImage("/com/mx/cvi/images/password_icon.png", 32, 32));
	    passwordIconLbl.setBounds(40, 70, 32, 32);
	    form.add(passwordIconLbl);
	    
	    passwordTxt = new JPasswordField();
	    passwordTxt.setBounds(100, 76, 160, 25);
	    form.add(passwordTxt);
		
	    version = new JLabel("Software: v.0.1");
	    version.setBounds(250, 143, 100, 25);
	    form.add(version);
	    
	    loginBtn = new JButton("Entrar");
	    loginBtn.setBounds(180, 110, 80, 25);
	    loginBtn.addActionListener(new LoginWindowController(this));
	    form.add(loginBtn);
	    
	    //adding image
	    /*try{
	    	background = ImageIO.read(LoginWindow.class.getResourceAsStream("/com/mx/cvi/images/slider_pup.jpg"));
	    } catch (IOException e) {
            e.printStackTrace();
        }
	    
	    // A specialized layered pane to be used with JInternalFrames
	    desktop = new JDesktopPane() {
            private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                grphcs.drawImage(background, 0, 0, null);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(background.getWidth(), background.getHeight());
            }
        };*/
        
        //add(desktop); //adding to form
        
        setVisible(true);  //image
        
        Dimension desktopSize = getDesktop().getSize();
	    Dimension jInternalFrameSize = form.getSize();
	    form.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
	        (desktopSize.height- jInternalFrameSize.height)/2);
	    
	    form.setVisible(true);
	    
	    getDesktop().add(form);
	    
	    //desktop.add(form); //image
	}
	
	/**
	 * @return the login
	 */
	public JButton getLoginBtn() {
		return loginBtn;
	}

	/**
	 * @return the userTxt
	 */
	public JTextField getUserTxt() {
		return userTxt;
	}

	/**
	 * @return the passwordTxt
	 */
	public JPasswordField getPasswordTxt() {
		return passwordTxt;
	}
	
}

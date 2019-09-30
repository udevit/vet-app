package com.mx.cvi.controller;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class ServiceWindowController extends BaseWindowController{

	private JDesktopPane desktop;
	private JInternalFrame listService;
	private JInternalFrame addService;
	
	public ServiceWindowController(JDesktopPane desktop){
		this.desktop = desktop;
		createListTable();
		createAddForm();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	private void createListTable(){
		JInternalFrame form = new JInternalFrame("Servicios - Centro Veterinario Ixtepec", true, true, true, true );
	    form.setSize(350,200);
	    form.setFocusable(true);
	    Dimension desktopSize = desktop.getSize();
	    Dimension jInternalFrameSize = form.getSize();
	    form.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
	        (desktopSize.height- jInternalFrameSize.height)/2);
	    
	    form.setVisible(true);
	    
	    desktop.add(form);
	}

	private void createAddForm(){
		JInternalFrame form = new JInternalFrame("Agregar/Editar Servicios - Centro Veterinario Ixtepec", true, true, true, true );
	    form.setSize(350,200);
	    form.setFocusable(true);
	    Dimension desktopSize = desktop.getSize();
	    Dimension jInternalFrameSize = form.getSize();
	    form.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
	        (desktopSize.height- jInternalFrameSize.height)/2);
	    
	    form.setVisible(true);
	    
	    desktop.add(form);
	}
	
}

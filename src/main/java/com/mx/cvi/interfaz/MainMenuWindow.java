package com.mx.cvi.interfaz;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

import com.mx.cvi.controller.MainMenuWindowController;
import com.mx.cvi.controller.ServiceWindowController;
import com.mx.cvi.model.MenuModel;
import com.mx.cvi.util.Utilities;

public class MainMenuWindow extends BaseWindowTemplate{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage background = null;
	private List<MenuModel> menuModelList = new ArrayList<>();
	
	public MainMenuWindow(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setVisible(true);
		
		//create menu
		MenuModel menuSales = new MenuModel("Ventas", "Menu Ventas", "sales_icon.png", "");
		menuSales.getItems().add(new MenuModel("Agregar Venta", "Clic para registrar una venta", "money_in_icon.png", "SaleAction"));
		menuSales.getItems().add(new MenuModel("Corte de Caja", "Clic para realizar corte de caja ", "money_bag_icon.png", "EndOfDayAction"));
		
		MenuModel menuUsers = new MenuModel("Usuarios", "Clic para administrar los usuarios", "users_icon.png", "userAction");
		MenuModel menuPets = new MenuModel("Mascotas", "Clic para administrar las Mascotas", "pet_icon.png", "SaleAction");
		MenuModel menuServices = new MenuModel("Servicios", "Clic para administrar los Servicios", "services_icon.png", "ServiceAction");
		menuServices.getItems().add(new MenuModel("Listar", "Clic para listar los Servicios", "list_service_icon.png", "ServiceListAction",
			new ServiceWindowController(this.getDesktop())));
		menuServices.getItems().add(new MenuModel("Agregar", "Clic para agregar los Servicios", "add_icon_1.png", "ServiceAddAction",
			new ServiceWindowController(this.getDesktop())));

		MenuModel menuProducts = new MenuModel("Productos", "Clic para administrar los Productos", "shopping_car_icon.png", "ProducAction");
		menuProducts.getItems().add(new MenuModel("Articulos", "Clic para administrar Articulos", "items_icon.png", "ItemAction"));
		menuProducts.getItems().add(new MenuModel("Medicamentos", "Clic para administrar Medicamentos", "pilds_icon.png", "MedicineAction"));
		menuProducts.getItems().add(new MenuModel("Vacunas", "Clic para administrar Vacunas", "injection_icon.png", "InjectionAction"));
		menuProducts.getItems().add(new MenuModel("Alimentos", "Clic para administrar Alimentos", "food_icon.png", "FoodAction"));
		
		MenuModel menuShifts = new MenuModel("Turnos", "Clic para administrar los Turnos", "clock_icon.png", "ShiftAction");
		MenuModel menuAbout = new MenuModel("Acerca de...", "Clic para conocer acerca del Sistema", "about_icon.png", "AboutAction");
		
		menuModelList.add(menuSales);
		menuModelList.add(menuUsers);
		menuModelList.add(menuPets);
		menuModelList.add(menuServices);
		menuModelList.add(menuProducts);
		menuModelList.add(menuShifts);
		menuModelList.add(menuAbout);
	}
	
	public void initComponents(){
        JMenuBar menuBar = new JMenuBar();
        
        for(MenuModel item : menuModelList){
	        JMenu menu = new JMenu(item.getMenuName());
	        menu.setActionCommand(item.getActions());
	        menu.addActionListener(new MainMenuWindowController());
	        menu.setToolTipText(item.getToolTip());
			menu.setHorizontalTextPosition(SwingConstants.CENTER);
	        menu.setVerticalTextPosition(SwingConstants.BOTTOM);
	        menu.setIcon(Utilities.getResizedImage("/com/mx/cvi/images/" + item.getIcon(), 60, 60));
	        
	        if(!item.getItems().isEmpty()){
	        	for(MenuModel subMenu : item.getItems()){
	        		JMenuItem menuItem = new JMenuItem(subMenu.getMenuName());
	        		menuItem.setActionCommand(subMenu.getActions());
	        		menuItem.addActionListener(subMenu.getController());
	        		menuItem.setToolTipText(subMenu.getToolTip());
	        		menuItem.setIcon(Utilities.getResizedImage("/com/mx/cvi/images/" + subMenu.getIcon(), 40, 40));
	        		menu.add(menuItem);
	        	}
	        }
	        
	        menuBar.add(menu);
        }
        
		setJMenuBar(menuBar);
        
	}
	
}

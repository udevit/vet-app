package com.mx.cvi.model;

import java.util.ArrayList;
import java.util.List;

import com.mx.cvi.controller.BaseWindowController;

/**
 * 
 * @author OCG
 *
 */
public class MenuModel {
	private String menuName;
	private String toolTip;
	private String icon;
	private String actions;
	private List<MenuModel> items;
	private BaseWindowController controller;
	
	/**
	 * 
	 * @param menuName
	 * @param toolTip
	 * @param icon
	 * @param actions
	 */
	public MenuModel(String menuName, String toolTip, String icon, String actions){
		this.menuName = menuName;
		this.toolTip = toolTip;
		this.icon = icon;
		this.actions = actions;
	}
	
	public MenuModel(String menuName, String toolTip, String icon, String actions, BaseWindowController controller){
		this.menuName = menuName;
		this.toolTip = toolTip;
		this.icon = icon;
		this.actions = actions;
		this.controller = controller;
	}
	
	/**
	 * @return the menuName
	 */
	public String getMenuName() {
		return menuName;
	}
	/**
	 * @param menuName the menuName to set
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	/**
	 * @return the toolTip
	 */
	public String getToolTip() {
		return toolTip;
	}
	/**
	 * @param toolTip the toolTip to set
	 */
	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
	}
	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * @return the actions
	 */
	public String getActions() {
		return actions;
	}
	/**
	 * @param actions the actions to set
	 */
	public void setActions(String actions) {
		this.actions = actions;
	}
	/**
	 * @return the items
	 */
	public List<MenuModel> getItems() {
		if(items == null)
			items = new ArrayList<>();
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(List<MenuModel> items) {
		this.items = items;
	}

	/**
	 * @return the controller
	 */
	public BaseWindowController getController() {
		return controller;
	}

	/**
	 * @param controller the controller to set
	 */
	public void setController(BaseWindowController controller) {
		this.controller = controller;
	}
	
}

package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;

@Service
public class MenuItemService {

	
	@Autowired
	MenuItemDao Dao;
	
	public List<MenuItem> getMenuItemListCustomer(){
		return Dao.getMenuItemListCustomer();
	}
	
	public MenuItem getMenuItem(long id) {
		return Dao.getMenuItem(id);
	}
	
	public void modifyMenuItem(MenuItem menuItem) {
		Dao.modifyMenuItem(menuItem);
	}
}

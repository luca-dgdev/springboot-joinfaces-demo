package com.example.demo.managedbean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;

import org.springframework.stereotype.Component;

import com.example.demo.model.Item;

@Component
@ViewScoped
public class ItemMBean implements Serializable {

	private List<Item> itemList;

	public ItemMBean() {
		super();
		itemList = Arrays.asList(new Item(1L, "item-1"), new Item(2L, "item-2"));
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

}

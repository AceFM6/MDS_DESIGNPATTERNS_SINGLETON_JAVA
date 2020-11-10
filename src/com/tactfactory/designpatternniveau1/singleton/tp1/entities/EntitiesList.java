package com.tactfactory.designpatternniveau1.singleton.tp1.entities;

import java.util.ArrayList;
import java.util.List;

public class EntitiesList {

	private EntitiesList() {
		
		List<Entity1> result = new ArrayList<Entity1>();
		
	    for (int i = 0; i < 20; i++) {
	      Entity1 e1 = new Entity1();
	      e1.setId(i % 15);
	      e1.setData("data " + i);
	      result.add(e1);
	    }
	    
	    this.list = result;
	    
	    this.id = list.size() - 1;
	}
	
	private static EntitiesList INSTANCE = null;
	private int id;
	private List<Entity1> list;
	
	public static synchronized EntitiesList getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new EntitiesList(); 
        }
        return INSTANCE;
    }
	
	public void add() {
		this.id ++;
		Entity1 e = new Entity1();
		e.setId(this.id);
		e.setData("data " + this.id);
		list.add(e);
	}
	
	public List<Entity1> getList() {
		return this.list;
	}
	
	public void remove() {
	}
	
}

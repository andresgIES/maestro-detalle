package com.co.services.interfaces;

import java.util.List;

public interface ICRUD <T>{
	
	public void save();
	
	public void update ();
	
	public void delete ();
	
	public List<T> listAll ();

}

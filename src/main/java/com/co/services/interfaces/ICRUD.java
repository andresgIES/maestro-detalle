package com.co.services.interfaces;

import java.util.List;

public interface ICRUD <D,E>{
	
	public void save(D d);
	
	public void update (D d);
	
	public void delete (D d);
	
	public List<D> listAll ();

}

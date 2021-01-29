package com.co.services;

import java.util.List;

public interface ICRUD <D>{
	
	public void save(D d);
	
	public void update (D d);
	
	public void delete (D d);
	
	public List<D> listAll ();

}

package com.co.services.adapter;

public interface AdapterFull <D,E>{
	
	public D convertTo (E e);
	
	public E convertFrom (D d);

}

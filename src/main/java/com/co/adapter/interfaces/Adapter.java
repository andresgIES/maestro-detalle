package com.co.adapter.interfaces;

public interface Adapter <D,E>{
	
	public D convertTo (E e);
	
	public E convertFrom (D d);

}

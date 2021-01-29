package com.co.services.adapter;

public interface AdapterPartial<D, E> {

	public D convertTo(E e);

	public E convertFrom(D d);
}

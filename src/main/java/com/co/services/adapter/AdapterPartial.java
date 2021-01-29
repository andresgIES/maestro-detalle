package com.co.services.adapter;

public interface AdapterPartial<D, E> {

	public D convertToWithPropertiesNull(E e);

	public E convertFromWithPropertiesNull(D d);
}

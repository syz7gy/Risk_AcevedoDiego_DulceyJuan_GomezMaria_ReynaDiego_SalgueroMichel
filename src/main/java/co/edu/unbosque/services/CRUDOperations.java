package co.edu.unbosque.services;

import co.edu.unbosque.util.MyLinkedList;

public interface CRUDOperations<T> {

	public int create(T data);

	public MyLinkedList<T> getAll();

	public int deleteById(Long id);

	public int updateById(Long id, T newData);

	public long count();

	public boolean exists(Long id);
}

package foo.bar.entity.dao;

import java.util.List;

public interface GenericDao<T> {
	public boolean insert(T entity);
	public boolean update(T entity);
	public boolean delete(T entity);
	public T get(int id);
	public List<T> list();
}
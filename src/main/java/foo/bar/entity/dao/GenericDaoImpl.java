package foo.bar.entity.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class GenericDaoImpl<T> implements GenericDao<T> {	
	
	private final Class<T> entityClass;

    public GenericDaoImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

	@Override
	public boolean insert(T entity) {			
		System.out.println(entity.getClass().getSimpleName());
		return false;
	}

	@Override
	public boolean update(T entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(T entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
}



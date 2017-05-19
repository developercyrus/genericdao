package foo.bar.client;

import foo.bar.entity.Company;
import foo.bar.entity.Person;
import foo.bar.entity.dao.GenericDao;
import foo.bar.entity.dao.GenericDaoImpl;

public class Main {
	public static void main(String[] args) {
		GenericDao<Person> personDao = new GenericDaoImpl<Person>(Person.class);
		Person p = new Person();
		personDao.insert(p);
		
		GenericDao<Company> companyDao = new GenericDaoImpl<Company>(Company.class);
		Company c = new Company();
		companyDao.insert(c);
	}
}

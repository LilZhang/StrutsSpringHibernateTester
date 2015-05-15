package oops.exercise876;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PersonDaoHibernate extends HibernateDaoSupport implements PersonDao {

	@Override
	public Person get(Integer id) {
		return getHibernateTemplate().get(Person.class, id);
	}

	@Override
	public Integer save(Person person) {
		return (Integer)getHibernateTemplate().save(person);
	}

	@Override
	public void update(Person person) {
		getHibernateTemplate().update(person);
		
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
		
	}

	@Override
	public void delete(Person person) {
		getHibernateTemplate().delete(person);
		
	}

	@Override
	public List<Person> findByName(String name) {
		return (List<Person>)getHibernateTemplate().find("from Person p where p.name = ?",name);
	}

	@Override
	public List findAllPerson() {
		return (List<Person>)getHibernateTemplate().find("from Person");
	}

	@Override
	public long getPersonNumber() {
		return (long)getHibernateTemplate().find("select count(*) from Person as p").get(0);
	}

}

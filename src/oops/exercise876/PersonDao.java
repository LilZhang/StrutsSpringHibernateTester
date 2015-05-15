package oops.exercise876;

import java.util.List;

public interface PersonDao {
	public Person get(Integer id);
	public Integer save(Person person);
	public void update(Person person);
	public void delete(Integer id);
	public void delete(Person person);
	public List<Person> findByName(String name);
	public List findAllPerson();
	public long getPersonNumber();
}

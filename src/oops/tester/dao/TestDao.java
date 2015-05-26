package oops.tester.dao;

import java.util.List;

import oops.tester.domain.Test;

public interface TestDao {
	Test get(Integer id);
	Integer save(Test test);
	void update(Test test);
	void delete(Test test);
	void delete(Integer id);
	List<Test> findAll();
	List<Test> findByText(String text);
}

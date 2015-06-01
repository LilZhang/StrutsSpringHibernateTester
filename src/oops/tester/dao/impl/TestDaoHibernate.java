package oops.tester.dao.impl;

import java.util.List;

import oops.tester.dao.TestDao;
import oops.tester.domain.Test;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class TestDaoHibernate extends HibernateDaoSupport implements TestDao {

	@Override
	public Test get(Integer id) {
		return getHibernateTemplate().get(Test.class, id);
	}

	@Override
	public Integer save(Test test) {
		return (Integer)getHibernateTemplate().save(test);
	}

	@Override
	public void update(Test test) {
		getHibernateTemplate().update(test);
		
	}

	@Override
	public void delete(Test test) {
		getHibernateTemplate().delete(test);
		
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
		
	}

	@Override
	public List<Test> findByText(String text) {
		return (List<Test>)getHibernateTemplate().find("from Test as t where t.testString like ?","%"+text+"%");
		//return (List<Test>)getHibernateTemplate().find("from Test as t where t.testString = ?",text);
	}

	@Override
	public List<Test> findAll() {		
		return (List<Test>)getHibernateTemplate().find("from Test");
	}

}

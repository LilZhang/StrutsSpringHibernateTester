package oops.tester.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oops.tester.dao.TestDao;
import oops.tester.domain.Test;
import oops.tester.service.TsManager;
import oops.tester.vo.TestBean;

public class TsManagerImpl implements TsManager {
	private TestDao testDao;
	
	
	public TestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	@Override
	public int write(String text) {
		Test t = new Test();		
		t.setTestString(text);
		t.setWriteInTime(new Date());
		int tid = testDao.save(t);
		return tid;
		
	}

	@Override
	public List<TestBean> read(String text) {
		List<Test> tests = testDao.findByText(text);
		List<TestBean> result = new ArrayList<TestBean>();
		for(Test t : tests)
		{
			result.add(new TestBean(t.getId(),t.getTestString(),t.getWriteInTime()));
		}
		return result;
	}

}

package oops.tester.service;

import java.util.List;

import oops.tester.vo.TestBean;

public interface TsManager {
	int write(String text);
	List<TestBean> read(String text);
}

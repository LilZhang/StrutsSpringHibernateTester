package oops.tester.action;

import java.util.List;

import oops.tester.service.TsManager;

import com.opensymphony.xwork2.ActionSupport;

public class TestSearchAction extends ActionSupport {
	public static final String NONE = "none";	
	private List tbs;
	private String searchText;
	private String stip;
	private TsManager tsManager;
	
	public List getTbs() {
		return tbs;
	}
	public void setTbs(List tbs) {
		this.tbs = tbs;
	}
	public String getSearchText() {
		return searchText;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	public String getStip() {
		return stip;
	}
	public void setStip(String stip) {
		this.stip = stip;
	}	
	public void setTsManager(TsManager tsManager) {
		this.tsManager = tsManager;
	}
	public String execute()throws Exception
	{
		tbs = tsManager.read(getSearchText());
		if(tbs.equals(null))
		{
			setStip("NULL !");
		}
		else
		{
			setStip("查询完成,信息如下:");
		}
		return SUCCESS;
	}
	
}

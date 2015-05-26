package oops.tester.action;

import oops.tester.service.TsManager;

import com.opensymphony.xwork2.ActionSupport;

public class TestWriteAction extends ActionSupport {
	private String text;
	private String wtip;
	private TsManager tsManager;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getWtip() {
		return wtip;
	}
	public void setWtip(String wtip) {
		this.wtip = wtip;
	}	
	public void setTsManager(TsManager tsManager) {
		this.tsManager = tsManager;
	}
	public String execute() throws Exception
	{
		if(getText() != null)
		{
			tsManager.write(getText());
			setWtip("Write In Success :"+text);			
		}
		else
		{
			setWtip("Empty Text");			
		}
		return SUCCESS;
	}
	
}

package oops.exercise876;

import com.opensymphony.xwork2.Action;

public class RegistAction implements Action {
	private Person person;
	private String tip;
	private RegService regService;
	
	
	
	
	public Person getPerson() {
		return person;
	}




	public void setPerson(Person person) {
		this.person = person;
	}




	public String getTip() {
		return tip;
	}




	public void setTip(String tip) {
		this.tip = tip;
	}




	public void setRegService(RegService regService) {
		this.regService = regService;
	}




	@Override
	public String execute() throws Exception {
		if(regService.regist(person)){
			setTip("×¢²á³É¹¦£¡");
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

}

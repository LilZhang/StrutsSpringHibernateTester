package oops.exercise876;

public class RegServiceImpl implements RegService {

	private PersonDao personDao;
	
	public void setPersonDao(PersonDao personDao){
		this.personDao=personDao;
	}
	
	@Override
	public boolean regist(Person person) {
		int result = personDao.save(person);
		if(result>0){
			return true;
		}else{
			return false;
		}
	}
	
}

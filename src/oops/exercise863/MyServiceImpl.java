package oops.exercise863;

public class MyServiceImpl implements MyService {

	@Override
	public boolean valid(String username, String pass) {
		if(username.equals("lilzhang")&&pass.equals("123456"))
		{
			return true;			
		}
		else
		{
			return false;
		}
	}
	
}

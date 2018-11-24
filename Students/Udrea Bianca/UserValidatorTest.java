package lab7;

import org.junit.Test;

public class UserValidatorTest{
	User user1=new User("2980403123210");
	User user2=new User("2980403046210");
	UserValidator userValidator1=new UserValidator();
	UserValidator userValidator2=new UserValidator();
	@Test
	public void testValidUsers() {
		try {
			userValidator1.validate(user1);
		}
		catch(UserValidationFailedException exception) {
			System.out.println("It wasn't validated 1");
		}
		
		
		
	}

	@Test(expected = UserValidationFailedException.class)
	public void testInvalidUser() {
		try {
			userValidator1.validate(user2);
		}
		catch(UserValidationFailedException exception) {
			System.out.println("It wasn't validated 2");
		}
		
	}
}
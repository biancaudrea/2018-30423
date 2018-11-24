package lab7;
import java.util.Arrays;
import java.util.List;

public class UserValidator {

	public List<String> cityCodes = Arrays.asList("125", "223", "478");

	// UserValidationFailedException
	public void validate(User user) throws UserValidationFailedException{
		// SSN
		// GYYMMDDCCCXYZ - 13 characters long
		// G - gender (1/2)
		// YY - year
		// MM - month
		// DD - day
		// CCC - city code
		// XYZ - any characters
		String ssnChecked=user.getSsn();		
			if(ssnChecked.length()!=13)
		{
			throw new UserValidationFailedException("Length is not good");
		}
		char[] ssnAsCharArray =ssnChecked.toCharArray();
		String gender=String.copyValueOf(ssnAsCharArray,0,1);
			if(gender!="1" && gender!="2")
			{
				throw new UserValidationFailedException("Gender is not good");
			}
		String month=String.copyValueOf(ssnAsCharArray,3,2);
		int monthInteger = Integer.parseInt(month);
		if(monthInteger>12)
		{
			throw new UserValidationFailedException("Month is not good");
		}
		String day=String.copyValueOf(ssnAsCharArray,5,2);
		int dayInteger = Integer.parseInt(day);
		if(dayInteger>31)
		{
			throw new UserValidationFailedException("Day is not good");
		}
		String cityCode=String.copyValueOf(ssnAsCharArray,7,3);
		if(cityCode!="125" && cityCode!="223" && cityCode!="478")
		{
			throw new UserValidationFailedException("City is not good");
		}
	}
		
}
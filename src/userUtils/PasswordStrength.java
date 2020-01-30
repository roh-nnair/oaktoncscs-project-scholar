package userUtils;

public class PasswordStrength 
{
	private static final String SPEC_CHARS = "!@#$%^&*()_-+=\\|][}{//<>`~";
	
	public static boolean validatePass(String pass)
	{
		return hasSpecChars(pass) && hasUpperCase(pass) && hasLowerCase(pass) && hasNums(pass);
	}
	
	private static boolean hasSpecChars(String s)
	{
		for(int i = 0; i < s.length(); i++)
			if(SPEC_CHARS.indexOf(s.charAt(i))!=-1)
				return true;
		return false;
	}
	
	private static boolean hasUpperCase(String s) {
		for(int i = 0; i< s.length(); i++)
			if((int)s.charAt(i) >= 'A' && (int)(s.charAt(i))<= 'Z')
				return true;
		return false;
	}
	
	private static boolean hasLowerCase(String s) {
		for(int i = 0; i< s.length(); i++)
			if((int)s.charAt(i) >= 'a' && (int)(s.charAt(i))<= 'z')
				return true;
		return false;
	}
	
	private static boolean hasNums(String s) {
		for(int i = 0; i< s.length(); i++)
			if((int)s.charAt(i) >= '0' && (int)(s.charAt(i))<= '9')
				return true;
		return false;
	}
}

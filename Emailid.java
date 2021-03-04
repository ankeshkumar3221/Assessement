import java.util.*;
import java.util.regex.Pattern;
public class Emailid {
	
	public static void validationEmail(String str) {
		
		String emailCheck = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
		Pattern pat = Pattern.compile(emailCheck); 
		if (str == null) {
			System.out.println("Enter your mail to check!");
		}
		else {
			boolean bool1 = pat.matcher(str).matches();
			if(bool1 == true) {
				System.out.println(str+" is valid");
			}
			else {
				System.out.println(str+" is not valid");
			}
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string :");
		String str = sc.next();
		
		validationEmail(str);
		System.out.println("THANK YOU");	
		
		
	}

}

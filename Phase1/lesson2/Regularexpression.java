package lesson2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regularexpression {
	
	public static void main(String[] args) {
			String regex="[a-z]+";
			String input="tat";
			String input2="tat1";
			
			Pattern pattern= Pattern.compile(regex);
			
			Matcher match= pattern.matcher(input);
			Matcher match2= pattern.matcher(input2);
			
			if (match.matches()) {
				System.out.println("Pattern1 Matched");
			}
			else {
				System.out.println("Invalid Input1");
			}
			
			if (match2.matches()) {
				System.out.println("Pattern2 Matched");
			}
			else {
				System.out.println("Invalid Input2");
			}
			
			
		
	}

}

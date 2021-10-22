package week3.day2.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
String payment = "PayPal India";
char[] charArray = payment.toCharArray();
Set<Character> charSet = new HashSet<Character>();
Set<Character> dupCharSet = new HashSet<Character>();

for (int i = 0; i < charArray.length; i++) {
	charSet.add(charArray[i]);
	if(charSet.equals(charSet.add(charArray[i]))) {
		dupCharSet.add(charArray[i]);
	}
}for (Character character : dupCharSet) {
	System.out.println(character);
	
}

 
	}

}

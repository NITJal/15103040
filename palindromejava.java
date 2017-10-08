package assignments;
import java.util.*;

public class palindromejava {

	public static void main(String[] args) {
		String str;
		Scanner obj = new Scanner(System.in);
		str=obj.nextLine();
		obj.close();
		String revstring="";
		 
		for(int i=str.length()-1;i>=0;--i){
		revstring +=str.charAt(i);
		}
		 
		System.out.println(revstring);
		 
		if(revstring.equalsIgnoreCase(str)){
		System.out.println("The string is Palindrome");
		}
		else{
		System.out.println("Not Palindrome");
		}

	}

}

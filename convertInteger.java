package question2;
import java.util.Scanner; 
public class convertInteger {
	private static Scanner reader;
public static void main(String[] args)
{
	//	int myStringToInteger(String str) {
			reader = new Scanner(System.in);
			System.out.println("S=");
			String str = reader.nextLine(); //input string
			
		    int answer = 0, factor = 1;
		    for (int i = str.length()-1; i >= 0; i--) {
		        answer += (str.charAt(i) - '0') * factor;
		        factor *= 10;
		    }
		   System.out.print(answer);
		//	return;
}
		
	}
//}



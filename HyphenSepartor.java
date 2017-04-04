import java.util.Scanner; 
public class HyphenSepartor {

	private static Scanner reader;

	public static void main(String[] args)
	{
	reader = new Scanner(System.in);
	System.out.println("S=");
	String i = reader.nextLine(); //input string
	
	System.out.println("K=");
	int n = reader.nextInt(); //input number
	
	String input = i.replaceAll("-", ""); //remove hyphens from string
	
	input = input.toUpperCase(); //convert all letters uppercase
	
	StringBuilder str = new StringBuilder(input);
	int idx = str.length() - n;

	while (idx > 0)
	{
	    str.insert(idx, "-");
	    idx = idx - n;
	}
	System.out.println(str.toString());
	
}
	
}
package strings;

public class ReverseString {

	public static void main(String[] args) {
		String str="Rohit";
		String revStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr =revStr + str.charAt(i);
		}
		System.out.println("reverse of the string: " + revStr);
	}

}

package demo_jun25;
public class ReverseNumber {
	public static void main(String[] args) {
		
		//if you / by 10--> ignore the last digit 
		    //and take the remaining
		
		// if you % by 10--> take the last digit
	int num =12321;
	int num1= num;
	System.out.println("original value of num : " + num);//12321
	int rev=0;
	
	while(num != 0)
	{
	 rev  =   rev*10 + num%10;
		
		 	num	=  num/10;
	
	}
 System.out.println("reverse of the number is : " + rev);
 System.out.println("current value of num is : " + num);//0
  if (num1==rev)
  {
	  System.out.println("Palindrome");
  }
  else
  {
	  System.out.println("NOT Palindrome");
  }
 
	}//end of main

}//end of class

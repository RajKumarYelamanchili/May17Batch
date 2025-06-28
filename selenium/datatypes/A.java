package datatypes;

public class A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
		for (int j=5;j>=i;j--) {
			System.out.print("*");
			Thread.sleep(1000);
		}
		System.out.println();
		Thread.sleep(1000);

	}

}
}
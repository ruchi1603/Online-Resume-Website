import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isprime = true;
				for(int i = 2; i < n; i++) {
					if(n % i == 0) {
						isprime = false;
						break;
					}
				}
		if(isprime) {
			System.out.println("Prime no");
		}
		else
			System.out.println("Not prime");

	}

}

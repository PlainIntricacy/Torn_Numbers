import java.util.Scanner;

public class torn {

	public static void main(String args[]){
		
		System.out.println("Welcome.");
		System.out.println("A torn number is a four digit number that is equal to the sum between its first two digits and last two digits, squared");
		System.out.println("");
		
		System.out.println("Choose an option:");
		System.out.println("1. Verify a number");
		System.out.println("2. Search for torn numbers");
		
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		
		if(i==1){
			System.out.println("Please enter a four digit number to be verified:");
			int q = input.nextInt();
			while(q<1000||q>9999){
				System.out.println("Incorrect input. Please enter a four digit number.");
				q = input.nextInt();
			}
				print_verify(q);
		}
		else
			if(i==2){
				boolean found=false;
				System.out.println("Searching for all torn numbers...");
				for(int z=1000;z<=9999;z++){
					if(print_search(z)==true){
						System.out.println(z);
						found=true;
					}
				}
				if(found==false){
					System.out.println("No torn numbers found!");
				}
			}
			else
			{
				System.out.println("Incorrect input. Retry.");
			}
		input.close();
	}
	
	public static int print_verify(int x){
		int a = x/100;
		int b = x%100;
		int c = a + b;
		if(c*c==x){
			System.out.println(x + " is a torn number!");
			return 0;
		}
		else{
			System.out.println(x + " is not a turn number!");
			return 0;
		}
	};
	
	public static boolean print_search(int x){
		int a = x/100;
		int b = x%100;
		int c = a + b;
		if(c*c==x){
			return true;
		}
		else{
			return false;
		}
	};
	
	
}

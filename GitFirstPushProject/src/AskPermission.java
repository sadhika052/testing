import java.util.Scanner;

public class AskPermission {

	public static void main(String[] args) {

		System.out.println("Enter your condition....");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//sc.nextLine();
		System.out.println("Do you give permission? Y/N  ");
		String sp = sc.next();
		
		if(sp.equals("Y") && !s.contains("smok")) {
			System.out.println("Permission granted");
		}
		else {
			System.out.println("Sorry user!!.. We are unable to proceed your request...");
		}
		
		System.out.println("Do you have any other request? Y/N");
		String f = sc.next();
		if(f.equals("Y")) {
			System.out.println("Enter your condition....");
			sc.next();
			String st = sc.nextLine();
			//sc.nextLine();
			System.out.println("Do you give permission? Y/N  ");
			String sp1 = sc.next();
			
			if(sp1.equals("Y") && !st.contains("smok")) {
				System.out.println("Permission granted");
			}
			else {
				System.out.println("Sorry user!!.. We are unable to proceed your request...");
			}
			
		}
		else {
			System.out.println("Thanks for your response..");
		}
		
	}

}

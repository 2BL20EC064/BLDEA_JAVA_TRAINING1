package TrainingCodes;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author hp
 *
 */
public class pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);// TODO Auto-generated method stub
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && i<=(n/2)) || (j==(n-1) && i<=(n/2)) || (i+j)==(n-1)+(n/2) || (i-j)==(n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");	
			for(int j=0;j<n;j++) {
				if(j==0 || (i+j)==(n/2) || (i-j)==(n/2) ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();	
		
			
		}
	}

}

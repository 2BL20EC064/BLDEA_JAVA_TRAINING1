package TrainingCodes;
/**
 * 
 */

/**
 * @author hp
 *
 */ 
import java.util.Scanner;
public class universalbatch1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);// TODO Auto-generated method stub
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j<=6) || j==3 || (i==(n-1) && j<=6)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || (i==(n-1) && j<=(n/2))) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n/2) || (i==0 && j<=(n/2)) || i==(n-1) && j<=(n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
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
				if(j==0 || (i==0 && j<=(n/2)) || (i==(n/2) && j<=(n/2)) || i==(n-1) && j<=(n/2)  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==6 || (i==j && j!=4 && j!=(n/2) && j!=7 && j!=8 && j!=9 && j!=(n-1)) || (i+j)==6 && j!=2 && j!=1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((i==j && j!=4 && j!=5 && j!=6 && j!=7 && j!=8 && j!=9 && j!=(n-1)) || ((i+j)==6 && j!=2 && j!=1 && j!=0) || (j==3 && i!=0 && i!=1 && i!=2 )) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==6 || (i==j && j!=4 && j!=(n/2) && j!=7 && j!=8 && j!=9 && j!=(n-1)) || (i+j)==6 && j!=2 && j!=1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n/2) || (i==0 && j<=(n/2)) || i==(n-1) && j<=(n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==3 || (i==0 && j<=6)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n/2) || (i==(n/2) && j<=(n/2))) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j<=(n/2)) || (i==(n/2) && j<=(n/2)) || i==(n-1) && j<=(n/2)  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j<(n/2) ) || (j==(n/2) && i!=0 && i!=(n/2)) || (i==(n/2) && j<(n/2)) ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
	}
}
			
			
			
			
			
			
			
			
			
			
		
	

		
			


		
			

		
	
	



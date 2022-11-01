package practicestest;

public class Demojava {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row-1;col++) {
				System.out.print(" ");
			}
			for(int col=7-row;col>=2;col--) {
				System.out.print("* ");
				
			}
			System.out.println(" ");
		}
		
for(int row=1;row<=5;row++) {
	for(int col=5-row;col>=1;col--) {
		System.out.print(" ");
	}
		for(int col=1;col<=row;col++) {
			System.out.print("* ");
		}
	
	System.out.println(" ");
	}

	}
}



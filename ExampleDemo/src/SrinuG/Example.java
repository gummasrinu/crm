package SrinuG;

public class Example {
	public static void main(String[] args) {
	int num=213547863;
	int sum=0,oddsum=0;
	while(num>0) {
		int rem=num%10;
		num=num/10;
		
		if(rem%2==0) {
			sum=sum+rem;
		}
		else {
			oddsum=oddsum+rem;
		}
		
	}
	System.out.println("sum 0f even digits is="+sum);
	System.out.println("sum of odd digits is="+oddsum);
	}
}

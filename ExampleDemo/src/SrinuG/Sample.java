package SrinuG;

public class Sample extends Example {
	void deposit() {
		int amt = 20000;
		avlbal = avlbal + amt;
		System.out.println(avlbal);

	}
}

class Demo extends Sample {
   void withdraw(){
	   int wamt=2000;
	   avlbal=avlbal-wamt;
	   System.out.println(avlbal);
	
   }
   public static void main(String args[]) {
			Demo d = new Demo();
			d.display();
			d.deposit();
			d.withdraw();

		}
	}



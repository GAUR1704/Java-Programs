package cm.prowings.basics.forloops;

public class BreakForLoopExample2 {
	
	public static void main(String[] args) {
		
		for(int i= 0 ; i<=10 ; i++) {
			
			System.out.println("i = "+i);
			System.out.println("=============");
			
			for (int j =0; j<=5; j++)
				if (i==2) {
					System.out.println("j ="+j);
					
				}
		}
	}
}

	
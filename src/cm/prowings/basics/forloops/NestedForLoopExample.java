package cm.prowings.basics.forloops;

public class NestedForLoopExample {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println("i =" + i);
			System.out.println("=====");

			for (int j = 0; j <= 2; j++) {
				System.out.println("j =" + j);
			}
		}
	}

}

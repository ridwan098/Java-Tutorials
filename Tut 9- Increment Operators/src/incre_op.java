import java.util.Scanner;

class incre_op {
	public static void main(String args[]) {
		Scanner ridwan = new Scanner(System.in);
		
		int tuna = 5, bass = 18;
		
		++tuna;		/**This is an increment operator and adds one to tuna,
		you can also use --*/
		System.out.println(tuna);
		
		System.out.println(bass++);/**You can also do it via this method however,
		this changes it after its original value has been outputted*/
		
		System.out.println(bass);
		
		
	}

}

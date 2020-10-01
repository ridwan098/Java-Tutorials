class condition {
	public static void main(String[] args) {
		
		int age = 45;
		
		if (age >=  60) {
			System.out.println("You are a senior citizen");
		
		}else if (age >= 50){
			System.out.println("You are in your 50s");
		
		}else if(age >= 40) {
			System.out.println("You are in your 40s");
			
		}else {
			System.out.println("You are a young buck");
		}
	}

}

/** 	"if" is the main test and "elseif" is the alternative tests if the
 * main "if" is false. Pretty much a way of testing more options
 elseif goes in between if and else.
 */

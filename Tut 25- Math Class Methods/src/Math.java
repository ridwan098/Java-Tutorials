class Mathematics {
	public static void main(String[] args) {
		
		double numA, numB, numC, numD, numE, numF, numG, numH;
		
		numA = -22.6;
		numB = 7.4;
		numC = 7.8;
		numD = 8.6;
		numE = 5.2;
		numF = 5;
		numG = 3;
		numH = 9;
		
		System.out.println(numA + " is " + Math.abs(numA) + " far away from 0");/**
		absolute value, checks how much away from 0 the number is*/
		
		System.out.println("Ceil of " + numB + " is: " + Math.ceil(numB));/** ceil" 
		rounds up numbers to the next number */
		
		System.out.println("Floor of " + numC + " is: " + Math.floor(numC));/** Floor
		rounds down numbers */
		
		System.out.println("Max between " + numD + " & " + numE + " is: " + Math.max(numD, numE));/** works 
		out the highest of two numbers. Which is why you need to give it two numbers */
		
		System.out.println("Min between " + numD + " & " + numE + " is: " + Math.min(numD, numE));/** works 
		out the lesser of two numbers. Which is why you need to give it two numbers.
		It is the opposite of MAX*/
		
		System.out.println(numF + " To the power of " + numG + " is: " + Math.pow(numF, numG));		
		// Works out the power of two numbers, which is why of takes two parameters
		
		System.out.println("Square root of " + numH + " is: " + Math.sqrt(numH));
	
	}

}

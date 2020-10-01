// This program allows you to calculate a compound interest

class Compound {
	public static void main(String[] args) {
		//A = P(1 + R) ^ n
		
		double amount;
		double principle = 10000;
		double rate = .01;
		
		for (int day = 1; day<= 20; day++) {
			amount = principle * Math.pow(1+ rate, day);
			System.out.println(day + "  " + amount);
		}
	}
}

/** A is the amount,
P is the principle,
R is the rate
n is the number of years*/
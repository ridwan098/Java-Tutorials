//make sure to open the tuna class aswell
//this program opens another object and then displays its message,
//called simpleMessage()

class classes {
	public static void main(String args[]) {
		
		//name of class 	name of object = new tuna class
		tuna ridwanObject = new tuna();	//now we have a new tuna object from the tuna class called ridwanObject
		//the above imports from the tuna class
		
		ridwanObject.simpleMessage();
		
	}
}

//the main bit, can be renamed, check the tuna class.

//However, this would run as it is main

//public means the class will be available publicly, by other classes
//void means that it is going to do something, but wouldn't return any data
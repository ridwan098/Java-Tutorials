
public class apples {
	public static void main(String[] args) 
	{
		tuna member1 = new tuna("Megan", "Fox");
		tuna member2 = new tuna("Natalie", "Portman");
		tuna member3 = new tuna("Taylor", "Swift");
		
		System.out.println();
		System.out.println(tuna.getMembers());
		// the members will all bethe same because it is a shared variable (Static)
		// this is because the value is the same for all object
		// so if you change the object and the static infrmation will still be the same
		System.out.println(member1.getFirst());
		member1.setFirst("Ridwan");
		System.out.println(member1.getFirst());
		
		
		/** because static information is the same for 
		 * all objects, you dont need the name of the objects
		 * to access the static information. Just the name
		 * of the class will suffice: such as:		
		 * Static information is available even when you 
		 * don't have objects 
		**/
		System.out.println(tuna.getMembers());
	}
}

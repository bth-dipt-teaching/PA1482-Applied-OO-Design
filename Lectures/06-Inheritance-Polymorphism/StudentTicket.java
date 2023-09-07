public class StudentTicket extends Ticket {
	public StudentTicket() {
		super("no student movie", "no time"); // Calling the constructor of the super class
	}

	public int findBestSeat() {
		// Perhaps get a starting position from the super class
		// Using the reference "super" to get to the original findBestSeat() method
		// Otherwise I would just recursively call myself...
		int seat = super.findBestSeat();
		
		// Then do some Student-specific magic to get the
		// best seat for them...
		mySeat = 10; // Do not need to use "super" here. Sub-classes inherit all methods and attributes.
		return mySeat;
	}    
}

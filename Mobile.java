package week1.day1;

public class Mobile {
	
	long mobileNumber = 9962336787L;
	String mobileBrand = "Samsung";
	
	public static void main(String[] args) {
		Mobile action = new Mobile();
		action.dialNumber();
		long contact = action.sendMsgTo();
		System.out.println(contact);
		action.printMsg("Hello");
		
		
	}
	
	public void dialNumber() {
		long mobileNumber = 9962336787L;
		System.out.println(mobileNumber);
	}
	
	// get an integer type value and return it
	private long sendMsgTo(){
		
		long contact = 9813673748L;
		return contact;
	}
	
	//If I want to print whatever I give - use no access modifier, void
	void printMsg(String msg) {
		System.out.println(msg);
		
	
		
	}
	

}

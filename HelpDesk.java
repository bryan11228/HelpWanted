import cs1.Keyboard;

public class HelpDesk {

    private ArrayPriorityQueue problems;

    public HelpDesk(){
	problems = new ArrayPriorityQueue();
    }

    public void run(){
	String s = "Welcome to our Help Desk! I'm assuming you have a problem with our product. Can you give us 1 or 2 words generalizing the issue that you are having?";
	System.out.println(s);
	String nom = Keyboard.readString();

	s = "Great! Now would you describe the problem in a sentence or two?";
	System.out.println(s);
	String prob = Keyboard.readString();

	s = "Amazing! Are you an employee (regardless of the rank) at our company? \n(Please answer true or false)";
	boolean isWorker = Keyboard.readBoolean();
	int VIP = 4;
	if (isWorker){
	    s = "Are you a manager or The Boss? \n\t0:Boss\n\t1:Manager\n\t2:Employee";
	    System.out.println(s);
	    VIP = Keyboard.readInt();
	}
	problems.add(new Ticket(VIP,nom,prob));

	s = "Thank you for submitting your problem! We will address it as soon as possible.";
	System.out.println(s);
    }

    public static void main(String[] args) {
	HelpDesk a = new HelpDesk();
	a.run();
		
    }

}

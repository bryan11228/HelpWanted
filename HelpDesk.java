import cs1.Keyboard;

public class HelpDesk {

    private ArrayPriorityQueue<Ticket> problems;

    public HelpDesk(){
	problems = new ArrayPriorityQueue();
    }

    public static void main(String[] args) {
	String s = "Welcome to our Help Desk! How can we help you today?";
	System.out.println(s);
	String prob = Keyboard.readString();
	problems.add(new Ticket());




    }

}

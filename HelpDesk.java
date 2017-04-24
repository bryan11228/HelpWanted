import cs1.Keyboard;

public class HelpDesk {

    private ArrayPriorityQueue problems;

    private final String[][] responses = {
	//priority 0
	{"Hey Boss, we fixed your problem!",
	 "Boss, we are sorry, but we do not have the ability to solve the problem right now. How about getting a new device?",
	 "Boss, we know the solution to the problem, but we do not have the necessary equipments to solve it. Sorry."},
	//priority 1
	{"Hey Manager, we fixed your problem!",
	 "Hey Manager, we are sorry, but we do not have the ability to solve the problem right now. How about getting a new device?",
	 "Hey Manager, we know the solutions to the problem, but we do not have the necessary equipments to solve it. Sorry."},
	//priority 2
	{"We solved your problem! Treat us to a cup of coffee next time!",
	 "This problem cannot be fixed with our ability... Sorry!",
	 "This problem can be solved easily, just bring your device to work and hand it to us. We can fix it for you."},
	//priority 3
	{"We solved your problem! Thank you for using our product!",
	 "Unfortunately, we do not have the ability to solve this problem. You can try getting a new device... Sorry!",
	 "You can bring this device to our store and we can fix it for you."}
    };

	public HelpDesk(){
	    problems = new ArrayPriorityQueue();
	}

    public void solve(){
	int importance;
	int random;
	while (!(problems.isEmpty())){
	    Ticket next = problems.removeMin();
	    importance = next.getVIP();
	    random = (int) (Math.random() * 2);
	    next.setSolDesc(responses[importance][random]);
	    next.toggleSol();
	    System.out.println("Solved Another Problem!\n\tID : " + next.getID() );
	    System.out.println("\tTitle : " + next.getName() );
	    System.out.println("\tProblem : " + next.getProblem() );
	    System.out.println("\tSolution : " + next.getSolDesc() );
	}
    }

    public void addProb(){
	String s = "Can you give us 1 or 2 words generalizing the issue that you are having?";
	System.out.println(s);
	String nom = Keyboard.readString();

	s = "Great! Now would you describe the problem in a sentence or two?";
	System.out.println(s);
	String prob = Keyboard.readString();

	s = "Amazing! Are you an employee (regardless of the rank) at our company? \n(Please answer true or false)";
	System.out.println(s);
	boolean isWorker = Keyboard.readBoolean();
	int VIP = 3;
	if (isWorker){
	    s = "Are you a manager or The Boss? \n\t0:Boss\n\t1:Manager\n\t2:Employee";
	    System.out.println(s);
	    VIP = Keyboard.readInt();
	}
	problems.add(new Ticket(VIP,nom,prob));

	s = "Thank you for submitting your problem! We will address it as soon as possible.";
	System.out.println(s);
	
	s = "Is there any other problems?\n\t0:Yes\n\t1:No";
	System.out.println(s);
	int ans = Keyboard.readInt();
	boolean more;
	if (ans == 0){
	    more = true;
	}
	else {
	    more = false;
	}

	if (more){
	    this.addProb();  
	}
    }

    public void run(){
	String s = "Welcome to our Help Desk! I'm assuming you have a problem with our product. Can you give us 1 or 2 words generalizing the issue that you are having?";
	System.out.println(s);
	String nom = Keyboard.readString();

	s = "Great! Now would you describe the problem in a sentence or two?";
	System.out.println(s);
	String prob = Keyboard.readString();

	s = "Amazing! Are you an employee (regardless of the rank) at our company? \n(Please answer true or false)";
	System.out.println(s);
	boolean isWorker = Keyboard.readBoolean();
	int VIP = 3;
	if (isWorker){
	    s = "Are you a manager or The Boss? \n\t0:Boss\n\t1:Manager\n\t2:Employee";
	    System.out.println(s);
	    VIP = Keyboard.readInt();
	}
	problems.add(new Ticket(VIP,nom,prob));

	s = "Thank you for submitting your problem! We will address it as soon as possible.";
	System.out.println(s);

	s = "Is there any other problems?\n\t0:Yes\n\t1:No";
	System.out.println(s);
	int ans = Keyboard.readInt();
	boolean more;
	if (ans == 0){
	    more = true;
	}
	else {
	    more = false;
	}

	if (more){
	    this.addProb();
	}
	solve();
    }

    public static void main(String[] args) {
	HelpDesk a = new HelpDesk();
	a.run();
		
    }

}

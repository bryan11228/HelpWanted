public class Ticket implements Comparable {

    // v-------------v instanceVars v-------------v

    private int ID;
    private int VIPLvl;
    private boolean solved;
    private String name;
    private String problem;
    private String sol_Description;

    // ^-------------^ instanceVars ^-------------^

    // v-------------v constructor v-------------v

    public Ticket() {//default
	ID = (int) (Math.random() * 9999);
	VIPLvl = 100;
	solved = false;
	name = "";
	problem = "";
	sol_Description = "";
    }

    public Ticket( int VIP, String nom, String prob) {//overloaded
	ID = 0;
	VIPLvl = VIP;
	solved = false;
	name = nom;
	problem = prob;
	sol_Description = "";
    }

    // ^-------------^ constructor ^-------------^

    // v-------------v accessors v-------------v

    public int getID() {
	return ID;
    }
    public int getVIP() {
	return VIPLvl;
    }
    public boolean getSol() {
	return solved;
    }
    public String getName() {
	return name;
    }
    public String getProblem() {
	return problem;
    }
    public String getSolDesc() {
	return sol_Description;
    }

    // ^-------------^ accessors ^-------------^
  
   // v-------------v mutators v-------------v

    public int setID(int newVal) {
        int ret = ID;
	ID = newVal;
	return ret;
    }
	   
    public int setVIP(int newVal) {
	int ret = VIPLvl;
	VIPLvl = newVal;
	return ret;
    }

    public boolean toggleSol() {
	boolean ret = solved;
	solved = !(solved);
	return ret;
    }

    public String setName(String newVal) {
	String ret = name;
	name = newVal;
	return ret;
    }

    public String setSolDesc(String newVal) {
        String ret = sol_Description;
	sol_Description = newVal;
	return ret;
    }

    // ^-------------^ mutators ^-------------^

    // v-------------v compareTo v-------------v

    public int compareTo(Object other) {
	if (this.getVIP() < ((Ticket) other).getVIP()) {
	    return 1;
	}
	else if (this.getVIP() > ((Ticket) other).getVIP()) {
	    return -1;
	}
	else {
	    return 0;
	}
    }

    // ^-------------^ compareTo ^-------------^

}

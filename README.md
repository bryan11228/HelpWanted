# Team HelpWanted

Edwin Mok, Mark Shafran, Bryan Chan

## Design

**Class Ticket**

Class Ticket implements comparable in order to compare the VIPStatus of the user who submitted a ticket.  We also typed our ArrayPriorityQueue in that it accepts Tickets in its underlying ArrayList structure.

*Instance Variables:*

int ID- The identification of a ticket

int VIPLvl- The status of the user who submitted the ticket (ie. CEO)

boolean solved- If this boolean variable is true, the problem is solved

String name- The name of the user who submitted the ticket

String problem- A description of the user's problem

String sol_Desciption- A description of the solution to the user's problem

*Notable methods:*

compareTo() method compares the VIPStatus of the two tickets.

* Returns 1 if the called ticket is less important than the ticket in the parameter
* Returns -1 if the called ticket is more important than the ticket in the parameter
* Returns 0 if they are of equal importance

**Class HelpDesk**

Class HelpDesk uses ArrayPriorityQueue to store the tickets.

*Methods:* 

addProb()- A method that adds a ticket,complete with the problem and its description, to our ArrayPriorityQueue "problems".

solve()- A method that removes and resolves tickets based on the VIPStatus of the user. The ticket is solved/marked as unsolvable randomly.

run()- Prompts the user to provide the VIPStatus and a description of their problem.

**Embellishments**

We used a 2D array to store the solution strings that could be accessed and printed after there are no more problems subnmitted.

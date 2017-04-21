public interface PriorityQueue<Ticket> {

    //add a Ticket into the ArrayPriorityQueue
    public void add(Ticket x);

    //check if the ArrayPQ is empty
    public boolean isEmpty();

    //check the next Ticket to be processed based on priority
    public Ticket peekMin();

    //remove the next Ticket after it has been processed
    public Ticket removeMin(); 

}

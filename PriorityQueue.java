public interface PriorityQueue<Ticket> {

    public void add(Ticket x);

    public boolean isEmpty();

    public Ticket peekMin();

    public Ticket removeMin(); 
}
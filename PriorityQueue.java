public interface PriorityQueue<T> {

    //add a Ticket into the ArrayPriorityQueue
    public void add(T x);

    //check if the ArrayPQ is empty
    public boolean isEmpty();

    //check the next Ticket to be processed based on priority
    public T peekMin();

    //remove the next Ticket after it has been processed
    public T removeMin(); 

}

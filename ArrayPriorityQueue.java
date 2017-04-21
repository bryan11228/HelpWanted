
import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue
{
    private ArrayList<Ticket> _data;
    
    public ArrayPriorityQueue(){
	_data = new ArrayList<Ticket>();
    }
    
    //Adds an item to the priority queue
    public void add(Ticket x){
	_data.add(x);
    }

    //returns true if the stack is empty, otherwise returns false
    public boolean isEmpty(){
	return _data.size() == 0;
    }

    //returns the smallest item stored in the priority queue
    public Ticket peekMin(){
    	int minPos = 0;
	for(int i = 1; i < _data.size(); i++){
	    if(_data.get(i).compareTo(_data.get(minPos)) < 0 ){
		minPos = i;
	    }
	}
	return _data.get(minPos);
    }

    //returns and removes the smallest item stored in the priority queue
    public Ticket removeMin(){
	int minPos = 0;
	for(int i = 1; i < _data.size(); i++){
	    if(_data.get(i).compareTo(_data.get(minPos)) < 0 ){
		minPos = i;
	    }
	}
	return _data.remove(minPos);
    }

    public static void main( String[] args){

	ArrayPriorityQueue a = new ArrayPriorityQueue();
	System.out.println("Now enqueueing... " + "\n_data after enqueueing:");
	a.add(23);
	a.add(42);
	a.add(66);
	a.add(12);
	System.out.println(a._data);
	System.out.println("Now dequeueing..." + "\nThe smallest element in _data is: ");
	System.out.println(a.removeMin());
	System.out.println("_data after dequeueing: ");
	System.out.print(a._data);
	System.out.println(" The new smallest element in _data is: " + a.peekMin());

	
    }
    
    

}

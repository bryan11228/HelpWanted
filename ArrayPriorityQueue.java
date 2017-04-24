
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

	
    }
    
    

}

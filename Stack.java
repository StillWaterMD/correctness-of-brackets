import java.util.ArrayList;


public class Stack<Type>{

	private ArrayList<Type> arr;
	private int top;
	private int size;


	public void push(Type a) throws Exception{
		
		if(this.top < this.size-1) 
			arr.add(a);
		else 
			throw new Exception("Stack is full");

		top++;
	
	}
	
	public Type pop() throws Exception{
		
		if(top>=0){
			
			return arr.remove(top--);
			
			
		}
		else{
		
			throw new Exception("Stack is empty. Can not retrive element.");

		}
	
	}
	
	public Type getTop() throws Exception{


		if(top>=0) return arr.get(top);
		
		else throw new Exception("Stack is empty. Can not get top element");


	
	}




	Stack(int size){
	
		
		arr=new ArrayList<Type>(size);
		this.size=size;
		top=-1;

	}

	public boolean isEmpty(){

		
		return -1==top;


	}

}
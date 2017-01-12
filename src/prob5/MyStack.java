package prob5;

public class MyStack implements Stack {
	int top=-1;
	String[] array;
	
	public MyStack(int i){
		array=new String[i];
	}
	public void resize(){
		int Max=array.length*2;
		String sub[]=new String[Max];
		for(int i=0;i<top;i++){
			sub[i]=array[i];
		}
		array=sub;
	}

	@Override
	public void push(String item) {
		top++;
		if(top==array.length){
			resize();
			array[top]=item;
		}
		else{

			array[top]=item;
			
		}
	}
	

	@Override
	public String pop() throws MyStackException{
		
		if(top==-1){
			throw new MyStackException();
		}
		
		return array[top--];
	}

	@Override
	public boolean isEmpty() {
		if(top==-1){
		
         return true;			
			
		}
		return false;
	}

	@Override
	public int size() {
				return top+1;
	}

}

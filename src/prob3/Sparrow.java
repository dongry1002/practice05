package prob3;

public class Sparrow extends Bird{

	public void fly(){
		System.out.println(getName()+"가 날아다닙니다.");
	}
	public void sing(){
		super.sing();
	}
	
	public String toString(){
		
		return "참의 이름은" +this.getName()+"입니다.";
		
		
		}
	
}

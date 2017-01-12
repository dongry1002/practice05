package prob3;

public abstract class Bird {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void  fly();
	public  void sing(){
		System.out.println(name+"가 소리내어 웁니다.");
	}
	
	
	
}

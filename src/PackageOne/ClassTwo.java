package PackageOne;

public class ClassTwo extends ClassThree {
    int a;
    
	public ClassTwo(int a) {
		super(a);
		this.a = a;
	}

	public int increment() {
		System.out.println(a);
		a=a+1;
		return a;
	}
	
	public int decrement() {
		a=a-1;
		return a;
	}

}

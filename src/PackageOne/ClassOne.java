package PackageOne;

import org.testng.annotations.Test;

public class ClassOne {
    @Test
	public void Answer() {
    	
		ClassTwo value = new ClassTwo(3);
		System.out.println(value.decrement());
		System.out.println(value.increment());
		System.out.println(value.multiply());
		System.out.println("Subhasish");
		
	}

}

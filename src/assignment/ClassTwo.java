package assignment;

public class ClassTwo {
	
	
	public ClassTwo(){
		this(5,6);
		System.out.println("Hi");
	}
	public ClassTwo(int a, int b) {
		this("Hello Eveyone!");
		System.out.println(a+b);
	}
	public ClassTwo(String x){
		System.out.println(x);
	}

}

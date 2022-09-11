
interface Lam{
	
	int add(int x,int y);
}
interface Lam1{
	
	String display(String name);
}
interface Lam2{
	
	void display1(String subName);
}
public class LambdaExpression {

	public static void main(String[] args) {
		//Multiple parameters in lambda expression
		Lam l=(x,y)->x+y;
		System.out.println("Sum of 2 Numbers:"+l.add(30,50));
		
		//Multiple parameters with data type in lambda expression
		Lam ll=(int x, int y)->(x+y);
		System.out.println("Multiple of 2 Numbers:"+l.add(9, 8));
		
		Lam1 l1;
		l1=(name)->{  
            return "Hello "+name;  
        };
		System.out.println("Student name:"+l1.display("Ayesha"));
		
		Lam2 l2=(subName)->
		System.out.println("Java");
	};
	

}

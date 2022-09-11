interface Sayable {
			//Default method
		default void say() {
			System.out.println("Hello,this is default method");
		 }
		//Abstract method
		void sayMore(String msg);
	}
public class DefaultMethods implements Sayable {
    //implementing abstract method
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		DefaultMethods dm=new DefaultMethods();
		dm.say();  //calling default method
		dm.sayMore("Work is Worship");  //calling abstract method
	}

}

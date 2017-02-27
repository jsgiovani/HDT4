import java.util.*;
public class Mian {
	

	public static void main(String[] args) {
		PilaArrayList mystack = new PilaArrayList();
		
		mystack.push(45);
		mystack.push("hola");
		mystack.push(69);
		mystack.push(23);
		mystack.push("Hola soy giovani");
		mystack.push(32.4869);
		
		mystack.zice();
		mystack.firstAbove();
		mystack.peck();
		
	}

}

public class Mian {
	

	public static void main(String[] args) {
		PilaArrayList mystack = new PilaArrayList();
		
		mystack.empujar(45);
		mystack.empujar("hola");
		mystack.empujar(69);
		mystack.empujar(23);
		mystack.empujar("Hola soy giovani");
		mystack.empujar(32.4869);
		mystack.tamanoPila();
		mystack.cima();
		mystack.ultimo();
		
	}

}

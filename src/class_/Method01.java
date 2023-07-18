package class_;

public class Method01 {
	
	public static void disp() {
	System.out.println("static method...");	
	}
	public void output() {
		System.out.println("non-static method...");
	}
	public static void main(String[] args) {
		Method01.disp();
		Method01 method01 = new Method01();
		method01.output();
	}

}

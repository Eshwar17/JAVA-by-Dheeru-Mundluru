
public class VariablesDemo {
	// <type> <name> [= literal (or) expression]
	int id = 1000;
	int nextId = id + 1;
	
	void compute() {
		System.out.println(id);
		System.out.println(nextId);
	}
	public static void main(String[] args) {
		VariablesDemo v = new VariablesDemo();
		v.compute();
	}

}

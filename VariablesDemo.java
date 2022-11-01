
public class VariablesDemo {
	/*
	 * Variables :
	 * Variables are containers for storing different values in the memory
	 * Java is STATICALLY TYPED LANGUAGE.
	 * So, the type checking is done at the compilation time and it is called as STATIC TYPE CHECKING
	 * As a result, mistakes can be detected at the earliest that is at the compilation time itself
	 * JavaScript is a DYNAMICALLY TYPED LANGUAGE, where the checking of the type is done at the runtime and called as DYNAMIC TYPE CHECKING.
	 * PRIMITIVE VARIABLES : Variables which store the raw data
	 * OBJECT REFERENCE : Variable doesn't store but refer to the objects/instances(Class/Interfaces)
	 * INSTANCE VARIABLES : Variables declared at the class level. If these variables are not initialized, they are given with default values.
	 * STATIC VARIABLES : Variables declared at class level but can be accessed without object creation. Even these variables have default values.
	 * LOCAL VARIABLES : Variables declared at method level. If these variables are not initialized, they are not given with the default values.
	 * Assignment Statements : <name> = literal / expression. But it is done at the method level but not ALLOWED AT THE CLASS LEVEL
	 */
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

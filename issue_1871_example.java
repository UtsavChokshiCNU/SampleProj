public class issue_1871_example{
	
	public static void printOne(){
		System.out.println("One");
	}

	public static void printTwo(){
		System.out.println("Two");
	}

	public static void printThree(){
		System.out.println("Three");
	}

	public static void printAnything(){
		System.out.println("Anything");
	}

	public static void method1(int i){

		switch (i) {
		  case 1: printOne(); printTwo();
		    break;
		  case 2:
		    printThree();
		    break;
		  case 3:  // Noncompliant; duplicates case 1's implementation
		    printOne();
		    printTwo();
		    break;
		  default:
		    printAnything();
		    break;
		}

	}

	public static void method2(int a){
		if (a >= 0 && a < 10) {
		  	printOne();
		    printTwo();
		}
		else if (a >= 10 && a < 20) printThree();
		else if (a >= 20 && a < 50) {
		  	printOne();
		    printTwo();
		}
		else printAnything();
	}


	public static void main(String[] args) {

		method1(2);
		method2(5);

	}
}
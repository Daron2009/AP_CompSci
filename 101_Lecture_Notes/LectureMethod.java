/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Spike");
        greeting("Mortis");
        
        double num = raise(200000, 5);
        System.out.println(num);
        num = raise(200000, 5);
	}
	
	public static void greeting(String name) {
	    System.out.println("Hello "+name);
	}
	
	public static double raise(double salary, int percent) {
	    double amount = salary + (salary*(percent/100.0));
	    return amount;
	}
	
	public static void printAnimal() {
	    System.out.println("           __n__n__");
        System.out.println("    .------`-\\00/-'");
        System.out.println("   /  ##  ## (oo)");
        System.out.println(" / \\## __   ./");
        System.out.println("    |//YY \\|/");
        System.out.println("    |||    |||");
	}
}
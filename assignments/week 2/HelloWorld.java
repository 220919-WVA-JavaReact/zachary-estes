public class HelloWorld{
   
	public static void main(String[] args){
	
		System.out.println("hello world");

		int number = 5;
		byte smaller = 50;
		boolean value = true;

		System.out.println(number);
		System.out.println(smaller);
		System.out.println(value);

		if (5 > 7) {
			System.out.println("This statement is true");
		} else {
			System.out.println("This statement is false");
			}
		int num = 9;
		//if loop
		if (num > 0){
			System.out.println("Positive");
		} else if (num == 0) {
		System.out.println("Zero");
		} else {
		System.out.println("Negative");
		}
		
		int counter = 0;
		//while
		while (counter < 10) {
		System.out.println(counter);
		counter++;
		}
		
		//for loop
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		int a = 4;
		int b = 3;
		
		add(a,b);

		System.out.println(add(a,b));

		String name = "Zach";
		
		System.out.println(name.length());

		System.out.println(name.charAt(3));
	}
	
	public static int add(int a, int b){
		return a + b;
	}

}
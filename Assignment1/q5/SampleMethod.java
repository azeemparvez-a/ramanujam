package q5;

//5. Write a program to calculate average of the n number using a separate function other than main.

class SampleMethod {

	  // create a method
	  public int addNumbers(int a, int b) {
	    int sum = a + b;

	    int average = sum/2;
	    return average;
	  }

	  public static void main(String[] args) {
	    
	    int num1 = 25;
	    int num2 = 15;

	    // create an object of Main
	    SampleMethod obj = new SampleMethod();
	    // calling method
	    int result = obj.addNumbers(num1, num2);
	    System.out.println("Average is: " + result);
	  }
	}
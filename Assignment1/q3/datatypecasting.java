package q3;
//*3. Write a program to declare all primitive data types with all possible types of initialization and also check implicit and explicit type casting by assigning them to each other.

public class datatypecasting {

	public static void main(String[] args) {
        System.out.println("---Implicit casting---");	
	//Implicit casting
		 int i = 100;
		 long l = i;
		 float f = l;

	        System.out.println("Int value " + i);
	        System.out.println("Long value " + l);
	        System.out.println("Float value " + f);

	//Explicit casting
	        System.out.println("---Explicit casting---");
	        
	        double d1 = 100.04;
	        long l1 = (long)d1;
	        int i1 = (int)l1;

	        System.out.println("Double value " + d1);
	        System.out.println("Long value " + l1);
	        System.out.println("Int value " + i1);
	
	 //Other data types
	        short s = 65;
	        byte b;
	        char c;
	 
	//casting    
	        System.out.println("---Other casting---");
	        
	        b=(byte)s;
	        c=(char)s;

			System.out.println("Short value " +s);
            System.out.println("Byte value " +b);
	        System.out.println("Char value " +c);
	        
	}

}

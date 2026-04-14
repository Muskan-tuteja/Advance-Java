package A;

public class ClassCast_exp {
	//occur when we convert an object is cast to an incompatible class type
	
	
    public static void main(String[] args) {
    	
    	Object obj = "Hello";   // String object stored in Object

        Integer num = (Integer) obj;   // wrong casting

        System.out.println(num);
    }


}



package java8;

// Java Lambda Expression Example: No Parameter
interface Sayable{  
    public String say();  
}  
public class LambdaExpression2{  
public static void main(String[] args) {  
    Sayable s=()->{
		return null;  
       // return "I have nothing to say.";  
    };  
    System.out.println(s.say());  
}  
}  
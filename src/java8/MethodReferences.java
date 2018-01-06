package java8;

public class MethodReferences {
static MethodReferences obj=null;
public static void main(String[] args) {
	obj.abc();
}
public static void abc(){
	System.out.println(200);
}
}

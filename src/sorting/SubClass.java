package sorting;

interface A {
	int a=100;
}
class B implements A{
public static void main(String[] args) {
	A obj=new B();
	System.out.println(obj.a);
}
}

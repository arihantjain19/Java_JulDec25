package firstprj;
interface myintf{
	public void fun1();
	public int fun2(int q);
}
interface second{
	public void fun3();
}
class abc implements myintf, second{
	public void fun1() {
		System.out.println("interface demo");
	}
	public int fun2(int q) {
		return q*q;
	}
	public void fun3() {
		System.out.println("From interface second");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc a = new abc();
		a.fun1();
		System.out.println(a.fun2(12));
		a.fun3();
	}

}

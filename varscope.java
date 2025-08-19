package firstprj;

public class varscope {

	public static void main(String[] args) {
		int a = 1000;
		System.out.println("a is:"+a);
		if(true) {
			//int a = 2000;
			System.out.println("a is:"+a);
			a++;
		}
		fun1();
		System.out.println("Now a is:"+a);
		int g = 3;
		System.out.print(++g);
	}
	static void fun1() {
		int a;
		a = 5000;
		System.out.println("a in fun1:"+a);
	}
}

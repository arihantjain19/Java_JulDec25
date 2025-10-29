package firstprj;
public class ExcepDemo {
	public static void main(String[] args) {
		ToCalculate tc = new ToCalculate();
		int res=0;
		int ar[] = new int[8];
		for(int i =0;i<8;i++) { ar[i]=i*i;}
		try{
			res = tc.myDiv(30, 0);
			System.out.println("Hello");
			tc.printArray(ar);
			System.out.println("Array print inside Try..");
		}
		catch(ArithmeticException exc) {
			System.out.println("Exception occured"+exc.toString());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Result is:"+res);
		System.out.println("After function calling...");
		System.out.println("After Array Print..");
	}

}
class ToCalculate{
	int a, b;
	int myDiv(int x, int y) {
		return x/y;
	}
	void printArray(int []arr) {
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}
}

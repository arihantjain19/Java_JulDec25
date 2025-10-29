package firstprj;

public class StringDemo {

	public static void main(String[] args) {
		String str;
		str = "Manipal University Jaipur";
		System.out.println(str);
		System.out.println(str.charAt(2));
		System.out.println(str.length());
		System.out.println(str.indexOf('U'));
		char arr[] = str.toCharArray();
		System.out.println(arr[0]);
		for(char ch:arr) {
			System.out.print(ch+" ");
		}

	}

}

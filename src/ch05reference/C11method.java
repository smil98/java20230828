package ch05reference;

public class C11method {

	public static void main(String[] args) {
		int[] a = method1();
		
		System.out.println("메소드 호출 후");
		System.out.println(System.identityHashCode(a));
		System.out.println(a[2]);
	}
	
	public static int[] method1() {
		int[] c = {9, 7, 5};
		
		System.out.println("method 1 내부");
		System.out.println(System.identityHashCode(c));
		return c;
	}

}

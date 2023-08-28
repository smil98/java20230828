package ch05reference;

public class C07reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "java";
		String b = "spring";
		String c = a;
		
		//참조값 보기
		int code1 = System.identityHashCode(a);
		int code2 = System.identityHashCode(b);
		int code3 = System.identityHashCode(c);
		
		System.out.println(code1);
		System.out.println(code2);
		System.out.println(code3);
	}

}

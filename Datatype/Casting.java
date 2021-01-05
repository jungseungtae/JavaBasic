
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // 손실이 없어 자동으로 변환가능
		double b2 = (double) 1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(b2);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // 강제 변경 후 실수 손실
		
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
		String g = "내가 그의 이름을 불러주기 전에는";
		String h = "\n그는 다만";
		String i = "\n하나의 몸짓에 지나지 않았다. - 김춘수 꽃 -";
		
		System.out.println(g+h+i);
	}

}

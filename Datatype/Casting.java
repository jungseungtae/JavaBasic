
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // �ս��� ���� �ڵ����� ��ȯ����
		double b2 = (double) 1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(b2);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // ���� ���� �� �Ǽ� �ս�
		
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
		String g = "���� ���� �̸��� �ҷ��ֱ� ������";
		String h = "\n�״� �ٸ�";
		String i = "\n�ϳ��� ������ ������ �ʾҴ�. - ����� �� -";
		
		System.out.println(g+h+i);
	}

}

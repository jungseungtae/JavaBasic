import javax.swing.JOptionPane;

public class AccountingEx1 {

	public static void main(String[] args) {
		String item_money = JOptionPane.showInputDialog("���ǰ��� �Է����ּ��� (���ڸ� ����)");
		String x = JOptionPane.showInputDialog("a�� ���ͺй���(%)�� �Է����ּ��� (���ڸ� ����)");
		String y = JOptionPane.showInputDialog("b�� ���ͺй���(%)�� �Է����ּ��� (���ڸ� ����)");
		String z = JOptionPane.showInputDialog("c�� ���ͺй���(%)�� �Է����ּ��� (���ڸ� ����)");

		double item_value = Double.parseDouble(item_money);
		double tax = Math.floor(item_value/11);
		double cost_price = Math.ceil(item_value/11*10);
		double origin_price = cost_price*0.3;
		double income = cost_price-origin_price;
		double a= income*Double.parseDouble(x)/100;
		double b=income*Double.parseDouble(y)/100;
		double c=income*Double.parseDouble(z)/100;
	
		System.out.println("���� ��: "+ item_money);
		System.out.println("���� 10%: " +tax);
		System.out.println("���� ���ް� :" +cost_price);
		System.out.println("���� : "+ origin_price);
		System.out.println("���� : " + income);
		System.out.println("A�� ����: "+a);
		System.out.println("B�� ����: "+b);
		System.out.println("C�� ����: "+c);
	
		}

}
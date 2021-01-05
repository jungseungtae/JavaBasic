import javax.swing.JOptionPane;

public class AccountingEx1 {

	public static void main(String[] args) {
		String item_money = JOptionPane.showInputDialog("물건값을 입력해주세요 (숫자만 가능)");
		String x = JOptionPane.showInputDialog("a의 수익분배율(%)을 입력해주세요 (숫자만 가능)");
		String y = JOptionPane.showInputDialog("b의 수익분배율(%)을 입력해주세요 (숫자만 가능)");
		String z = JOptionPane.showInputDialog("c의 수익분배율(%)을 입력해주세요 (숫자만 가능)");

		double item_value = Double.parseDouble(item_money);
		double tax = Math.floor(item_value/11);
		double cost_price = Math.ceil(item_value/11*10);
		double origin_price = cost_price*0.3;
		double income = cost_price-origin_price;
		double a= income*Double.parseDouble(x)/100;
		double b=income*Double.parseDouble(y)/100;
		double c=income*Double.parseDouble(z)/100;
	
		System.out.println("물건 값: "+ item_money);
		System.out.println("세금 10%: " +tax);
		System.out.println("물건 공급가 :" +cost_price);
		System.out.println("원가 : "+ origin_price);
		System.out.println("이익 : " + income);
		System.out.println("A의 수익: "+a);
		System.out.println("B의 수익: "+b);
		System.out.println("C의 수익: "+c);
	
		}

}
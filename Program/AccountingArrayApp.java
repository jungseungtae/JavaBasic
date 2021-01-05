
public class AccountingArrayApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Edit ��> Find/replace�� �� ��ȯ ���� ����Ű:Cnt+F
		//�ڵ带 ������ ��ȯ��Ű�� Alt+Sh+L ��, ��ü�� ��ȯ�ǹǷ� ���� Ȯ�� �ʼ�.
		
		double valueOfSupply = Double.parseDouble(args[0]); // ��ü����(�Է¶�)
		double vatRate = 0.1; // �ΰ���
		double expenseRate = 0.3; // ����
		double vat = valueOfSupply * vatRate; // ����
		double total = valueOfSupply + vat; // �ǸŰ�
		double Expense = valueOfSupply * expenseRate; // ����
		double Income = valueOfSupply - Expense; // ������
		
		double[] DicidendRates = new double[100];
		DicidendRates[0] = 0.5;
		DicidendRates[1] = 0.3;
		DicidendRates[2] = 0.2;
		DicidendRates[3] = 0.1;
		
		double Dividend1 = Income * DicidendRates[0];  // ��� 1
		double Dividend2 = Income * DicidendRates[1];  // ��� 2
		double Dividend3 = Income * DicidendRates[2];  // ��� 3
		double Dividend4 = Income * DicidendRates[3];
		
		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : "+ total);
		System.out.println("Expense : "+ Expense);
		System.out.println("Income : "+ Income);
		System.out.println("Dividend 1 : "+ Dividend1);
		System.out.println("Dividend 2 : "+ Dividend2);
		System.out.println("Dividend 3 : "+ Dividend3);
		System.out.println("Dividend 4 : "+ Dividend4);
	}
}


public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		//Edit ��> Find/replace�� �� ��ȯ ���� ����Ű:Cnt+F
		//�ڵ带 ������ ��ȯ��Ű�� Alt+Sh+L ��, ��ü�� ��ȯ�ǹǷ� ���� Ȯ�� �ʼ�.
		//���� ����Ű ctl+F11
		
		double valueOfSupply = Double.parseDouble(args[0]); // ��ü����(�Է¶�)
		double vatRate = 0.1; // �ΰ���
		double expenseRate = 0.3; // ����
		double vat = valueOfSupply * vatRate; // ����
		double total = valueOfSupply + vat; // �ǸŰ�
		double Expense = valueOfSupply * expenseRate; // ����
		double Income = valueOfSupply - Expense; // ������
		
		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : "+ total);
		System.out.println("Expense : "+ Expense);
		System.out.println("Income : "+ Income);
		
		double[] DicidendRates = new double[4];
		DicidendRates[0] = 0.5;
		DicidendRates[1] = 0.3;
		DicidendRates[2] = 0.2;
		DicidendRates[3] = 0.1;
		
		int i = 0;
		while (i < DicidendRates.length) {
		System.out.println("Dividend : "+ (Income * DicidendRates[i]));
		i = i + 1;
		}
	}
}

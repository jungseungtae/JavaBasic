
public class AccountingIFApp { // if ���ǹ�

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
		
		double Dividend1;
		double Dividend2;
		double Dividend3;
		
		if(Income > 10000.0) {
			Dividend1 = Income * 0.5;  // ��� 1
			Dividend2 = Income * 0.3;  // ��� 2
			Dividend3 = Income * 0.2;  // ��� 3
			
		} else {
			Dividend1 = Income * 1.0;  // ��� 1
			Dividend2 = Income * 0;  // ��� 2
			Dividend3 = Income * 0;  // ��� 3

		}
		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : "+ total);
		System.out.println("Expense : "+ Expense);
		System.out.println("Income : "+ Income);
		System.out.println("Dividend 1 : "+ Dividend1);
		System.out.println("Dividend 2 : "+ Dividend2);
		System.out.println("Dividend 3 : "+ Dividend3);
	}
}

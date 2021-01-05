
public class AccountingIFApp { // if 조건문

	public static void main(String[] args) {
		
		//Edit ㅡ> Find/replace로 값 변환 가능 단축키:Cnt+F
		//코드를 변수로 변환시키는 Alt+Sh+L 단, 전체가 변환되므로 예외 확인 필수.
		
		double valueOfSupply = Double.parseDouble(args[0]); // 전체수입(입력란)
		double vatRate = 0.1; // 부가세
		double expenseRate = 0.3; // 원가
		double vat = valueOfSupply * vatRate; // 세금
		double total = valueOfSupply + vat; // 판매가
		double Expense = valueOfSupply * expenseRate; // 이익
		double Income = valueOfSupply - Expense; // 순이익
		
		double Dividend1;
		double Dividend2;
		double Dividend3;
		
		if(Income > 10000.0) {
			Dividend1 = Income * 0.5;  // 배당 1
			Dividend2 = Income * 0.3;  // 배당 2
			Dividend3 = Income * 0.2;  // 배당 3
			
		} else {
			Dividend1 = Income * 1.0;  // 배당 1
			Dividend2 = Income * 0;  // 배당 2
			Dividend3 = Income * 0;  // 배당 3

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

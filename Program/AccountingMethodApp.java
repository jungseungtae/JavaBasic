
public class AccountingMethodApp {
	public static double valueOfSupply;
	public static double vatRate; // 부가세
	public static double expenseRate;
	
	public static void main(String[] args) {
		
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;		
		//Edit ㅡ> Find/replace로 값 변환 가능 단축키:Cnt+F
		//코드를 변수로 변환시키는 Alt+Sh+L 단, 전체가 변환되므로 예외 확인 필수.
		//alt+sh+m 
		
		double vat = getVAT(); // 세금
		double total = getTotal(); // 판매가
		double Expense = getExpense(); // 이익
		double Income = getIncome(); // 순이익
		double Dividend1 = getDividend1();  // 배당 1
		double Dividend2 = getDividend2();  // 배당 2
		double Dividend3 = getDividend3();  // 배당 3
		
		print();
	}

	public static void print() {
		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend 1 : "+ getDividend1());
		System.out.println("Dividend 2 : "+ getDividend2());
		System.out.println("Dividend 3 : "+ getDividend3());
	}

	public static double getDividend1() {
		return getIncome() * 0.5;
	}
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
}

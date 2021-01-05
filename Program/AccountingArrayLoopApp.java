
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		//Edit ㅡ> Find/replace로 값 변환 가능 단축키:Cnt+F
		//코드를 변수로 변환시키는 Alt+Sh+L 단, 전체가 변환되므로 예외 확인 필수.
		//실행 단축키 ctl+F11
		
		double valueOfSupply = Double.parseDouble(args[0]); // 전체수입(입력란)
		double vatRate = 0.1; // 부가세
		double expenseRate = 0.3; // 원가
		double vat = valueOfSupply * vatRate; // 세금
		double total = valueOfSupply + vat; // 판매가
		double Expense = valueOfSupply * expenseRate; // 이익
		double Income = valueOfSupply - Expense; // 순이익
		
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

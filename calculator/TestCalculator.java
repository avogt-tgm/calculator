package calculator;
/**
 * Hier wird die Funktionalität von Calculator getestet
 * @author Andreas Vogt
 *
 */
public class TestCalculator {
	public static void main (String []args){
		OperationsType otype = new AdditionCalculator();
		double modifier = 5;
		double [] zahlen1 = {1,5,11,20,100};
		Calculator cal = new Calculator();
		for(int i = 0; i<zahlen1.length;i++){
			cal.addValue(zahlen1[i]);
		}
		cal.setModifier(modifier);
		cal.setOperationsType(otype);
		cal.processCalculations();
		System.out.println(cal.toString());
		
		otype = new SubstractionCalculator();
		cal = new Calculator();
		for(int i = 0; i<zahlen1.length;i++){
			cal.addValue(zahlen1[i]);
		}
		cal.setModifier(modifier);
		cal.setOperationsType(otype);
		cal.processCalculations();
		System.out.println(cal.toString());
		
		otype = new MultiplicationCalculator();
		cal = new Calculator();
		for(int i = 0; i<zahlen1.length;i++){
			cal.addValue(zahlen1[i]);
		}
		cal.setModifier(modifier);
		cal.setOperationsType(otype);
		cal.processCalculations();
		System.out.println(cal.toString());
		
		otype = new DivisionCalculator();
		cal = new Calculator();
		for(int i = 0; i<zahlen1.length;i++){
			cal.addValue(zahlen1[i]);
		}
		cal.setModifier(modifier);
		cal.setOperationsType(otype);
		cal.processCalculations();
		System.out.println(cal.toString());
		
		
		
	}
}

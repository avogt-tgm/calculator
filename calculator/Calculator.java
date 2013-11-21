package calculator;


import java.util.LinkedList;
import java.util.List;
/**
 * Diese Klasse speichert double Werte in eine Liste und m
 * @author Andreas Vogt
 *
 */
public class Calculator {

	private List<Double> values;

	private double modifier;

	private OperationsType operationstype;


	public Calculator() {
		values = new LinkedList();
		modifier = 0;
	}

	public void addValue(double value) {
		this.values.add(value);
	}

	public void setModifier(double modifier) {
		this.modifier = modifier;
	}

	public void removeValue(double value) {
		this.values.remove(value);
	}

	public List processCalculations() {
		return null;
	}

	public String toString() {
		return null;
	}

	public void setOperationsType(OperationsType operationstype) {

	}

}

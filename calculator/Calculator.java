package calculator;


import java.util.LinkedList;
import java.util.List;
/**
 * Diese Klasse speichert double Werte in eine Liste
 * Diese Werte werden je na operationstype mit dem 
 * modifier addiert,subtrahiert,multipliziert oder dividiert
 * @author Andreas Vogt
 *
 */
public class Calculator {

	private List<Double> values;

	private double modifier;

	private OperationsType operationstype;

	/**
	 * Konstruktor
	 */
	public Calculator() {
		values = new LinkedList();
		modifier = 0;
		operationstype = null;
	}
	/**
	 * Der Wert im Parameter wird in die Liste hinzugefügt
	 * @param value
	 */
	public void addValue(double value) {
		this.values.add(value);
	}
	/**
	 * Hier wird der modifier geändert
	 * @param modifier
	 */
	public void setModifier(double modifier) {
		this.modifier = modifier;
	}
	/**
	 * Falls der Wert im Parameter in der Liste vorkommt wird er gelöscht
	 * @param value
	 */
	public void removeValue(double value) {
		this.values.remove(value);
	}
	/**
	 * Die Methode 
	 */
	public void processCalculations() {
		this.values = this.operationstype.processCalculations(values ,modifier);
	}
	/**
	 * Alle Zahlen in values werden in einem String gespeichert und zurückgegeben
	 */
	public String toString() {
		String text = "Zahlen in der Liste : ";
		for(int i = 0; i < this.values.size(); i++){
                        text += this.values.get(i).toString() + " | ";
        }
		
		return text;
	}
	/**
	 * Hier wird der operationstype geändert
	 * @param operationstype
	 */
	public void setOperationsType(OperationsType operationstype) {
		this.operationstype = operationstype;
	}

}

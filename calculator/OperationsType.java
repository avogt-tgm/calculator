package calculator;

import java.util.List;
/**
 * Interface f�r die Operationen
 * @author Andreas Vogt
 *
 */
public abstract interface OperationsType {

	public abstract List processCalculations(List values , double modifier);

}

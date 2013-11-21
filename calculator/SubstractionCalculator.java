package calculator;

import java.util.List;
/**
 * Subtractions Methode
 * @author Andreas Vogt
 *
 */
public class SubstractionCalculator implements OperationsType {

	public List processCalculations(List values , double modifier) {
		for (int i = 0; i < values.size(); i++)
        {
                values.set(i, ((double) values.get(i)) - modifier);
        }
        
        return values;
	}

}

package poc.designpattern.strategy;

import poc.designpattern.Example;

public class StrategyExample implements Example
{
	Strategy strategy;
	
	public void operation() 
	{
	    strategy = new StrategyFilledBack();
	    System.out.println("Llenado hacia atras");
	    strategy.fill();
	    
		//strategy = new StrategyFilledForward();
	    //System.out.println("llenado hacia adelante");
	    //strategy.fill();
	}
	
}

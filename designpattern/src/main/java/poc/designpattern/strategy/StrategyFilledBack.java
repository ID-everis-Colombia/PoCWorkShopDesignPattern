package poc.designpattern.strategy;

public class StrategyFilledBack  extends Strategy{
    public void fill() 
    {
        for(int i = arrangement.length - 1; i >= 0; i--){
        	arrangement[i] = generateRandom();
            System.out.println("generando aleatorio para la poscion " + i + " = " + arrangement[i]);
        }
    }

}

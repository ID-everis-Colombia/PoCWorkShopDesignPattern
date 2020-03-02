package poc.designpattern;

import poc.designpattern.adapter.AdapterExample;
import poc.designpattern.factorymethod.FactoryMethodExample;
import poc.designpattern.strategy.StrategyExample;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	String pattern = "";
    	Example example = null;
    	int option = 0;
    	int maxOpt = 3;
    	Scanner sc = new Scanner(System.in);
    	
        do 
        {
        	System.out.println("1. Patron Estructural        - Adaptador\n");
        	System.out.println("2. Patron Creacional         - Método de Fábrica\n");
        	System.out.println("3. Patron de Comportamiento  - Estrategia\n");
            System.out.println("Ingrese un numero entre 0 y " + maxOpt + " para ver un ejemplo de patrones\\n");
            option = sc.nextInt();
        } 
        while (option < 0 || option > maxOpt);
        
        switch (option) 
        {   
        	case 1:
                pattern = "Adaptador";
                example = new AdapterExample();
        		break;
        	case 2:
                pattern = "Método de Fábrica";
                example = new FactoryMethodExample();
        		break;
        	case 3:
                pattern = "Patrón Estrategia";
                example = new StrategyExample();
        		break;
        }
    	
        
        
        System.out.println("Patron: '" + pattern + "'");
        example.operation();       
        sc.close();
    }
}

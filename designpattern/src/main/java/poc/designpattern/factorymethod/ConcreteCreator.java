package poc.designpattern.factorymethod;

public class ConcreteCreator extends AbstractCreator 
{
    public Product factoryMethod() {
        return new ConcreteProduct();
    }

}

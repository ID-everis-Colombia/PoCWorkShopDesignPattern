package poc.designpattern.factorymethod;

public abstract class AbstractCreator 
{
    public Product createProduct()
    {
        return factoryMethod();
    }
    
    public abstract Product factoryMethod();
}

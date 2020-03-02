package poc.designpattern.strategy;
import java.util.Random;

public abstract class Strategy {
	public Random rand = new Random();
	public int[] arrangement = new int[10];

	public int generateRandom(){
        return rand.nextInt(100);
    }

	public abstract void fill();
}

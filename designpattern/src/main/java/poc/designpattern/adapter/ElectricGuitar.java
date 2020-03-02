package poc.designpattern.adapter;

public class ElectricGuitar extends Guitar {

    @Override
    public void onGuitar() {
        System.out.println("Tocando guitarra");
    }

    @Override
    public void offGuitar() {
        System.out.println("Dejar de tocar guitarra");
    }

}

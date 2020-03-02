package poc.designpattern.adapter;

import poc.designpattern.Example;

public class AdapterExample implements Example {

    public void operation() {
        System.out.println("Guitarra Acústica");
        Guitar gGuitar = new ElectricGuitar();
        gGuitar.onGuitar();
        gGuitar.offGuitar();       

        System.out.println("Guitarra Electrica");
        Guitar eGuitar = new ElectricGuitar();
        eGuitar.onGuitar();
        eGuitar.offGuitar();
        
        ///System.out.println("Guitarra ElectroAcustica");
        ///Guitar eaGuitar = new ElectroAcousticGuitar();
        ///eaGuitar.onGuitar();
        ///eaGuitar.offGuitar();
    }

}

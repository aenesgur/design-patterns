package facade;

import facade.facade.CarProductionFacade;

public class Main {
    public static void main(String[] args) {
        CarProductionFacade productionFacade = new CarProductionFacade();
        productionFacade.produceCar();
    }
}

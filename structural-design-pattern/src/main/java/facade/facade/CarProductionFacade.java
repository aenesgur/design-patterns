package facade.facade;

import facade.subSystem.ChassisProduction;
import facade.subSystem.ElectricalSystemAssembly;
import facade.subSystem.MotorProduction;

public class CarProductionFacade {
    private MotorProduction motorProduction;
    private ChassisProduction chassisProduction;
    private ElectricalSystemAssembly electricalSystemAssembly;

    public CarProductionFacade() {
        motorProduction = new MotorProduction();
        chassisProduction = new ChassisProduction();
        electricalSystemAssembly = new ElectricalSystemAssembly();
    }

    public void produceCar() {
        System.out.println("Car Production is Started!");
        motorProduction.produceMotor();
        chassisProduction.produceChassis();
        electricalSystemAssembly.assembleElectricalSystem();
        System.out.println("Car Production is Completed!");
    }
}

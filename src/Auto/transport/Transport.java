package Auto.transport;

import java.util.ArrayList;

import Auto.driver.Driver;

import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    public float engineVolume;

    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();

    public Transport(String brand, String model, float engineVolume)
    {
        this.brand = ValidationUtils.validOrDefault(brand, "Марка указана не корректно");
        this.model = ValidationUtils.validOrDefault(model, "Модель указана не корректно");
        if (engineVolume == 0) {
            System.out.println("Объем двигателя указан не корректно");
        }else {this.engineVolume = engineVolume;}
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public float getEngineVolume() {
        return engineVolume;
    }

//    public abstract void Start();
//
//    public abstract void Finish();

    public abstract boolean carService();

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public abstract void autoRepair();

}




package Auto.driver;

import Auto.transport.Transport;
public abstract class Driver <T extends Transport> {
    private final String fullName;
    private final String category;
    private final int drivingExperience;
    private final T car;

    public Driver(String fullName, String category,
                  int drivingExperience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

//    public void startMovement() {
//        System.out.printf("Водитель %s начинает движение ", this.fullName);
//        this.car.Start();
//    }
//
//    public void finish() {
//        System.out.printf("Водитель %s останавливается ", this.fullName);
//        this.car.Finish();
//    }
//
//    public void refuel() {
//        System.out.printf("Водитель %s заправляет ", this.fullName, this.car.getBrand(),
//                this.car.getModel());
//    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return String.format("Водитель %s, категория '%s'," +
                        " стаж вождения %s лет, управляет автомобилем '%s %s', объем двигателя %s л. " +
                        "и будет участвовать в заезде! ",
                this.fullName, this.category, this.drivingExperience,
                this.car.getBrand(), this.car.getModel(), this.car.getEngineVolume());
    }
}

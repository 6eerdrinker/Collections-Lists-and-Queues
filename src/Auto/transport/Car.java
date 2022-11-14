package Auto.transport;


public class Car extends Transport implements Competing {
    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

//    @Override
//    public void pitStop() {
//        System.out.printf("Автомобиль %s %s выполняет пит-стоп.",
//                this.getBrand(),this.getModel());
//    }
//
//    @Override
//    public int getBestLapTime() {
//        return ThreadLocalRandom.current().nextInt(1,100);
//    }
//
//    @Override
//    public int getMaxSpeed() {
//        return ThreadLocalRandom.current().nextInt(1, 400);
//    }
//
//    @Override
//    public void Start() {
//        System.out.printf("Автомобиль %s %s начинает движение. ",
//                this.getBrand(), this.getModel());
//    }
//    @Override
//    public void Finish() {
//        System.out.printf("Автомобиль %s %s останавливается. ",
//                this.getBrand(), this.getModel());
//    }

    @Override
    public boolean carService() {
        return false;
    }

    @Override
    public void autoRepair() {
        System.out.println(this.getBrand() + " " + this.getModel() +  " отремонтирован.");
    }
}

package Auto.transport;

public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

//    @Override
//    public void pitStop() {
//        System.out.printf("Грузовик %s %s выполняет пит-стоп ",
//                this.getBrand(),this.getModel());
//    }

//    @Override
//    public int getBestLapTime() {
//        return ThreadLocalRandom.current().nextInt(1,10);
//    }
//
//    @Override
//    public int getMaxSpeed() {
//        return ThreadLocalRandom.current().nextInt(1, 250);
//    }
//
//    @Override
//    public void Start() {
//        System.out.printf("Грузовик %s %s начинает движение ",
//                this.getBrand(), this.getModel());
//    }
//    @Override
//    public void Finish() {
//        System.out.printf("Грузовик %s %s останавливается ",
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

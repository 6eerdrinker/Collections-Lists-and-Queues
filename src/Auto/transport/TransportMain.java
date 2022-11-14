package Auto.transport;

import Auto.driver.Driver;
import Auto.driver.DriverB;
import Auto.driver.DriverC;
import Auto.driver.DriverD;

import java.util.List;


public class TransportMain {
    public static void main(String[] args) {
        System.out.println("Список транспорта участвующего в соревнованиях:");
        System.out.println();
        Car bmw = new Car("Автомобиль 'BMW", "Z8'", 3.0f);
        Driver <Car> andrey = new DriverB("Андрей Андреевич Андреев", "B", 18,
                new Car("BMW", "Z8", 3.0f));
        Mechanic<Car> akseniy = new Mechanic<Car>("Аксений", "Григорьев", "Топ Гир");
        Sponsor coocooo = new Sponsor("Ку-Ку", 30_000);
        Sponsor oriental = new Sponsor("Ориентал", 900_000);
        bmw.addDriver(andrey);
        bmw.addMechanic(akseniy);
        bmw.addSponsor(coocooo, oriental);

        Car kia = new Car("Автомобиль 'KIA", "4-restyle'", 2.0f);
        Driver <Car> nik = new DriverB("Николай Николаевич Николаев", "B", 33,
                new Car("KIA", "4-restyle", 2.0f));
        Mechanic<Car> vlad = new Mechanic<Car>("Владимир", "Иванов", "Мотор");
        Sponsor rytm = new Sponsor("Ритм", 500_000);
        Sponsor tuning = new Sponsor("Тюнинг Мания", 150_000);
        kia.addDriver(nik);
        kia.addMechanic(vlad);
        kia.addSponsor(rytm, tuning);
//        Car lada = new Car("Лада", "Granta", 1.7f);
//        Car audi = new Car("Ауди", "A8 50 L TDI quattro", 3.0f);
//        Car kia = new Car("KIA", "Sportage 4-го поколения", 2.0f);
//        DriverB driverBLada = new DriverB("Василий", "B", 35,
//                new Car("Лада", "Гранта", 1.7f));
//        DriverB driverBAudi = new DriverB("Жорик", "B", 10,
//                new Car("Ауди", "А8 50 L TDI quattro", 3.0f));

        Truck kamaz = new Truck("Грузовой автомбиль 'КАМАЗ", "4326'", 10.85f);
        Driver <Truck> sergey = new DriverC("Сергей Сергеевич Сергеев", "C", 5,
                new Truck("КАМАЗ", "4326", 10.85f));
        Mechanic<Truck> evgeny = new Mechanic<Truck>("Евгений", "Аксёнов", "Вектор");
        Sponsor trassa = new Sponsor("Трасса", 350_000);
        Sponsor highway = new Sponsor("ХайВэй", 350_000);
        kamaz.addDriver(sergey);
        kamaz.addMechanic(evgeny);
        kamaz.addSponsor(trassa, highway);

//        Truck kamaz = new Truck("КАМАЗ", "4326", 10.85f);
//        Truck man = new Truck("MAN", "TGS 33.480 6x6", 12.4f);
//        Truck scania = new Truck("Scania", "S500 4×2 Highline", 16.0f);
//        Truck hino = new Truck("HINO", "700SS", 12.9f);
//
//        DriverC driverC = new DriverC("Толян", "C", 12,
//                new Truck("Камаз", "4532", 8));
        Bus paz = new Bus("Автобус 'ПАЗ", "3205'", 4.67f);
        Driver <Bus> vit = new DriverD("Виталий Витальевич Кутепов", "D", 10,
                new Bus("ПАЗ", "3205", 4.67f));
        Mechanic<Bus> ivan = new Mechanic<Bus>("Иван", "Семенов", "Движок");
        Sponsor stavka = new Sponsor("Ставка", 50_000);
        Sponsor freeBet = new Sponsor("ФриБэт", 1_900_000);
        paz.addDriver(vit);
        paz.addMechanic(ivan);
        paz.addSponsor(stavka, freeBet);

        System.out.println("Легковые автомобили: ");
        printInfo(bmw);
        System.out.println();
        printInfo(kia);
        System.out.println();
        System.out.println("Грузовые автомобили: ");
        printInfo(kamaz);
        System.out.println();
        System.out.println("Автобусы: ");
        printInfo(paz);
//        Bus paz = new Bus("ПАЗ", "3205", 4.670f);
//        Bus daewoo = new Bus("Daewoo", "BS-106", 11.051f);
//        Bus gaz = new Bus("Газ", "32215", 2.9f);
//        Bus isuzu = new Bus("Isuzu", "Citibus", 4.6f);
//
//        DriverD driverD = new DriverD("Петро", "D", 18,
//                new Bus("ПАЗ", "3205", 4.670f));
        List<Transport> transports = List.of(bmw, kamaz, paz, kia);

        AutoService autoService = new AutoService();
        autoService.addCar(bmw);
        autoService.addCar(kia);
        autoService.addTruck(kamaz);
        autoService.service();
        autoService.service();
        autoService.service();

         }

    private static void printInfo(Transport transport) {
        System.out.printf(" - %s - %s, объем двигателя %s л. ",
        transport.getBrand(), transport.getModel(), transport.getEngineVolume());
        System.out.println();
        System.out.println("Водитель: ");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.printf("%s, категория '%s', стаж вождения - %s лет.", driver.getFullName(),
                    driver.getCategory(), driver.getDrivingExperience());
        }
        System.out.println();
        System.out.println("Спонсоры: ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println("Компания " + "'" + sponsor.getName() + "'"
                    +", спонсирует заезд на " + sponsor.getAmountSum() +" руб."
            );
        }
        System.out.println("Механики: ");
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName() + " " + mechanic.getSurname()
                    + ", cервисная компания "
            + "'" + mechanic.getNameCompany() + "'");
        }
    }
}

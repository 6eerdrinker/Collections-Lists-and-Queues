package Auto.transport;

public class Mechanic <T extends Transport>{
    private final String name;
    private final String surname;
    private final String nameCompany;

    public Mechanic(String name, String surname, String nameCompany) {
        this.name = name;
        this.surname = surname;
        this.nameCompany = nameCompany;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public boolean carService(T t) {
       return t.carService();
    }

    public void autoRepair(T t) {
        t.autoRepair();
    }
}

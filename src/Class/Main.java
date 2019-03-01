package Class;
import Exception.*;

public class Main {

    public static void main(String[] args) throws WrongIlluminanceException, WrongSpaceException {
        House zdani = new House("asd");
        zdani.addRoom("001",25,3);
        zdani.getRoom("001").add(new Bulb(1300));
        zdani.getRoom("001").add(new Bulb(130));
        zdani.getRoom("001").add(new Bulb(100));
        zdani.getRoom("001").add(new Kreslo("Креслицо",8));
        zdani.getRoom("001").add(new Kreslo("Раскладной диван",3,4));

        zdani.addRoom("003", 20, 4);
        zdani.getRoom("003").add(new Table("Очень большая штука",19));
        zdani.describe();
    }

    interface Adder{
        void get();
    }
}
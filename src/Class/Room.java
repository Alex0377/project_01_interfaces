package Class;

import Interface.Furniture;
import Interface.Place;
import Exception.*;
import java.util.ArrayList;

public class Room implements Place {
    String name;
    int intensity, kolWindow;
    public int size, sizeMin, sizeMax;
    public ArrayList<Furniture> furni;
    public ArrayList<Bulb> bulbs;
    public AnotherException listExce;

    public Room(){}
    public Room(String n, int s, int kolWin){
        furni = new ArrayList<Furniture>();
        bulbs = new ArrayList<Bulb>();
        name = n;
        size = s;
        intensity = kolWin*700;
        kolWindow = kolWin;
        sizeMax = sizeMin = 0;
    }
    public void checkFurniture() throws WrongSpaceException {
        if(((sizeMax*100)/size)>70)
            throw new WrongSpaceException("Мебель занимает " + (((sizeMax*100)/size)) + "% комнаты, а это не удобно");
            else{
                System.out.print("Площадь = " + size + " м^2 ");
                if(sizeMax != 0) System.out.println("(занято " + sizeMin + "-" + sizeMax + ", гарантировано свободно "
                        + (size - sizeMax) + " м^2 или " + (100 - ((sizeMax*100)/size)) + "% площади)");
                else
                    System.out.println("(свободно 100% комнаты)");
                System.out.println("Мебель:");
            for (Furniture mebel: furni) {
                if(mebel.setMaxSize() == mebel.setMinSize())System.out.println(mebel.setName() + " (площадь " + mebel.setName() + " м^2)");
                else
                    System.out.println(mebel.setName() + " (площадь от " + mebel.setMinSize() + " м^2 до " + mebel.setMaxSize() + " м^2)");
            }
        }
    }
    public void checkLight() throws WrongIlluminanceException {
        if(intensity<300 || intensity>4000)
            throw new WrongIlluminanceException("Освещенность в комнате равна " + intensity + ", что не подходит под стандарты");
        else{
            System.out.print("Освещеность = " + intensity + " (" + kolWindow + " окна по 700 лк, лампочки ");
            if(bulbs.size()!=0)
            for (int i = 0;i<bulbs.size();i++) {
                if (i != (bulbs.size() - 1)) System.out.print(bulbs.get(i).intensity + " и ");
                else
                    System.out.println(bulbs.get(i).intensity);
            }
            else
                System.out.println("нету!!!!!!!)");
        }
    }
    public void add(Bulb b){
        bulbs.add(b);
        intensity += b.intensity;
    }
    public void add(Interface.Furniture f){
        furni.add(f);
        sizeMin += f.setMinSize();
        sizeMax += f.setMaxSize();
    }
}

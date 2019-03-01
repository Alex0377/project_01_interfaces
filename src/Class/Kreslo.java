package Class;

import Interface.Furniture;

public class Kreslo implements Furniture {
    private int minSize, maxSize;
    private String name;
    Kreslo(String str, int s){
        name = str;
        minSize = s;
    }
    Kreslo(String str, int min, int max){
        name = str;
        minSize = min;
        maxSize = max;
    }

    @Override
    public void getName() {
    }
    @Override
    public void getMinSize() {

    }
    @Override
    public void getMaxSize() {

    }

    @Override
    public String setName() {
        return name;
    }

    @Override
    public int setMinSize() {
        return minSize;
    }
    @Override
    public int setMaxSize() {
        return minSize;
    }
}

package Class;

import Interface.Furniture;

public class Table implements Furniture {
    private int minSize;
    private int maxSize;
    private String name;
    Table(String str,int s){
        name = str;
        minSize = maxSize = s;
    }
    Table(String str,int min, int max){
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
        return maxSize;
    }
}

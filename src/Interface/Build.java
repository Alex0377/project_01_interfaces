package Interface;
import Class.Room;
import Exception.*;

public interface Build {
    void addRoom(String name, int s, int kolWin);
    Room getRoom(String s);
    void describe() throws WrongIlluminanceException, WrongSpaceException;
}

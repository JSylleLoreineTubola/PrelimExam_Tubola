import java.util.*;
public class Student {
    public int ID;
    public int hrs;
    public int pts;

    public Student(int ID, int hrs, int pts) {
        this.ID = ID;
        this.hrs = hrs;
        this.pts = pts;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }
}
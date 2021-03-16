import java.util.*;
public class Student {
    private int ID;
    private int pts;
    private int hrs;
    private double gp;

    public Student() {
    }

    public Student(int ID, int pts, int hrs) {
        this.ID = ID;
        this.pts = pts;
        this.hrs = hrs;
        calculateGradePoint();
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

   @Override
   public String toString() {
       return "\n ID number : " + ID + "\n Number of points earned : " + pts + "\n Credit hours : " + hrs + "\n Grade point average : "
               + gp;
   }

   public void calculateGradePoint() {
       gp = pts / (double) hrs;
   }
}
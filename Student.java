import java.util.*;
public class Student {
    private int IDd;
    private int pts;
    private int hrs;
    private double gp;

    public Student() {
    }

    public Student(int IDd, int pts, int hrs) {
        this.IDd = IDd;
        this.pts = pts;
        this.hrs = hrs;
        calculateGradePoint();
    }

    public int getIDd() {
        return IDd;
    }

    public void setIDd(int IDd) {
        this.ID = IDd;
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
       return "\n ID number : " + IDd + "\n Number of points earned : " + pts + "\n Credit hours : " + hrs + "\n Grade point average : "
               + gp;
   }

   public void calculateGradePoint() {
       gp = pts / (double) hrs;
   }
}
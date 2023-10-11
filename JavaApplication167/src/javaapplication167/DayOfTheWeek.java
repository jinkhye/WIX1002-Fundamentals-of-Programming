package javaapplication167;

public class DayOfTheWeek {

    public int q,m,y,J,K;
    public double h;
    
    public DayOfTheWeek(int q, int m, int y) {
        this.q = q;
        this.m = m;
        this.y = y;
    }
    
    public boolean valid() {
        int days;
        switch(m) {
            case 3,5,7,8,10,12 -> days = 31;
            case 4,6,9,11 -> days = 30;
            case 1 -> {
                days = 31;
                m = 13;
                y--;
            }
            case 2 -> {
                if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                    days = 29;
                    m = 14;
                    y--;
                }
                else {
                    days = 28;
                    m = 14;
                    y--;
                }
            }
            default -> days = 0;
        }
        return (q > 0 && q <= days);
    }
    
    public boolean leap() {
        return (y % 4 ==0 && y % 100 != 0 || y % 400 == 0);
    }
    
    public String dayoftheweek() {
        if (valid()) {
            String day = "";
            J = y / 100;
            K = y % 100;
            h = (q + Math.floor((13 * (m + 1)) / 5) + K + Math.floor(K/4) + Math.floor(J/4) + 5 * J) % 7;
            switch ((int)h) {
                case 0 -> day = "Saturday";
                case 1 -> day = "Sunday";
                case 2 -> day = "Monday";
                case 3 -> day = "Tuesday";
                case 4 -> day = "Wednesday";
                case 5 -> day = "Thursday";
                case 6 -> day = "Friday";
            }
            return "is on " + day;
        }
        else {
            return "is invalid Input";
        }
    }
}
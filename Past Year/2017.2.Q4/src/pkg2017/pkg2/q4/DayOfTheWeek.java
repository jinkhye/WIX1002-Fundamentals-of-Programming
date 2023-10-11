package pkg2017.pkg2.q4;

public class DayOfTheWeek {
    
    private int q, m, y;

    public DayOfTheWeek (int q, int m, int y) {
        this.q = q;
        this.m = m;
        this.y = y;
    }
    
    public boolean validate() {
        int days = 0;
        switch (m) {
            case 1 -> {
                m = 13;
                days = 31;
                y--;
            }
            case 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> {
                if (leap()) {
                    m = 14;
                    days = 29;
                    y--;
                }
                else {
                    m = 14;
                    days = 28;
                    y--;
                }
            }
            default -> {
            }
        }
        return (q > 0 && q <= days);
    }

    public boolean leap() {
        return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0);
    }
    
    public String dayoftheweek() {
        String day = "";
        double K = y % 100;
        double J = y / 100;
        double h = (int)(q + Math.floor((13 * (m + 1)) / 5) + K + Math.floor(K / 4) + Math.floor(J / 4) + 5 * J) % 7;
        
        switch ((int)h) {
            case 0 -> day = "Saturday";
            case 1 -> day = "Sunday";
            case 2 -> day = "Monday";
            case 3 -> day = "Tuesday";
            case 4 -> day = "Wednesday";
            case 5 -> day = "Thursday";
            case 6 -> day = "Friday";
        }
        return day;
    }
    
    @Override
   
    public String toString() {
        String result = "";
        result += q + "/" + m + "/" + y + " ";
        if (validate()) {
            result += "is on " + dayoftheweek();
        }
        else {
            result += "invalid Input";
        }
        return result;
    }
}
package part1.task6;

public class Exercise6 {
    public static void main(String[] args) {
        int s = 3700;
        int sec, m, min,h, hour, d, day, week;

        sec = s % 60;
        m = (s - sec) / 60;

        min = m % 60;
        h = (m - min) / 60;

        hour = h % 60;
        d = (h - hour) / 60;

        day = d % 60;
        week = (d - day) / 60;

        System.out.println( hour + " час " + min + " минут " + sec + " cекунд " + day + " сутки " + week + " недели " );
    }
}

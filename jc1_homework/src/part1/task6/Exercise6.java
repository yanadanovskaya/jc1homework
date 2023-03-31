package part1.task6;

public class Exercise6 {
    public static void main(String[] args) {
        int sec = 604_800, min, h, day, week;
        min = sec / 60;
        h = sec / 3600;
        day = sec / 86_400;
        week = sec / 604_800;

        System.out.println("min=" + min + "; h=" + h + "; day=" + day + "; week=" + week);
    }
}

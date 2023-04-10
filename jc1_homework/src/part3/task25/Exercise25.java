package part3.task25;

public class Exercise25 {

    public static class Time {
        int sec;
        int min;
        int hour;
        public Time(int sec) {
            this.sec = (sec / 3600) % 60;
            this.min = (sec / 3600) / 60;
            this.hour = sec / 3600;
        }
        public Time(int sec, int min, int hour) {
            this.sec = sec;
            this.min = min;
            this.hour = hour;

        }

        private void getTime() {
            if (sec > 59) {
                this.min = min + sec / 60;
                this.sec = sec % 60;
            }
            if (min > 59) {
                this.hour = hour + min / 60;
                this.min = min % 60;
            }
            System.out.println(this.sec + " " + this.min + " " + this.hour);
        }

        public static void main(String[] args) {
            Time time = new Time(10,60,80);
            time.getTime();

            Time time1=new Time(time.sec);
            Time time2=new Time(time.min);

            int i=time1.compareTo(time2);
        }

        private int compareTo(Time time2) {

            return 0;
        }
    }
}

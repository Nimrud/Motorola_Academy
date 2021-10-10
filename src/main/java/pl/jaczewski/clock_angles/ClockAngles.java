package pl.jaczewski.clock_angles;

// Jest godzina 3:15. Jaki kąt tworzą ze sobą wskazówki zegara?

public class ClockAngles {
    public static void main(String[] args) {
        ClockAngles angles = new ClockAngles();
        System.out.println(angles.calcAngle(3, 15));
    }

    public int calcAngle(int hrs, int min) {
        if (hrs < 0 || min < 0 || hrs > 24 || min > 60) {
            throw new IllegalArgumentException("Złe dane wejściowe");
        }

        if (hrs > 12) {
            hrs -= 12;
        }

        if (hrs == 12) {
            hrs = 0;
        }

        if (min == 60) {
            min = 0;
            hrs += 1;
        }

        /*
        minutnik pokonuje 360 stopni zegara w 60 min (=> 6 stopni na min)
        wskazówka godzinna: 360 st. w 12 godz. (=> 0,5 stopnia na min)
         */
        int hourAngle = (int) ((hrs * 60 + min) * 0.5);
        int minuteAngle = min * 6;

        int angle = Math.abs(hourAngle - minuteAngle);

        return angle;
    }
}

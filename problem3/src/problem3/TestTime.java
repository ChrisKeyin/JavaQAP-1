package problem3;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        t1.setHour(21); t1.setMinute(10); t1.setSecond(15);
        t2.setHour(10); t2.setMinute(20); t2.setSecond(25);

        System.out.println("Before changes:");
        System.out.println("t1 = " + t1);  // 21:10:15
        System.out.println("t2 = " + t2);  // 10:20:25
        
        System.out.println("\nApplying nextSecond() to t1 and previousSecond() to t2...");
        t1.nextSecond();        // -> 21:10:16
        t2.previousSecond();    // -> 10:20:24

        System.out.println("\nAfter changes:");
        System.out.println("t1 = " + t1);  // 21:10:16
        System.out.println("t2 = " + t2);  // 10:20:24
    }
}

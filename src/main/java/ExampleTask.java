public class ExampleTask {
    public static void main(String[] args) {

        int sec = 506770000;
        int min = sec / 60;
        int hour = min / 60;
        int days = hour / 24;
        int week = days / 7;
        int years = days / 365;

        System.out.println("Секунд: " + sec);
        System.out.println("Минут: " + min);
        System.out.println("Часов: " + hour);
        System.out.println("Дней: " + days);
        System.out.println("Недель: " + week);
        System.out.println("Лет: " + years);


        int speed = 300000;
        long seconds = days * 24 * 60 * 60;
        long distance = speed * seconds;
        System.out.println(distance);



        byte b = 5;
        int i = 9, k = 91;
        long l = 30_000_000_000L;

        // b = b + 150; переполнение типа byte
        //  k  = k - 1000000000000000000000000; переполнение типа int
        System.out.println((k + i) > (i - k));
        System.out.println(k * i);
        System.out.println(k / i);
        System.out.println(k % i);
        System.out.println(i += k); // int + long

        System.out.println(l + k);

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        System.out.println(b > i);
        System.out.println(k != i);

        float f = 0.5F;
        double d = 5.84;

        System.out.println(((f - d) > 0) && ((d - f) > 0));
        System.out.println(((f - d) > 0) || ((d - f) > 0));
        System.out.println(d / f);
        System.out.println(d % f);

        char c = 'q', t = 'a';
        boolean bol = false;

        System.out.println(c + t); // char + char
        System.out.println(!bol);
    }

}

package Group1.chapter3;

public class Light {
    public static void main(String[] args) {

        int ligthspeed;
        long days;
        long seconds;
        long distance;

        ligthspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = ligthspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет оклол ");
        System.out.println(distance + " миль. ");
    }
}

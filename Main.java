public class Main
{
    public static void main(String[] args)
    {
        Parts part = new Parts("Generic Part");
        System.out.println(part);

        Engine steam = new Engine(false,"Steam");
        System.out.println();
        System.out.println(steam);

        Wheel wheel = new Wheel(20);
        System.out.println();
        System.out.println(wheel);

        Tank tank = new Tank(50, "Liters", "Diesel");
        System.out.println();
        System.out.println(tank);
    }
}
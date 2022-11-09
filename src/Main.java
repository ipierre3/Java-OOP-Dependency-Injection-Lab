public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Weapon gun = new Weapon("Gun", 50);
        Robot robot_one = new Robot(gun);
        System.out.println(robot_one.name);
        robot_one.Attack();

    }
}
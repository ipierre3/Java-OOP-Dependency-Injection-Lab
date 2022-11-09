public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Weapon gun = new Weapon("Gun", 50);
        Weapon club = new Weapon("Club", 25);
        Robot robot_one = new Robot(club);
        System.out.println(robot_one.name);
        robot_one.Attack();

    }
}
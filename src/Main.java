public class Main {
    public static void main(String[] args) {

        Lightsaber Lightsaber = new Lightsaber();

        Vulcan_Nerve_Pinch Vulcan_Nerve_Pinch = new Vulcan_Nerve_Pinch();

        Railgun Railgun = new Railgun();

        Robot robot_one = new Robot("Astro-boy", Lightsaber);

        Robot robot_two = new Robot("Spock-bot", Vulcan_Nerve_Pinch);

        Robot robot_three = new Robot("XJ9", Railgun);

        robot_one.Attack();
        robot_two.Attack();
        robot_three.Attack();

        Attacker Filthy_Organic_one = new Filthy_Organic("John", 15);
        Filthy_Organic_one.Attack();

    }
}
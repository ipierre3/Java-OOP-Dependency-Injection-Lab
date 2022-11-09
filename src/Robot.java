public class Robot {

    //Instance variables (HAS A)
    public String name;
    public Weapon weapon;

    //Constructor
    public Robot() {
        this.name = "AstroBoy";
        this.weapon = new Weapon("Gun", 50);

    }

    //Methods (CAN DO)
    public void Attack() {
        System.out.println(this.name + " attacks with his " + this.weapon.name + " for " + this.weapon.power + " damage ");
    }
}

public class Robot {

    //Instance variables (HAS A)
    public String name;
    public String weaponName;
    public int weaponPower;

    //Constructor
    public Robot() {
        this.name = "T-1000";
        this.weaponName = "Gun";
        this.weaponPower = 50;
    }

    //Methods (CAN DO)
    public void Attack() {
        System.out.println(this.name + " attacks with their " + this.weaponName + " for " + this.weaponPower + " damage ");
    }
}

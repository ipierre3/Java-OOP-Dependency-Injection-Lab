public class Filthy_Organic implements Attacker{
    //Instance variables (HAS A)
    public String name;
    public int attackPower;

    //Constructor
    public Filthy_Organic(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;

    }
    public void Attack() {
        System.out.println(this.name + " attacks for " + this.attackPower + " damage ");

    }
}


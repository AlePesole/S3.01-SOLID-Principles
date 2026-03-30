public class Warrior extends Character {
    public Warrior() {
        super(new StandardPhysicalDamage());
    }

    @Override
    public void attack() {
        System.out.println("The warrior strikes with a sword.");
    }

}

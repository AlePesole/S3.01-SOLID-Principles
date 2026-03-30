public class StandardPhysicalDamage implements PhysicalDamageable {
    public void takeDamage(int points) {
        System.out.println("The character resists and only takes " + (points / 2) + " points of damage.");
    }
}

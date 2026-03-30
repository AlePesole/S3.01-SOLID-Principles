public class NoPhysicalDamage implements PhysicalDamageable {
    public void takeDamage(int points) {
        System.out.println("The character cannot take physical damage!");
    }
}

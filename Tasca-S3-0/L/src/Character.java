public class Character {
    PhysicalDamageable physicalDamageable;

    public Character(PhysicalDamageable physicalDamageable) {
        this.physicalDamageable = physicalDamageable;
    }

    public void attack() {
        System.out.println("The character attacks with a weapon.");
    }

    public void takeDamage(int points) {
        physicalDamageable.takeDamage(points);
    }
}

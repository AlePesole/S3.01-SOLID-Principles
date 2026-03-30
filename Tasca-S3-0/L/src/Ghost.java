public class Ghost extends Character {
    public Ghost() {
        super(new NoPhysicalDamage());
    }

    @Override
    public void attack() {
        System.out.println("The ghost casts a spooky spell.");
    }
}

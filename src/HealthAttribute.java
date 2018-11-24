public class HealthAttribute implements Attribute {
    int health=10;

    @Override
    public int getAttribute() {
        return health;
    }

    @Override
    public void setAttribute(int attribute) {
        this.health=attribute;
    }

    @Override
    public void add(Hero hero) {
        hero.setHealth(hero.getHealth()+health);
    }
}

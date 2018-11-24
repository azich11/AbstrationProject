package AbstrationProject;

public class HealthAttribute implements Attribute {
    int health;

    @Override
    public int getAttribute() {
        return health;
    }

    @Override
    public void setAttribute(int attribute) {
        this.health=attribute;
    }
}

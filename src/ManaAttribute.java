package AbstrationProject;

public class ManaAttribute implements Attribute{
    int mana;

    @Override
    public int getAttribute() {
        return mana;
    }

    @Override
    public void setAttribute(int attribute) {
        this.mana=attribute;
    }
}

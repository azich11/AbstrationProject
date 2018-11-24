public class ManaAttribute implements Attribute{
    int mana=5;


    @Override
    public int getAttribute() {
        return mana;
    }

    @Override
    public void setAttribute(int attribute) {
        this.mana=attribute;
    }

    @Override
    public void add(Hero hero) {
        hero.setMana(hero.getMana()+mana);
    }
}

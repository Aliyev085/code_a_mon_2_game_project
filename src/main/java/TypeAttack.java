//Factory Design Pattern

public class TypeAttack implements Attack {
    protected Attack decoratedAttack;
    public TypeAttack(Attack decoratedAttack) {
        this.decoratedAttack = decoratedAttack;
    }

    public void attack() {
        decoratedAttack.attack();
        System.out.println("Attack Start by Code A Mon");
    }
}

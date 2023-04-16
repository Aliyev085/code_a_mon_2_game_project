//Decorator design pattern.
// This code is an example of the Decorator design pattern. The Decorator pattern is a structural design pattern that allows behavior to be added to an individual object,
// either statically or dynamically, without affecting the behavior of other objects from the same class.
//In this example, the class DoubleDamageTypeAttack is a decorator that extends the functionality of the class TypeAttack by adding the ability to display a message on the console whenever the method "attack" is called.
// The class Attack is decorated by passing an instance of it to the constructor of DoubleDamageTypeAttack.
// The class DoubleDamageTypeAttack overrides the attack method and calls the decorated attack method, then it calls setDoubleDamageTypeAttack method which displays the message on the console.
public class DoubleDamageTypeAttack extends TypeAttack {
    public DoubleDamageTypeAttack(Attack decoratedAttack) {
        super(decoratedAttack);
    }

    @Override
    public void attack() {
        decoratedAttack.attack();
        setDoubleDamageTypeAttack(decoratedAttack);
    }

    private void setDoubleDamageTypeAttack(Attack decoratedAttack) {
        // Display message whenever function is called
        System.out.println("----------Double type Attack Start by Code A Mon----------");

    }
}

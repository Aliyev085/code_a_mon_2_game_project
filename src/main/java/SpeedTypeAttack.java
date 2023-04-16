//Decorator Design Pattern
//This code defines a class called "SpeedTypeAttack" that extends a class "TypeAttack" which decorated an object of the class "Attack". The class overrides the "attack" method from the TypeAttack class. The method calls the "attack" method of decorated object and set the speed type attack.
//This code is an example of the "Decorator" design pattern. The "Decorator" pattern allows for behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class.
// The "SpeedTypeAttack" class is adding the functionality of speed type attack to the decorated "Attack" class without modifying the behavior of the "Attack" class.

public class SpeedTypeAttack extends TypeAttack {
    public SpeedTypeAttack(Attack decoratedAttack) {
        super(decoratedAttack);
    }

    @Override
    public void attack() {
        decoratedAttack.attack();
        setSpeedTypeAttack(decoratedAttack);
    }

    private void setSpeedTypeAttack(Attack decoratedAttack) {
        // Display message whenever function is called
        System.out.println("----------Speed type Attack Start by Code A Mon----------");

    }
}

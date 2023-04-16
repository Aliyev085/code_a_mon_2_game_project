//Template Method" design pattern
//This code defines a class called "TrainerAttack" that implements the "Attack" interface.
// The class overrides the "attack" method from the interface, but the method body is empty.
//This code is an example of the "Template Method" design pattern.
// The "attack" method defined in the Attack interface acts as a template method, and the child class TrainerAttack will provide the implementation for this method.
//This allows for common behavior to be defined in a base class or interface,
// while allowing subclasses to provide specific implementation details.

public class TrainerAttack  implements Attack {
    @Override
    public void attack() {
        // int trainerDamage = (int) (Math.random() * 12);
    }
}

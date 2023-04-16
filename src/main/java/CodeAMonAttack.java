// concrete strategy

//This code is an example of the Concrete Strategy pattern.
// The CodeAMonAttack class is a concrete implementation of the Attack interface, which serves as the strategy.
// The attack() method in this class provides a specific implementation of the attack behavior defined in the Attack interface.
// This pattern allows for different variations of the attack behavior to be implemented and swapped out at runtime,
// while still adhering to the common interface defined by the strategy.

public class CodeAMonAttack implements Attack {
    @Override
    public void attack() {
        // int code_A_Mon_Damage = (int) (Math.random() * 12);
    }
}

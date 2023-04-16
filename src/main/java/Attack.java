// Strategy interface/design pattern
// This code is an example of the Strategy design pattern.
//The Attack interface acts as the strategy and defines a common method for attacking.
//Concrete classes that implement the Attack interface provide specific implementations of the attack behavior.
//This pattern allows for the behavior of a class to be easily changed at runtime by switching out the strategy being used.
//It also promotes the encapsulation of the implementation of the attack behavior, as the client code only interacts with the strategy through the common interface.


public interface Attack {
    public void attack();
}

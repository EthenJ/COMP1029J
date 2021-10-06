/**
 * This is the definition of the Dog3 class.
 */

public class Dog3
{
    int weight = 5; // the weight of the dog
    
    // Ask the dog to bark
    void bark() {
        System.out.println("Woof!");
    }
    
    // Feed the dog with a certain amount of food
    void feed(int food) {
        weight = weight + food;
    }
    
    // Get the current weight of the dog
    int getWeight() {
        return weight;
    }
}

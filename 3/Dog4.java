/**
 * This is the definition of the Dog4 class.
 */

public class Dog4
{
    int weight; // the weight of the dog

    // The constructor of the class
    public Dog4(int initialWeight) {
        weight = initialWeight;
    }
    
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

public class Dog extends Animal {

    private String owner;

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public void play(){
        System.out.println("Dog "+ name+" is chasing its tail");

    }

    @Override
    public void play(Toy toy) {
        System.out.println(name + " is playing with " + toy);
    }
}

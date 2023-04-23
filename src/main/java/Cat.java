public class Cat extends Animal {


    public Cat(String name, int age) {
        super (name, age);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void play(){
        System.out.println("Cat "+ name+" jumps onto the table");

    }
    @Override
    public void play(Toy toy) {
        System.out.println(name + " is playing with " + toy);
    }
}
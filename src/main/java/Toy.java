public class Toy {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    public void play(){
        System.out.println("Toy of brand" + name + " is making some weird sound");
    }

    public void play(Toy toy){
        System.out.println("Robot "+ name + " is happy to see " + toy);
    }




}

public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("Coco", 14);
        Dog max = new Dog("max", 5, "Peng");
        Rabbit white  = new Rabbit("red", 1);

        Toy Geroge = new Toy ("geroge");

        Action [] friends = new Action[3];
        friends [0] = coco;
        friends [1] = max;
        friends [2] = white;




        Geroge.play();
        for (Action Friends : friends) {
            Friends.play(Geroge);
        }
    }
}


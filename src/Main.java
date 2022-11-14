import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Shark("Blue Shark"),
                new Shark("Black Shark"),
                new Turtle("Black Turtle"),
                new Turtle("Green Turtle"),
                new Eagle("Big Eagle"),
                new Eagle("Small Eagle")
        };
        System.out.println(" ");
        System.out.println("-----GetClass-------");
        for (Animal animal : animals) {
            if (animal.getClass().equals(Shark.class)) ((Shark) animal).attack();
              else if (animal.getClass().equals(Turtle.class)) ((Turtle) animal).swim();
                else if (animal.getClass().equals(Eagle.class))((Eagle) animal).fly();
                System.out.println(animal);
        }
        int shark = 0;
        int turtle = 0;
        int eagle = 0;
        Shark [] sharks = new Shark[2];
        Turtle [] turtles = new Turtle[2];
        Eagle [] eagles = new Eagle[2];
        System.out.println("------InstanceOF--------");
        for (Animal animal : animals) {
            if (animal instanceof Shark){
                sharks [shark] = (Shark) animal;
                shark++;
            } else if (animal instanceof Turtle) {
                turtles [turtle] = (Turtle) animal;
                turtle++;
            } else if (animal instanceof Eagle) {
                eagles [eagle] = (Eagle) animal;
                eagle++;
            }
        }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));
    }
}
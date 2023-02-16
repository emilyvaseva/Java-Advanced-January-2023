package P09ExamPreparation.P03;

public class Main {
    public static void main(String[] args) {

        Bag bag = new Bag("black", 10);

        Present present = new Present("Doll", 0.4, "girl");

        System.out.println(present);

        bag.add(present);
        bag.remove("Toy");

        Present secondPresent = new Present("Train", 2, "boy");

        bag.add(secondPresent);

        Present heaviestPresent = bag.heaviestPresent();

        System.out.println(heaviestPresent);

        Present p = bag.getPresent("Doll");

        System.out.println(p);
        System.out.println(bag.count());
        System.out.println(bag.report());
    }
}

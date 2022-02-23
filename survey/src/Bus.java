

public class Bus {
    public static void main(String[] args) {
        int passengers = 0;
        passengers += 9;
        System.out.println(passengers);
        passengers -= 5;
        System.out.println(passengers);

        String p = "Passengers";


        Person brandon = new Person();
        brandon.age = 39;
        System.out.println(brandon.age);

        brandon.Greet();
        brandon.name = "Brandon";
        System.out.println(brandon.myName());
    }
}

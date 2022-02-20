public class JavaIntro {
    public static void main(String[] args) {
        System.out.println("Kalvin is the Best! Yes!");

        int myAge = 39;
        double month = .2;
        System.out.println(myAge);
        char firstLetter = 'b';
        String brandon = "brandon";
        
        System.out.println(brandon.length());

        System.out.println(brandon.toUpperCase());
        DoStuff("Brandon is the best!");

        DoStuff(ReturnString("Brandon"));


        if (myAge > 30) {
            DoStuff("You're an OLD man!");
        } else {
            DoStuff("You have a ways to go");
        }

        for (int i = 1; i <= 10; i ++) {
            System.out.println(i);
        }
        
        TestClass.meow();

        Cat Kitty = new Cat();
        Kitty.name = "Kalvin";
        Kitty.age = 6;
        Kitty.purr();
        System.out.println(Kitty.name);
    }

    // creating our own method
    public static void DoStuff(String stuff) {
        System.out.println(stuff);
    }

    public static String ReturnString(String str) {
        return str + " return string";
    }
}

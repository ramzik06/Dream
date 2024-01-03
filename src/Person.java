import java.util.Scanner;

public class Person {
    private String fullName;
    private int age;


    public Person() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите полное имя: ");
        this.fullName = scanner.nextLine();

        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
    }


    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    public void move() {
        System.out.println(fullName + " двигается.");
    }


    public void talk() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(fullName + " говорит: ");
        String message = scanner.nextLine();
        System.out.println(fullName + " сказал: " + message);
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.move();
        person1.talk();


        System.out.print("Введите ваше полное имя: ");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();

        System.out.print("Введите ваш возраст: ");
        int inputAge = scanner.nextInt();

        Person person2 = new Person(inputName, inputAge);
        person2.move();
        person2.talk();
    }
}

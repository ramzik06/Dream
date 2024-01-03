
class Animal {
    String food;
    String location;
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Такое животное спит");
    }

    public void eat() {
        System.out.println("Животное ест " + food);
    }

    public void sleep() {
        System.out.println("Животное спит");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }


    public void makeNoise() {
        System.out.println("Гав Гав");
    }


    public void eat() {
        System.out.println("Собака ест " + food);
    }
}

class Cat extends Animal {
    String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }


    public void makeNoise() {
        System.out.println("Мяу Мяу нгга");
    }


    public void eat() {
        System.out.println("Кошка ест " + food);
    }
}

class Horse extends Animal {
    String breed;

    public Horse(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }


    public void makeNoise() {
        System.out.println("Boko chango sie te kureta, H'iriondo meta mi Nie naa ri Katon datte Tole Tole");
    }


    public void eat() {
        System.out.println("Лошадь ест " + food);
    }
}

class Veterinary {
    public void treatAnimal(Animal animal) {
        System.out.println("Ветеринар обрабатывает животное:");
        System.out.println("Еда: " + animal.food);
        System.out.println("Местонахождение: " + animal.location);
        System.out.println();
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Мясо", "Дом", "Овчарка"),
                new Cat("Корм", "Квартира", "Рыжий"),
                new Horse("Сено", "Ангар", "ДревнеГреческий")
        };

        Veterinary vet = new Veterinary();

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
            vet.treatAnimal(animal);
        }
    }
}


class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Reader {
    String fullName;
    int libraryCardNumber;
    String faculty;
    String birthDate;
    String phone;

    public Reader(String fullName, int libraryCardNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги:");
        for (String title : bookTitles) {
            System.out.print(" " + title + ",");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги:");
        for (Book book : books) {
            System.out.print(" " + book.title + " (автор: " + book.author + "),");
        }
        System.out.println();
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги:");
        for (String title : bookTitles) {
            System.out.print(" " + title + ",");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }
}

public class Library {
    public static void main(String[] args) {
        Reader[] readers = new Reader[2];
        readers[0] = new Reader("Arman Z.R.", 12345, "Информатика", "01.01.1990", "123-456-7890");
        readers[1] = new Reader("Namra N.M.", 67890, "Физика", "15.05.1985", "987-654-3210");

        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].takeBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"), new Book("Энциклопедия", "Автор3"));

        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[1].returnBook(2);
    }
}

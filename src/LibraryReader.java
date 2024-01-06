public class LibraryReader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public LibraryReader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взяла " + numberOfBooks + " книги");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взяла книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взяла книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " (" + book.getAuthor() + "), ");
        }
        System.out.println();
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернула книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернула " + numberOfBooks + " книги");
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернула книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " (" + book.getAuthor() + "), ");
        }
        System.out.println();
    }
}

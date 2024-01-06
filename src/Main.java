public class Main {

        public static void main(String[] args) {
            LibraryReader reader1 = new LibraryReader("Айнур Айнурова", 12345, "Факультет дур", "28.04.2006", "+123456789");
            LibraryReader reader2 = new LibraryReader("Дария Дариянова", 54321, "Факультет крутых", "11.02.2006", "+987654321");

            Book book1 = new Book("Приключения", "Автор1");
            Book book2 = new Book("Словарь", "Автор2");
            Book book3 = new Book("Энциклопедия", "Автор3");

            reader1.takeBook(3);
            reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
            reader1.takeBook(book1, book2, book3);

            reader2.returnBook("Приключения", "Словарь", "Энциклопедия");
            reader2.returnBook(3);
            reader2.returnBook(book1, book2, book3);
        }
    }

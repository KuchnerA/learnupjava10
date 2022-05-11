public class Main {

    public static void main(String[] args) {

        ContactsBook book = new ContactsBook();

        book.add(new Contact("Maxim", "88_005_553_535"));
        book.add(new Contact("Alex", "88_444_444_444"));
        book.add(new Contact("Zoya", "88_444_613_333"));
        book.add(new Contact("Nicolay", "88_153_444_222"));


        Contact foundContact = book.getByPhone("88_005_553_535");
        System.out.println(foundContact);
        book.removeByPhone("88_444_444_444");

        System.out.println(book.returnContactsBook());
    }

}

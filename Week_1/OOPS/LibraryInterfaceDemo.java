public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        
        // Test Case : 1   for kid user
        
        System.out.println(".......Testing for the kid user........");
        System.out.println();

        KidUser kid = new KidUser();
        
        kid.age = 10;
        kid.registerAccount();

        kid.age = 18;
        kid.registerAccount();

        kid.bookType = "Kids";
        kid.requestBook();

        kid.bookType = "Fiction";
        kid.requestBook();



        // Test Case : 2   for adult user

        System.out.println("........Testing for the Adult user........");
        System.out.println();

        AdultUser adult = new AdultUser();

        adult.age = 5;
        adult.registerAccount();

        adult.age = 23;
        adult.registerAccount();

        adult.bookType = "Kids";
        adult.requestBook();

        adult.bookType = "Fiction";
        adult.requestBook();
    }
}

public class AdultUser implements LibraryUser {
    
    // Instance Variables
    int age;
    String bookType;

    // Logic for the kid to register account
    @Override
    public void registerAccount(){
        if(age > 12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
        System.out.println();
    }

    //Logic for the kid to request book
    @Override
    public void requestBook(){
        if(bookType.equalsIgnoreCase("Fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
        System.out.println();
    }
}

public class EmailConfirmation {

    public void send(String email) {
        System.out.println("📧 Sending confirmation email to: " + email);
        //Send email confirmation....
    }

    public void check(String email) {
        boolean userConfirmed = true;
        //Check user confirmation email...
        if (!userConfirmed) {
            System.out.println("⚠️ User did not confirm registration.");
            return;
        }
    }
}

public class UserRegistrator {
    private UserValidator userValidator;
    private EmailConfirmation emailConfirmation;

    public UserRegistrator(EmailConfirmation emailConfirmation, UserValidator userValidator) {
        this.userValidator = userValidator;
        this.emailConfirmation = emailConfirmation;
    }

    public void registrate(User user) {
        userValidator.validateEmail(user.getEmail());
        userValidator.validatePassword(user.getPassword());

        emailConfirmation.check(user.getEmail());
        System.out.println("User " + user + " has been registered successfully.");
    }
}

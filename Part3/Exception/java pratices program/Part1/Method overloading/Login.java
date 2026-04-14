class Login {

    // Login with username only
    public static void login(String username) {
        System.out.println( username);
    }

    // Login with username and password
    public static void login(Long password) {
        System.out.println( password);
    }

    // Login with username, password and OTP
    public static void login(int otp) {
        System.out.println(otp);
    }

    public static void main(String[] args) {

        login("ABC");
        login(123422335);
        login(7890);
    }
}

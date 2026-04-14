class NLogin {

    // Login with username only
  void login(String username) {
        System.out.println("Login successful with username: " + username);
    }

    // Login with username and password
     void login(String username, String password) {
        System.out.println("Login successful with Password: " + password);
    }

    // Login with username, password and OTP
   void login(String username, String password, int otp) {
        System.out.println("Login successful with OTP: " + otp);
    }

    public static void main(String[] args) {
NLogin obj = new NLogin();

        obj.login("muskan");
        obj.login("muskan", "12345");
        obj.login("muskan", "12345", 7890);
    }
}

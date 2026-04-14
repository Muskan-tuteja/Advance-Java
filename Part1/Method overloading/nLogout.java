class nLogout {

    // Logout with username only
   void logout(String username) {
        System.out.println("Logout successful with username: " + username);
    }

    // Logout with username and reason
 void logout(String username, String reason) {
        System.out.println("Logout successful with reason: " + reason);
    }

    // Logout with username, reason and time
 void logout(String username, String reason, int time) {
        System.out.println("Logout successful at time: " + time);
    }

    public static void main(String[] args) {
nLogout obj = new nLogout();

       obj.logout("muskan");
       obj.logout("muskan", "User clicked logout");
        obj.logout("muskan", "Session expired", 1030);
    }
}

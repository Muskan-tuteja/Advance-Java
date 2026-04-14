class User{
    private String user_id;
    private String user_name;
    private double password;
    int pwd;

    public String getUserid(){
        return user_id;
    }
    public String getUsername(int pwd){
        if(this.pwd == pwd)
        return user_name;
        else
        return "invalid";
    }
    public double getPassword(){
        return password;
    }
    public void setUserid(String user_id){
        this.user_id = user_id;
    }
    public void setUsername(String user_name,int pwd){
        if(this.pwd == pwd)
        this.user_name = user_name;
        else
        System.out.println("INVLID PWD");
        
    }
    public void setPassword(int password){
        this.password = password;
    }
    public User(String user_id,String user_name,int password,int pwd){
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.pwd = pwd;
    }
    public static void main(String[] args) {
        User a = new User("Abc@123","Priyanshu",456,875);
        System.out.println(a.user_id);
        
    }
}
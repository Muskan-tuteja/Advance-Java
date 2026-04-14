public class Teacher {
    private int teacher_age;
    private long teacher_phno;
    private String teacher_id;
    private String teacher_name;

    public int getAge(){
        return teacher_age;
    }

    public long getMobno(){
        return teacher_phno;
    }

    public String getName(){
        return teacher_name;
    }

    public String getId(){
        return teacher_id;
    }

    public void setAge(int age){
        this.teacher_age = age;
    }

    public void setMobno(long phno){
        this.teacher_phno = phno;
    }

    public void setName(String name){
        this.teacher_name = name;
    }

    public void setId(String id){
        this.teacher_id = id;
    }

    public Teacher(){
        
    }
    public Teacher(int age){
        this.teacher_age = age;
       
    }
    public Teacher(long phno,String name){
        this.teacher_phno = phno;
        this.teacher_name = name;
        
    }
    public Teacher(String id){
        this.teacher_id = id;
        
    }
    public Teacher(int age2,String id2,String name2,long phno2){
        this.teacher_age = age2;
        this.teacher_id = id2;
        this.teacher_name = name2;
        this.teacher_phno = phno2;
        
    }

    public static void main(String[] args) {
        Teacher value1 = new Teacher();
        Teacher value2 = new Teacher();
        Teacher value3 = new Teacher(21);
        Teacher value4 = new Teacher(19);
        Teacher value5 = new Teacher(82827345655l,"Rahul");
        Teacher value6 = new Teacher(7836858979l,"Priyanshu");
        Teacher value7 = new Teacher("AB12");
        Teacher value8 = new Teacher("CD39");
        Teacher value9 = new Teacher(85,"Priyanshu","Sharik",9844884848l);
        Teacher value10 = new Teacher(98,"Sharik","Vikash",8348834733l);
    }
}

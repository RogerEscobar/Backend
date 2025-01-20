package C8_SpringBoot.Model;

public class User {
    private String name;
    private int age;
    private String email;
    private String gender;
    public User (String name, int age, String email, String gender){
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }
//Get
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    public String getGender() {
        return gender;
    }
//Set
    public String setName() {
        return name;
    }

    public int setAge() {
        return age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String setGender() {
        return gender;
    }

}

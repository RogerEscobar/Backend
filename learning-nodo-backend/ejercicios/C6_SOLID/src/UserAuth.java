/*
//Codigo original violacion DRY
public class UserAuth {
    public boolean loginAdmin(String username, String password) {
        if (username.equals("admin") && password.equals("1234")){
            return true;
        }
        return false;
    }
    public boolean loginRegularUser(String username, String password){
        if (username.equals("user") && password.equals("abcd")) {
            return true;
        }
        return false;
    }
}*/
public class UserAuth {
    public boolean login(String username, String password) {
        return (username.equals("admin") && password.equals("1234")) ||
               (username.equals("user") && password.equals("abcd"));
        }
    }
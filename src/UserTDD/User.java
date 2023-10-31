package UserTDD;

public class User {
    private String newUserName;
    private String userName;
    private String userPassword;
    boolean lengthMinimum;
    boolean lengthMax;
    //private String newPassword;

    public User(String myUserName, String myPassword){
        this.userName = myUserName;
        this.userPassword = myPassword;
}
    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
    public void ChangeUserName(String newUserName) {
        if (newUserName.length() >= 4) {
            userName = newUserName;
        }
    }
    public boolean changePassword() {
        if (userPassword.length()>=7) {
            lengthMinimum = true;
        }
        if (userPassword.length()<=20) {
            lengthMax = true;
        }
        return lengthMinimum && lengthMax;
    }
}

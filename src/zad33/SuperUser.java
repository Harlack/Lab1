package zad33;

public class SuperUser extends User{
    private double age;
    private String userName;
    private String login;
    public double[] permissions;

    SuperUser(String userName, String login, String pwd) {
        super(userName, login, pwd);
    }
    public void setPermissions(double[] perms){
        permissions = perms;
    }
    public double[] getPermissions(){
        return permissions;
    }
    @Override
    public void logIn(){
        if(pwdHash = SHA256.hash(pwd))
            service.logIn(username, String.toUpperCase(pwdHash));
    }
    public void logOut(){
        service.logOutWithPwd(username,
                String.toUpperCase(pwdHash));
    }

}

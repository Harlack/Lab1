package zad33;

public class Admin extends User{
    private double age;
    private String userName;
    private String login;
    private boolean loggedIn = false;
    public double[] permissions;

    Admin(String userName, String login, String pwd) {
        super(userName, login, pwd);
    }

    public void setPermissions(double[] perms){
        System.out.println("Set permissions");
        permissions = perms;
    }
    public double getPermission(int index){
        return permissions.get(index);
    }
    @Override
    public void logIn(){
        if(pwdHash = SHA256.hash(pwd)){
            service.logIn(userName, String.toUpperCase(pwd));
            loggedIn = true;
        }
    }
    public void logOut(){
        service.logOutWithPwd(userName, String.toUpperCase(pwdHash));
        loggedIn = false;
    }
}

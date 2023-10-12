package zad33;


import static javax.xml.crypto.dsig.DigestMethod.SHA256;

public class User implements Login{
    public String userName;
    protected String login;
    private String pwdHash;
    UserService service;
    User(String userName, String login, String pwd){
        this.userName = userName;
        this.login = login;
        this.pwdHash = SHA256.hashCode(pwd);
    }
    @Override
    public void logIn(){
        if(pwdHash = SHA256.hashCode(pwdHash))
            service.logIn(userName, pwdHash);
    }

    public void logOut(){
        service.logOut(userName);
    }
}

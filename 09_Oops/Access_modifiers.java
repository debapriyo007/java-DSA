public class Access_modifiers {

    public static void main(String[] args) {
        bankAccount myAcc =new bankAccount();
        myAcc.username ="Debapriyo";
        myAcc.setPassword("oct27@2327");
    }
}

class bankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd)
    {
        password=pwd;
    }
}

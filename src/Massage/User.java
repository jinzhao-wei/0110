package Massage;

import javax.jws.soap.SOAPBinding;

public class User {
    private int id;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        String str=new String();
        str=str.valueOf(id);
        if(str.length()!=10)
        {
            System.out.println("学号长度必须为十位");
            return ;
        }
        this.id=id;

    }
    User(int id, String name, String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }
    User(){

    }
}

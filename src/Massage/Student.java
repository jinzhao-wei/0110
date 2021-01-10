package Massage;

public class Student extends User{
    private int id;
    private String name;
    private String password;
    Student(int id, String name, String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    //构造方法区别的是参数的类型和个数
    //
}

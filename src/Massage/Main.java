package Massage;

public class Main {
    public static void main(String[] args) {
        Student stu=new Student(666666666,"李华","123abc");

        Teacher teacher=new Teacher();
        teacher.setMajar("计算机科学与技术");
        teacher.setId(1234567890);
        teacher.setName("张老师");
        teacher.setPassword("akl6897");
        System.out.println("学号:"+stu.getId());
        System.out.println("姓名:"+stu.getName());
        System.out.println("Password:"+stu.getPassword());
        System.out.println("学号:"+teacher.getId());
        System.out.println("姓名:"+teacher.getName());
        System.out.println("Password:"+teacher.getPassword());
    }
}

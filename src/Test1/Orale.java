package Test1;

public class Orale extends JDBC {
    @Override
    public void connect() {
        System.out.println("Oracle链接");
    }
    public void sellect(){
        System.out.println("Oracle查询");
    }
}

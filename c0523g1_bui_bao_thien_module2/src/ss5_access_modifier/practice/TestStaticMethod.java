package ss5_access_modifier.practice;

public class TestStaticMethod {
    public static void main(String[] args) {
        StacticMethod.change();
        //gọi method change() ở class StaticMethod

        StacticMethod s1 = new StacticMethod(111, "Hoang");
        StacticMethod s2 = new StacticMethod(222, "Khanh");
        StacticMethod s3 = new StacticMethod(333, "Nhu");
        
        s1.display();
        s2.display();
        s3.display();
    }
}

package exception;

public class exception1 {
    public static void main(String[] args) {
        System.out.println("helllooo");
        System.out.println("hiii");
        System.out.println("supppppppp");
       //unchecked exception
        try {
            System.out.println(200/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("ueueueueueue");
        System.out.println("yayyyyy");
    }
}

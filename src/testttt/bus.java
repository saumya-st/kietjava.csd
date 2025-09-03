package testttt;

public class bus extends Quickride{
    @Override
    void bookingid() {
        System.out.println("BUS303");
    }

    @Override
    void schedule() {
        System.out.println("The bus ride is confirmed");
    }

    @Override
    void refund() {
        System.out.println("no refund");

    }
}


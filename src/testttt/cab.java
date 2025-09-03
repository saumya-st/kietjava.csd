package testttt;

public class cab extends Quickride{
    @Override
    void bookingid() {
        System.out.println("CAB101");
    }

    @Override
    void schedule() {
        System.out.println("schedule the ride at 10:00am");
    }

    @Override
    void refund() {

        System.out.println("refund is 300");
        System.out.println("");
    }
}

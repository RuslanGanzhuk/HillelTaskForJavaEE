package task3;

public class IncrementOne implements Runnable{

    private IncrementSynchronize incrementSynchronize;

    public IncrementOne (){

    }

    IncrementOne(IncrementSynchronize incrementSynchronize){
        this.incrementSynchronize = incrementSynchronize;
    }

    @Override
    public void run() {
            incrementSynchronize.getNextValue();
            System.out.println(Thread.currentThread().getName() + " val " + incrementSynchronize.getValue());
    }
}


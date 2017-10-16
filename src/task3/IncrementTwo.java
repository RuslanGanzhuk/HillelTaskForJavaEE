package task3;

public class IncrementTwo implements Runnable {

    private IncrementSynchronize incrementSynchronize;

    public IncrementTwo(){

    }

    IncrementTwo(IncrementSynchronize incrementSynchronize){
        this.incrementSynchronize = incrementSynchronize;
    }

    @Override
    public void run() {
        synchronized (incrementSynchronize){
            int temp = incrementSynchronize.getValue()+1;
            incrementSynchronize.setValue(temp++);
            System.out.println(Thread.currentThread().getName() + " val " + incrementSynchronize.getValue());
        }

    }
}

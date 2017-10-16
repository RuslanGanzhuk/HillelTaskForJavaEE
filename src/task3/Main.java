package task3;


public class Main {
    public static void main(String[] args) {

        IncrementSynchronize incrementSynchronize = new IncrementSynchronize();

        /*First way*/

            Thread thread1 = new Thread(new IncrementOne(incrementSynchronize));
            Thread thread2 = new Thread(new IncrementOne(incrementSynchronize));
            Thread thread3 = new Thread(new IncrementOne(incrementSynchronize));

            thread1.start();
            thread2.start();
            thread3.start();

            try {
                thread1.join();
                thread2.join();
                thread3.join();
            }catch (InterruptedException e){

            }

        /* Second way*/

        Thread thread4 = new Thread(new IncrementTwo(incrementSynchronize));
        Thread thread5 = new Thread(new IncrementTwo(incrementSynchronize));
        Thread thread6 = new Thread(new IncrementTwo(incrementSynchronize));

            thread4.start();
            thread5.start();
            thread6.start();

            try {
                thread4.join();
                thread5.join();
                thread6.join();
            }catch (InterruptedException e){

            }
        System.out.println(incrementSynchronize.getValue());

        }
}


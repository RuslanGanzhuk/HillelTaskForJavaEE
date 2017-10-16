package task3;

public class IncrementSynchronize {

     private int value = 0;

     public IncrementSynchronize(){

     }

     synchronized int getNextValue(){
         return value++;
     }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

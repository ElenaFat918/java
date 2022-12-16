package HomeWork3;

public class Main {
    public static void main(String[] args) {
        WorkOne workOne = new WorkOne(); 
        workOne.taskOne();

        WorkTwo workTwo = new WorkTwo();
        workTwo.addAndRemoveNumbers();

        WorkThree workThree = new WorkThree();
        workThree.findMinMaxAverage();
    }
}

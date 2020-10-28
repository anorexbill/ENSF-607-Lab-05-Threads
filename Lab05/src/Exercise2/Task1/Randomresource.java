package Exercise2.Task1;

import java.util.Random;

class Randomresource {

    private int number;
    Random rand = new Random();
    private int sum;

    public Randomresource(){
        number = 0;
    }

    public synchronized void randomNumber(){
        int randNum = rand.nextInt(101);
        number = randNum;

        System.out.println(number);
        setSum(getSum()+ number);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void calculate(){
        System.out.println("The sum of the numbers is: " +getSum());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

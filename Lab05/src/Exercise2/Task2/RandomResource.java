package Exercise2.Task2;

import java.util.ArrayList;
import java.util.Random;

class RandomResource {
    private ArrayList<Integer> number;
    Random rand = new Random();

    public RandomResource(){
        number = new ArrayList<>();
    }

    public synchronized void randomNumber(){
        int randNum = rand.nextInt(101);
        number.add(randNum);
//        System.out.println(randNum);

    }

    public ArrayList<Integer> getNumber() {
        return number;
    }

    public void setNumber(ArrayList<Integer> number) {
        this.number = number;
    }

}

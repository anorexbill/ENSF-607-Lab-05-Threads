package Exercise2.Task1;

public class RandomThread implements Runnable {
    Randomresource random;

    public RandomThread(Randomresource random){
        this.random = random;
    }

    public void run(){
        for(int i = 0; i<1; i++){
            try {

                random.randomNumber();
                System.out.println(Thread.currentThread().getName() + " is running");

                Thread.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException{
        Randomresource random = new Randomresource();
        Runnable t11 = new RandomThread(random);
        Thread t1 =  new Thread(t11);
        Runnable t22 = new RandomThread(random);
        Thread t2 =  new Thread(t22);
        Runnable t33 = new RandomThread(random);
        Thread t3 =  new Thread(t33);
        Runnable t44 = new RandomThread(random);
        Thread t4 =  new Thread(t44);
        Runnable t55 = new RandomThread(random);
        Thread t5 =  new Thread(t55);

        t1.start();

        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

       random.calculate();

    }
}

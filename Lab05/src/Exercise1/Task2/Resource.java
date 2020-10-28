package Exercise1.Task2;

public class Resource {
    int counter;

    synchronized public int increment() {
        return counter++;
    }

}

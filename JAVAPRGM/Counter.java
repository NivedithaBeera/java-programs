public class Counter {
    private int count;

    public  Counter() {
        this.countv= 0;
    }

    public Counter(int intialCount) {
        this.count = intialCount;
    }

    public void increment(){
        count++;
    }

    public void decrement(){
        count--;
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println("Initial count (counter): " + counter1.getCount());
        counter1.increment();
        counter1.increment();
        System.out.println("After 2 increments (counter1): " +counter1.getCount());
        counter1.decrement();
        System.out.println("After 1 decrement (counter1): " + counter1.getCount());

        Counter counter2 = new Counter(10);
        System.out.println("Initial count (counter2): " + counter2.getCount());
        counter2.increment();
        System.out.println("After 1 increment (counter2): " + counter2.getCount());
        counter2.decrement();
        counter2.decrement();
        System.out.println("After 2 decrements (counter2): " + counter2.getCount());
    }
}

    

public class CounterN {
    private int count;

    public CounterN(){
        this.count = 0;
    }

    public CounterN(int initialCount){
        this.count = initialCount;
    }

    public void increment(){
        this.count++;
    }
    public void decrement(){
        this.count--;
    }

    public int getCount(){
        return this.count;
    }

    public static void main(String[] args) {
        CounterN counter1 = new CounterN();
        System.out.println("Initial count (counter1) " + counter1.getCount());
        counter1.increment();
        System.out.println("After increment (counter1): " + counter1.getCount());


        CounterN counter2 = new CounterN(10);
        System.out.println("Initial count (counter2:) " + counter2.getCount());
        counter2.decrement();
        System.out.println("After decrement (counter2): " + counter2.getCount());
    }

}
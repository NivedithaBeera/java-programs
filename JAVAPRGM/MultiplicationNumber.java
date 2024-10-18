public class MultiplicationNumber{
    public static void main(String[] args) {
        int number = 15;
        int length = 10;
        for(int i=1;i<=length;i++){
            System.out.printf("%d*%d = %d%n", number, i, number * i);
        }
    }
}
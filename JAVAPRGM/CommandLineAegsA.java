public class CommandLineArgsA{
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usage: java CommandLineArgs <num> [length]");
            return;
        }

        
        int num = Integer.parseInt(args[0]);

        int length = 10;


        if (args.length > 1) {
            length = Integer.parseInt(args[1]);
        }

        System.out.println("num: " + num);
        System.out.println("length: " + length);
        
        
        for (int i = 0; i < length; i++) {
            System.out.println(num + i);
        }
    }
}


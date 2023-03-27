public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().isPowerOfTwo(536870912));
        System.out.println(new Main().isPowerOfTwo(1024));
    }

    public boolean isPowerOfTwo(int n) {
        double result = Math.log(n) / Math.log(2);
        System.out.println(result);
        return (result - (int)result) == 0;


//        return (Math.log(n) / Math.log(2)) % 1 == 0;
    }

}
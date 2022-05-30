public class Stairs {
    public int climbStairs(int n) {

        int steps = 0;
        switch (n) {
            case 1 -> steps = 1;
            case 2 -> steps = 2;
            default -> {
                steps = climbStairs(n-1) + climbStairs(n-2);
            }
        }
        return steps;
    }
    public static void main(String [] args){
        Steps steps = new Steps();
        for (int i = 1; i < 45; i++){
            System.out.println("Total steps :" + i + " = " + steps.climbStairs(i));
        }
    }
}
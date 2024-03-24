public class Main {
    public static int coinProblem(int sum, int[] coins) {
        int[] coinDp = new int[sum + 1];
        coinDp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                coinDp[i] += coinDp[i - coin];
            }
        }

        return coinDp[sum];
    }

    public static void main(String[] args) {
        int sum = 4;
        int[] coins = {1, 2, 3};
        int answer = coinProblem(sum, coins);
        System.out.println(answer);

    }
}

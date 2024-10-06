import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class gfgweekly4 {
    public static int longestIncreasingPath(int n, int[][] edges, int[] values) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0] - 1;
            int v = edge[1] - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] dp = new int[n];
        Arrays.fill(dp, -1); 
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            maxLength = Math.max(maxLength, dfs(i, -1, values, adj, dp));
        }

        return maxLength;
    }

    private static int dfs(int u, int parent, int[] values, List<List<Integer>> adj, int[] dp) {
        if (dp[u] != -1) {
            return dp[u];  
        }

        int maxLength = 1; 

        for (int v : adj.get(u)) {
            if (v != parent && values[v] > values[u]) { 
                maxLength = Math.max(maxLength, 1 + dfs(v, u, values, adj, dp));
            }
        }

        dp[u] = maxLength; 
        return maxLength;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{1, 2}, {1, 3}};
        int[] values = {4, 3, 5};

        System.out.println(longestIncreasingPath(n, edges, values));  // Output: 3
    }
}

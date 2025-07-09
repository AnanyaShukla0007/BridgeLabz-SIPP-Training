import java.util.*;

class RottenOranges {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) queue.offer(new int[]{r, c});
                if (grid[r][c] == 1) fresh++;
            }
        }

        int minutes = 0;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                for (int[] d : dirs) {
                    int x = cell[0] + d[0], y = cell[1] + d[1];
                    if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] != 1) continue;
                    grid[x][y] = 2;
                    queue.offer(new int[]{x, y});
                    fresh--;
                }
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(new RottenOranges().orangesRotting(grid)); // Output: 4
    }
}

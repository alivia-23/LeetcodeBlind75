package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
 * A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
 * Example 1:
 * Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
 * Output: 1
 * Example 2:
 * Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
 * Output: 3
 */
public class CountEqualRowColPairs {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> map = new HashMap<>();

        // convert each row into string and put in the map by tracking
        // the frequency of each row
        for (int[] row : grid) {
            String rowString = Arrays.toString(row);
            map.put(rowString, map.getOrDefault(rowString, 0) + 1);
        }

        // loop through the column and convert row array to string
        // check if the string exists in map and get the frequency of it

        int count = 0;
        for (int c = 0; c < grid.length; c++) {
            int[] colArr = new int[grid.length];
            for (int r = 0; r < grid.length; r++) {
                colArr[r] = grid[r][c];
                String colArrString = Arrays.toString(colArr);
                if (map.containsKey(colArrString)) {
                    count += map.get(colArrString);
                }
            }
        }
        return count;
    }

}

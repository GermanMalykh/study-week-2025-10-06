package sql;

//https://leetcode.com/problems/big-countries/description/
public class LeetCode595 {
    String sql = """
            SELECT name, population, area
            FROM World
            WHERE
                population >= 25000000
                OR area >= 3000000;
            """;
}

package sql;

//https://leetcode.com/problems/find-customer-referee/description/
public class LeetCode584 {
    String select = """
            SELECT name
            FROM Customer
            WHERE referee_id != 2 OR referee_id IS NULL;
            """;

    String select2 = """
            SELECT name
            FROM Customer
            WHERE referee_id IS DISTINCT FROM 2;
            """;
}

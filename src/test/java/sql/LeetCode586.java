package sql;

//https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/description/
public class LeetCode586 {
    String sql = """
            SELECT customer_number
            FROM Orders
            GROUP BY customer_number
            ORDER BY COUNT(order_number) DESC
            LIMIT 1;
            """;
}

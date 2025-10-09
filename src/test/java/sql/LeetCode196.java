package sql;

//https://leetcode.com/problems/delete-duplicate-emails/
public class LeetCode196 {
    String delete = """
            DELETE FROM Person p1
            USING Person p2
            WHERE p1.email = p2.email
            AND p1.id > p2.id;
            """;

    String delete2 = """
            DELETE FROM Person
              WHERE id NOT IN (
                  SELECT min(id)
                  FROM Person
                  GROUP BY email
              );
            """;
}

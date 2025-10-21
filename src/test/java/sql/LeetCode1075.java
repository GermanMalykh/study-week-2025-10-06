package sql;

//https://leetcode.com/problems/project-employees-i/description/
public class LeetCode1075 {
    String sql = """
            SELECT
              p.project_id,
              ROUND(AVG(e.experience_years), 2) AS average_years
            FROM Project p
            JOIN Employee e
              ON e.employee_id = p.employee_id
            GROUP BY p.project_id;
            """;


    String sql2 = """
            SELECT
              p.project_id,
              ROUND(
                (
                  SELECT SUM(e.experience_years) * 1.0 / COUNT(*)
                  FROM Project p2
                  JOIN Employee e ON e.employee_id = p2.employee_id
                  WHERE p2.project_id = p.project_id
                ), 2
              ) AS average_years
            FROM Project p
            GROUP BY p.project_id;
            """;
}

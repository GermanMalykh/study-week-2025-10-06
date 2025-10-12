package java_practice.javarush.level23.lecture05;

public class Solution3 {
    static final double INCOME_TAX_RATE = 0.13;

    double employeeSalary = 5000.0;
    double calculatedTax = employeeSalary * INCOME_TAX_RATE;

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        System.out.println(solution.calculatedTax);
    }
}

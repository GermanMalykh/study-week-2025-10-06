package java_practice.javarush.level23.lecture04;

public class Solution4 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Алиса");

        // Поручаем работу и сдачу отчёта
        programmer.work();
        programmer.report();
    }
}

abstract class Worker {
    protected String employeeName;

    abstract void work();
}

interface Reportable {
    void report();
}

class Programmer extends Worker implements Reportable {

    public Programmer(String name) {
        employeeName = name;
    }

    @Override
    void work() {
        System.out.println("Программист пишет код");
    }

    @Override
    public void report() {
        System.out.println("Программист сдаёт отчёт");
    }

}
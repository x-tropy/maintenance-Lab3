public class ZooKeeperBonus implements BonusBehavior {
    private int salary;

    public ZooKeeperBonus(int salary) {
        this.salary = salary;
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (salary * 0.05 + 100);
    }
}

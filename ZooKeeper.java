public class ZooKeeper extends Employee {
    private BonusBehavior bonusBehavior;

    public ZooKeeper(String name, int salary) {
        super(name, salary);
        bonusBehavior = new ZooKeeperBonus(salary);
    }

    public void setBonusBehavior(BonusBehavior b) {
        bonusBehavior = b;
    }

    @Override
    public int calculateChristmasBonus() {
        return bonusBehavior.calculateChristmasBonus();
    }
}

public class Admin extends Employee {
    private BonusBehavior bonusBehavior;

    public Admin(String name, int salary) {
        super(name, salary);
        bonusBehavior = new AdminBonus(salary);
    }

    public void setBonusBehavior(BonusBehavior b) {
        bonusBehavior = b;
    }

    @Override
    public int calculateChristmasBonus() {
        return bonusBehavior.calculateChristmasBonus();
    }
}

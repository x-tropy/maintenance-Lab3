public class AdminBonus implements BonusBehavior {
    private int salary;

    public AdminBonus(int salary) {
        this.salary = salary;
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (salary * 0.08 + 90);
    }
}

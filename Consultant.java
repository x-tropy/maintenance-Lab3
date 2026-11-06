public class Consultant implements Employable {
    private String name;
    private int daysWorked;
    private BonusBehavior bonusBehavior;

    public Consultant(String name, int daysWorked) {
        this.name = name;
        this.daysWorked = daysWorked;
        bonusBehavior = new ConsultantBonus(daysWorked);
    }

    public void setBonusBehavior(BonusBehavior b) {
        bonusBehavior = b;
    }

    @Override
    public void setEmployeeName(String name) {
        this.name = name;
    }

    @Override
    public String getEmployeeName() {
        return name;
    }

    // Consultants are paid per day, so salary is not applicable; use zero and ignore writes.
    @Override
    public void setSalary(int salary) {
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public int calculateChristmasBonus() {
        return bonusBehavior.calculateChristmasBonus();
    }
}

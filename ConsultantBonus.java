public class ConsultantBonus implements BonusBehavior {
    private int daysWorked;

    public ConsultantBonus(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    @Override
    public int calculateChristmasBonus() {
        return daysWorked * 5;
    }
}

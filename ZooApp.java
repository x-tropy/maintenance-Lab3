public class ZooApp {
    // 这里测试所有类的功能
    public static void main(String[] args) {
        Zoo zL = new Zoo("London", 10);
        Zoo zT = new Zoo("Tokyo", 20);
        Zoo zN = new Zoo("New York", 35);
        Zoo zP = new Zoo("Paris", 40);
        Zoo zB = new Zoo("Beeston", 42);
        System.out.println("numZoos: " + Zoo.numZoos);

        ZooCorp zooCorp = new ZooCorp(zL);
        zooCorp.addZoo(zT);
        zooCorp.addZoo(zN);
        zooCorp.addZoo(zP);
        zooCorp.addZoo(zB);
        zooCorp.printZooInfo();

        Employable zk1 = new ZooKeeper("John", 100);
        Employable am1 = new Admin("Jane", 100);
        System.out.println(zk1.calculateChristmasBonus());
        System.out.println(am1.calculateChristmasBonus());
        zooCorp.addStaff(zk1);
        zooCorp.addStaff(am1);

        Employable cs1 = new Consultant("Alex", 20);
        zooCorp.addStaff(cs1);
        java.util.Iterator<Employable> staffIter = zooCorp.getAllEmployee().iterator();
        while (staffIter.hasNext()) {
            Employable staffMember = staffIter.next();
            System.out.println("Bonus for " + staffMember.getEmployeeName() + ": "
                    + staffMember.calculateChristmasBonus());
        }

        ((ZooKeeper) zk1).setBonusBehavior(new AdminBonus(zk1.getSalary()));
        System.out.println("ZooKeeper with Admin strategy: "
                + zk1.calculateChristmasBonus());

        ((Admin) am1).setBonusBehavior(new ConsultantBonus(20));
        System.out.println("Admin with Consultant strategy: "
                + am1.calculateChristmasBonus());
    }
}

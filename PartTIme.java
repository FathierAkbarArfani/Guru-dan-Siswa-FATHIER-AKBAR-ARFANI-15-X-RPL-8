public class PartTIme extends Teacher {
    int hoursworked;

    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public int setSalary() {
        int salary = hoursworked * 4 * 100000;
        return salary;
    }
    public PartTIme() {
        super();
        hoursworked = 0;
    }

    public PartTIme(String name, String subject, int hoursworked, int age) {
        super(name, subject, age);
    }

    public void print() {
        super.print();
        System.out.println("Hours Worked: " + hoursworked);
    }
}

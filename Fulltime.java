public class Fulltime extends Teacher{
    int anualSalary;
    String unit;

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
public Fulltime() {
    super();
    anualSalary = 0;
    unit = "";
}
public Fulltime(String name , int age, String subject, String unit, int anualSalary) {
    super(name,subject, age);
    this.unit = unit;
    this.anualSalary = anualSalary;

}
    public void print() {
    super.print();
    System.out.println("Anual Salary: "+anualSalary);
    System.out.println("Unit: "+unit);
}
}

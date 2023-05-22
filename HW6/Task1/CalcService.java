package Task1;
public class CalcService {

    private int baseSalary;

    
    public CalcService(int baseSalary) {
        this.baseSalary = baseSalary;
    }


    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
        }
}

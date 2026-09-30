class CompanyTest implements Company {

    public void display() {
        System.out.println("Interface method called");
    }

    public static void main(String[] args) {

        CompanyTest obj = new CompanyTest();

        System.out.println("Employee ID: " + Company.EMPLOYEE_ID);
        System.out.println("Company Name: " + Company.COMPANY_NAME);

        obj.display();
    }
}
public interface Company {

    int EMPLOYEE_ID = 101;
    String COMPANY_NAME = "ABC Technologies";

    void display();
}
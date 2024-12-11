import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String department;
    private double salary;
    private String hireDate;
    private List<Request> requests;


    public Employee(String department, double salary, String hireDate) {
        this.department = department;
        this.salary = salary;
        this.hireDate = hireDate;
        this.requests = new ArrayList<>();
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }


    public void sendMessage(String message) {
        System.out.println("Message: " + message);
    }


    public List<Request> viewRequests() {
        return requests;
    }


    public void updateSalary(Double newSalary) {
        this.salary = newSalary;
        System.out.println("Salary updated to: " + this.salary);
    }


    public String getEmployeeDetails() {
        return "Department: " + getDepartment() + ", Salary: " + getSalary() + ", Hire Date: " + getHireDate();
    }

    public void addRequest(Request request) {
        requests.add(request);
        System.out.println("Request add: " + request);
    }

    public void removeRequest(Request request) {
        requests.remove(request);
        System.out.println("Request remove: " + request);
    }

    public void displayRequests() {
        System.out.println("Requests for Employee in " + department + ":");
        for (Request req : requests) {
            System.out.println(req);
        }
    }
}

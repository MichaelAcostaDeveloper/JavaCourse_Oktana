package Arrays;

public class Employee {
    public String name;
    public String role;
    public int projects;

    public Employee(String name, String role, int projects) {
        this.name = name;
        this.role = role;
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", projects=" + projects +
                '}';
    }
}


import java.util.ArrayList;
import java.util.List;

class Employee {
    private int code;
    private int departmentCode;
    private String fullName;
    private String position;
    private double salary;
    private double bonus;
    private String month;

    public Employee(int code, int departmentCode, String fullName, String position, double salary, double bonus, String month) {
        this.code = code;
        this.departmentCode = departmentCode;
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.bonus = bonus;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code=" + code +
                ", departmentCode=" + departmentCode +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", month='" + month + '\'' +
                '}';
    }
}

class Delivery {
    private int contractNumber;
    private String equipmentType;
    private String userComment;
    private int employeeCode;

    public Delivery(int contractNumber, String equipmentType, String userComment, int employeeCode) {
        this.contractNumber = contractNumber;
        this.equipmentType = equipmentType;
        this.userComment = userComment;
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "contractNumber=" + contractNumber +
                ", equipmentType='" + equipmentType + '\'' +
                ", userComment='" + userComment + '\'' +
                ", employeeCode=" + employeeCode +
                '}';
    }
}

class Contract {
    private int contractNumber;
    private String organizationName;
    private String contractDate;

    public Contract(int contractNumber, String organizationName, String contractDate) {
        this.contractNumber = contractNumber;
        this.organizationName = organizationName;
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", organizationName='" + organizationName + '\'' +
                ", contractDate='" + contractDate + '\'' +
                '}';
    }
}

class Organization {
    private int contractNumber;
    private int countryCode;
    private String city;
    private String address;
    private String phone;
    private String email;
    private String website;

    public Organization(int contractNumber, int countryCode, String city, String address, String phone, String email, String website) {
        this.contractNumber = contractNumber;
        this.countryCode = countryCode;
        this.city = city;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.website = website;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "contractNumber=" + contractNumber +
                ", countryCode=" + countryCode +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}

public class ScientificProductionEnterprise {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<Delivery> deliveries = new ArrayList<>();
        List<Contract> contracts = new ArrayList<>();
        List<Organization> organizations = new ArrayList<>();

        // Добавление данных
        employees.add(new Employee(1, 1, "Иванов Иван Иванович", "Инженер", 50000, 10000, "Январь"));
        deliveries.add(new Delivery(1, "АЦП NM с АМ1", "Отлично работает", 1));
        contracts.add(new Contract(1, "Организация А", "2023-01-01"));
        organizations.add(new Organization(1, 1, "Москва", "ул. Ленина, 1", "+79991234567", "orgA@example.com", "http://orgA.com"));

        // Вывод данных в консоль
        System.out.println("Сотрудники:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nПоставки:");
        for (Delivery delivery : deliveries) {
            System.out.println(delivery);
        }

        System.out.println("\nДоговоры:");
        for (Contract contract : contracts) {
            System.out.println(contract);
        }

        System.out.println("\nОрганизации:");
        for (Organization organization : organizations) {
            System.out.println(organization);
        }
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(Gender.Male, "Roman", "Polozov", "Programmer");
        Employee employee2 = new Employee(Gender.Female, "Ekaterina", "Safronova", "Medic");
        Employee employee3 = new Employee(Gender.Male, "Michail", "Krymskiy", "Engineer");
        Employee employee4 = new Employee(Gender.Female, "Olga", "Urdina", "Administrator");
        Employee employee5 = new Employee(Gender.Male, "Mark", "Twen", "Writer");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        Celebrator(employeeList);
    }
    public static void Celebrator(List<Employee> employeeList) {
        try {
            System.out.println("Введите дату в формате: dd.MM");
            Scanner sc = new Scanner(System.in);
            String date = sc.nextLine();
            Checks checks = new Checks();
            checks.checkDate(date);
            for (Employee employee : employeeList) {
                if (date.equals(Holidays.March_8th.getDate()) && employee.getMale() == Gender.Female) {
                    System.out.println(String.format("Поздравляем, %s, c 8 Марта!!!", employee));
                } else if (date.equals(Holidays.February_23th.getDate()) && employee.getMale() == Gender.Male) {
                    System.out.println(String.format("Поздравляем, %s, c Днём Защитника Отечества!!!", employee));
                } else if (date.equals(Holidays.New_Year.getDate())) {
                    System.out.println(String.format("Поздравляем, %s, c Новым Годом!!!", employee));
                }
            }
            if(!date.equals(Holidays.March_8th.getDate()) && !date.equals(Holidays.February_23th.getDate())
                    && !date.equals(Holidays.New_Year.getDate())){
                System.out.println(Holidays.Not_Holiday.getDate());
            }
        } catch (HolidayDateException e) {
            System.out.println(e.getMessage());;
        }
    }
}

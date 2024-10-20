import lombok.Data;

@Data
public class Employee {
    private Gender male;
    private String firstName;
    private String lastName;
    private String post;

    public Employee(Gender male, String firstName, String lastName, String post) {
        this.male = male;
        this.firstName = firstName;
        this.lastName = lastName;
        this.post = post;
    }

    public Gender getMale() {
        return male;
    }

    public void setMale(Gender male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }
}

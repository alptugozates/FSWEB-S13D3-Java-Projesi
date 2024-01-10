public class Person {
    String firstName;
    String lastName;
    int age;
    String email;
    String phoneNumber;
    boolean isStudent;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age , String email, String phoneNumber, boolean isStudent) {
        this(firstName, lastName, age);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isStudent = isStudent;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        return age < 19 && age > 13;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public boolean getIsStudent() {
        return isStudent;
    }

}


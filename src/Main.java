public class Main {
    public static void main(String[] args) {
       Person person1 = new Person("Ali", "Ozturk", 30);
       Person person2 = new Person("Fatma", "Ozturk", 18, "fatmaozturk@gmail.com", "05365555555", true);

        System.out.println("Person 1:");
        System.out.println("First Name:" + person1.getFirstName());
        System.out.println("Last Name:" + person1.getLastName());
        System.out.println("age:" + person1.getAge());
        System.out.println("isTeen: " + person1.isTeen());

        System.out.println("Person 2:");
        System.out.println("First Name:" + person2.getFirstName());
        System.out.println("Last Name:" + person2.getLastName());
        System.out.println("age: " + person2.getAge());
        System.out.println("isTeen: " + person2.isTeen());
        System.out.println("email: " + person2.getEmail());
        System.out.println("Phone Number:" + person2.getPhoneNumber());
        System.out.println("isStudent:" + person2.getIsStudent());
    }

}
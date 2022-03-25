package aggregation;

public class Aggregate {
    public static void main(String[] args) {
        Address address = new Address(7,"Thida St","Hlaing","Yangon");

        Person person = new Person("Wayne",20,address);

        Person person1 = new Person(
                "MMZ",
                26,
                new Address(6,"Malar St","Hlaing","Yangon")
        );
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.address.number);
        System.out.println(person.address.street);
        System.out.println(person.address.township);
        System.out.println(person.address.region);

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.address.number);
        System.out.println(person1.address.street);
        System.out.println(person1.address.township);
        System.out.println(person1.address.region);
    }

}

package ClassAndObject;

    public class Person {
        String name, address;
        int age;

        public  Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public static void main(String[] args) {
            Person persoana = new Person("Fiona", 19, "Oradea");
            System.out.println("Numele: "+persoana.name);
            System.out.println("Varsta: "+persoana.age);
            System.out.println("Adresa: "+persoana.address);
        }
    }

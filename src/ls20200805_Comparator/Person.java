package ls20200805_Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override

    //by name & age
    public int compareTo(Person person) {
        int nameForCompare = this.name.compareTo(person.name);
        if (nameForCompare == 0) { //int можно сравнивать через ==, остальное - через equals
            return this.age - person.age;
        } else return nameForCompare;

        //variant: return (nameForCompare == 0) ? this.age - person.age : nameForCompare;
    }

    /*
   by age
    public int compareTo(Person person) {
//        if (person.age == this.age) {
//            return 0;
//        } else if (person.age > this.age) {
//            return 1;
//        } else return -1;

        return this.age - person.age; // person.age-this.age - меняем местами и сортировка по убыванию
    }

by name
    public int compareTo(Person person){
        return this.name.compareTo(person.name);
    }
*/
    @Override
    public String toString() {
        return "name: " + name + ", age: " + age;
    }
}

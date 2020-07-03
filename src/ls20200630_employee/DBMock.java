package ls20200630_employee;

/**
 * JavaAdvanced 30.06.2020
 */
public class DBMock {
    private static Employee[] employees = {
            new CProgrammer("Name0", 2000.0),
            new JavaProgrammer("Name6", 4000.0),
            new Tester("Anna", 3000.0),
            new Tester("Alex", 1800.0),
            new CProgrammer("Name1", 2010.0),
            new CProgrammer("Name2", 2020.0),
            new JavaProgrammer("Name3", 2030.0),
            new JavaProgrammer("Name4", 2040.0),
            new JavaProgrammer("Name5", 2050.0),
            new Manager("Max", 2050.0,600),
            new Manager("Pier", 2050.0,1000)
    };

    //задача - отобрать из массива employee программистов

    public static Employee[] getEmployees(){
        return employees;
    }

    public static Programmer[] getProgrammers() {
        int counter = 0;
        for (Employee employee : employees) { //считаем программистов в массиве
            if (isProgrammer(employee)) {
                counter++;
            }
        }
        if (counter > 0) {//создаем массив из Programmers
            Programmer[] programmers = new Programmer[counter];
            int i = 0;
            for (Employee employee : employees) {
                if (isProgrammer(employee)) {
                    programmers[i] = (Programmer) employee; //принудительное изменение типа переменной - cast
                    i++;
                }
            }
            return programmers;
        }
        return null; //null - не типизированная переменная, если в массив не приходит ни одного программиста
    }

    private static boolean isProgrammer(Employee employee) {
        if (employee instanceof Programmer) {// instance of оператор - является ли эта позиция объектом данного класса
            //с одной стороны ссылочная переменная, с другой - название класса
            return true;
        }
        return false;
    }
}

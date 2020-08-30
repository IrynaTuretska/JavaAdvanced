package ls20200826_Predicate_UnaryOperator;

public class StringDemo {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println(s == s1);    //true - переменные смотрят на один и тот же объект в String Pool
        System.out.println(s == s2);    //false - сравнение с вновь созданным объектом, который занимает новое место в памяти
        System.out.println(s.equals(s1));   //true - equals проверка по значению, логическое равенство строк
        System.out.println(s.equals(s2));   //true

        System.out.println("- - - - - - -");
        s = s.toUpperCase(); //при любом изменении строки создается новый объект
        System.out.println(s == s1);

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
    }
}

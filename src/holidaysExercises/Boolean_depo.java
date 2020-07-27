package holidaysExercises;

/**
 * JavaAdvanced 13.07.2020
 */
public class Boolean_depo {
    public static void main(String[] args) {
        boolean papa, mama;
        System.out.println("Nr1: " + smartDepositBox(false, false));
        System.out.println("Nr2: " + smartDepositBoxTwo(true, false));

    }

    private static boolean smartDepositBoxTwo(boolean papa, boolean mama) {
        //Nr2
        if (papa == true && mama == true) return true;
        return false;
    }

    private static boolean smartDepositBox(boolean papa, boolean mama) {
        //Nr1
        if (papa == true || mama == true) return true;
        return false;
    }


}

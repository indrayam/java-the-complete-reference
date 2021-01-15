package enums;

enum OldApple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland;
}
public class EnumsDemo2 {
    public static void main(String[] args) {
        OldApple ap, ap1, ap2;

        System.out.printf("All Apple constants and their ordinal values..%n");
        for (OldApple value : OldApple.values()) {
            System.out.printf("%d. %s%n", value.ordinal(), value);
        }

        System.out.println();

        ap = OldApple.RedDel;
        ap1 = OldApple.GoldenDel;
        ap2 = OldApple.RedDel;

        if (ap.compareTo(ap1) < 0) {
            System.out.printf("%s comes before %s%n", ap, ap1);
        }
        if (ap.compareTo(ap1) > 0) {
            System.out.printf("%s comes after %s%n", ap, ap1);
        }
        if (ap.compareTo(ap2) == 0) {
            System.out.printf("%s equals %s%n", ap, ap2);
        }

        System.out.println();

        if (ap.equals(ap1)) {
            System.out.printf("%s equals %s%n", ap, ap1);
        } else {
            System.out.printf("%s is not equal to %s%n", ap, ap1);
        }
        if (ap.equals(ap2)) {
            System.out.printf("%s equals %s%n", ap, ap2);
        }
        if (ap == ap2) {
            System.out.printf("%s equals %s%n", ap, ap2);
        }
    }
}

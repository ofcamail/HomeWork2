public class Main {
    public static void main(String[] args) {
        int a1 = 12;
        int b1 = 7;
        int a2 = 1;
        int b2 = 3;
        boolean isNoIntersection1 = ((a1<a2 && b1<a2)||(a1>b2 && b1>b2));
        boolean isIntersectionPointa2b2 = ((a1==a2&&b1==b2) || (a1==a2 &&b1>b2)||(a1<a2&&b1>b2) || (b1==b2 &&a1<a2));
        boolean isIntersectionPointa1b1 = ((a1==a2 && b1<b2) || (a2<a1&&b2>b1)|| (b1==b2&&a1>a2));
        boolean isIntersectionPointa1 = (a1==b2);
        boolean isIntersectionPointa2 = (a2==b1);

if (isNoIntersection1) {
    System.out.println("Прямые не пересекаются");
} else if (isIntersectionPointa1b1){
    System.out.print("Отрезок пересечения имеет координаты " + a1 + " и " + b1);
} else if (isIntersectionPointa2b2){
    System.out.print("Отрезок пересечения имеет координаты " + a2 + " и " + b2);
} else if (isIntersectionPointa1){
    System.out.println("Точка пересечения имеет координату " + a1);
} else if (isIntersectionPointa2) {
    System.out.println("Точка пересечения имеет координату " + a2);
} else {
    System.out.println("Недопустимые значения");
}
    }
}
public class Main {
    public static void main(String[] args) {
        int a1 = 18;
        int b1 = 19;
        int a2 = 20;
        int b2 = 21;
boolean isIntersectionPointa2Andb1 = (a1<a2 && b1<b2 && b1>a2);
boolean isIntersectionPointa1Andb2 = (a1>a2 && b1>b2 && b2>a1);
boolean isIntersectionPointa2Andb2 = (a1<a2 && b1>b2);
boolean isIntersectionPointa1Andb1 = (a1>a2 && b1<b2);
boolean isIntersectionPointa1 = (a1==b2);
boolean isIntersectionPointa2 = (a2==b1);
boolean isIntersectionPointInSameStart = (a1==a2 && b1 < b2);
boolean isIntersectionPointInSameStart2 = (a1==a2 && b1 > b2);
boolean isIntersectionPointAllSame = (a1==a2 && b1==b2);
if (isIntersectionPointa2Andb1) {
    System.out.println("Отрезок пересечения имеет координаты " + a2 + " и " + b1);
} else if (isIntersectionPointa1Andb2){
    System.out.println("Отрезок пересечения имеет координаты " + a1 + " и " + b2);
} else if (isIntersectionPointa2Andb2){
    System.out.println("Отрезок пересечения имеет координаты " + a2 + " и " + b2);
} else if (isIntersectionPointa1Andb1){
    System.out.println("Отрезок пересечения имеет координаты " + a1 + " и " + b1);
} else if (isIntersectionPointa1) {
    System.out.println("Точка пересечения имеет координату " + a1);
} else if (isIntersectionPointa2) {
    System.out.println("Точка пересечения имеет координату " + a2);
} else if (isIntersectionPointInSameStart) {
    System.out.println("Отрезок пересечения имеет координаты " + a1 + " и " + b1);
} else if (isIntersectionPointInSameStart2) {
    System.out.println("Отрезок пересечения имеет координаты " + a1 + " и " + b2);
} else if (isIntersectionPointAllSame) {
    System.out.println("Отрезок пересечения имеет координаты " + a1 + " и " + b2);
} else {
    System.out.println("Точек пересечения нет");
}
    }
}
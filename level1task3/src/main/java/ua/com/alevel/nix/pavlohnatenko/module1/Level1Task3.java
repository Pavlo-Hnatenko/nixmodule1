package ua.com.alevel.nix.pavlohnatenko.module1;

public class Level1Task3 {

    public static long countTriangleArea(int point1X, int point1Y, int point2X, int point2Y,
                                               int point3X, int point3Y) {

        double segment1 = countSegment(point1X, point1Y, point2X, point2Y);
        double segment2 = countSegment(point2X, point2Y, point3X, point3Y);
        double segment3 = countSegment(point1X, point1Y, point3X, point3Y);
        double halfPerimeter = (segment1 + segment2 + segment3) / 2;

        double result = Math.sqrt(halfPerimeter * (halfPerimeter - segment1) * (halfPerimeter - segment2) *
                (halfPerimeter - segment3));

        return Math.round(result);

    }

    public static double countSegment(int point1X, int point1Y, int point2X, int point2Y) {

        return Math.sqrt(Math.pow(point2X - point1X, 2) + Math.pow(point2Y - point1Y, 2));

    }
}

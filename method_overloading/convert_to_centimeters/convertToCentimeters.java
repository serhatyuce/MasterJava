package method_overloading.convert_to_centimeters;

public class convertToCentimeters {


    public static double convertToCm(int inches){

        return inches*2.54;     // 1 inch equal to 2,54cm
    }

    public double convertToCm(int feet, int inches){

        return convertToCm((feet*12)+inches);
    }

}

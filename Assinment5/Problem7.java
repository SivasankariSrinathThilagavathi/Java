class TemperatureConverter {

    double convert(double celsius){
        return (celsius*9/5)+32;
    }

    double convert(int fahrenheit){
        return (fahrenheit-32)*5/9.0;
    }

    double convert(float kelvin){
        return kelvin - 273.15f;
    }
}
class Problem7{
    public static void main(String[] args){
        TemperatureConverter tc = new TemperatureConverter();

        System.out.println("Celsius to Fahrenheit: " + tc.convert(25.0));     
        System.out.println("Fahrenheit to Celsius: " + tc.convert(77));       
        System.out.println("Kelvin to Celsius: " + tc.convert(300.0f));       
}
}

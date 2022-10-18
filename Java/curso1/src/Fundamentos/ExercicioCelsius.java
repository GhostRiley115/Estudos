package Fundamentos;

public class ExercicioCelsius {
    
    //formula: (°F - 32) x 5/9 = °C
    public static void main(String args[]){
        
        double fahrenheit = 75;
        double celcius;
        final double x = 32;
        final double formula = 5/9.0;
      
        celcius = (fahrenheit - x) * formula;
        System.out.println("O valor em celcius e: " + celcius);
        
        fahrenheit = 94;
        celcius = (fahrenheit - x) * formula;        
        System.out.println("O valor em celcius e: " + celcius);
         
    }
    
}

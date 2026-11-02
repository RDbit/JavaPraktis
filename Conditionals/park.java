package Conditionals;

public class park{
    public static void main(String[] args){
        String name = "Ardzs";
        int charge = 4;

        if(charge >= 40 && charge <= 79){
            System.out.print("Hello " + name + " you given me " + charge + "Pesos you can only park in 1hr");
        }
        else if(charge >= 80 && charge <= 119){
            System.out.print("Hello " + name + " you given me " + charge + "Pesos you can only park in 3hr");

        }
        else if(charge >= 120){
            System.out.print("Hello " + name + " you given me " + charge + "Pesos you can only park in 5hr");

        }
        else{System.out.print("invalid");}
    
    }
}
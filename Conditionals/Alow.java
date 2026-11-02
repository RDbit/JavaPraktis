package Conditionals;

public class Alow{
    public static void main(String[] args){
        int score = 90;
        int absent = 2;
        boolean cheated = true;

        if(score >= 90 && absent <= 3 && !cheated ){
            System.out.print("Dean list");
        }
        else{
            System.out.print("Cheated");
        }
    }


}
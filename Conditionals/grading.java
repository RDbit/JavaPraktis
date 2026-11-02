package Conditionals;

public class grading {
    public static void main(String[] args){
        int score = 0;

        if(score < 0 || score > 100 ){
            System.out.print("invalid score");
        }

        else if(score >= 90 && score <= 100){
            System.out.print('A');
        }
        else if(score >= 80 && score <= 89){
            System.out.print('B');
        }
        else if(score >= 70 && score <= 79){
            System.out.print('C');
        }
        else if(score >= 60 && score <= 69){
            System.out.print('D');
        }
        else{
            System.out.print('F');
        }

    }
    
}

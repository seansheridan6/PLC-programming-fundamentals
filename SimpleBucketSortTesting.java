import java.util.Scanner;
public class Tests {

    static int[] score ={12, 3, 25, 13, 15, 6, 19, 21, 4, 17};

    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int maxScore = score[0];
        for(int i = score[1]; i < score.length; i++){
            if(score[i] > maxScore){
                maxScore = score[i];
            }
        }

        System.out.println("the highest score was " + maxScore);
        String userinput = read.nextLine();
        System.out.println(userinput);
        read.close();
        System.exit(0);
    }

}

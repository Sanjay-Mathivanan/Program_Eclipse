package basic;
import java.util.Scanner;

public class _08puzzle {
	public static void main(String[] args){

        Scanner scan =new Scanner(System.in);

        System.out.print("Enter a limit of row & column: ");
        int n=scan.nextInt();

        char[][] arr= new char[n][n];

        System.out.println("Enter the matrix values:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]= scan.next().charAt(0);
            }
        }

        System.out.println("Matrix:");
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scan.nextLine();
        System.out.print("Enter a word to find: ");
        String word = scan.nextLine();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

                if(arr[i][j] == word.charAt(0)){

                    int k;
                    for (k=1; k<word.length(); k++){

                        if(i+k >=n || arr[i+k][j] != word.charAt(k)){
                            break;
                        }
                    }

                    if(k == word.length()) {
                        System.out.println("Word found");
                        return;
                    }
                }
            }
        }

         System.out.println("Word not found");
        

    }
}

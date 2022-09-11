
import java.util.Arrays;
public class FindPair {
    public static void findPair(int[] numbers, int sum){
        Arrays.sort(numbers);
        int min=0;
        int max= numbers.length-1;
        int flag=0;
        while(min<max){
            if(numbers[min]+numbers[max]==sum){
                System.out.println("["+numbers[min]+","+numbers[max]+"]");
                flag=flag+1;
            }
            if(numbers[min]+numbers[max]>sum){
                max=max-1;
            }
            else{
                min=min+1;
            }
        }
        if(flag==0) {
            System.out.println("Pair not found");
        }

    }

}


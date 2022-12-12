package beecrowd;
import java.util.Scanner;

public class BEE_1179 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] numbers = new int[15];
    int even = 0;
    int odd = 0;
    int[] even_arr;
    int[] odd_arr;
    for(int i = 0; i<15; i++) {
      numbers[i] = in.nextInt();
    }
    for(int i = 0; i<15; i++) {
      if(numbers[i]%2==0) {
        even++;
      }
      else {
        odd++;
      }
    }
    int imposter1 = 0;
    int imposter2 = 0;
    even_arr = new int[even];
    odd_arr = new int[odd];
    for(int i = 0; i<15; i++) {
      if(numbers[i]%2==0) {
        even_arr[imposter1] = numbers[i];
        imposter1++;
      }
      else {
        odd_arr[imposter2] = numbers[i];
        imposter2++;
      }
    }
    int count = 0;
    while(even!=0 || even != even -5) {
      System.out.println("Even "+even_arr[count]);
      count++;
      even--;
    }
    count = 0;
    while(odd!=0 || odd != odd -5) {
      System.out.println("Odd "+odd_arr[count]);
      count++;
      odd--;
    }
    count = 0;
    while(odd!=0 || odd != odd -5) {
      System.out.println("Odd "+odd_arr[count]);
      count++;
      odd--;
    }
    count = 0;
    while(even!=0 || even != even -5) {
      System.out.println("Even "+even_arr[count]);
      count++;
      even--;
    }

  }

}
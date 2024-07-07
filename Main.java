import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//EX1
//        int[] numbers={ 50, -20, 0, 30, 40, 60, 10};
//        boolean isEqual=false;
//        if (numbers[0]==numbers[numbers.length-1]){
//            isEqual=true;
//        }
//        System.out.println("Are the first and last element of the array the same:"
//        +isEqual);

//EX2

//        int[] numbers ={1, 4, 17, 7, 25, 3, 100};
//        double average=0;
//        for (int i = 0; i < numbers.length; i++) {
//            average=(average+numbers[i]);
//        }
//        average=average/numbers.length;
//        System.out.println("The average of the said array is:"+average);
//        ArrayList<Integer> largerNumbers = new ArrayList<>();
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i]>average){
//                largerNumbers.add(numbers[i]);
//            }
//        }
//        System.out.println("The numbers in the said array that are greater than the average are:"
//       +largerNumbers);

//EX3

//           int[] numbers ={20, 30, 50, 40};
//           int firstElm = numbers[0];
//           int lastElm = numbers[numbers.length-1];
//           int largest=0;
//           if (firstElm>lastElm){
//               largest=firstElm;
//           }else {
//               largest=lastElm;
//           }
//        System.out.println("Larger value between first and last element:"+largest);

//EX4

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(10);
//        numbers.add(50);
//        numbers.add(40);
//        numbers.add(70);
//        System.out.println("Original Array: "+numbers);
//
//        int firstElm = numbers.getFirst();
//        int lastElm = numbers.getLast();
//
//        ArrayList<Integer> numbersRev = new ArrayList<>();
//
//        for(int number:numbers){
//            if (numbers.indexOf(number)==numbers.size()-1){
//                numbersRev.add(firstElm);
//            } else if (numbers.indexOf(number)==0) {
//                numbersRev.add(lastElm);
//            } else {
//                numbersRev.add(number);
//            }
//        }
//        System.out.println("Reversed Array: "+numbersRev);


//EX5

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(40);
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(4);
//        numbers.add(10);
//        numbers.add(7);
//        System.out.println("Original Array: "+ numbers);
//        int pointer = 0;
//
//        ArrayList<Integer> oddNumbers = new ArrayList<>();
//        for(int number:numbers){
//            if (number%2!=0){
//                oddNumbers.add(pointer,number);
//                ++pointer;
//            }else {
//                oddNumbers.add(number);
//            }
//        }
//        System.out.println("Edited Array: "+ oddNumbers);



//EX6

//         int[] numbers1={2,3,6,6,4};
//         int[] numbers2={2,3,6,6,4};
//         boolean isEqual = true;
//
//         if(numbers1.length!=numbers2.length){
//             System.out.println("Arrays lengths aren't equal.");
//         }else {
//             for (int i = 0; i < numbers1.length; i++) {
//                 if (numbers1[i] != numbers2[i]) {
//                     isEqual = false;
//                     break;
//                 }
//             }
//             System.out.println("Are the two arrays equals: " + isEqual);
//         }


    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;
import java.util.Arrays;


public class PuzzleJava{

	// Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
	public static ArrayList<Integer> greaterThan10(){
		int[] arr = {3,5,1,2,7,9,8,13,25,32};
		int sum = 0;
		ArrayList<Integer> newarr = new ArrayList();
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
			if(arr[i] > 10){
				newarr.add(arr[i]);
			}
		}
	System.out.println("Sum is: " + sum);
	return newarr;
	}

	// Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
	public static ArrayList<String> shuffleNames(){
		String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		ArrayList<String> newarr = new ArrayList();
        List list = Arrays.asList(names);
        Collections.shuffle(list);
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
            if(names[i].length() > 5){
                newarr.add(names[i]);
            }
        }
        return newarr;
	}

	// Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
	public static void alphabetVowels(){
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		Collections.shuffle(Arrays.asList(alphabet));
		char first = alphabet[0];
		System.out.println(alphabet[25]);
		System.out.println(alphabet[0]);
			if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
				System.out.println("This letter is a vowel!");
			}
	}


	// Generate and return an array with 10 random numbers between 55-100.
	public static int[] randomArr55To100(){
        int[] arr = new int[10];
        Random rand = new Random();
        for(int i=0; i<10; i++){
            arr[i] = rand.nextInt(46)+55;
        }
        return arr;
    }
	

	// Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    public static int[] randomArr55To100Sorted(){
	    int[] array = randomArr55To100();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("The minimum is: "+array[0]);
        System.out.println("The maximum is: "+array[9]);
        return array;
    }
    // Create a random string that is 5 characters long.
        public static String randomString(){
        Random rand = new Random();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String str = "";
        for(int i = 0; i<5; i++){
            int random = rand.nextInt(26);
            str += alphabet[random];
        }
        return str;
    }

    // Generate an array with 10 random strings that are each 5 characters long
    public static String[] randomString5(){
    	String[] arr = new String[10];
        for(int i=0; i<10; i++){
            arr[i]=randomString();
        }
    return arr;
    }
}
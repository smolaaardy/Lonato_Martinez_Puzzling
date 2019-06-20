import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class PuzzleJavaTest{
    public static void main(String[] args){
    	PuzzleJava puzzle = new PuzzleJava();
        puzzle.greaterThan10();
        puzzle.shuffleNames();
        puzzle.alphabetVowels();
        puzzle.randomArr55To100();
        puzzle.randomArr55To100Sorted();
        System.out.println(puzzle.randomString());
        System.out.println(Arrays.toString(puzzle.randomString5()));
    }
}
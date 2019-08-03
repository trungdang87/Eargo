package Test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import Solution.Exercise1;

@RunWith(Parameterized.class)
public class Exercise1Test {
	
    @Parameter(0)
    public int num;
    @Parameter(1)
    public int[] array;

    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { 
        	{0, new int []{0,0,0,0}}, 
        	{-11, new int []{0,0,0,0}},
        	{83, new int []{3,0,1,3}},
        	{11, new int []{0,1,0,1}}
        	/*you can add more test parameters here*/
        	
        };
        return Arrays.asList(data);
    }

    @Test
    public void testCoinChange() {
        Exercise1 tester = new Exercise1();
        assertTrue(Arrays.equals(array, tester.solution(num)));
    }
    
}

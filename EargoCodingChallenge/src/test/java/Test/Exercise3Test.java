package Test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import Solution.Exercise3;

@RunWith(Parameterized.class)
public class Exercise3Test {
	
    @Parameter(0)
    public int[] data;
    @Parameter(1)
    public int[] result;
    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { 
        	{new int[] {3,8,8,55,38,1,7,42,54,53}, new int []{6, 9}}, 
        	{new int[] {5,100,3,5,0,0,0,0,0,0}, new int []{1, 2}},
        	{new int[] {0,0,0,0,0,0,3,4,7,8}, new int []{6,10}},
        	{new int[] {1,1,1,1}, new int []{0,0}},
        	{new int[] {0}, new int[] {0,0}},
        	{new int[] {}, new int[] {0,0}},
        	{null, new int[] {0,0}}
        	/*you can add more test parameters here*/
        	
        };
        return Arrays.asList(data);
    }
    
    @Test
    public void testCoinChange() {
        Exercise3 tester = new Exercise3();
        assertTrue(Arrays.equals(result, tester.solution(data)));
    }

}

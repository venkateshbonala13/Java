package streamsAndLambdasTest;


import org.junit.Test;
import streamsAndLambdas.StringStartsWithA;

import static org.junit.Assert.assertEquals;
import java.util.*;
public class StringStartsWithATest {
    @Test
    public void testFilterStringA(){
        List<String> strings= List.of("Aghcdhv","akjg","jgbn","kjuc","Adhguiub");
        List<String> expectedstrings= List.of("Aghcdhv","Adhguiub");
        List<String> result= StringStartsWithA.filterStringsStartingWithA(strings);
        assertEquals(expectedstrings,result);
    }



    @Test
    public void testFilterStringNoA(){
        List<String> strings= List.of("ghcdhv","akjg","jgbn","kjuc","dhguiub");
        List<String> expectedstrings= List.of();
        List<String> result=StringStartsWithA.filterStringsStartingWithA(strings);
        assertEquals(expectedstrings,result);
    }



    @Test
    public void testFilterStringAEmpty(){
        List<String> strings= List.of();
        List<String> expectedstrings= List.of();
        List<String> result=StringStartsWithA.filterStringsStartingWithA(strings);
        assertEquals(expectedstrings,result);
    }


}

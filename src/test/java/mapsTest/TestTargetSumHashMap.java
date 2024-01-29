package mapsTest;

import maps.TargetSumHashMap;
import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertArrayEquals;

public class TestTargetSumHashMap {

    @Test
    void testfindTarget(){
        int[] input = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] result= TargetSumHashMap.findTwoSumIndices(input,target);
        int[] expectedResult={3,5};
        assertArrayEquals(expectedResult,result);
    }

    @Test
    void testfindTargetfornoSol(){
        int[] input1 = {10, 20, 30, 40, 50, 60};
        int target1 = 55;
        int[] result1=TargetSumHashMap.findTwoSumIndices(input1,target1);
        int[] expectedResult1={};
        assertArrayEquals(expectedResult1,result1);
    }


    @Test
    public void testfindTargetforDuplicateValus(){
        int[] input2 = {10, 60, 30, 40, 50, 60};
        int target2 = 100;
        int[] result2=TargetSumHashMap.findTwoSumIndices(input2,target2);
        int[] expectedResult2={1,3};
        assertArrayEquals(expectedResult2,result2);

    }



}

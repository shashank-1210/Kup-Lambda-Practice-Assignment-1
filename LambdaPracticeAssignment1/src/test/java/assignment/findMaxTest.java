package assignment;

import org.junit.Assert;
import org.junit.Test;



public class findMaxTest {

   MaxOfTwoNumbersImpl obj = new MaxOfTwoNumbersImpl();
    @Test
    public void test1()
    {
       int actual=obj.max.findMax(2,3);
       int expected =3;
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void test2()
    {
        int actual=obj.max.findMax(-1,0);
        int expected =0;
        Assert.assertEquals(expected,actual);

    }

    ////Negative Test Case as expected output will be 0.
    @Test
    public void test3()
    {
        int actual=obj.max.findMax(-1,0);
        int expected =-1;
      Assert.assertNotEquals(expected,actual);

    }




}
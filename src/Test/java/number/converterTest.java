package number;

import main.java.converter.Digit;
import main.java.converter.DotProduct;
import main.java.converter.GetPower;
import main.java.converter.SumOfDigit;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class converterTest {
    @Test public void gettingDigit(){
        List<Integer>expect= Arrays.asList(3,2,1);
        assertEquals(expect, Digit.getDigits("123"));
    }
    @Test public void gettingPowers(){
        List<Integer> expect=Arrays.asList(1,8,64);
        assertEquals(expect, GetPower.getPowers(3,8));
    }
    @Test public void gettingProduct(){
        List<Integer>expext=Arrays.asList(3,16,64);
        List<Integer>digitList=Arrays.asList(3,2,1);
        List<Integer>powerSeries=Arrays.asList(1,8,64);
        assertEquals(expext,DotProduct.getProduct(digitList,powerSeries));
    }
    @Test public void gettingSum(){
        int expext=83;
        List<Integer>product=Arrays.asList(3,16,64);
        assertEquals(expext, SumOfDigit.getTotal(product));
    }
}

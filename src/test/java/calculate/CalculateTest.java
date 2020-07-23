package calculate;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;



public class CalculateTest {

    @Test(enabled = true) //false :忽略该条测试用例
    public void testAdd(){
        Calculate c = new Calculate();
        int jia = c.add(1,3);
        Assert.assertEquals(jia,4);
        System.out.println("testAdd");

    }
    @Test
    public void testSubtract(){
        Calculate c = new Calculate();
        int jian = c.subtract(5,1);
        Assert.assertEquals(jian,4);
        System.out.println("testSubtract");

    }
    @Test
    public void testMultiply(){
        Calculate c = new Calculate();
        int cheng = c.multiply(1,4);
        Assert.assertEquals(cheng ,4);
        System.out.println("testMultiply");
    }


    //     预期异常错误
    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivide(){

        Calculate c = new Calculate();
        int chu = 0;
        try{
            chu = c.divide(4,0);
        }catch (ArithmeticException a) {
            System.out.println("发生了错误" + a);
        }finally {
            System.out.println("testDivide");
            Assert.assertEquals(chu,0);
        }



    }
}

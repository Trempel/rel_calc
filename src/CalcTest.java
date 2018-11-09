import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class CalcTest {
    //check main funcs
    @Test
public void testPlus()
    {
        CalcMethod mc = new CalcMethod();
        int res = mc.calc(2,"+",3);
        Assert.assertEquals(3,mc);
    }
    @Test
    public void testMinus()
    {
        CalcMethod mc = new CalcMethod();
        int res = mc.calc(30,"-",20);
        Assert.assertEquals(10,res);
    }
    @Test
    public void testMult()
    {
        CalcMethod mc = new CalcMethod();
        int res = mc.calc(5,"*",4);
        Assert.assertEquals(20,res);
    }
    @Test
    public void testDiv()
    {
        CalcMethod mc = new CalcMethod();
        int res = mc.calc(6,"/",3);
        Assert.assertEquals(2,res);
    }
    @Test (expected = ArithmeticException.class)
    public void testDivByZero()
    {
        CalcMethod mc = new CalcMethod();
        int res = mc.calc(5,"/",0);
    }

}

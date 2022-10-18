package test;

import com.revature.testing.GetIndex;
import org.junit.*;

public class GetIndexTest {

    static GetIndex x;

    @BeforeClass
    public static void start(){
        x = new GetIndex();
    }

    @Before
    public void beforeTest(){
        System.out.println("This is before the test");
    }

    @After
    public void afterTest(){
        System.out.println("This is after the test");
    }

    @Test
    public void getIndexPosTest(){


        int[] arr = {14, 15, 9, 88, 4};
        System.out.println("testing pos test");
        Assert.assertEquals(18, x.findIndex(arr));
    }


    @Test
    public void  getIndexNegativeTest(){

        int[] arr = {14, 15, 9, 88, 4};
        System.out.println("testing negative test");
        Assert.assertNotEquals(19, x.findIndex(arr));
    }



}

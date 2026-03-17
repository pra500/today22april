package apcvc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import  static org.hamcrest.Matchers.*;

public class TTEST
{

    @DataProvider(name="nh")
    public Object[][] asa()
    {
        return new Object[][] {

                { "sdv", "dv"},
                { "sddv", "dev"},
        };
    }



    @Test(dataProvider = "nh")
    public void gessTest(String d, String dv){


        System.out.println(d);
        System.out.println(dv);
    }

}

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileTest  {

//@BeforeClass
//public static void init (){

Properties properties;
FileInputStream fs ;






    @Test
    public void testProperties  ()throws IOException {
       fs= new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/file.properties");
        properties= new Properties();
        properties.load(fs);
       System.out.println(properties.getProperty("Name"));
       System.out.println(properties.getProperty("City"));





    }





}

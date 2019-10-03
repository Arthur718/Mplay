package FtestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FtestBase {
static Properties properties;
static FileInputStream fs ;

public static void readData () throws IOException {
    fs= new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/file.properties");
    properties= new Properties();
    properties.load(fs);
   // //System.out.println(properties.getProperty("Name"));
    //System.out.println(properties.getProperty("City"));
    return;
}






}



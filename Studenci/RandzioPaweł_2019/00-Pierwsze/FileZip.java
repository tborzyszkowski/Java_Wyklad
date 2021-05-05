import java.util.ArrayList;
import java.io.File;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class FileZip
{
    public static void main(String[] args)
    {
        try {
            ZipFile zipFile = new ZipFile("test.zip");
            ArrayList<File> filesToAdd = new ArrayList<File>();
            filesToAdd.add(new File("test1.txt"));
            filesToAdd.add(new File("test2.txt"));
            ZipParameters parameters = new ZipParameters();
            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_MAXIMUM);
            parameters.setEncryptFiles(true);
            parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
            //parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
            parameters.setPassword("passwd1234");
            zipFile.addFiles(filesToAdd, parameters);
        }
        catch (ZipException e) {e.printStackTrace();}
    }
}
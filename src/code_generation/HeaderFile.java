package code_generation;

import data.Cv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by inesa on 21/05/2016.
 */
public class HeaderFile {
    public HeaderFile(Cv cv) throws IOException {
        FileOutputStream out = null;

        try {
            out = new FileOutputStream(Paths.get("").toAbsolutePath().toString() + "/resources/headerFile.tex");

            //Personal info!
            String[] splited = cv.info.getName().split(" ");
            String s = "\n" + "\\" + "name";

            for(int i=0; i < splited.length ; i++){
               s += "{" + splited[i] + "}";
            }

           // \position{Software Engineer{\enskip\cdotp\enskip}Security Expert}

            s += "\n" + "\\" + "position" + "{";
            for(int i=0; i < cv.info.getSub().size() - 1  ; i++){
                s += cv.info.getSub().get(i) + "{\\enskip\\cdotp\\enskip}";
            }

            s += cv.info.getSub().get(cv.info.getSub().size() - 1)  + "}";

            for(int i=0; i < cv.info.getContacts().size() ; i++){
                s += "\n" + "\\" + cv.info.getContacts().get(i).icon.name.trim() + "{" + cv.info.getContacts().get(i).text.trim() + "}";
            }

            out.write(s.getBytes());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }


}

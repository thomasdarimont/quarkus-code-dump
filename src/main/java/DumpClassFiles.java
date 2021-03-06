import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class DumpClassFiles {

    public static void main(String[] args) throws Exception{

        Path classesDump = Path.of("quarkus-in-memory-classes.ser");
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(classesDump));
        Map<String,byte[]> classes = (Map<String,byte[]>)ois.readObject();
        ois.close();

        classes.forEach((name, bytes) ->
        {
            try {
                Path targetPath = Path.of("target/generated-classes/" + name);
                if (!targetPath.getParent().toFile().exists()) {
                    targetPath.getParent().toFile().mkdirs();
                }
                Files.write(targetPath,bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}

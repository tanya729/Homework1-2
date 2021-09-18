import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class getContentType {
    public static String getContentType(File file) {
        if (file == null) {
            return null;
        }
        Path path = Paths.get(file.toURI());
        if (path == null) {
            return null;
        }
        String contentType = null;
        try {
            contentType = Files.probeContentType(path);
        } catch (IOException e) {
            log.error("ContentType odd", e);
        }
        if (contentType == null) {
            contentType = getContentTypeByExtension(file);
        }
        if (contentType == null) {
            contentType = DEFAULT_MIME_TYPE;
        }
        return contentType;
    }
}
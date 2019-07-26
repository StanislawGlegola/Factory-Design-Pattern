package PhotoFormat;

interface PhotoViever {
    void showPhoto(String fileName);
}

class JPGformat implements PhotoViever {

    public void showPhoto(String fileName) {
        System.out.println("Show photograph in .JPG format: " + fileName);
    }
}

class JPEGformat implements PhotoViever {

    public void showPhoto(String fileName) {
        System.out.println("Show photograph in .JPEG format: " + fileName);
    }
}

class PNGformat implements PhotoViever {

    public void showPhoto(String fileName) {
        System.out.println("Show photograph in .JPNG format: " + fileName);
    }
}

class FormatReaderFactory {
    public PhotoViever reader(String fileName) {
        if (fileName
                .endsWith(".JPG")) {
            return new JPGformat();
        } else if (fileName
                .endsWith(".JPEG")) {
            return new JPEGformat();
        } else if (fileName
                .endsWith(".PNG")) {
            return new PNGformat();
        } else {
            return null;
        }
    }
}

public class Main1 {
    public static void main(String[] args) {

        String fileName = "photo.JPG";

        FormatReaderFactory formatReader = new FormatReaderFactory();

        PhotoViever reader = formatReader.reader(fileName);
        if (reader != null) {
            reader.showPhoto(fileName);
        }
    }
}

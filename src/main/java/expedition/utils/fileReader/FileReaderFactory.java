package expedition.utils.fileReader;

public class FileReaderFactory {
    public static IFileReader createReader (String path){
        if (path.endsWith(".csv")){
            return new CsvFileReader(path);
        } else {
            System.out.println("Unsupported file format");
        }
        return null;
    }
}

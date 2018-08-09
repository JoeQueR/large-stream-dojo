package papierbulle;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class App {

    public static void main(String[] args) throws IOException {

        System.out.println("Parsing...");

        final Reader reader = Files.newBufferedReader(Paths.get(Objects.requireNonNull(App.class.getClassLoader().getResource("./trees.csv")).getPath()));
        final CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        final List<String[]> dataStore = csvReader.readAll();

        System.out.println(dataStore.size());

//        CsvToBean<Tree> csvToBean = new CsvToBeanBuilder<Tree>(reader)
//                .withType(Tree.class)
//                .withIgnoreLeadingWhiteSpace(true)
//                .build();
//
//        List<Tree> trees = csvToBean.parse();
//
//        System.out.println(trees.size());

        doThings(dataStore);
    }

    private static void doThings(final List<String[]> dataStore) {
        System.out.println("Ready!");
    }
}

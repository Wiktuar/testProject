package teachclasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toMap;
// StringBuilder использовать не стал, мне больше String.format() нравится.
public class ParsingString {
    public static void main(String[] args) {
       readFromFile("file.txt");
    }

// метод, считывающий информацию из файла
    public static void readFromFile(String fileName){
        try(FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr)){
            String s;
            while((s = br.readLine()) != null){
                printString(s);
            }
        }catch(IOException e){
            System.out.println("Не могу прочесть файл");
        }
    }

//  метод, обрабатывающий строку и печатающий результат
    public static void printString(String stroka){
        Map<String, String> map =  Pattern.compile(",").splitAsStream(stroka)
                .map(str -> str.split(":"))
                .collect(toMap(str -> str[0].replaceAll("\"", ""), str -> str[1].replaceAll("\"", "")));

        String result = String.format("Студент %s получил %s по предмету %s",
                map.get("фамилия"), map.get("оценка"), map.get("предмет"));
        System.out.println(result);
    }
}

package teachclasses;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
         Map<String, String> map = getSearchParams();
        Set<NoteBook> set = setOfNoteBooks();
        Set<NoteBook> filteredSet = filter(set, map);
        filteredSet.forEach(System.out::println);
    }

    private static Set<NoteBook> setOfNoteBooks(){
        Set<NoteBook> set = new HashSet<>();
        set.add(new NoteBook((byte) 4, 250, OperationSystem.WINDOWS, "white", "Lenovo"));
        set.add(new NoteBook((byte) 8, 500, OperationSystem.LINUX, "white", "Sony"));
        set.add(new NoteBook((byte) 8, 250, OperationSystem.MacOS, "black", "Apple"));
        set.add(new NoteBook((byte) 4, 500, OperationSystem.WINDOWS, "black", "Lenovo"));
        set.add(new NoteBook((byte) 16, 1000, OperationSystem.MacOS, "black", "Apple"));
        set.add(new NoteBook((byte) 16, 1000, OperationSystem.LINUX, "white", "Sony"));
        return set;
    }

    private static Map<String, String> getSearchParams(){
        String value = "";
        Map<String, String> searchParams = new HashMap();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введите цифру, соответствующую необходимому критерию \n" +
                    "1 - ОЗУ \n" +
                    "2 - Объем жесткого диска \n" +
                    "3 - Операционная система \n" +
                    "4 - Цвет\n" +
                    "5 - Бренд\n" +
                    "6 - выход");

            String param = scanner.nextLine();
            switch(param){
                case "1":
                    System.out.println("Введите требуемый объем ОЗУ - 4  8  16");
                    value = scanner.nextLine(); break;
                case "2":
                    System.out.println("Введите требуемый объем ЖД - 250  500  1000");
                    value = scanner.nextLine(); break;
                case "3":
                    System.out.println("Выберите операционную систему - Windows, Linux, MacOS");
                    value = scanner.nextLine(); break;
                case "4":
                    System.out.println("Выберите желамый цвет - white  black");
                    value = scanner.nextLine(); break;
                case "5":
                    System.out.println("Выберите желаемый бренд  Windows, Linux, MacOS");
                    value = scanner.nextLine(); break;
                case "6": value = "exit";
            }

            if(param.equals("6")) break;
            searchParams.put(param, value);
        }

//        System.out.println("Введите количество компьютеров в выдаче");
//        int limit = scanner.nextInt();
//        scanner.close();
//        searchParams.put("limit", String.valueOf(limit));
        return searchParams;
    }

    private static Set<NoteBook> filter(Set<NoteBook> notebooksSet, Map<String, String> searchParams){
        for(Map.Entry<String, String> pair : searchParams.entrySet()){
            switch (pair.getKey()){
                case "1": notebooksSet = notebooksSet.stream().filter(n -> n.getRAM() == Integer.parseInt(pair.getValue()))
                        .collect(Collectors.toSet()); break;
                case "2": notebooksSet = notebooksSet.stream().filter(n -> n.getCapacityHD() == Integer.parseInt(pair.getValue()))
                        .collect(Collectors.toSet()); break;
                case "3": notebooksSet = notebooksSet.stream().filter(n -> n.getOperationSystem().toString().equals(pair.getValue()))
                        .collect(Collectors.toSet()); break;
                case "4": notebooksSet = notebooksSet.stream().filter(n -> n.getColor().equals(pair.getValue()))
                        .collect(Collectors.toSet()); break;
                case "5": notebooksSet = notebooksSet.stream().filter(n -> n.getBrand().equals(pair.getValue()))
                        .collect(Collectors.toSet()); break;
            }
        }
        return notebooksSet;
    }
}

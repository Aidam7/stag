package pro1;

import com.google.gson.Gson;
import pro1.apiDataModel.EntryExamList;

import java.util.Objects;
import java.util.stream.Collectors;

public class Main7 {
    public static void main(String[] args) {
        System.out.println(specializationDeadlines(2025));}
    public static String specializationDeadlines(int i) {
        String json = Api.getSpecializations(i);
        EntryExamList exams = new Gson().fromJson(json, EntryExamList.class);
        return exams.items.stream()
                .filter(e -> Objects.equals(e.fakulta, "FIM"))
                .filter(e -> Objects.equals(e.programNazev, "Informační a síťová bezpečnost"))
                .map(e -> e.deadline.value)
                .distinct()
                .collect(Collectors.joining(","));
    }
}

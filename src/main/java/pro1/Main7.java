package pro1;

import com.google.gson.Gson;
import pro1.apiDataModel.EntryExamList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

public class Main7 {
    public static void main(String[] args) {
        System.out.println(specializationDeadlines(2025));
    }

    public static String specializationDeadlines(int i) {
        DateTimeFormatter dfm = DateTimeFormatter.ofPattern("d.M.yyyy");
        String json = Api.getSpecializations(i);
        EntryExamList exams = new Gson().fromJson(json, EntryExamList.class);
        return exams.items.stream()
                .map(e -> e.deadline.value)
                .distinct()
                .map(s -> LocalDate.parse(s, dfm))
                .sorted()
                .map(d -> d.format(dfm))
                .collect(Collectors.joining(","));
    }
}

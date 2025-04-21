package pro1.apiDataModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EntryExamList {
    @SerializedName("prijimaciObor")
    public List<EntryExam> items;
}

package pro1.apiDataModel;

import com.google.gson.annotations.SerializedName;

public class EntryExam
{
    @SerializedName("fakulta")
    public String fakulta;
    @SerializedName("programNazev")
    public String programNazev;
    @SerializedName("eprDeadlinePrihlaska")
    public Deadline deadline;
}


package jack.chen.models;

public class ResultModel {
    public int[] resultArray;
    public long startTime;
    public long getStartTime(){return startTime;}
    public void setStartTime(long startTime){ this.startTime = startTime;}
    public long endTime;
    public long getEndTime(){return endTime;}
    public void setEndTime(long endTime){ this.endTime = endTime;}
    public String timeCost;
}

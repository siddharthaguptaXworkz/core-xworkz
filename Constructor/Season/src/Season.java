public class Season {
    private int startMonth;
    private int endMonth;
    private final String className = "Season";
    private final String seasonName;

    public Season(int startMonth, int endMonth, String seasonName) {
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.seasonName = seasonName;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(int startMonth) {
        this.startMonth = startMonth;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(int endMonth) {
        this.endMonth = endMonth;
    }

    public String getClassName() {
        return className;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void print() {
        System.out.println("startMonth = " + startMonth);
        System.out.println("endMonth = " + endMonth);
        System.out.println("className = " + className);
        System.out.println("seasonName = " + seasonName);
    }
}

enum WeekDay2 {
  MON("星期一"), TUE("星期二"), WED("星期三");
  private String day;

  private WeekDay2(String day) {
    this.day = day;
  }

  String getDay() {
    return this.day;
  }

  public static void main(String args[]) {
    for (WeekDay2 weekDay2 : WeekDay2.values()) {
      System.out.println(weekDay2 + weekDay2.getDay());
    }
  }
}
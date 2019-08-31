// 枚举类
enum WeekDay {
  Mon("monday"), Tue("tuesday"), Wed("wedsday");
  private final String day;

  private WeekDay(String day) { // 构造函数
    this.day = day;
  }

  public String getDay() {
    return day;
  }

  public static void main(String args[]) {
    for (WeekDay weekday : WeekDay.values()) { // 此处的weekday就是实例化后的WeekDay
      System.out.println(weekday + "===>" + weekday.getDay()); // 实例化后会在走早函数中将值传给day
      // Mon===>monday
      // Tue===>tuesday
      // Wed===>wedsday
    }
  }
}
package java7.StringBuilder;

public class Demo {
  public static void main(String[] args) {
    String a = "a";
    String b = "b";
    String c = "c";

    StringBuilder sb = new StringBuilder(a);

    long start = System.currentTimeMillis();
    for (int i = 0; i < 500; i++) {
      sb
        .append(a)
        .append(b)
        .append(c);
    }
    long finish = System.currentTimeMillis();

    System.out.println("Start:\t" + start + "\nFinish:\t" + finish );
  }
}

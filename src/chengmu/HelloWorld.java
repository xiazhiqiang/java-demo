package chengmu;

import java.lang.System.*;
import java.net.*;
// import android.net.Uri;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    // String url = "https://portal.zjzwfw.gov.cn/?DeviceID=11704301";
    String url = "https://portal.zjzwfw.gov.cn/ ?DeviceID=11704301";
    // String url = "https://portal.zjzwfw.gov.cn/%20?DeviceID=11704301";
    URI Uri = URI.create(url);
    System.out.println("params: " + Uri.getQuery().toString());
  }
}

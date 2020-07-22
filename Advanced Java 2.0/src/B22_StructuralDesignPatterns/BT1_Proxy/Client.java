package B22_StructuralDesignPatterns.BT1_Proxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

public class Client {
    public static void main(String[] args) {
        String url = "https://img1.liveinternet.ru/images/attach/d/2//9399/9399474_proxy_list_download_text_file.pdf";
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36";
        String destination = "D:\\WORKSPACE\\Tutor_CodegymDN\\Advanced Java 2.0\\src\\B22_StructuralDesignPatterns\\data.pdf";

        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        fileDownloaderProxy.download(userAgent, url, destination);
    }
}

package ss19_regex.exercise.craw;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Craw {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://dantri.com.vn/the-gioi.htm");
        URLConnection urlConnection = url.openConnection();

        InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        StringBuilder data = new StringBuilder();
        String pointer;

        while ((pointer = bufferedReader.readLine()) != null) {
            data.append(pointer);
        }

        /* Lấy tất cả mọi thứ trong h3, xuất hiện n lần*/
        Pattern pattern = Pattern.compile("<h3.*?</h3>");
        Matcher matcher = pattern.matcher(data);

        ArrayList<String> arrayList = new ArrayList<>();
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }

        String[] temp;
        List<String> result = new ArrayList<>();
        for(String s : arrayList) {
            temp = s.split("htm\">");
            result.add(temp[1].substring(0, temp[1].length() - 9));
        }

        for (String s : result) {
            System.out.println(s.replaceAll("&quot;","\"").trim());
        }

    }
}

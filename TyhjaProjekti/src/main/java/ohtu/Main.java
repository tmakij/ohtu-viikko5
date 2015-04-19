package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;

public final class Main {

    public static void main(String[] args) throws IOException {
        String studentNr;
        System.out.print("Opiskelijanumero ");
        if (args.length > 0) {
            studentNr = args[0];
            System.out.println(studentNr);
        } else {
            Scanner stdin = new Scanner(System.in);
            studentNr = stdin.nextLine();
            try {
                Integer.parseInt(studentNr);
            } catch (NumberFormatException ex) {
                System.out.println("Epäkelpo opiskelijanumero");
                return;
            }
        }

        String url = "http://ohtustats-2015.herokuapp.com/students/" + studentNr + "/submissions";

        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);

        client.executeMethod(method);

        InputStream stream = method.getResponseBodyAsStream();
        String bodyText = IOUtils.toString(stream);
        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        int tehtyja = 0;
        int tunteja = 0;
        for (Submission submission : subs) {
            System.out.println(submission);
            tehtyja += submission.getTehdyt();
            tunteja += submission.getHours();
        }
        System.out.println("yhteensä: " + tehtyja + " tehtävää " + tunteja + " tuntia");
    }
}

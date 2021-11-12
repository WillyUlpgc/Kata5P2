package kata5P2.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReader;
import kata5p2.view.MailListReaderBD;


public class Kata5p2 {

    public static void main(String[] args) {
        String file = "email.txt";
        MailListReader mailReader = new MailListReader();
        MailHistogramBuilder histBuilder = new MailHistogramBuilder();

        List<Mail> mails = new ArrayList<Mail>(mailReader.read(file));
        Histogram histogram = new Histogram();
        histogram = histBuilder.build(mails);
        new HistogramDisplay(histogram).execute();


    }
}
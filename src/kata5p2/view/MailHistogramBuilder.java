

package kata5p2.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;


public class MailHistogramBuilder {

    
    public Histogram<String> build(List<Mail> mails){
        List<String> domains = new ArrayList<String>();
        for(Mail mail : mails){
            String domain = mail.getDomain();
            if(!domain.equals("")) domains.add(domain);
        }
        
         Histogram<String> histogram = new Histogram();
         for(String domain : domains){
             histogram.increment(domain);
         }
         return histogram;
    }
}

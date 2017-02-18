/**
 * Created by HP on 18.02.2017.
 */
public class MailServ {

    MailSender sender;

    String user;
    String subj;
    String textOfMail;



    public  MailServ(String user, String subj) {

        sender = new MailSender();
        this.user = user;
        this.subj = subj;

    }

    public void createMail(){



    }




}

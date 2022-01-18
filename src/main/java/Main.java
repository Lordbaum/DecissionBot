import Listener.Id;
import Listener.MessageListener;
import Listener.Zuteilung;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.exceptions.ErrorResponseException;
import org.w3c.dom.events.EventException;

import javax.security.auth.login.LoginException;

public class Main {

    public static String prefix = "-";

    public static void main(String[] args) {
        try {
            JDA jda = JDABuilder.createDefault("insert token here").build();
           //TODO add Token
            jda.awaitReady();
            jda.addEventListener(new MessageListener());
            Zuteilung zuteilung = new Zuteilung();
            zuteilung.loadChannel(jda);
            jda.addEventListener(zuteilung);
            jda.addEventListener(new Id());

            jda.getPresence().setActivity(Activity.playing("Anarchy"));
        } catch (LoginException d) {
            System.out.println("Fehler beim erstellen des Bots");
            System.exit(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ErrorResponseException e) {
            System.out.println("ResponseException");
        } catch (EventException e) {
            System.out.println("eventException");
        } catch (IllegalStateException e) {
            System.out.println("fehler bei State");
        } catch (IllegalMonitorStateException e) {
            System.out.println("MonitorStateException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (IllegalThreadStateException e) {
            System.out.println("ThreadStateException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("OutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (ExceptionInInitializerError e) {
            System.out.println("ExceptionInitalizerError");
        }

    }
}

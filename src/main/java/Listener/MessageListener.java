package Listener;

import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class MessageListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        String baum = "Baum";
        String msg2 = e.getMessage().getContentRaw();
        if (e.getAuthor().isBot())
            return;
        if (e.isFromType(ChannelType.TEXT)) {
            if (e.getChannel().getName().equals("einreiche")) {
                String msg = e.getAuthor().getName() + " hat geschrieben: " + e.getMessage().getContentRaw();
                e.getChannel().sendMessage(msg).queue();
            }
        }
        if (e.getMessage().getContentRaw().equals("bot bist du da")) {
            e.getChannel().sendMessage("Nein").queue();
        }
        if (e.getMessage().getContentRaw().equals("weil"))
            e.getChannel().sendMessage(baum).queue();
        if (e.getMessage().getContentRaw().contains("[zgbz8izhuihb8zg8g8guighuhgu]")) {
            e.getChannel().sendMessage(msg2).queue();

        }

        if (e.getChannel().getName().equals("droge")) {
            String delet = e.getMessageId();
            e.getChannel().deleteMessageById(delet).queue();
        }
        if (e.getMessage().getContentRaw().equals("add")) {
            ;
            e.getMessage().addReaction("upvote:790623007043354634").queue();
        }

    }
}
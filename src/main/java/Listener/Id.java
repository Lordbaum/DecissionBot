package Listener;

import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Invite;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;


public class Id extends ListenerAdapter {
    private TextChannel idvote;
    private TextChannel a;

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent e) {
        if (e.isFromType(ChannelType.TEXT)) {

            TextChannel c = e.getTextChannel();
            String msg = e.getMessageId();
            int voted = c.retrieveMessageById(msg).complete().getReactions().get(0).getCount();
            a = e.getGuild().getTextChannelById("730795421001187400");
            System.out.println("so viele haben gevoted:");
            System.out.println(voted);
            int member = e.getGuild().getMemberCount();
            if (e.getChannel().getName().equals("idinfo")) {
                c.sendMessage(e.getReaction().getReactionEmote().getId()).queue();
                c.sendMessage(e.getReaction().getReactionEmote().getName()).queue();
            }
            if (e.getReaction().getReactionEmote().getName().equals("upvote") && c.getParent().getId().equals("730792975579480064")) {
                System.out.println("erkannt");
                if (voted >= Math.round(((float) 15 / (float) 100) * member)) {
                    System.out.println("hürde übersprungen");
                    String send = c.retrieveMessageById(msg).complete().getContentRaw();
                    a.sendMessage(send).queue();
                    c.retrieveMessageById(msg).complete().delete().queue();
                }
            }

        }
    }

}

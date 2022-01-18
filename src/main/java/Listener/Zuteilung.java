package Listener;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class Zuteilung extends ListenerAdapter {

    private TextChannel Drogen;
    private TextChannel bildung;
    private TextChannel aussen;
    private TextChannel gesund;
    private TextChannel finaz;
    private TextChannel wir_En;
    private TextChannel arbeit;
    private TextChannel natur;
    private TextChannel infra;
    private TextChannel familie;
    private TextChannel ernaehrung;
    private TextChannel discord;
    private int fehlerab;


    public void loadChannel(JDA jda) {
        for (TextChannel textChannel : jda.getCategoriesByName("Abstimmungen", true).get(0).getTextChannels()) {
            switch (textChannel.getName()) {
                case "drogen":
                    Drogen = textChannel;
                    break;
                case "bildungssystem_":
                    bildung = textChannel;
                    break;
                case "außenpolitik_":
                    aussen = textChannel;
                    break;
                case "gesundheitssystem_":
                    gesund = textChannel;
                    break;
                case "finanzen_":
                    finaz = textChannel;
                    break;
                case "wirtschaft-und-energie_":
                    wir_En = textChannel;
                    break;
                case "arbeit-und-soziales_":
                    arbeit = textChannel;
                    break;
                case "umwelt-und-naturschutz_":
                    natur = textChannel;
                    break;
                case "digitale-infrastrucktur-und-verkehr_":
                    infra = textChannel;
                    break;
                case "familie":
                    familie = textChannel;
                    break;
                case "ernährung-und-landwirtschaft_":
                    ernaehrung = textChannel;
                    break;
                case "discord":
                    discord = textChannel;
                    break;

            }
        }
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {

        String msg = e.getMessage().getContentRaw();
        TextChannel admin = e.getGuild().getTextChannelsByName("gelöschte-nachrichten", true).get(0);
        String delet = e.getMessageId();
        String fehler1 = "anfrage von " + e.getAuthor().getName() + " " + e.getMessage().getContentRaw() + " ist durchs system geraselt";
        String fehler1m = "Deine anfrage " + e.getMessage().getContentRaw() + " ist durchs system geraselt";
        fehlerab = 0;
        if (e.getAuthor().isBot())
            return;
        if (e.isFromType(ChannelType.TEXT)) {
            if (e.getChannel().getName().equals("einreichen")) {

                if (e.getMessage().getContentRaw().contains("[Drogen]")) {
                    e.getChannel().deleteMessageById(delet).queue();
                    fehlerab = 1;
                    Drogen.sendMessage(msg).queue((message) -> {
                        long Drogenid = message.getIdLong();
                        Drogen.addReactionById(Drogenid, "upvote:790623007043354634").queue();
                    });
                }

                if (e.getMessage().getContentRaw().contains("[Bildung]")) {
                    fehlerab = 1;
                    e.getChannel().deleteMessageById(delet).queue();
                    bildung.sendMessage(msg).queue((message) -> {
                        long bildungid = message.getIdLong();
                        bildung.addReactionById(bildungid, "upvote:790623007043354634").queue();
                    });
                }

                if (e.getMessage().getContentRaw().contains("[Außenpolitik]")) {
                    e.getChannel().deleteMessageById(delet).queue();
                    fehlerab = 1;
                    aussen.sendMessage(msg).queue((message) -> {
                        long aussenid = message.getIdLong();
                        bildung.addReactionById(aussenid, "upvote:790623007043354634").queue();
                    });
                }

                if (e.getMessage().getContentRaw().contains("[Gesundheitssystem]")) {
                    e.getChannel().deleteMessageById(delet).queue();
                    fehlerab = 1;
                    gesund.sendMessage(msg).queue((message) -> {
                        long gesundid = message.getIdLong();
                        gesund.addReactionById(gesundid, "upvote:790623007043354634").queue();
                    });
                }

                if (e.getMessage().getContentRaw().contains("[Finanzen]")) {
                    e.getChannel().deleteMessageById(delet).queue();
                    fehlerab = 1;
                    finaz.sendMessage(msg).queue((message) -> {
                        long finazid = message.getIdLong();
                        finaz.addReactionById(finazid, "upvote:790623007043354634").queue();
                    });
                }

                if (e.getMessage().getContentRaw().contains("[Wirtschaft]")) {
                    e.getChannel().deleteMessageById(delet).queue();
                    fehlerab = 1;
                    wir_En.sendMessage(msg).queue((message) -> {
                        long wrenid = message.getIdLong();
                        wir_En.addReactionById(wrenid, "upvote:790623007043354634").queue();
                    });
                }

                if (e.getMessage().getContentRaw().contains("[Arbeit]")) {
                    e.getChannel().deleteMessageById(delet).queue();
                    fehlerab = 1;
                    arbeit.sendMessage(msg).queue((message) -> {
                        long arbeitid = message.getIdLong();
                        arbeit.addReactionById(arbeitid, "upvote:790623007043354634").queue();
                    });
                }

                if (e.getMessage().getContentRaw().contains("[Umwelt]")) {
                    e.getChannel().deleteMessageById(delet).queue();
                    fehlerab = 1;
                    natur.sendMessage(msg).queue((message) -> {
                        long naturid = message.getIdLong();
                        natur.addReactionById(naturid, "upvote:790623007043354634").queue();
                    });
                }
                if (e.getMessage().getContentRaw().contains("[digital]")) {
                    e.getChannel().deleteMessageById(delet).queue();
                    fehlerab = 1;
                    infra.sendMessage(msg).queue((message) -> {
                        long infraid = message.getIdLong();
                        infra.addReactionById(infraid, "upvote:790623007043354634").queue();
                    });
                }
                if (e.getMessage().getContentRaw().contains("[Familie]")) {
                    e.getChannel().deleteMessageById(delet).queue();
                    fehlerab = 1;
                    familie.sendMessage(msg).queue((message) -> {
                        long familieid = message.getIdLong();
                        familie.addReactionById(familieid, "upvote:790623007043354634").queue();
                    });
                }
                if (e.getMessage().getContentRaw().contains("[Ernährung]")) {
                    e.getChannel().deleteMessageById(delet).queue();
                    fehlerab = 1;
                    ernaehrung.sendMessage(msg).queue((message) -> {
                        long ernaehrungid = message.getIdLong();
                        ernaehrung.addReactionById(ernaehrungid, "upvote:790623007043354634").queue();
                    });
                }
                if (e.getMessage().getContentRaw().contains("[Discord]")) {
                    e.getChannel().deleteMessageById(delet).queue();
                    fehlerab = 1;
                    discord.sendMessage(msg).queue((message) -> {
                        long Discordid = message.getIdLong();

                        discord.addReactionById(Discordid, "upvote:790623007043354634").queue();
                    });
                }
                if (fehlerab == 0) {
                    System.out.println(fehler1);

                    admin.sendMessage(fehler1).queue();
                    e.getMember().getUser().openPrivateChannel().queue((direct) ->
                            direct.sendMessage(fehler1m).queue());
                    e.getChannel().deleteMessageById(delet).queue();
                }
                if (e.getAuthor().isBot()) {
                    e.getMessage().addReaction("upvote:790623007043354634").queue();
                    System.out.println("es ist was passiert");
                }
            }
        }
    }
}

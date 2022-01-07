package bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import util.BotSettings;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/6/2022
 * Time: 7:30 PM
 */
public class AppFoodBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        
    }

    @Override
    public String getBotUsername() {
        return BotSettings.USER_NAME_BOT;
    }

    @Override
    public String getBotToken() {
        return BotSettings.TOKEN;
    }
}

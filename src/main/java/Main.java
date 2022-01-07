import bot.AppFoodBot;
import config.DbConfig;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import service.StoreDataToDbFromJson;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/6/2022
 * Time: 7:05 PM
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        StoreDataToDbFromJson.store();
        try {
            TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
            api.registerBot(new AppFoodBot());

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}

package enums;

import bot.BotService;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/6/2022
 * Time: 7:10 PM
 */
public enum BotState {
    START,
    SHOW_MENU,
    SHOW_PRODUCTS,
    SHOW_CATEGORIES,
    SELECT_PRODUCT,
    SELECT_PRODUCT_COUNT;


    public static BotState fromString(String name) {
        for (BotState value : BotState.values()) {
            if (value.name().equals(name))
                return value;
        }
        return null;
    }
}

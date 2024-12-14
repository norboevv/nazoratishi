package org.example;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class BotButton {
    public static ReplyKeyboardMarkup languageButtons() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🇷🇺 Русский"));
        row1.add(new KeyboardButton("🇺🇿 O'zbekcha"));
        row1.add(new KeyboardButton("🇺🇸 English"));

        rowList.add(row1);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup uzCityButtons() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Toshkent"));
        row1.add(new KeyboardButton("Samarqand"));
        row1.add(new KeyboardButton("Buxoro"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Andijon"));
        row2.add(new KeyboardButton("NamanganUz"));
        row2.add(new KeyboardButton("Farg'ona"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Xorazm"));
        row3.add(new KeyboardButton("Navoiy"));
        row3.add(new KeyboardButton("Qarshi"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Nukus"));
        row4.add(new KeyboardButton("Jizzax"));
        row4.add(new KeyboardButton("Termiz"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup ruCityButtons() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Ташкент"));
        row1.add(new KeyboardButton("Самарканд"));
        row1.add(new KeyboardButton("Бухара"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Андижан"));
        row2.add(new KeyboardButton("Наманган"));
        row2.add(new KeyboardButton("Фергана"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Хорезм"));
        row3.add(new KeyboardButton("Навои"));
        row3.add(new KeyboardButton("Карши"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Нукус"));
        row4.add(new KeyboardButton("Джизак"));
        row4.add(new KeyboardButton("Термез"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup enCityButtons() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Tashkent"));
        row1.add(new KeyboardButton("Samarkand"));
        row1.add(new KeyboardButton("Bukhara"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Andijan"));
        row2.add(new KeyboardButton("Namangan"));
        row2.add(new KeyboardButton("Fergana"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Khorezm"));
        row3.add(new KeyboardButton("Navoi"));
        row3.add(new KeyboardButton("Karshi"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Nukus"));
        row4.add(new KeyboardButton("Jizzakh"));
        row4.add(new KeyboardButton("Termez"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }
    public static ReplyKeyboardMarkup mainMenuUz() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🍕 Buyurtma berish"));
        row1.add(new KeyboardButton("📋 Buyurtmalar tarixi"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("📞 Chopar bilan aloqa"));
        row2.add(new KeyboardButton("⚙️ Sozlash"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("📚 Ma'lumotlar"));
        row3.add(new KeyboardButton("👥 Jamoamizga qo'shilish"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup mainMenuRu() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("📦 Сделать заказ"));
        row1.add(new KeyboardButton("📋 История заказов"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("⚙️ Настройки"));
        row2.add(new KeyboardButton("��️ Информация"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("📞 Связь с курьером"));
        row3.add(new KeyboardButton("👥 Присоединиться к команде"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup mainMenuEn() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("📦 Make Order"));
        row1.add(new KeyboardButton("📋 Order History"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("⚙️ Settings"));
        row2.add(new KeyboardButton("ℹ️ Information"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("📞 Contact Courier"));
        row3.add(new KeyboardButton("👥 Join Our Team"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }
    public static ReplyKeyboardMarkup deliveryTypeUz() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🚶 Olib ketish"));
        row1.add(new KeyboardButton("🚚 Yetkazib berish"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("⬅️ Ortga"));

        rowList.add(row1);
        rowList.add(row2);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup deliveryTypeRu() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🚶 Заберу сам"));
        row1.add(new KeyboardButton("🚚 Доставка"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("⬅️ Назад"));

        rowList.add(row1);
        rowList.add(row2);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup deliveryTypeEn() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🚶 Pickup"));
        row1.add(new KeyboardButton("🚚 Delivery"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("⬅️ Back"));

        rowList.add(row1);
        rowList.add(row2);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup ourBranchesRu() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🏢 Чиланзорский филиал"));
        row1.add(new KeyboardButton("🏢 Юнусабадский филиал"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("🏢Сергелийский филиал "));
        row2.add(new KeyboardButton("🏢 Якасарайский филиал"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("⬅️ Назад"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }
    public static ReplyKeyboardMarkup ourBranchUz() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🏢 Chilonzor filiali"));
        row1.add(new KeyboardButton("🏢 Yunusobod filiali"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("🏢 Sergeli filiali"));
        row2.add(new KeyboardButton("🏢 Yakkasaroy filiali"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("⬅️ Back"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }
    public static ReplyKeyboardMarkup ourBranchesEn() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🏢 Chilonzor branch"));
        row1.add(new KeyboardButton("🏢 Yunusobod branch"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("🏢 Sergeli branch"));
        row2.add(new KeyboardButton("🏢 Yakkasaroy branch"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("⬅️ Orqaga"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }
    public static ReplyKeyboardMarkup shareLocationUz() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton locationButton = new KeyboardButton("📍 Lokatsiyani ulashish");
        locationButton.setRequestLocation(true);
        row1.add(locationButton);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("⬅️ Orqaga"));

        rowList.add(row1);
        rowList.add(row2);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup locationButtons() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🌐 Ortga"));

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton locationButton = new KeyboardButton("📍 Eng yaqin filialni aniqlash");
        locationButton.setRequestLocation(true);
        row2.add(locationButton);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("🌐 Bu yerda buyurtma berish"));
        row3.add(new KeyboardButton("📍 Filialni tanlang"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup pickupBranchButtons() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton locationButton = new KeyboardButton("📍 Eng yaqin filialni aniqlash");
        locationButton.setRequestLocation(true);
        row1.add(locationButton);
        row1.add(new KeyboardButton("📍 Filialni tanlang"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("🌐 Bu yerda buyurtma berish"));
        row2.add(new KeyboardButton("⬅️ Ortga"));

        rowList.add(row1);
        rowList.add(row2);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup branchListButtons() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Atlas Chimgan"));
        row1.add(new KeyboardButton("Sergeyli 2"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Nukus Asia.uz KSM"));
        row2.add(new KeyboardButton("Megaplanet KSM"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Oybek"));
        row3.add(new KeyboardButton("Buyuk ipak yo'li"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Qo'yliq-5"));
        row4.add(new KeyboardButton("Parus KSM"));

        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("⬅️ Ortga"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup orderMenuButtons() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("���� Savat"));
        row1.add(new KeyboardButton("🍕 Pitsa"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("🥙 Pide va Lavash"));
        row2.add(new KeyboardButton("🍔 Setlar"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("🍟 Snaklar"));
        row3.add(new KeyboardButton("🍅 Souslar"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("⬅️ Ortga"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup pideLavashMenuButtons() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("VEGETARIAN LAVASH"));
        row1.add(new KeyboardButton("TOVUQ STEYK LAVASH"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("PISHLOQLI PIDE"));
        row2.add(new KeyboardButton("GO'SHTLI PIDE"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("3+1 VEGETARIAN LAVASH"));
        row3.add(new KeyboardButton("3+1 TOVUQ STEYK LAVASH"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("⬅️ Ortga"));
        row4.add(new KeyboardButton("🛒 Savat"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }

    public static ReplyKeyboardMarkup deliveryMenuButtons() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton locationButton = new KeyboardButton("📍 Eng yaqin filialni aniqlash");
        locationButton.setRequestLocation(true);
        row1.add(locationButton);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("🏠 Mening manzillarim"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("⬅️ Ortga"));

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);

        return markup;
    }
}


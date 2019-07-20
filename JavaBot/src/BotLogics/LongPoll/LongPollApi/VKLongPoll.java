package BotLogics.LongPoll.LongPollApi;

import BotLogics.LongPoll.Events.VKEvents;
import BotLogics.LongPoll.Events.VkEventType;

import java.util.HashMap;

public class VKLongPoll {
    private static final int CHAT_START_ID = 2000000000;
    private VKEvents DEFAULT_EVENT_CLASS = new VKEvents();
    enum PRELOAD_MESSAGE_EVENT { MESSAGE_NEW, MESSAGE_EDIT }




    public void check(){
        HashMap<String, String> values = new HashMap<String, String>();
        values.put("act", "a_check");
        values.put("key", "key");
    }
}
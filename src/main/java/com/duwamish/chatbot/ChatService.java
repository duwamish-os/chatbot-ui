package com.duwamish.chatbot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ChatService {
    public CompletableFuture<List<String>> getHistory() {
        return CompletableFuture.supplyAsync(() -> {
            List<String> history = new ArrayList<>();
            history.add("love");
            history.add("universe");

            return history;
        });
    }
}

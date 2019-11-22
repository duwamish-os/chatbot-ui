package com.duwamish.chatbot;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("chat")
public class ChatbotUi extends VerticalLayout {

    public ChatbotUi() {
        Button button = new Button("Talk to me",
                event -> Notification.show("Ke chha pasa!"));
        add(button);
    }

}

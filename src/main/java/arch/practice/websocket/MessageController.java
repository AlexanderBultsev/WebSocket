package arch.practice.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/webs")
    @SendTo("/topic/messages")
    public OutputMessage sendOutputMessage(final InputMessage inputMessage) {
        return new OutputMessage(inputMessage.getText());
    }

}

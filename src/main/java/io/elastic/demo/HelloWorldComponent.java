package io.elastic.demo;

import com.google.gson.JsonObject;
import io.elastic.api.Component;
import io.elastic.api.EventEmitter;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;

public class HelloWorldComponent extends Component {

    public HelloWorldComponent(EventEmitter eventEmitter) {
        super(eventEmitter);
    }

    @Override
    public void execute(ExecutionParameters parameters) {

        final JsonObject body = new JsonObject();
        body.addProperty("en", "Hello, world!");
        body.addProperty("de", "Hallo, Welt!");

        final Message response
                = new Message.Builder().body(body).build();

        getEventEmitter().emitData(response);
    }
}

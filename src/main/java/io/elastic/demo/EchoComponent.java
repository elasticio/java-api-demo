package io.elastic.demo;

import com.google.gson.JsonObject;
import io.elastic.api.Component;
import io.elastic.api.EventEmitter;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;

public class EchoComponent extends Component {

    public EchoComponent(EventEmitter eventEmitter) {
        super(eventEmitter);
    }

    @Override
    public void execute(ExecutionParameters parameters) {

        final JsonObject snapshot = new JsonObject();
        snapshot.add("echo", parameters.getSnapshot());

        getEventEmitter()
                .emitSnapshot(snapshot)
                .emitData(echoMessage(parameters));
    }

    private Message echoMessage(ExecutionParameters parameters) {

        final Message msg = parameters.getMessage();

        final JsonObject body = new JsonObject();
        body.add("echo", msg.getBody());
        body.add("config", parameters.getConfiguration());

        return new Message.Builder()
                .body(body)
                .attachments(msg.getAttachments())
                .build();
    }
}

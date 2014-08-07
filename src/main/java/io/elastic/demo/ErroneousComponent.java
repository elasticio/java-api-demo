package io.elastic.demo;

import io.elastic.api.Component;
import io.elastic.api.EventEmitter;
import io.elastic.api.ExecutionParameters;

public class ErroneousComponent extends Component {

    public ErroneousComponent(EventEmitter eventEmitter) {
        super(eventEmitter);
    }

    @Override
    public void execute(ExecutionParameters parameters) {

        getEventEmitter().emitException(new IllegalStateException("Ouch"));
    }
}

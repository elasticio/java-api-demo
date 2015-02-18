package io.elastic.demo;

import io.elastic.api.Component;
import io.elastic.api.EventEmitter;
import io.elastic.api.ExecutionParameters;

public class ReboundingComponent extends Component {

    public ReboundingComponent(EventEmitter eventEmitter) {
        super(eventEmitter);
    }

    @Override
    public void execute(ExecutionParameters parameters) {
        this.getEventEmitter().emitRebound("Rebound for a reason!");       
    }

}

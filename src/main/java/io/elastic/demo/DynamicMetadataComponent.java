package io.elastic.api.demo;

import com.google.gson.JsonObject;

import io.elastic.api.Component;
import io.elastic.api.DynamicMetadataProvider;
import io.elastic.api.EventEmitter;
import io.elastic.api.ExecutionParameters;

public class DynamicMetadataComponent extends Component implements DynamicMetadataProvider {

	public DynamicMetadataComponent(EventEmitter eventEmitter) {
		super(eventEmitter);
	}

	@Override
	public JsonObject getMetaModel(JsonObject configuration) {
		
		JsonObject metaModel = new JsonObject();
		
		metaModel.addProperty("property", "value");
		
		return metaModel;
	}

	@Override
	public void execute(ExecutionParameters parameters) {
		// TODO Auto-generated method stub
		
	}

}

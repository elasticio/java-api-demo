package io.elastic.demo;

import io.elastic.api.DynamicMetadataProvider;

import com.google.gson.JsonObject;

public class DynamicMetadataComponent implements DynamicMetadataProvider {

	@Override
	public JsonObject getMetaModel(JsonObject configuration) {
		
		JsonObject metaModel = new JsonObject();
		
		metaModel.addProperty("property", "value");
		
		return metaModel;
	}

}

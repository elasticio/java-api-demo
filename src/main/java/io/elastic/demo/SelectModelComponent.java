package io.elastic.demo;

import io.elastic.api.SelectModelProvider;

import com.google.gson.JsonObject;

public class SelectModelComponent implements SelectModelProvider{

	@Override
	public JsonObject getSelectModel(JsonObject configuration) {
		JsonObject selectModel = new JsonObject();
		
		selectModel.addProperty("property", "value");
		return selectModel;
	}
}

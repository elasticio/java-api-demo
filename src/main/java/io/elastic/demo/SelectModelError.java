package io.elastic.demo;

import com.google.gson.JsonObject;

import io.elastic.api.SelectModelProvider;

public class SelectModelError implements SelectModelProvider {

	@Override
	public JsonObject getSelectModel(JsonObject configuration) {
		throw new IllegalStateException("YOU SHALL NOT PASS!!!");
	}

}

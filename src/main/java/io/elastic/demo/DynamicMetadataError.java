package io.elastic.demo;

import com.google.gson.JsonObject;

import io.elastic.api.DynamicMetadataProvider;

public class DynamicMetadataError implements DynamicMetadataProvider {

	@Override
	public JsonObject getMetaModel(JsonObject configuration) {
		throw new RuntimeException("BAM!");
	}

}

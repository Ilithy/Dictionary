package com.looker.dictionary.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.reflect.TypeToken
import com.looker.dictionary.data.util.JsonParser
import com.looker.dictionary.domain.model.Meaning

@ProvidedTypeConverter
class Converters(private val jsonParser: JsonParser) {

	@TypeConverter
	fun fromMeaningsJson(json: String): List<Meaning> {
		return jsonParser.fromJson<ArrayList<Meaning>>(
			json,
			object : TypeToken<ArrayList<Meaning>>() {}.type
		) ?: emptyList()
	}

	@TypeConverter
	fun toMeaningsJson(meanings: List<Meaning>): String {
		return jsonParser.toJson(
			meanings,
			object : TypeToken<ArrayList<Meaning>>() {}.type
		) ?: "[]"
	}
}
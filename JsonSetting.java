package me.sevtix.jslib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class JsonSetting {

	private File backendfile;
	private JsonElement json;

	/* 
	 * This Library was made by Sevtix
	 * Build date: 13th October 2k17
	 */
	
	// TODO: Implement Array Support

	public JsonSetting(String filepath) {
		try {
			backendfile = new File(filepath);
			JsonParser jsonParser = new JsonParser();
			json = jsonParser.parse(new JsonReader(new InputStreamReader(new FileInputStream(backendfile))));
		} catch (Exception e) {
			printError(e);
		}
	}

	// SET FUNCTIONS

	public void setAsInt(String property, int value) throws Exception {
		JsonObject object = json.getAsJsonObject();
		object.addProperty(property, value);
	}

	public void setAsString(String property, String value) throws Exception {
		JsonObject object = json.getAsJsonObject();
		object.addProperty(property, value);
	}

	public void setAsBoolean(String property, Boolean value) throws Exception {
		JsonObject object = json.getAsJsonObject();
		object.addProperty(property, value);
	}

	// GET FUNCTIONS

	public int getAsInt(String property) throws Exception {
		JsonObject object = json.getAsJsonObject();
		return object.get(property).getAsInt();
	}

	public String getAsString(String property) throws Exception {
		JsonObject object = json.getAsJsonObject();
		return object.get(property).getAsString();
	}

	public boolean getAsBoolean(String property) throws Exception {
		JsonObject object = json.getAsJsonObject();
		return object.get(property).getAsBoolean();
	}

	public JsonElement getAsJsonElement(String property) throws Exception {
		JsonObject object = json.getAsJsonObject();
		return object.get(property);
	}

	// SAVE FUNCTION

	public void saveToJson() {

		try {
			FileWriter writer = new FileWriter(backendfile);
			writer.write(json.toString());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			printError(e);
		}
	}

	// DETAILED ERROR PRINT FUNCTION
	
	private void printError(Exception ex) {
		System.out.println("jsonsettings-lib > "+ex.getClass().getSimpleName() + ":" + ex.getMessage());
	}

}

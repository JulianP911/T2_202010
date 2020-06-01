package Infracciones;

import java.util.Properties;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Crs 
{
	// Atributos

	@SerializedName("type")
	@Expose
	private String type;
	
	@SerializedName("properties")
	@Expose
	private Properties properties;

	// Metodos
	
	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public Properties getProperties() 
	{
		return properties;
	}

	public void setProperties(Properties properties) 
	{
		this.properties = properties;
	}
}
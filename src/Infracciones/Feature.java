
package Infracciones;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feature 
{
	// Atributos

	@SerializedName("type")
	@Expose
	private String type;
	
	@SerializedName("properties")
	@Expose
	private Properties_ properties;
	
	@SerializedName("geometry")
	@Expose
	private Geometry geometry;
	
	// Metodos

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public Properties_ getProperties() 
	{
		return properties;
	}

	public void setProperties(Properties_ properties) 
	{
		this.properties = properties;
	}

	public Geometry getGeometry() 
	{
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
}
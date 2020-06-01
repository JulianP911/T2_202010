package Infracciones;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example 
{
	// Atributos

	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("crs")
	@Expose
	private Crs crs;
	@SerializedName("features")
	@Expose
	private List<Feature> features = null;

	// Metodos
	
	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Crs getCrs() 
	{
		return crs;
	}

	public void setCrs(Crs crs)
	{
		this.crs = crs;
	}

	public List<Feature> getFeatures() 
	{
		return features;
	}

	public void setFeatures(List<Feature> features) 
	{
		this.features = features;
	}

}
package Infracciones;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties 
{
	// Atributos

	@SerializedName("name")
	@Expose
	private String name;
	
	// Metodos

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

}
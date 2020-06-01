package Infracciones;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties_ 
{
	// Atributos

	@SerializedName("OBJECTID")
	@Expose
	private Integer oBJECTID;
	@SerializedName("FECHA_HORA")
	@Expose
	private String fECHAHORA;
	@SerializedName("MEDIO_DETE")
	@Expose
	private String mEDIODETE;
	@SerializedName("CLASE_VEHI")
	@Expose
	private String cLASEVEHI;
	@SerializedName("TIPO_SERVI")
	@Expose
	private String tIPOSERVI;
	@SerializedName("INFRACCION")
	@Expose
	private String iNFRACCION;
	@SerializedName("DES_INFRAC")
	@Expose
	private String dESINFRAC;
	@SerializedName("LOCALIDAD")
	@Expose
	private String lOCALIDAD;
	
	// Metodos

	public Integer getOBJECTID() 
	{
		return oBJECTID;
	}

	public void setOBJECTID(Integer oBJECTID) 
	{
		this.oBJECTID = oBJECTID;
	}

	public String getFECHAHORA() 
	{
		return fECHAHORA;
	}

	public void setFECHAHORA(String fECHAHORA) 
	{
		this.fECHAHORA = fECHAHORA;
	}

	public String getMEDIODETE() 
	{
		return mEDIODETE;
	}

	public void setMEDIODETE(String mEDIODETE) 
	{
		this.mEDIODETE = mEDIODETE;
	}

	public String getCLASEVEHI() 
	{
		return cLASEVEHI;
	}

	public void setCLASEVEHI(String cLASEVEHI)
	{
		this.cLASEVEHI = cLASEVEHI;
	}

	public String getTIPOSERVI() 
	{
		return tIPOSERVI;
	}

	public void setTIPOSERVI(String tIPOSERVI) 
	{
		this.tIPOSERVI = tIPOSERVI;
	}

	public String getINFRACCION() 
	{
		return iNFRACCION;
	}

	public void setINFRACCION(String iNFRACCION)
	{
		this.iNFRACCION = iNFRACCION;
	}

	public String getDESINFRAC()
	{
		return dESINFRAC;
	}

	public void setDESINFRAC(String dESINFRAC)
	{
		this.dESINFRAC = dESINFRAC;
	}

	public String getLOCALIDAD() 
	{
		return lOCALIDAD;
	}

	public void setLOCALIDAD(String lOCALIDAD) 
	{
		this.lOCALIDAD = lOCALIDAD;
	}

}
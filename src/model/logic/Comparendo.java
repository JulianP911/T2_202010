package model.logic;

/**
 * Clase de tipo comparendo el cual almacena todas sus caracteristicas y detalles
 * @author Julian Padilla - Pablo Pastrana
 */
public class Comparendo 
{
	// Atributos
	
	/**
	 * Numero de reconocimiento del comparendo
	 */
	private int objective;
	
	/**
	 * Fecha en la cual fue tomado el comparendo
	 */
	private String fecha_hora;
	
	/**
	 * Medio por el cual se tomo el comparendo
	 */
	private String medio_dete;
	
	/**
	 * Clase de vehiculo al cual se le aplico el comparendo
	 */
	private String clase_vehi;
	
	/**
	 * Tipo de servicio del vehiculo al cual se le aplico el comparendo
	 */
	private String tipo_servi;
	
	/**
	 * Infraccion impuesta al vehiculo
	 */
	private String infraccion;
	
	/**
	 * Descripcion del comparendo detalladamente
	 */
	private String des_infrac;
	
	/**
	 * Localida en la cual fue realizado el comparendo
	 */
	private String localidad;
	
	/*
	 * Arreglo de double para guardar las cordenadas
	 */
	private double[] cordenadas;
	
	// Metodo Constructor
	
	/**
	 * Metodo constructor del comparendo
	 * @param pObjective Objective del comparendo
	 * @param pFecha_hora Fecha_hora del comparendo
	 * @param pMedio_dete Medio_ Dete del comparendo
	 * @param pClase_vehi Clase_vehi del comparendo
	 * @param pTipo_servi Tipo_servi del comparendo
	 * @param pInfraccion Infraccion del comparendo
	 * @param pDes_infrac Des_infrac del comparendo
	 * @param pLocalidad Localidad del comparendo
	 * @param pCordenada1 Cordenada1 del comparendo
	 * @param pCordenada2 Cordenada2 del comparendo
	 */
	public Comparendo(int pObjective, String pFecha_hora, String pMedio_dete, String pClase_vehi, String pTipo_servi, String pInfraccion, String pDes_infrac, String pLocalidad, double pCordenada1, double pCordenada2) 
	{
		this.objective = pObjective;
		this.fecha_hora = pFecha_hora;
		this.medio_dete = pMedio_dete;
		this.clase_vehi = pClase_vehi;
		this.tipo_servi = pTipo_servi;
		this.infraccion = pInfraccion;
		this.des_infrac = pDes_infrac;
		this.localidad = pLocalidad;
		cordenadas = new double[2];
		cordenadas[0] = pCordenada1;
		cordenadas[1] = pCordenada2;
	}
	
	// Metodos
	
	/**
	 * Da el objective del comparendo
	 * @return Objective
	 */
	public int getObjective() 
	{
		return objective;
	}
	
	/**
	 * Cambia el objective del comparendo
	 * @param objective Nuevo objective
	 */
	public void setObjective(int objective) 
	{
		this.objective = objective;
	}
	
	/**
	 * Da la fecha y la hora a la cual se tomo el comparendo
	 * @return Fecha y Hora
	 */
	public String getFecha_hora() 
	{
		return fecha_hora;
	}
	
	/**
	 * Cambia la fecha y la hora del comparendo
	 * @param fecha_hora Nueva Fecha_Hora
	 */
	public void setFecha_hora(String fecha_hora) 
	{
		this.fecha_hora = fecha_hora;
	}
	
	/**
	 * Da el Medio_dete del comparendo
	 * @return Medio_dete 
	 */
	public String getMedio_dete() 
	{
		return medio_dete;
	}
	
	/**
	 * Cambia el medio en el cual se tomo el comparendo
	 * @param medio_dete Nuevo medio_dete
	 */
	public void setMedio_dete(String medio_dete) 
	{
		this.medio_dete = medio_dete;
	}
	
	/**
	 * Da la clase del vehiculo al cual se le aplico el comparendo
	 * @return Clase_vehi
	 */
	public String getClase_vehi() 
	{
		return clase_vehi;
	}
	
	/**
	 * Cambia la clase del vehiculo al cual se le aplico el comparendo
	 * @param clase_vehi Nuevo clase_vehi
	 */
	public void setClase_vehi(String clase_vehi) 
	{
		this.clase_vehi = clase_vehi;
	}
	
	/**
	 * Da el tipo del vehiculo al cual se le aplico el comparendo
	 * @return Tipo_vehi
	 */
	public String getTipo_servi()
	{
		return tipo_servi;
	}
	
	/**
	 * Cambia el tipo del vehiculo al cual se le aplico el comparendo
	 * @param tipo_servi Nuevo Tipo_servi
	 */
	public void setTipo_servi(String tipo_servi) 
	{
		this.tipo_servi = tipo_servi;
	}
	
	/**
	 * Da el tipo del infraccion la cual se le aplico el comparendo
	 * @return Infraccion
	 */
	public String getInfraccion() 
	{
		return infraccion;
	}
	
	/**
	 * Cambia el tipo del infraccion la cual se le aplico el comparendo
	 * @param infraccion Nueva infraccion
	 */
	public void setInfraccion(String infraccion) 
	{
		this.infraccion = infraccion;
	}
	
	/**
	 * Da la descripcion del comparendo que se aplico
	 * @return Des_infrac
	 */
	public String getDes_infrac() 
	{
		return des_infrac;
	}
	
	/**
	 * Cambia la descripcion del comparendo que se aplico
	 * @param des_infrac Nuevo des_infrac
	 */
	public void setDes_infrac(String des_infrac) 
	{
		this.des_infrac = des_infrac;
	}
	
	/**
	 * Da la localidad donde se aplico el comparendo
	 * @return Localida
	 */
	public String getLocalidad() 
	{
		return localidad;
	}
	
	/**
	 * Cambia la localidad donde se aplico el comparendo
	 * @param localidad Nueva localida
	 */
	public void setLocalidad(String localidad) 
	{
		this.localidad = localidad;
	}
	
	/**
	 * Da el arreglo con las coordenadas de la latitud y longitud
	 * @return Cordenadas
	 */
	public double[] getCordenadas() 
	{
		return cordenadas;
	}
	
	/**
	 * Cambia el arreglo con las coordenadas de la latitud y longitud
	 * @param cordenadas Nuevas cordenadas
	 */
	public void setCordenadas(double[] cordenadas) 
	{
		this.cordenadas = cordenadas;
	}
}

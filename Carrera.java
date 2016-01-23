public class Carrera {
	private String codigo_carr;
	private String nombre_carr;
	private String unidad_carr;
	private int estudiantes_carr;
	
	public Carrera(){
		
	}
	
	public Carrera(String carrCodigo, String carrNombre, String carrUnidad, int carrNestudiantes){
		codigo_carr = carrCodigo;
		nombre_carr = carrNombre;
		unidad_carr = carrUnidad;
		estudiantes_carr = carrNestudiantes;
	}
	
	public Materia get_Materia_By_Codigo(String codigo){
		//Buscar Materia por Codigo.
		
	}
}
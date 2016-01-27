public class Materia {
	private String codigo_mat;
	private String nombre_mat;
	private String descripcion_mat;
	private int cred_teo_mat;
	private int cred_prac_mat;
	
	public Materia(){
		
	}
	
	public Materia(String matCodigo, String matNombre, String matDescrp, int matTeoricos, int matPracticos){
		codigo_mat = matCodigo;
		nombre_mat = matNombre;
		descripcion_mat = matDescrp;
		cred_teo_mat = matTeoricos;
		cred_prac_mat = matPracticos;
	}
	
	public Materia get_Materia_By_Codigo(String codigo){
		
	}
}
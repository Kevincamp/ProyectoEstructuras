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

    public String presentarMateria(){
        System.out.println("**************************************\n");
        System.out.println(codigo_mat + " -" + nombre_mat + "\n");
        System.out.println("Descripcion: "+ descripcion_mat + "\n");
        System.out.println("Creditos -> teo: "+ cred_teo_mat + "pract: " + cred_prac_mat+ ".\n");
    }
}
import java.io.*;

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
	
    public String getCodigo_carr(){
        return codigo_carr;
    }
    public String getNombre_carr(){
        return nombre_carr;
    }
    public String getUnidad_carr(){
        return unidad_carr;
    }
    public int getEstudiantes_carr(){
        return estudiantes_carr;
    }
    
    public void cargarCarrera(Carrera c) throws Exception
    {
        
        File f = new File("d:\\"+codigo_carr+".sol");
        if(f.exists()) {
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            c =(Carrera)ois.readObject(); //cargamos el archivo al objeto Carrera
            fis.close();
            ois.close();
        }
        Else
        {
            f.createNewFile();
        }
    }
    
    public void insertarCarrera
    
    
    
}
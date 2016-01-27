import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NodoCarrera implements Serializable
{
	private String codigo;
	private String nombre;
	private String unidad;
	private int estudiantes;

	NodoCarrera enlace;
	NodoCarrera(String co, String no,String un, int est)
	{
		String codigo=co;
		String 	nombre=no;
		String unidad=un;
		int estudiante=est;
	}
	
	String getCodigo(NodoCarrera x)
	{
		return x.codigo;
	}
	String getNombre(NodoCarrera x)
	{
		return x.nombre;
	}
	String getUnidad(NodoCarrera x)
	{
		return x.unidad;
	}
	int getEstudiantes(NodoCarrera x)
	{
		return x.estudiantes;
	}
	void SaveNodoCarrera(NodoMateria x,File f)
	{
		bw=new BufferedWriter(new FileWriter(f));
		if(f.exists())
		{
			
			bw.write(x.codigo+"\n"+x.nombre+"\n"+x.unidad+"\n"+Integer.toString(x.estudiantes));
		}
	}
}

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NodoMateria implements Serializable
{
	private String codigo;
	private String nombre;
	private String desc;
	private int cteoricos;
	private int cpracticos;

	NodoMateria enlace;
	NodoMateria(String co, String no,String de, int ct, int cp)
	{
		String codigo=co;
		String 	nombre=no;
		String desc=de;
		int cteoricos=ct;
		int cpracticoscp;

	}
	String getCodigo(NodoMateria x)
	{
		return x.codigo;
	}
	String getNombre(NodoMateria x)
	{
		return x.nombre;
	}
	String getDesc(NodoMateria x)
	{
		return x.desc;
	}
	int getCT(NodoMateria x)
	{
		return x.cteoricos;
	}
	int GetCP(NodoMateria x)
	{
		return x.cpracticos;
	}
	void SaveNodoMateria(NodoMateria x,File f)
	{
		bw=new BufferedWriter(new FileWriter(f));
		if(f.exists())
		{
			
			bw.write(x.codigo+"\n"+x.nombre+"\n"+x.desc+"\n"+Integer.toString(x.cteoricos) +"\n"+Integer.toString(x.cpracticos));
		}
	}
}

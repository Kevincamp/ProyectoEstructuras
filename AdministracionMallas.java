public class AdministracionMallas {
	
  public static void main(String[] args) {
	  submenu(menu());
  }
  
  public static int menu(){
	  Teclado in = new Teclado();
	  System.out.println("1. Carreras.\n");
	  System.out.println("2. Materias.\n");
	  System.out.println("3. Malla Curriculares.\n");
	  System.out.println("4. Salir.\n");
	  int opcion = in.getInt("Selecciona una opción : ");
	  return opcion;
  }
  
  public static void submenu(int opcion){
	  Teclado in = new Teclado();
	  
	  switch (opcion){
		  case 1:
		  	System.out.println("************* CARRERAS *************\n");	
		  	System.out.println("1. Ingresar Nueva Carrera.\n");
			System.out.println("2. Listar todas las Carreras.\n");
			System.out.println("3. Buscar Carrera por Código.\n");
			System.out.println("4. Eliminar Carrera.\n");
			System.out.println("5. Atras.\n");
		  	int carr = in.getInt("Selecciona una opción : ");
			accion_Carrera(carr);
		  	break;
		  case 2:
		  	System.out.println("************* MATERIAS *************\n");
		  	System.out.println("1. Ingresar Nueva Materia.\n");
			System.out.println("2. Listar todas las Materias.\n");
			System.out.println("3. Buscar Materia por Código.\n");
			System.out.println("4. Eliminar Materia.\n");
			System.out.println("5. Atras.\n");
		  	int mat = in.getInt("Selecciona una opción : ");
		  	break;
		  case 3:
		  	System.out.println("************* MALLA CURRICULARES *************\n");
			System.out.println("1. Crear Nueva Malla Curricular.\n");
			System.out.println("2. Listar Número de versiones por Código de Carrera.\n");
			System.out.println("3. Buscar Malla Curricular por Código de Carrera y Versión.\n");
			System.out.println("4. Eliminar Malla Curricular.\n");
			int mall = in.getInt("Selecciona una opción : ");
		  	break;
		  case 4:
		  	System.out.println("5. Atras");
		  	break;
	  }
  }
  
  public static void accion_Carrera(int opcion){
	  Teclado in = new Teclado();
	  switch(opcion){
		  case 1:
		  System.out.println("************* CARRERA *************\n");
		  System.out.println("************* INGRESO DE NUEVA CARRERA *************\n");
		  System.out.println("Ingrese los siguientes datos.\n");
		  String codigo_carr = in.getString("Código de la carrera: ");
		  String nombre_carr = in.getString("Nombre de la carrera: ");
		  String unidad_carr = in.getString("Unidad Academica:  ");
		  int estudiantes_carr = in.getInt("# de estudiantes: ");
		  Carrera carrera = new Carrera(codigo_carr, nombre_carr, unidad_carr, estudiantes_carr);
		  
		  break;
		  case 2:
		  break;
		  case 3:
		  break;
		  case 4:
		  break;
		  case 5:
		  break;
	  }
  }
}
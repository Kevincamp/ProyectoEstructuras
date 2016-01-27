public class AdministracionMallas {
	
  public static void main(String[] args) {
      Teclado in = new Teclado();
      int opcion = 10;
      while(opcion != 4)
      {
          menu();
          opcion = in.getInt("Escoja modulo a ingresar: ");
          switch(opcion)
          {
              case 1:
                  int opcionCarrera = 10;
                  while(opcionCarrera !=5)
                  {
                      menuCarrera();
                      opcionCarrera = in.getInt("Sellecione una opción: ");
                      switch(opcionCarrera)
                      {
                              
                          case 1:
                              //Ingresar nueva Carrera
                              break;
                          case 2:
                              //Listar todas las Carreras
                              break;
                          case 3:
                              //Buscar Carrera Codigo
                              break;
                          case 4:
                              //Eliminar Carrera
                              break
                    
                      }
                  }
                        break;
              case 2:   menuMaterias();
                        break;
              case 3:   menuMallas():
                        break;
                
                  
          }
      }
	  submenu(menu());
  }
  
  static void menu()
  {
	  
      System.out.println("********** Modulos de Administración ***********");
	  System.out.println("1. Carreras.\n");
	  System.out.println("2. Materias.\n");
	  System.out.println("3. Malla Curriculares.\n");
	  System.out.println("4. Salir.\n");
  }
    
  static void menuCarrera()
  {
        System.out.println("************* CARRERAS *************\n");
        System.out.println("1. Ingresar Nueva Carrera.\n");
        System.out.println("2. Listar todas las Carreras.\n");
        System.out.println("3. Buscar Carrera por Código.\n");
        System.out.println("4. Eliminar Carrera.\n");
        System.out.println("5. Atras.\n");
    }
    
    static void menuMaterias()
    {
        System.out.println("************* MATERIAS *************\n");
        System.out.println("1. Ingresar Nueva Materia.\n");
        System.out.println("2. Listar todas las Materias.\n");
        System.out.println("3. Buscar Materia por Código.\n");
        System.out.println("4. Eliminar Materia.\n");
        System.out.println("5. Atras.\n");
    }
    
    static void menuMallas()
    {
        
        System.out.println("************* MALLA CURRICULARES *************\n");
        System.out.println("1. Crear Nueva Malla Curricular.\n");
        System.out.println("2. Listar Número de versiones por Código de Carrera.\n");
        System.out.println("3. Buscar Malla Curricular por Código de Carrera y Versión.\n");
        System.out.println("4. Eliminar Malla Curricular.\n");
        System.out.println("5. Atras.\n");
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
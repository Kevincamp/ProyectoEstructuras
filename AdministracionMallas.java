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
                      opcionCarrera = in.getInt("Selecione una opción: ");
                      switch(opcionCarrera)
                      {
                              
                          case 1:
                              nuevaCarrera();
                              break;
                          case 2:
                              listarCarreras()
                              break;
                          case 3:
                              buscarCarrera();
                              break;
                          case 4:
                              eliminarCarrera()
                              break;
                    
                      }
                  }
                        break;
              case 2:
                  int opcionMateria = 10;
                  while(opcionMateria != 5)
                  {
                      menuMaterias();
                      opcionMateria = in.getInt("Seleccione una opción");
                      switch(opcionCarrera)
                      {
                          case 1:
                              nuevaMateria();
                              break;
                          case 2:
                              listarMaterias();
                              break;
                          case 3:
                              buscarMateria();
                              break;
                          case 4:
                              eliminarMateria();
                              break;
                      }
                  }
                        break;
              case 3:
                  int opcionMalla = 10;
                  while(opcionMalla != 5)
                  {
                      menuMallas();
                      opcionMalla = in.getInt("Seleccione una opción");
                      switch(opcionMalla)
                      {
                      
                          case 1:
                              break;
                          case 2:
                              break;
                          case 3:
                              break;
                          case 4:
                              break;
                      }
                  }
                        break;
                
                  
          }
      }
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
    
    /****************************************  REGION CARRERA **********************/
    
    public void nuevaCarrera(){
        
        Teclado in = new Teclado();
        System.out.println("************* INGRESO DE NUEVA CARRERA *************\n");
        System.out.println("Ingrese los siguientes datos.\n");
        String codigo_carr = in.getString("Código de la carrera: ");
        String nombre_carr = in.getString("Nombre de la carrera: ");
        String unidad_carr = in.getString("Unidad Academica:  ");
        int estudiantes_carr = in.getInt("# de estudiantes: ");
        Carrera carrera = new Carrera(codigo_carr, nombre_carr, unidad_carr, estudiantes_carr);
        
    }
    
    public void listarCarreras(){
    
    }
    
    public void buscarCarrera(){
        
        Teclado in = new Teclado();
        System.out.println("************* BUSCAR CARRERA *************\n");
        String codigo_carr = in.getString("Ingrese código de la carrera: ");
        //BuscarCarrera
    }
    
    public void eliminarCarrera(){
        
        Teclado in = new Teclado();
        System.out.println("************* ELIMINAR CARRERA *************\n");
        String codigo_carr = in.getString("Ingrese código de la carrera: ");
        //ElimnarCarrera
    }
    
    
    /****************************************  REGION MATERIA **********************/
    public void nuevaMateria()
    {
        
        Teclado in = new Teclado();
        System.out.println("************* INGRESO DE NUEVA MATERIA *************\n");
        System.out.println("Ingrese los siguientes datos.\n");
        String codigo_mat = in.getString("Código de la materia: ");
        String nombre_mat = in.getString("Nombre de la materia: ");
        String descripción_mat = in.getString("descripción:  ");
        int credTeo_mat = in.getInt("# Creditos Teoricos: ");
        int credPrac_mat = in.getInt("# Creditos Practicos: ");
        
        Materia m = new Materia(codigo_mat, nombre_mat, descripción_mat, credTeo_mat, credPrac_mat);
    }
    
    public void listarMaterias()
    {
    
    }
    
    public void buscarMateria(){
        
        Teclado in = new Teclado();
        System.out.println("************* BUSCAR MATERIA *************\n");
        String codigo_mat = in.getString("Ingrese código de la materia: ");
        //BuscarMateria
    }
    
    
    public void eliminarMateria(){
        
        Teclado in = new Teclado();
        System.out.println("************* ELIMINAR MATERIA *************\n");
        String codigo_mat = in.getString("Ingrese código de la materia: ");
        //ElimnarMateria
    }
    
    /****************************************  REGION MALLA **********************/
    
    public void nuevaMalla(){
        Teclado in = new Teclado();
        System.out.println("************* INGRESO DE NUEVA MALLA *************\n");
        System.out.println("Ingrese los siguientes datos.\n");
        String codigo_carr = in.getString("Código de la carrera: ");
        int ver_mall = in.getInt("Version malla: ");
        
        Malla m = new Malla(codigo_carr,ver_mall);

    }
    
}
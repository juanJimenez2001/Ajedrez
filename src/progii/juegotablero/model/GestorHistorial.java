package progii.juegotablero.model;


import progii.juegotablero.exceptions.MovimientoException;
import stacks.exceptions.EmptyStackException;
import stacks.Stack;
import anotacion.Programacion2; 
@Programacion2 (
                nombreAutor1 = "Juan",
                apellidoAutor1 = "Jimenez Perez",
                emailUPMAutor1 = "juan.jimenez.perez@alumnos.upm.es",
                nombreAutor2 = "Jesus",
                apellidoAutor2 = "Hernandez Perez", 
                emailUPMAutor2 = "jesus.hernandezp@alumnos.upm.es"
               )
  /**
   * Clase que gestiona el historial de movimientos de la partida
   * 
   *
   */
  public class GestorHistorial {
  
  /**
   * Pila con los movimientos a deshacer
   */
  private stacks.Stack<Movimiento> pilaDeshacer;
  
  /**
   * Pila con los movimientos a rehacer
   */
  private stacks.Stack<Movimiento> pilaRehacer;
  
  /**
   * Crea e inicializa las pilas del gestor del historial
   */
  public GestorHistorial() {
    pilaDeshacer = new stacks.Stack<Movimiento>();
    pilaRehacer = new stacks.Stack<Movimiento>();
  }
  
  /**
   * Guarda un nuevo movimientos en el historial
   * @param movimiento Movimiento a guardar
   */
  public void guardarMovimiento (Movimiento movimiento) {
    pilaDeshacer.push(movimiento);
    if(!pilaRehacer.isEmpty())
      pilaRehacer.makeEmpty();
  }
  
  /**
   * Devuelve el último movimiento realizado y lo elimina de la pila de deshacer
   * @return El movimiento a deshacer
   * @throws MovimientoException En caso de que no haya movimientos que deshacer
   */
  public Movimiento deshacer () throws MovimientoException {  
    Movimiento movimiento=null;
    if(pilaDeshacer.isEmpty())
      throw new MovimientoException("No se puede deshacer porque no hay movimientos para deshacer");
    else{
      try{
        movimiento = pilaDeshacer.pop();
        pilaRehacer.push(movimiento);
      } // de try
      catch (EmptyStackException e){
        System.out.println("Deshacer: stack vacio");
        e.printStackTrace(System.out);
      } // de catch    
    } // de else
    return movimiento;
  }
  
  
  /**
   * Devuelve el último movimiento deshecho y lo elimina de la pila de rehacer
   * @return El movimiento a rehacer
   * @throws MovimientoException En caso de que no haya movimientos que rehacer
   */
  public Movimiento rehacer () throws MovimientoException {
    Movimiento movimiento=null;
    try {
      if(!pilaRehacer.isEmpty()) {
        movimiento = pilaRehacer.pop();
        pilaDeshacer.push(movimiento);
      }
      else
        throw new MovimientoException("No se puede rehacer porque no hay movimientos para rehacer");
    }
    catch (EmptyStackException e){
      System.out.println("Rehacer: stack vacio");
      e.printStackTrace(System.out);
    } // de catch    
    return movimiento;
  } // de rehacer
  
  
} // de class GestorHistorial

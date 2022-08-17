package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import list.ArrayList;
import list.IList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;
import anotacion.Programacion2; 
@Programacion2 (
                nombreAutor1 = "Juan",
                apellidoAutor1 = "Jimenez Perez",
                emailUPMAutor1 = "juan.jimenez.perez@alumnos.upm.es",
                nombreAutor2 = "Jesus",
                apellidoAutor2 = "Hernandez Perez", 
                emailUPMAutor2 = "jesus.hernandezp@alumnos.upm.es"
               )
  
  public class Alfil extends PiezaAjedrez  {
  public Alfil(Jugador jugador, int fila, char columna) {
    super(jugador, TipoPiezaAjedrez.ALFIL, fila, columna);
  }
  
  
  @Override
  public IList<Casilla> movimientosValidos() {//movimientos del alfil
    IList<Casilla> resultado = new ArrayList<>();
    casillasVisitables (resultado, 1, 1);
    casillasVisitables (resultado, -1, 1);
    casillasVisitables (resultado, 1, -1);
    casillasVisitables (resultado, -1, -1);
    return resultado;
  }//movimientos del alfil
  
}

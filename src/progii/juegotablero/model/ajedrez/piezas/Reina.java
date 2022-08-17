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
  
  public class Reina extends PiezaAjedrez  {
  public Reina(Jugador jugador, int fila, char columna) {
    super(jugador, TipoPiezaAjedrez.REINA, fila, columna);
  }
  
  
  @Override
  public IList<Casilla> movimientosValidos() {//movimientos de la reina
    IList<Casilla> resultado = new ArrayList<>();
    casillasVisitables (resultado, 1, 1);
    casillasVisitables (resultado, -1, 1);
    casillasVisitables (resultado, 1, -1);
    casillasVisitables (resultado, -1, -1);
    casillasVisitables (resultado, 0, 1);
    casillasVisitables (resultado, -1, 0);
    casillasVisitables (resultado, 1, 0);
    casillasVisitables (resultado, 0, -1);
    return resultado;
  }//movimientos de la reina
  
}

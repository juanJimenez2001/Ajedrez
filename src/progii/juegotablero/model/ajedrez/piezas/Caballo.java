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
  
  public class Caballo extends PiezaAjedrez  {
  public Caballo(Jugador jugador, int fila, char columna) {
    super(jugador, TipoPiezaAjedrez.CABALLO, fila, columna);
  }
  
  
  @Override
  public IList<Casilla> movimientosValidos() {//movimientos de la reina
    IList<Casilla> resultado = new ArrayList<>();
    int x=super.getFila();
    int y=super.getColumna();
    casillaVisitable (resultado, x-2, y-1);
    casillaVisitable (resultado, x-2, y+1);
    casillaVisitable (resultado, x-1, y+2);
    casillaVisitable (resultado, x+1, y+2);
    casillaVisitable (resultado, x+2, y+1);
    casillaVisitable (resultado, x+2, y-1);
    casillaVisitable (resultado, x+1, y-2);
    casillaVisitable (resultado, x-1, y-2);
    return resultado;
  }//movimientos de la reina
  
}

package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.ajedrez.ControlJugadoresAjedrez;
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
  
  public class Peon extends PiezaAjedrez  {
  public Peon (Jugador jugador, int fila, char columna) {
    super(jugador, TipoPiezaAjedrez.PEON, fila, columna);
  }
  
  
  @Override
  public IList<Casilla> movimientosValidos() {//movimientos del peon
    IList<Casilla> resultado = new ArrayList<>();
    int x=super.getFila();
    int y=super.getColumna();
    if("BLANCO"==(super.getJugador().getNombre())) {
      PiezaAjedrez pieza = queHay(x-1, y);
      if (movimientoDentroLimites(x-1, y)&& (pieza == null)) 
        resultado.add(resultado.size(), new Casilla(x-1, y));
      if(x==6) {
        PiezaAjedrez pieza2 = queHay(x-2, y);
        if (movimientoDentroLimites(x-2, y)&& (pieza2 == null) && pieza==null) 
          resultado.add(resultado.size(), new Casilla(x-2, y));
      }
      PiezaAjedrez pieza3 =queHay(x-1, y+1);
      if(pieza3!=null && pieza3.getJugador().getId()!=queHay(x, y).getJugador().getId())
        resultado.add(resultado.size(), new Casilla(x-1, y+1));
      pieza3=queHay(x-1, y-1);
      if(pieza3!=null && pieza3.getJugador().getId()!=queHay(x, y).getJugador().getId())
        resultado.add(resultado.size(), new Casilla(x-1, y-1));
      
    }
    if("NEGRO"==(super.getJugador().getNombre())) {
      PiezaAjedrez pieza = queHay(x+1, y);
      if (movimientoDentroLimites(x+1, y)&& (pieza == null)) 
        resultado.add(resultado.size(), new Casilla(x+1, y));
      if(x==1) {
        PiezaAjedrez pieza2 = queHay(x+2, y);
        if (movimientoDentroLimites(x+2, y)&& (pieza2 == null) && pieza==null) 
          resultado.add(resultado.size(), new Casilla(x+2, y));
      }
      PiezaAjedrez pieza3 =queHay(x+1, y+1);
      if(pieza3!=null && pieza3.getJugador().getId()!=queHay(x, y).getJugador().getId())
        resultado.add(resultado.size(), new Casilla(x+1, y+1));
      pieza3=queHay(x+1, y-1);
      if(pieza3!=null && pieza3.getJugador().getId()!=queHay(x, y).getJugador().getId())
        resultado.add(resultado.size(), new Casilla(x+1, y-1));
    }
    return resultado;
  }//movimientos del peon
  
}

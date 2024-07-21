package Gt.edu.miumg;


public abstract class Personaje {

    private String nombre;
    private String direccion;
    private long tamaño;
    private int poder;
    private int vida;

    public abstract void desplegarNombre();
    public abstract int obtenerVida();
    public abstract void aumentarPoder();

}


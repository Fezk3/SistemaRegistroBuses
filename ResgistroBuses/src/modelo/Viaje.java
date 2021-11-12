package modelo;

public class Viaje {
    
    private int idViaje, placaBus, Chofer_cedula;
    private String sale_de, destino, tiempo_estimado;
    private double costo, cantidadKM;

    public Viaje(int idViaje, int placaBus, int Chofer_cedula, String sale_de, String destino, String tiempo_estimado, double costo, double cantidadKM) {
        this.idViaje = idViaje;
        this.placaBus = placaBus;
        this.Chofer_cedula = Chofer_cedula;
        this.sale_de = sale_de;
        this.destino = destino;
        this.tiempo_estimado = tiempo_estimado;
        this.costo = costo;
        this.cantidadKM = cantidadKM;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public int getPlacaBus() {
        return placaBus;
    }

    public void setPlacaBus(int placaBus) {
        this.placaBus = placaBus;
    }

    public int getChofer_cedula() {
        return Chofer_cedula;
    }

    public void setChofer_cedula(int Chofer_cedula) {
        this.Chofer_cedula = Chofer_cedula;
    }

    public String getSale_de() {
        return sale_de;
    }

    public void setSale_de(String sale_de) {
        this.sale_de = sale_de;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTiempo_estimado() {
        return tiempo_estimado;
    }

    public void setTiempo_estimado(String tiempo_estimado) {
        this.tiempo_estimado = tiempo_estimado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCantidadKM() {
        return cantidadKM;
    }

    public void setCantidadKM(double cantidadKM) {
        this.cantidadKM = cantidadKM;
    }
    
}

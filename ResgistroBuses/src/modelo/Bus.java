package modelo;

public class Bus {
    
    private int placa, n_unico, Chofer_cedula, capacidad;
    private String estado, viaje_a_realizar;

    public Bus(int placa, int n_unico, int Chofer_cedula, int capacidad, String estado, String viaje_a_realizar) {
        this.placa = placa;
        this.n_unico = n_unico;
        this.Chofer_cedula = Chofer_cedula;
        this.capacidad = capacidad;
        this.estado = estado;
        this.viaje_a_realizar = viaje_a_realizar;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getN_unico() {
        return n_unico;
    }

    public void setN_unico(int n_unico) {
        this.n_unico = n_unico;
    }

    public int getChofer_cedula() {
        return Chofer_cedula;
    }

    public void setChofer_cedula(int Chofer_cedula) {
        this.Chofer_cedula = Chofer_cedula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getViaje_a_realizar() {
        return viaje_a_realizar;
    }

    public void setViaje_a_realizar(String viaje_a_realizar) {
        this.viaje_a_realizar = viaje_a_realizar;
    }
    
}

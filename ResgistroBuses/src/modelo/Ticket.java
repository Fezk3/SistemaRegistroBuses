package modelo;

public class Ticket {
    
    private int n_ticket, Viaje_idViaje, Cliente_cedula;

    public Ticket(int n_ticket, int Viaje_idViaje, int Cliente_cedula) {
        this.n_ticket = n_ticket;
        this.Viaje_idViaje = Viaje_idViaje;
        this.Cliente_cedula = Cliente_cedula;
    }

    public int getN_ticket() {
        return n_ticket;
    }

    public void setN_ticket(int n_ticket) {
        this.n_ticket = n_ticket;
    }

    public int getViaje_idViaje() {
        return Viaje_idViaje;
    }

    public void setViaje_idViaje(int Viaje_idViaje) {
        this.Viaje_idViaje = Viaje_idViaje;
    }

    public int getCliente_cedula() {
        return Cliente_cedula;
    }

    public void setCliente_cedula(int Cliente_cedula) {
        this.Cliente_cedula = Cliente_cedula;
    }
    
}

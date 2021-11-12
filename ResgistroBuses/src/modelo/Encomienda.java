
package modelo;

import java.sql.Date;


public class Encomienda {
    private int codigo;
    private float precioXPeso;
    private int cliente_cedula;
    private String para;
    private int viaje_idViaje;
    private String lugar_salida;
    private String lugar_destino;
    private Date fecha_hora_llegada;
    private Date fecha_hora_salida;
    private Date fecha_hora_entrega;
    private String estado;

    public Encomienda(int codigo, float precioXPeso, int cliente_cedula, String para, int viaje_idViaje, String lugar_salida, String lugar_destino, Date fecha_hora_llegada, Date fecha_hora_salida, Date fecha_hora_entrega, String estado) {
        this.codigo = codigo;
        this.precioXPeso = precioXPeso;
        this.cliente_cedula = cliente_cedula;
        this.para = para;
        this.viaje_idViaje = viaje_idViaje;
        this.lugar_salida = lugar_salida;
        this.lugar_destino = lugar_destino;
        this.fecha_hora_llegada = fecha_hora_llegada;
        this.fecha_hora_salida = fecha_hora_salida;
        this.fecha_hora_entrega = fecha_hora_entrega;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecioXPeso() {
        return precioXPeso;
    }

    public void setPrecioXPeso(float precioXPeso) {
        this.precioXPeso = precioXPeso;
    }

    public int getCliente_cedula() {
        return cliente_cedula;
    }

    public void setCliente_cedula(int cliente_cedula) {
        this.cliente_cedula = cliente_cedula;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public int getViaje_idViaje() {
        return viaje_idViaje;
    }

    public void setViaje_idViaje(int viaje_idViaje) {
        this.viaje_idViaje = viaje_idViaje;
    }

    public String getLugar_salida() {
        return lugar_salida;
    }

    public void setLugar_salida(String lugar_salida) {
        this.lugar_salida = lugar_salida;
    }

    public String getLugar_destino() {
        return lugar_destino;
    }

    public void setLugar_destino(String lugar_destino) {
        this.lugar_destino = lugar_destino;
    }

    public Date getFecha_hora_llegada() {
        return fecha_hora_llegada;
    }

    public void setFecha_hora_llegada(Date fecha_hora_llegada) {
        this.fecha_hora_llegada = fecha_hora_llegada;
    }

    public Date getFecha_hora_salida() {
        return fecha_hora_salida;
    }

    public void setFecha_hora_salida(Date fecha_hora_salida) {
        this.fecha_hora_salida = fecha_hora_salida;
    }

    public Date getFecha_hora_entrega() {
        return fecha_hora_entrega;
    }

    public void setFecha_hora_entrega(Date fecha_hora_entrega) {
        this.fecha_hora_entrega = fecha_hora_entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

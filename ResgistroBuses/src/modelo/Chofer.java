package modelo;

public class Chofer extends Cliente {
    
    private String apellido, tel;
    
    public Chofer(String nombre, int cedula, String apellido, String tel) {
        super(nombre, cedula);
        this.apellido = apellido;
        this.tel = tel;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}

package modelo;

public class Funcionario {
    private int id;
    private String nombre;
    private String apellido;
    private String cargo;
    private int idDepartamento;

    public Funcionario() {}

    public Funcionario(String nombre, String apellido, String cargo, int idDepartamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.idDepartamento = idDepartamento;
    }

    // getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public int getIdDepartamento() { return idDepartamento; }
    public void setIdDepartamento(int idDepartamento) { this.idDepartamento = idDepartamento; }
}
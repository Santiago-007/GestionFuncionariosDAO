package main;

import dao.FuncionarioDAO;
import dao.FuncionarioDAOImpl;
import modelo.Funcionario;

public class Main {

    public static void main(String[] args) {

        FuncionarioDAO dao = new FuncionarioDAOImpl();

        Funcionario f = new Funcionario();
        f.setNombre("Juan");
        f.setApellido("Torres");
        f.setCargo("Administrador");
        f.setIdDepartamento(1);

        dao.insertar(f);

        System.out.println("✔ Registro insertado correctamente");
    }
}
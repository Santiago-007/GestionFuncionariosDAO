package dao;

import java.util.List;
import modelo.Funcionario;

public interface FuncionarioDAO {
    void insertar(Funcionario f);
    List<Funcionario> listar();
    void actualizar(Funcionario f);
    void eliminar(int id);
}
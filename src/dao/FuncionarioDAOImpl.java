package dao;

import conexion.Conexion;
import modelo.Funcionario;
import java.sql.*;
import java.util.*;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    public void insertar(Funcionario f) {
        try {
            Connection con = Conexion.getConexion();
            String sql = "INSERT INTO Funcionario(nombre, apellido, cargo, id_departamento) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, f.getNombre());
            ps.setString(2, f.getApellido());
            ps.setString(3, f.getCargo());
            ps.setInt(4, f.getIdDepartamento());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error insertar: " + e.getMessage());
        }
    }

    public List<Funcionario> listar() {
        List<Funcionario> lista = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Funcionario");

            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id"));
                f.setNombre(rs.getString("nombre"));
                f.setApellido(rs.getString("apellido"));
                f.setCargo(rs.getString("cargo"));
                f.setIdDepartamento(rs.getInt("id_departamento"));
                lista.add(f);
            }
        } catch (Exception e) {
            System.out.println("Error listar: " + e.getMessage());
        }
        return lista;
    }

    public void actualizar(Funcionario f) {
        try {
            Connection con = Conexion.getConexion();
            String sql = "UPDATE Funcionario SET nombre=?, apellido=?, cargo=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, f.getNombre());
            ps.setString(2, f.getApellido());
            ps.setString(3, f.getCargo());
            ps.setInt(4, f.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error actualizar: " + e.getMessage());
        }
    }

    public void eliminar(int id) {
        try {
            Connection con = Conexion.getConexion();
            String sql = "DELETE FROM Funcionario WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error eliminar: " + e.getMessage());
        }
    }
}

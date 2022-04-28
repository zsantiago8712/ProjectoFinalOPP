package com.sz.controler;

import com.mysql.jdbc.Connection;
import com.sz.model.DataBase;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Query {
    final private DataBase db;


    public Query(){
        this.db = new DataBase();
    }

    public void Insertar(int edad, boolean sexo, String dolor_p, float presion, float colesterol,
                         boolean tratamiento_hip, boolean fumador,  boolean diabetico, float HDL, int frecuencia){

        try{
            String query = "INSERT INTO Datos(Edad, Sexo, Dolor_Pecho, Presion_Sanguinea, Colesterol, Tratamineto_Hipertension, Fumador, Diabetico, HDL, Frecuancia_Cardiaca_Max) VALUES(?,?,?,?,?,?,?,?,?,?);";
            Connection conn = (Connection) db.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, edad);
            ps.setBoolean(2, sexo);
            ps.setString(3, dolor_p);
            ps.setFloat(4, presion);
            ps.setFloat(5, colesterol);
            ps.setBoolean(6, tratamiento_hip);
            ps.setBoolean(7, fumador);
            ps.setBoolean(8, diabetico);
            ps.setFloat(9, HDL);
            ps.setInt(10, frecuencia);

            ps.executeUpdate();
            System.out.println("El registro se inserto de forma correcta");

        }catch (SQLException e){
            System.out.println("No se inserto el registro");
            System.out.println(e.getErrorCode());
            JOptionPane.showMessageDialog(null, "No se inserto el registro", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}

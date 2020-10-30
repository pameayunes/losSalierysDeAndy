/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.it;

import edu.it.model.Alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.UUID;

public class App {
    public static void crearTablas(Connection mariaDb, Connection connectionSqlLite) throws Exception {
        StringBuilder stringBuilder =
                new StringBuilder()
                        .append("CREATE TABLE ")
                        .append("`clase2`.`alumnos` ")
                        .append("(`id` VARCHAR(36) NOT NULL , ")
                        .append("`nombre` VARCHAR(128) NOT NULL, ")
                        .append("`apellido` VARCHAR(128) NOT NULL ) ");

        Statement st = mariaDb.createStatement();
        st.execute(stringBuilder.toString());
        st.close();

        stringBuilder =
                new StringBuilder()
                        .append("CREATE TABLE ")
                        .append("`alumnos` ")
                        .append("(`id` VARCHAR(36) NOT NULL , ")
                        .append("`nombre` VARCHAR(128) NOT NULL, ")
                        .append("`apellido` VARCHAR(128) NOT NULL ) ");

        Statement st2 = connectionSqlLite.createStatement();
        st2.execute(stringBuilder.toString());
        st.close();
    }
    public static void insertarDatos(Connection connMariaDB, Connection SQLLite, Alumno alumno) throws Exception {
        PreparedStatement st1 = connMariaDB.prepareStatement("insert into alumnos values (?,?,?);");
        st1.setString(1, alumno.id);
        st1.setString(2,alumno.nombre);
        st1.setString(3, alumno.apellido);

        st1.execute();

        PreparedStatement st2 = SQLLite.prepareStatement("insert into alumnos values (?,?,?);");
        st2.setString(1, alumno.id);
        st2.setString(2,alumno.nombre);
        st2.setString(3, alumno.apellido);

        st2.execute();
    }
    public static void consultarDatos(Connection connMariaDB, Connection SQLLite) {
        // select * from alumnos
        
    }
    public static void main(String[] args) throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connMariaDb = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/clase2", "root", "");

        String url = "jdbc:sqlite:c:/var/database/Testing.db";
        Connection connSqlLite = DriverManager.getConnection(url);

        // crearTablas(connMariaDb, connSqlLite);
        Alumno alumno = new Alumno(
                UUID.randomUUID().toString(),
                "nombre",
                "apellido");

        insertarDatos(connMariaDb, connSqlLite, alumno);

        connMariaDb.close();
        connSqlLite.close();
    }
}
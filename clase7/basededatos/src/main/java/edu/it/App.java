/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.it;

import com.github.javafaker.Faker;
import edu.it.model.Alumno;

import java.sql.*;
import java.util.UUID;

import static edu.it.utiles.Utiles.ver;

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
    public static void consultarDatos(Connection connMariaDB, Connection SQLLite) throws Exception {
        {
            ver("------------------------------");
            ver("Maria DB");
            ver("------------------------------");

            PreparedStatement prepStat = connMariaDB.prepareStatement("select * from alumnos");
            ResultSet rs = prepStat.executeQuery();

            while (rs.next()) {
                ver("id: ", rs.getString("id"));
                ver("nombre: ", rs.getString("nombre"));
                ver("apellido: ", rs.getString("apellido"));
            }

            rs.close();
            prepStat.close();
        }
        {
            ver("------------------------------");
            ver("SQL Lite");
            ver("------------------------------");

            PreparedStatement prepStat = SQLLite.prepareStatement("select * from alumnos");
            ResultSet rs = prepStat.executeQuery();

            while (rs.next()) {
                ver("id: ", rs.getString("id"));
                ver("nombre: ", rs.getString("nombre"));
                ver("apellido: ", rs.getString("apellido"));
            }

            rs.close();
            prepStat.close();
        }
    }
    private static void operarTransaccion(Connection connMariaDB) {
        final Integer montoOperacion = 10;

        try {
            connMariaDB.setAutoCommit(false);

            PreparedStatement prepStat = connMariaDB
                    .prepareStatement("insert into movimientos values (?, ?)");
            prepStat.setString(1, UUID.randomUUID().toString());
            prepStat.setInt(2, montoOperacion);
            prepStat.execute();

            PreparedStatement prepStat2 = connMariaDB
                    .prepareStatement("update saldo set monto = monto2 + ?");
            prepStat2.setInt(1, montoOperacion);
            prepStat2.execute();

            connMariaDB.commit();
        }
        catch (Exception ex) {
            System.out.println("No se pudo concretar la transaccion");
            try { connMariaDB.rollback(); } catch (Exception ex2) {}
        }
    }
    private static void crearMuchosAlumnos(Connection connMariaDB, Connection SQLLite) throws Exception {
        Faker fkr = Faker.instance();

        for (int x:new int[10000]) {
            Alumno alumno = new Alumno(
                    UUID.randomUUID().toString(),
                    fkr.address().firstName(),
                    fkr.address().lastName());

            System.out.println(alumno);

            PreparedStatement st1 = connMariaDB.prepareStatement("insert into alumnos values (?,?,?);");
            st1.setString(1, alumno.id);
            st1.setString(2,alumno.nombre);
            st1.setString(3, alumno.apellido);

            st1.execute();
        }
        for (int x:new int[10000]) {
            Alumno alumno = new Alumno(
                    UUID.randomUUID().toString(),
                    fkr.address().firstName(),
                    fkr.address().lastName());

            System.out.println(alumno);

            PreparedStatement st1 = SQLLite.prepareStatement("insert into alumnos values (?,?,?);");
            st1.setString(1, alumno.id);
            st1.setString(2,alumno.nombre);
            st1.setString(3, alumno.apellido);

            st1.execute();
        }

    }
    public static void main(String[] args) throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connMariaDb = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/clase7", "root", "");

        String url = "jdbc:sqlite:c:/var/database/Testing.db";
        Connection connSqlLite = DriverManager.getConnection(url);

        // crearTablas(connMariaDb, connSqlLite);

        // crearMuchosAlumnos(connMariaDb, connSqlLite);

        // insertarDatos(connMariaDb, connSqlLite, alumno);

        // consultarDatos(connMariaDb, connSqlLite);

        // operarTransaccion(connMariaDb);

        connMariaDb.close();
        connSqlLite.close();
    }
}

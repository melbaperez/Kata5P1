package kata5p1;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement;

public class CrearTabla {
    
    public void createNewTable() { // Cadena de conexión SQLite
        String url = "jdbc:sqlite:BD/KATA5.db";
        // Instrucción SQL para crear nueva tabla
        String sql = "CREATE TABLE IF NOT EXISTS EMAIL (\n" + " Id integer PRIMARY KEY AUTOINCREMENT,\n"
        + " Mail text NOT NULL);";
        try (Connection conn = DriverManager.getConnection(url);
               Statement stmt = conn.createStatement()) {
            // Se crea la nueva tabla
            stmt.execute(sql);
            System.out.println("Tabla creada");
        } catch (SQLException e) {
            System.out.println(e.getMessage()); 
        }
        
    }
    

}

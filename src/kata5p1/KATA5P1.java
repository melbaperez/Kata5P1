package kata5p1;

import java.util.List;

public class KATA5P1 {
    
    public static void main(String[] args) { 
        //SelectApp app = new SelectApp(); 
        //app.selectAll();
        
        //CrearTabla crearTablaMail = new CrearTabla();  
        //crearTablaMail.createNewTable();
        
        List<String> mailList;
        String fileName = new String("email.txt");
        mailList = MailListReader.read(fileName);
        InsertarDatosTabla insertarDatosTabla = new InsertarDatosTabla();
        insertarDatosTabla.insert(mailList);
    }

}

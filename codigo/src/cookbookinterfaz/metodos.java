package cookbookinterfaz;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Franco
 */
public class metodos {
    private BufferedImage _image = null;    
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen","jpg","png");
    private JFileChooser fileChooser = new JFileChooser(); 
    private String namefile=new String();
    /**
     * Constructor de clase
     */
    
    
    public metodos(){}      
    
    /**
     * dada una direccion fisica de un archivo de imagen,
     * coloca esta en el objeto BufferedImage, o sea en memoria 
     * @param  url
     */
    public void cargar_imagen_en_buffer(URL _url){         
        //se llena el buffer con la imagen        
            try {                
                _image = ImageIO.read(_url);
            } catch (IOException ex) {
                System.err.println( ex.getMessage() );
            }               
    }
    
    /* retorna el objeto almacenado en memoria */
   public BufferedImage Obtener_imagen_de_Buffer(){       
        return _image;
   }
    

   
   /**
    * crea un archivo de imagen desde el BufferedImage dada la direccion fisica 
    * @param  String f
    */
   public void guardar_imagen(String f){
        try {
            //se extrae el fomato de la cadena "f" que contiene la direccion
            String formato = (f.endsWith(".jpg")) ? "jpg" : "png";   
            //ImageIO.write(_image, "jpg", new File("e:/carpeta/imagen2.jpg"));
            ImageIO.write(_image, formato, new File(f));
 } catch (IOException e) {            
            System.out.println("Error al crear el archivo");
 }
   }
   
    /**
     * Metodo que muestra una ventana de dialgo para añadir "archivo de imagen" en memoria     
     * @param JPanel
     */
    public void Abrir_Dialogo(JPanel p){
       fileChooser = new JFileChooser();       
       fileChooser.setFileFilter(filter);
       fileChooser.setCurrentDirectory(new java.io.File("C:\\Users\\"));
       int result = fileChooser.showOpenDialog(null);  
       if ( result == JFileChooser.APPROVE_OPTION ){
            try {           
                //se asigna a "url" el archivo de imagen seleccionado
                URL url = fileChooser.getSelectedFile().toURL();  
                String namefile = fileChooser.getSelectedFile().getName();
                //se lo coloca en memoria
                cargar_imagen_en_buffer(url);                            
                //se añade al contenedor
                p.add(new mipanel(Obtener_imagen_de_Buffer(), p.getSize()));
                p.setVisible(true);
                p.repaint();
     //           guardar_imagen(namefile);           
            } 
            catch (IOException ex) {                
                System.err.println( ex.getMessage() );
            } 
        }
       
    }
}
    
       /*public void Guardar_Dialogo(){
       //JFileChooser fileChooser = new JFileChooser();       
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showSaveDialog(null);       
       if ( result == JFileChooser.APPROVE_OPTION ){ 
                //se obtiene la direccion donde se guardara la imagen
                String url = fileChooser.getSelectedFile().toString();
                //String namefile = fileChooser.getSelectedFile().getName();                                            
                System.out.println("url: " + url);                                        
                //Se guarda la imagen
                guardar_imagen(url);            
        }
        String url="/cookbookinterfaz/imagen/Resource/";
        String namefile = fileChooser.getSelectedFile().getName();                                            
                                                 
                //Se guarda la imagen
                guardar_imagen(url);   
   }*/

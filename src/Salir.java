import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Salir extends JFrame {
    public Salir(){
        setTitle("Muchas gracias por visitar el Banco Pichincha");
        //dimensiones de mi cajero
        setSize(500,700);
        //Me pondra a mi ventana en el medio de la pantalla
        setLocationRelativeTo(null);
        //acabara el programa cuando de a la X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creo el panel
        JPanel panel=new JPanel();
        this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        this.getContentPane().add(panel);
        panel.setLayout(null);


        JLabel titulo = new JLabel("BANCO PICHINCHA");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setOpaque(true);
        titulo.setBackground(Color.YELLOW);
        titulo.setBounds(5,5,475,30);
        //cambair el tipo de letra , estilo y tamaño
        titulo.setFont(new Font("arial",Font.BOLD,14));

        JLabel titulo1= new JLabel("PRESIONA OK ");
        titulo1.setHorizontalAlignment(SwingConstants.CENTER);
        titulo1.setOpaque(true);
        titulo1.setBounds(5,55,475,30);
        //Cambia el BIENVENIDO A COLOR ROJO
        titulo1.setForeground(Color.RED);
        titulo1.setFont(new Font("arial",Font.BOLD,20));

        JLabel titulo2= new JLabel("MUCHAS GRACIAS ");
        titulo2.setHorizontalAlignment(SwingConstants.CENTER);
        titulo2.setOpaque(true);
        titulo2.setBounds(5,100,475,30);
        //Cambia el BIENVENIDO A COLOR ROJO
        titulo2.setForeground(Color.black);
        titulo2.setFont(new Font("arial",Font.BOLD,16));



        //Boton salir
        JButton botonsalir = new JButton("OK");
        botonsalir.setHorizontalAlignment(SwingConstants.CENTER);
        botonsalir.setBackground(Color.pink);
        botonsalir.setBounds(165,159,150,50);
        //cambiar el color al texto del boton
        botonsalir.setForeground(Color.red);




        botonsalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Bienvenida venta =new Bienvenida(); //la instancia se hace a la ventana que quiro iniciar al tocar el boton
                venta.iniciar();
                dispose();
            }
        });





        panel.add(titulo);
        panel.add(titulo1);
        panel.add(titulo2);
        panel.add(botonsalir);


    }
    public void iniciar(){
        setVisible(true);
        //como va a ser la ventana
        setLocationRelativeTo(null); //QUITA EL TAMAÑO POR DEFAULT
        setSize(500,300);//TAMAÑO DE MI VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ACABA EL PROGRAMA CUANDO CUANDO CIERRO LA VENTANA
    }
}

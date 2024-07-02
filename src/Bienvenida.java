import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//primero tendo que hacer el extends JFrame
public class Bienvenida extends JFrame {
    public JTextField usuario;
    public JTextField contraseña;
    //creo el metodo constructor
    public Bienvenida(){
        super("Catucuamba Ariel e Isaac Valenzuela");
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

        JLabel titulo1= new JLabel("BIENVENIDO");
        titulo1.setHorizontalAlignment(SwingConstants.CENTER);
        titulo1.setOpaque(true);
        titulo1.setBounds(5,55,475,30);
        //Cambia el BIENVENIDO A COLOR ROJO
        titulo1.setForeground(Color.RED);
        titulo1.setFont(new Font("arial",Font.BOLD,20));

        JLabel titulo2= new JLabel("Ingrese su contraseña: ");
        titulo2.setHorizontalAlignment(SwingConstants.LEFT);
        titulo2.setOpaque(true);
        titulo2.setBounds(5,100,200,30);
        //Cambia el BIENVENIDO A COLOR ROJO
        titulo2.setForeground(Color.black);
        titulo2.setFont(new Font("arial",Font.BOLD,16));

        JTextField contrasenia= new JTextField();
        contrasenia.setHorizontalAlignment(SwingConstants.LEFT);
        contrasenia.setOpaque(true);
        contrasenia.setFont(new Font("arial",0,20));
        contrasenia.setBackground(Color.LIGHT_GRAY);
        contrasenia.setBounds(200,100,175,30);
        panel.add(contrasenia);

        //creo el boton confrimar contragena
        JButton botoncontrasenia = new JButton("Verificar contraseña");
        botoncontrasenia.setHorizontalAlignment(SwingConstants.CENTER);
        botoncontrasenia.setBackground(Color.pink);
        botoncontrasenia.setBounds(125,200,250,50);
        //cambiar el color al texto del boton
        botoncontrasenia.setForeground(Color.red);

        botoncontrasenia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //variable quemada password
                String contra = "123456";

                //Tomo lo que esta en la caja de texto y lo paso a una varible
                String contraIngresada=contrasenia.getText();


                //en ava se pone equals , no ==
                if (contra.equals(contraIngresada) ){
                    opciones ventana_m = new opciones();
                    ventana_m.iniciar();
                    dispose();//es para llamar el otro formulario siempre debe ir
                }
                else{
                    //me muestra un cuadro solo con ese mensaje
                    JOptionPane.showMessageDialog(null,"El password es incorrecto");
                    contrasenia.setText("");

                }




                /*//creamos una instancia de la ventana menu ,
                menu ventana_m = new menu();
                ventana_m.iniciar();
                dispose();//es para llamar el otro formulario*/
            }
        });








        panel.add(titulo);
        panel.add(titulo1);
        panel.add(titulo2);
        panel.add(contrasenia);
        panel.add(botoncontrasenia);




    }

    public void iniciar(){
        setVisible(true);
        //como va a ser la ventana
        setLocationRelativeTo(null); //QUITA EL TAMAÑO POR DEFAULT
        setSize(500,700);//TAMAÑO DE MI VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ACABA EL PROGRAMA CUANDO CUANDO CIERRO LA VENTANA
    }




}

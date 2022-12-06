import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class Main extends JFrame implements ActionListener{

  JLabel title,sideW,sideE,footer,botones,scoreBoard,game,comoJugar,footerSmall;
  JButton botonInicio,botonPuntaje,botonComo,botonSalir,botonBack,botonGame;
  JFrame frame;
  ImageIcon imageI = new ImageIcon("ThePizzaGame/Pizza.png");
  Border border = BorderFactory.createLineBorder(Color.black,40);
  Font letra = new Font("Felix Titling",Font.BOLD,15);
  JTextField textField;

  Main(){

    /*    Text Input     */

    textField = new JTextField();		
		textField.setPreferredSize(new Dimension(150,50));
    textField.setFont(new Font("consolas",Font.PLAIN,35));
    textField.setForeground(Color.green);
    textField.setBackground(Color.black);
    textField.setCaretColor(Color.white);    
    textField.setBounds(30,0,150,50);

    /*    Buttons     */

    botonInicio = new JButton("Inicio");  
    botonInicio.setBounds(0,0,95,30);
    botonInicio.setFont(letra);
    botonInicio.setBackground(Color.black);
    botonInicio.setForeground(Color.white);
    botonInicio.setFocusable(false);
    botonInicio.setBorderPainted(false);
    botonInicio.addActionListener(this);

    botonPuntaje = new JButton("Mejores puntajes");  
    botonPuntaje.setBounds(0,0,95,30); 
    botonPuntaje.setFont(letra);
    botonPuntaje.setBackground(Color.black);
    botonPuntaje.setForeground(Color.white);
    botonPuntaje.setFocusable(false);
    botonPuntaje.setBorderPainted(false);
    botonPuntaje.addActionListener(this);

    botonComo = new JButton("Como jugar");  
    botonComo.setBounds(600,500,95,30); 
    botonComo.setFont(letra);
    botonComo.setBackground(Color.black);
    botonComo.setForeground(Color.white);
    botonComo.setFocusable(false);
    botonComo.setBorderPainted(false);
    botonComo.addActionListener(this);

    botonSalir = new JButton("Salir");  
    botonSalir.setBounds(600,550,95,30); 
    botonSalir.setFont(letra);
    botonSalir.setBackground(Color.black);
    botonSalir.setForeground(Color.white);
    botonSalir.setFocusable(false);
    botonSalir.setBorderPainted(false);
    botonSalir.addActionListener(this);

    botonBack = new JButton("Volver al menú");
    botonBack.setSize(95,30);
    botonBack.setFont(letra);
    botonBack.setBackground(Color.black);
    botonBack.setForeground(Color.white);
    botonBack.setFocusable(false);
    botonBack.setBorderPainted(false);
    botonBack.addActionListener(this);

    botonGame = new JButton("Probar");
    botonGame.setFont(letra);
    botonGame.setBackground(Color.black);
    botonGame.setForeground(Color.white);
    botonGame.setFocusable(false);
    botonGame.addActionListener(this);
    botonGame.setBounds(180,0,150,50);

    /*    Title and image     */

    title = new JLabel();
    title.setText("The Pizza Game");
    title.setIcon(imageI);

    title.setHorizontalTextPosition(JLabel.CENTER);
    title.setVerticalTextPosition(JLabel.TOP);
    title.setForeground(Color.white);
    title.setFont(letra);
    title.setIconTextGap(20); 
    title.setBackground(Color.black);
    title.setOpaque(true);
    title.setBorder(border);
    title.setPreferredSize(new Dimension(50,320));
    title.setVerticalAlignment(JLabel.TOP);
    title.setHorizontalAlignment(JLabel.CENTER);

    /*    Menu     */
    
    botones = new JLabel();
    botones.add(botonInicio);
    botones.add(botonPuntaje);
    botones.add(botonComo);
    botones.add(botonSalir);

    botones.setLayout(new GridLayout(4,1));
    botones.setBackground(Color.black);
    botones.setForeground(new Color(0xFFFFFF));
    botones.setOpaque(true);
    botones.setPreferredSize(new Dimension(200,200));

    /*    Structure of the main window     */

    sideW = new JLabel();
    sideW.setBackground(Color.black);
    sideW.setPreferredSize(new Dimension(500,200));
    sideW.setOpaque(true);

    sideE = new JLabel();
    sideE.setBackground(Color.black);
    sideE.setPreferredSize(new Dimension(500,200));
    sideE.setOpaque(true);

    footer = new JLabel();
    footer.setBackground(Color.black);
    footer.setPreferredSize(new Dimension(500,100));
    footer.setLayout(new GridLayout(1,2));
    footer.setOpaque(true);

    footerSmall = new JLabel();
    footer.setBackground(Color.black);
    footer.setPreferredSize(new Dimension(500,100));
    footer.setLayout(new GridLayout(1,2));
    footer.setOpaque(true);

    /*    Main Window     */
    
    frame = new JFrame("The Pizza Game");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationByPlatform(true);
    frame.setLayout(new BorderLayout());
    frame.setSize(900,900);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    JFrame.setDefaultLookAndFeelDecorated(true);
    frame.setUndecorated(true);
    frame.setVisible(true);
    frame.getContentPane().setBackground(Color.black);

    frame.add(title,BorderLayout.NORTH);
    frame.add(botones,BorderLayout.CENTER);
    frame.add(sideE,BorderLayout.EAST);
    frame.add(sideW,BorderLayout.WEST);
    frame.add(footer,BorderLayout.SOUTH);
    frame.setIconImage(imageI.getImage()); 

    /*    Scoreboard     */

    scoreBoard = new JLabel();
    scoreBoard.setText("Mejores puntajes: ");

    /*    Como Jugar     */

    comoJugar = new JLabel();
    comoJugar.setText("Objetivo: adivinar el numero de 4 digitos, en la menor cantidad de intentos posibles.\n");
    comoJugar.setForeground(Color.white);
    comoJugar.setFont(letra);
    comoJugar.setPreferredSize(new Dimension(400,400));

    /*    Game     */

    game = new JLabel();
    //game.setLayout(new BorderLayout());
    //String gameText = new String("Adivina el numero: "); 
    //game.add(gameText,BorderLayout.NORTH);
    game.add(textField);
    game.add(botonGame);
    //game.add(sideE,BorderLayout.EAST);
    //game.add(sideW,BorderLayout.WEST);
    //game.add(footerSmall,BorderLayout.SOUTH);
    //game.add(footerSmall,BorderLayout.NORTH);
    game.setPreferredSize(new Dimension(200,200));
    game.setHorizontalAlignment(JLabel.CENTER);
    game.setVerticalAlignment(JLabel.CENTER);

  }
  
    @Override
    public void actionPerformed(ActionEvent e){
    if (e.getSource()==botonInicio) {

      frame.remove(botones);
      frame.add(game,BorderLayout.CENTER);
      footer.add(botonSalir);
      footer.add(botonBack);
      frame.revalidate();
      frame.repaint();

    }

    if (e.getSource()==botonPuntaje) {

      frame.remove(botones);
      frame.add(scoreBoard,BorderLayout.CENTER);
      footer.add(botonSalir);
      footer.add(botonBack);
      frame.revalidate();
      frame.repaint();

    }

    if(e.getSource()==botonComo) {

      frame.remove(botones);
      frame.add(comoJugar,BorderLayout.CENTER);
      footer.add(botonSalir);
      footer.add(botonBack);
      frame.revalidate();
      frame.repaint();

    }

    if (e.getSource()==botonSalir) {

      System.exit(0);

    }

    if (e.getSource()==botonBack){

      frame.remove(game);
      footer.remove(botonSalir);
      footer.remove(botonBack);
      botones.add(botonSalir);
      frame.add(botones,BorderLayout.CENTER);
      frame.revalidate();
      frame.repaint();

    }

    }
    public static void main(String[] args){
      Main frame = new Main();
    }

}
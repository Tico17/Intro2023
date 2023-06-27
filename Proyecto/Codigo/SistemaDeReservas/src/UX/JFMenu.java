package UX;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menú Ejemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear los menús
        JMenu fileMenu = new JMenu("Archivo");
        JMenu editMenu = new JMenu("Editar");
        JMenu helpMenu = new JMenu("Ayuda");

        // Crear los elementos del menú
        JMenuItem newItem = new JMenuItem("Nuevo");
        newItem.addActionListener(e -> {
            JPNew formPanel = new JPNew();
            frame.setContentPane(formPanel.getContentPanel());
            frame.revalidate();
            frame.repaint();
        });
        JMenuItem openItem = new JMenuItem("Abrir");
        JMenuItem saveItem = new JMenuItem("Guardar");
        JMenuItem exitItem = new JMenuItem("Salir");

        JMenuItem cutItem = new JMenuItem("Cortar");
        JMenuItem copyItem = new JMenuItem("Copiar");
        JMenuItem pasteItem = new JMenuItem("Pegar");

        JMenuItem aboutItem = new JMenuItem("Acerca de");

        // Agregar los elementos al menú correspondiente
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);

        // Agregar los menús a la barra de menú
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Asignar la barra de menú al JFrame
        frame.setJMenuBar(menuBar);

        // Configurar el tamaño y la visibilidad del JFrame
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

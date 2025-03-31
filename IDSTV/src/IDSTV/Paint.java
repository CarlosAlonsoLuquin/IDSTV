package IDSTV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Paint implements MouseListener, MouseMotionListener {

    private JFrame frame;
    private DrawingPanel drawingPanel;
    private Point lastPoint;
    private List<Point> puntosActuales = new ArrayList<>();
    private List<Trazo> trazos = new ArrayList<>();
    private List<Rectangulo> rectangulos = new ArrayList<>();
    private List<Triangulo> triangulos = new ArrayList<>();
    private int grosorTrazo = 3;
    private Color colorActual = Color.BLACK;
    private int metodo = 1; // 1 = pincel, 2 = rectangulo, 3 = cuadrado, 4 = triangulo

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Paint window = new Paint();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Paint() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1000, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#5080C5"));
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.decode("#5080C5")));
        panel_1.setBounds(10, 10, 274, 593);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel_3.setBounds(0, 0, 274, 203);
        panel_1.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel = new JLabel("Shapes");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(10, 10, 74, 24);
        panel_3.add(lblNewLabel);

        JButton btnNewButton = new JButton("Rectangulo");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodo = 2;
            }
        });
        btnNewButton.setBounds(164, 23, 100, 34);
        panel_3.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Cuadrado");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodo = 3;
            }
        });
        btnNewButton_1.setBounds(164, 67, 100, 34);
        panel_3.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Triangulo");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodo = 4;
            }
        });
        btnNewButton_2.setBounds(164, 111, 100, 34);
        panel_3.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Linea");
        btnNewButton_3.setBounds(164, 155, 100, 34);
        panel_3.add(btnNewButton_3);

        JLabel lblNewLabel_1_1_1_1 = new JLabel("");
        lblNewLabel_1_1_1_1.setIcon(new ImageIcon("Imagenes/Rectangulo.png"));
        lblNewLabel_1_1_1_1.setBounds(97, 23, 74, 34);
        panel_3.add(lblNewLabel_1_1_1_1);

        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
        lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon("Imagenes/cuadrado.png"));
        lblNewLabel_1_1_1_1_1.setBounds(97, 67, 74, 34);
        panel_3.add(lblNewLabel_1_1_1_1_1);

        JLabel lblNewLabel_1_1_1_1_2 = new JLabel("");
        lblNewLabel_1_1_1_1_2.setIcon(new ImageIcon("Imagenes/Triangulo.png"));
        lblNewLabel_1_1_1_1_2.setBounds(97, 111, 74, 34);
        panel_3.add(lblNewLabel_1_1_1_1_2);

        JLabel lblNewLabel_1_1_1_1_3 = new JLabel("");
        lblNewLabel_1_1_1_1_3.setIcon(new ImageIcon("Imagenes/Linea.png"));
        lblNewLabel_1_1_1_1_3.setBounds(97, 154, 74, 34);
        panel_3.add(lblNewLabel_1_1_1_1_3);

        JPanel panel_3_1 = new JPanel();
        panel_3_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel_3_1.setBounds(0, 201, 274, 209);
        panel_1.add(panel_3_1);
        panel_3_1.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Tools");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(10, 10, 46, 17);
        panel_3_1.add(lblNewLabel_1);

        JSlider slider = new JSlider(1, 20, grosorTrazo);
        slider.setBounds(10, 149, 164, 26);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                grosorTrazo = slider.getValue();
                drawingPanel.repaint();
            }
        });
        panel_3_1.add(slider);

        JButton btnNewButton_4_3_1 = new JButton("Lapiz");
        btnNewButton_4_3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodo = 1;
            }
        });
        btnNewButton_4_3_1.setBounds(167, 94, 97, 32);
        panel_3_1.add(btnNewButton_4_3_1);

        JButton btnNewButton_4_3_2 = new JButton("Borrador");
        btnNewButton_4_3_2.setBounds(167, 52, 97, 32);
        panel_3_1.add(btnNewButton_4_3_2);

        JButton btnNewButton_4_3_3 = new JButton("Pincel");
        btnNewButton_4_3_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodo = 1;
            }
        });
        btnNewButton_4_3_3.setBounds(167, 10, 97, 32);
        panel_3_1.add(btnNewButton_4_3_3);

        JLabel lblNewLabel_1_1_1_1_4 = new JLabel("");
        lblNewLabel_1_1_1_1_4.setIcon(new ImageIcon("Imagenes/Pincel.png"));
        lblNewLabel_1_1_1_1_4.setBounds(89, 10, 68, 34);
        panel_3_1.add(lblNewLabel_1_1_1_1_4);

        JLabel lblNewLabel_1_1_1_1_4_1 = new JLabel("");
        lblNewLabel_1_1_1_1_4_1.setIcon(new ImageIcon("Imagenes/borrador.png"));
        lblNewLabel_1_1_1_1_4_1.setBounds(83, 52, 74, 34);
        panel_3_1.add(lblNewLabel_1_1_1_1_4_1);

        JLabel lblNewLabel_2 = new JLabel("Grosor");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_2.setBounds(202, 149, 68, 26);
        panel_3_1.add(lblNewLabel_2);

        JLabel lblNewLabel_1_1_1_1_4_1_1 = new JLabel("");
        lblNewLabel_1_1_1_1_4_1_1.setIcon(new ImageIcon("Imagenes/lapiz.png"));
        lblNewLabel_1_1_1_1_4_1_1.setBounds(83, 94, 74, 34);
        panel_3_1.add(lblNewLabel_1_1_1_1_4_1_1);

        JPanel panel_3_1_1 = new JPanel();
        panel_3_1_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel_3_1_1.setBounds(0, 409, 274, 184);
        panel_1.add(panel_3_1_1);
        panel_3_1_1.setLayout(null);

        JLabel lblColors = new JLabel("Colors");
        lblColors.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblColors.setBounds(10, 0, 74, 24);
        panel_3_1_1.add(lblColors);

        JButton btnNewButton_4 = new JButton("");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = Color.RED;
            }
        });
        btnNewButton_4.setBackground(new Color(255, 0, 0));
        btnNewButton_4.setBounds(10, 34, 47, 39);
        panel_3_1_1.add(btnNewButton_4);

        JButton btnNewButton_4_1 = new JButton("");
        btnNewButton_4_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = Color.BLUE;
            }
        });
        btnNewButton_4_1.setBackground(new Color(0, 0, 255));
        btnNewButton_4_1.setBounds(67, 34, 47, 39);
        panel_3_1_1.add(btnNewButton_4_1);

        JButton btnNewButton_4_2 = new JButton("");
        btnNewButton_4_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = Color.GREEN;
            }
        });
        btnNewButton_4_2.setBackground(new Color(0, 255, 0));
        btnNewButton_4_2.setBounds(124, 34, 47, 39);
        panel_3_1_1.add(btnNewButton_4_2);

        JButton btnNewButton_4_5 = new JButton("");
        btnNewButton_4_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = Color.BLACK;
            }
        });
        btnNewButton_4_5.setBackground(new Color(0, 0, 0));
        btnNewButton_4_5.setBounds(181, 34, 47, 39);
        panel_3_1_1.add(btnNewButton_4_5);

        JButton btnNewButton_5 = new JButton("Guardar");
        btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnNewButton_5.setBounds(10, 146, 243, 29);
        panel_3_1_1.add(btnNewButton_5);

        JButton btnNewButton_5_1 = new JButton("Limpiar");
        btnNewButton_5_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                puntosActuales.clear();
                trazos.clear();
                rectangulos.clear();
                triangulos.clear();
                drawingPanel.repaint();
            }
        });
        btnNewButton_5_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnNewButton_5_1.setBounds(10, 85, 243, 39);
        panel_3_1_1.add(btnNewButton_5_1);

        drawingPanel = new DrawingPanel();
        drawingPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        drawingPanel.setBounds(294, 10, 682, 593);
        panel.add(drawingPanel);

        drawingPanel.addMouseListener(this);
        drawingPanel.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (metodo == 2) {
            rectangulos.add(new Rectangulo(e.getX(), e.getY(), 100, 50, colorActual));
        } else if (metodo == 3) {
            rectangulos.add(new Rectangulo(e.getX(), e.getY(), 75, 75, colorActual));
        } else if (metodo == 4) {
            triangulos.add(new Triangulo(e.getX(), e.getY(), 75, 75, colorActual));
        }
        drawingPanel.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        lastPoint = e.getPoint();
        puntosActuales.clear();
        puntosActuales.add(lastPoint);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (metodo == 1 && !puntosActuales.isEmpty()) {
            trazos.add(new Trazo(puntosActuales, colorActual, grosorTrazo));
            puntosActuales.clear();
        }
        drawingPanel.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        Point newPoint = e.getPoint();
        if (metodo == 1) {
            puntosActuales.add(newPoint);
        }
        drawingPanel.repaint();
        lastPoint = newPoint;
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    class DrawingPanel extends JPanel {
        public DrawingPanel() {
            setBackground(Color.WHITE);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Dibujar todos los trazos guardados
            for (Trazo trazo : trazos) {
                trazo.dibujar(g2d);
            }

            // Dibujar el trazo actual
            if (!puntosActuales.isEmpty()) {
                g2d.setColor(colorActual);
                g2d.setStroke(new BasicStroke(grosorTrazo));
                for (int i = 1; i < puntosActuales.size(); i++) {
                    Point p1 = puntosActuales.get(i - 1);
                    Point p2 = puntosActuales.get(i);
                    g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }

            // Dibujar todas las figuras
            for (Rectangulo rect : rectangulos) {
                rect.dibujar(g2d);
            }

            for (Triangulo tri : triangulos) {
                tri.dibujar(g2d);
            }
        }
    }

    class Trazo {
        private List<Point> puntos;
        private Color color;
        private int grosor;

        public Trazo(List<Point> puntos, Color color, int grosor) {
            this.puntos = new ArrayList<>(puntos);
            this.color = color;
            this.grosor = grosor;
        }

        public void dibujar(Graphics2D g2d) {
            g2d.setColor(color);
            g2d.setStroke(new BasicStroke(grosor));
            if (puntos.size() > 1) {
                for (int i = 1; i < puntos.size(); i++) {
                    Point p1 = puntos.get(i - 1);
                    Point p2 = puntos.get(i);
                    g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
        }
    }

    class Rectangulo {
        private int x, y, w, h;
        private Color color;

        public Rectangulo(int x, int y, int w, int h, Color color) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.color = color;
        }

        public void dibujar(Graphics2D g2d) {
            g2d.setColor(color);
            g2d.drawRect(x, y, w, h);
        }
    }

    class Triangulo {
        private int x, y, base, altura;
        private Color color;

        public Triangulo(int x, int y, int base, int altura, Color color) {
            this.x = x;
            this.y = y;
            this.base = base;
            this.altura = altura;
            this.color = color;
        }

        public void dibujar(Graphics2D g2d) {
            g2d.setColor(color);
            g2d.drawPolygon(getXPoints(), getYPoints(), getNPoints());
        }

        private int[] getXPoints() {
            return new int[] { x, x + base, x + base / 2 };
        }

        private int[] getYPoints() {
            return new int[] { y, y, y - altura };
        }

        private int getNPoints() {
            return 3;
        }
    }
}

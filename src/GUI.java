import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {
    JFrame window;

    //text Area
    JTextArea textArea;
    JScrollPane scrollPane;
    boolean wordWarpOn = false;

    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    JMenuItem itemNew, itemOpen, itemSave, itemSaveAs, itemExit;
    //File Format
    JMenuItem itemWrap,fontAriel,fontCSMS,fontTNR,fontSize8,fontSize10,fontSize12,fontSize16,fontSize20,fontSize24,fontSize28;
    JMenu menuFont, menuFontsSize;

    //color
    JMenuItem itemColor1, itemColor2,itemColor3;


    Function_File file = new Function_File(this);
Function_Format format = new Function_Format(this);
Function_Color color = new Function_Color(this);

    public static void main(String[] args) {
        new GUI();

    }

    public GUI() {
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        createFormatMenu();
        createColorMenu();
        format.selectedFont ="Ariel";

        format.createFont(16);
        format.wordWrap();
        window.setVisible(true);
    }

    public void createWindow() {
        window = new JFrame("(CH) - Editpad");
        window.setSize(1000, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void createTextArea() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane);


    }

    public void createMenuBar() {
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);
        menuFile = new JMenu("File");
        menuBar.add(menuFile);
        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);
        menuFormat = new JMenu("Format");
        menuBar.add(menuFormat);
        menuColor = new JMenu("Color");
        menuBar.add(menuColor);

    }

    public void createFileMenu() {
        itemNew = new JMenuItem("New file");
        itemNew.addActionListener(this);
        itemNew.setActionCommand("New");
        menuFile.add(itemNew);
        itemOpen = new JMenuItem("Open");
        itemOpen.addActionListener(this);
        itemOpen.setActionCommand("Open");
        menuFile.add(itemOpen);
        itemSave = new JMenuItem("Save");
        itemSave.addActionListener(this);
        itemSave.setActionCommand("Save");
        menuFile.add(itemSave);
        itemSaveAs = new JMenuItem("SaveAs");
        itemSaveAs.addActionListener(this);
        itemSaveAs.setActionCommand("SaveAs");
        menuFile.add(itemSaveAs);
        itemExit = new JMenuItem("Exit");
        itemExit.addActionListener(this);
        itemExit.setActionCommand("Exit");
        menuFile.add(itemExit);
    }

    public void createFormatMenu() {
        itemWrap = new JMenuItem("Word Wrap: Off");
        itemWrap.addActionListener(this);
        itemWrap.setActionCommand("Word Wrap");
menuFormat.add(itemWrap);

        menuFont = new JMenu("Font");
        menuFormat.add(menuFont);
        fontAriel = new JMenuItem("Ariel");
        fontAriel.addActionListener(this);
        fontAriel.setActionCommand("Ariel");
        menuFont.add(fontAriel);

        fontCSMS = new JMenuItem("Comic Sans MS");
        fontCSMS.addActionListener(this);
        fontCSMS.setActionCommand("Comic Sans MS");
        menuFont.add(fontCSMS);

        fontTNR = new JMenuItem("Times New Roman");
        fontTNR.addActionListener(this);
        fontTNR.setActionCommand("Times New Roman");
        menuFont.add(fontTNR);
        menuFontsSize = new JMenu("Font Size");
        menuFormat.add(menuFontsSize);

        fontSize8 = new JMenuItem("8");
        fontSize8.addActionListener(this);
        fontSize8.setActionCommand("8");
        menuFontsSize.add(fontSize8);

        fontSize10 = new JMenuItem("10");
        fontSize10.addActionListener(this);
        fontSize10.setActionCommand("10");
        menuFontsSize.add(fontSize10);

        fontSize12 = new JMenuItem("12");
        fontSize12.addActionListener(this);
        fontSize12.setActionCommand("12");
        menuFontsSize.add(fontSize12);

        fontSize16 = new JMenuItem("16");
        fontSize16.addActionListener(this);
        fontSize16.setActionCommand("16");
        menuFontsSize.add(fontSize16);

        fontSize20 = new JMenuItem("20");
        fontSize20.addActionListener(this);
        fontSize20.setActionCommand("20");
        menuFontsSize.add(fontSize20);

        fontSize24 = new JMenuItem("24");
        fontSize24.addActionListener(this);
        fontSize24.setActionCommand("24");
        menuFontsSize.add(fontSize24);

        fontSize28 = new JMenuItem("28");
        fontSize28.addActionListener(this);
        fontSize28.setActionCommand("28");
        menuFontsSize.add(fontSize28);
    }
    public void createColorMenu(){
       itemColor1 =new JMenuItem("White");
       itemColor1.addActionListener(this);
       itemColor1.setActionCommand("White");
       menuColor.add(itemColor1);
        itemColor2 =new JMenuItem("Black");
        itemColor2.addActionListener(this);
        itemColor2.setActionCommand("Black");
        menuColor.add(itemColor2);
        itemColor3 =new JMenuItem("Blue");
        itemColor3.addActionListener(this);
        itemColor3.setActionCommand("Blue");
        menuColor.add(itemColor3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "New":
                file.newFile();
                break;
            case "Open":
                file.openFile();
                break;
            case "Save":
                file.saveFile();
                break;
            case "SaveAs":
                file.saveFileAs();
                break;
            case "Exit":
                file.exit();
                break;
            case "Word Wrap":
                format.wordWrap();
                break;
            case"Ariel":
                format.setFont(command); break;
                case"Comic Sans MS":
                    format.setFont(command); break;
            case"Times New Roman":
                format.setFont(command); break;



            case "8":
                format.createFont(8);
                break;
            case "10":
                format.createFont(10);
                break;
            case "12":
                format.createFont(12);
                break;
            case "16":
                format.createFont(16);
                break;
            case "20":
                format.createFont(20);
                break;
            case "24":
                format.createFont(24);
                break;
            case "28":
                format.createFont(28);
                break;
            case "White":
            case "Black":
            case "Blue":
                color.changeColor(command);
            break;


        }
    }
}



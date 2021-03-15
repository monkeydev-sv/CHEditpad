import java.awt.*;

public class Function_Format {
    GUI gui;
    Font ariel ,comicSansMS,timesNewRoman;
    String selectedFont;
    public Function_Format(GUI gui){
this.gui = gui;

    }
    public void wordWrap(){
if(gui.wordWarpOn==false){
    gui.wordWarpOn = true;
    gui.textArea.setLineWrap(true);
    gui.textArea.setWrapStyleWord(true);
    gui.itemWrap.setText("Word Wrap: On");
}
else if(gui.wordWarpOn==true){
    gui.wordWarpOn = false;
    gui.textArea.setLineWrap(false);
    gui.textArea.setWrapStyleWord(false);
    gui.itemWrap.setText("Word Wrap: Off");
}
    }
    public void createFont(int fontSize){
       ariel = new Font ("Ariel",Font.PLAIN,fontSize);
        comicSansMS = new Font ("Comic Sans MS",Font.PLAIN,fontSize);
        timesNewRoman= new Font ("Times New Roman",Font.PLAIN,fontSize);
        setFont(selectedFont);
    }
    public void setFont(String font){
        selectedFont = font;
switch (selectedFont){
    case "Ariel":
        gui.textArea.setFont(ariel);
        break;
    case "Comic Sans MS":
        gui.textArea.setFont(comicSansMS);
        break;
    case "Times New Roman":
        gui.textArea.setFont(timesNewRoman);
        break;

}

    }
}

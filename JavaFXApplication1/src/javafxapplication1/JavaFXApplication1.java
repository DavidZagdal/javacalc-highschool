package javafxapplication1;





import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.scene.control.LabelBuilder;
import java.util.Scanner;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.geometry.Pos;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;

import static javafxapplication1.Buttons.btn0;
import static javafxapplication1.Buttons.btn1;
import static javafxapplication1.Buttons.btn2;
import static javafxapplication1.Buttons.btn3;
import static javafxapplication1.Buttons.btn4;
import static javafxapplication1.Buttons.btn5;
import static javafxapplication1.Buttons.btn6;
import static javafxapplication1.Buttons.btn7;
import static javafxapplication1.Buttons.btn8;
import static javafxapplication1.Buttons.btn9;
import static javafxapplication1.Buttons.btnCe;
import static javafxapplication1.Buttons.btnClr;
import static javafxapplication1.Buttons.btnClrLast;
import static javafxapplication1.Buttons.btnequ;
import static javafxapplication1.Buttons.btnminus;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.math.RoundingMode;
import javafx.scene.image.Image;
import static javafxapplication1.Buttons.btnBin;
import static javafxapplication1.Buttons.btnBinIndicator;
import static javafxapplication1.Buttons.btnDek;
import static javafxapplication1.Buttons.btnDekIndicator;
import static javafxapplication1.Buttons.btnHex;
import static javafxapplication1.Buttons.btnHexIndicator;
import static javafxapplication1.Buttons.btnOct;
import static javafxapplication1.Buttons.btnOctIndicator;
import static javafxapplication1.Buttons.btnPi;
import static javafxapplication1.Buttons.btnPlMn;
import static javafxapplication1.Buttons.btnPotencija;
import static javafxapplication1.Buttons.btnadd;
import static javafxapplication1.Buttons.btndiv;
import static javafxapplication1.Buttons.btndot;
import static javafxapplication1.Buttons.btnkorijen;
import static javafxapplication1.Buttons.btnkvadrat;
import static javafxapplication1.Buttons.btnlft;
import static javafxapplication1.Buttons.btnmult;
import static javafxapplication1.Buttons.btnright;
import static javafxapplication1.CommonFunctions.izvediJednako;
import static javafxapplication1.Buttons.radnjeIndicator;





/**
 *
 * @author david
 */
public class JavaFXApplication1 extends Application {
    public static Group root = new Group();
    Stage stage = new Stage();
    Stage stage2 = new Stage();
    //public static Button btnConsole = new Button();
    
    DecimalFormat df = new DecimalFormat("#.####");
    
    
    
    public static int resultNote = 0;
    
    
    public static Scene scene = new Scene(root, 340+10, 690+10+40, Color.color(0.15, 0.15, 0.15));
    
    
    public static Label btnConsole = LabelBuilder.create().text("").id("lightGrayLabel").build();
    public static Label btnConsole2 = LabelBuilder.create().text("").id("lightGrayLabelSmall").build();
    public static Label btnMove = LabelBuilder.create().text("").id("lightGrayLabelSmallest").build();
    public static Button btnFullscreen = new Button();
    public static Button btnClose = new Button();
    public static Button btnMin = new Button();
    public static Button btnHelp = new Button();
    public static Button btnExpand = new Button();
    public static int fullscreenNote=1;
    public static int iconifiedNote=1;
    private double xOffset = 0; 
    private double yOffset = 0;
    public static double xek=350;
    public static double ipsek=740;
    public static double windowY=0;
    public static double windowX=0;
    
    public static int helpIndicator = 0;
    
    public static int tockaIndicator = 0; //0 mozes koristit tocku, 1 nemozes koristit tocku
    public static int tockaIndicatorZaZagradu = 0;
    public static int minusIndicator = 0;
    
    public static double primaryStageX;
    public static double primaryStageY;
    
    public static double razmakXTu;
    
    //➑
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
       /* Image image = new Image("image/lemonkey.jpg"); 
        ImageView imageView = new ImageView(image); 
        imageView.setX(87.5+87.5+43.75*2); 
        imageView.setY(412.5+87.5+25+87.5+40+87.5); 
        imageView.setFitHeight(175); 
        imageView.setFitWidth(87.5); 
        imageView.setPreserveRatio(false); */ 
       
        df.setRoundingMode(RoundingMode.CEILING);
        
        windowX=primaryStage.getWidth();
        windowY=primaryStage.getHeight();
        
        Buttons buttons = new Buttons();
        btnMove.setText("  Kalkulator v. ➒");
        
       
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setX(event.getScreenX() - xOffset);
                primaryStage.setY(event.getScreenY() - yOffset);
            }
        });
        
        
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        
        
        
        btnFullscreen.setOnAction((ActionEvent event) -> {
            
            try{
            if(fullscreenNote==1){
                
                primaryStage.setMaximized(true);
                if (primaryStage.getWidth()>1000 && primaryStage.getHeight()>500){
                    
                    root.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        
                    }
                    });
                    root.setOnMouseDragged(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        
                    }
                    });
                    primaryStage.setMaximized(true);
                    fullscreenNote=0;
                    windowX = primaryStage.getWidth();
                    windowY = primaryStage.getHeight();

                    double windowXC = JavaFXApplication1.windowX;
                    double windowYC = JavaFXApplication1.windowY;
                    
                    if (windowXC > 3800) razmakXTu = -1100;
                    else if (windowXC > 2000) razmakXTu = -900;
                    else if (windowXC > 1900) razmakXTu = -250;
                    else if (windowXC > 1600) razmakXTu = 0;
                    else if(windowXC > 1100) razmakXTu = 400;
                    else if (windowXC > 900) razmakXTu = 400;
                    else if (windowXC > 600) razmakXTu = 500;
                    else if (windowXC > 200) razmakXTu = 600;
                    else if (windowXC > 0) razmakXTu = 700;
                    
                    
                    
                    root.getChildren().removeAll(buttons.btn7,buttons.btn8,buttons.btn9,buttons.btndiv,buttons.btn4,buttons.btn5,buttons.btn6,buttons.btnmult,buttons.btn1,buttons.btn2,buttons.btn3,buttons.btnminus,buttons.btndot,buttons.btn0,buttons.btnequ,buttons.btnadd,buttons.btnCe,buttons.btnClr,buttons.btnClrLast,buttons.btnPlMn,buttons.btnlft,buttons.btnright,buttons.btnkvadrat,buttons.btnkorijen,btnPotencija, btnPi, btnDek, btnHex, btnOct, btnBin, btnDekIndicator, btnHexIndicator, btnOctIndicator, btnBinIndicator);

                    btnExpand.setLayoutX(primaryStage.getWidth()-60-20-40-40-40);
                    btnExpand.setLayoutY(0);
                    btnExpand.setMinSize(40, 40);
                    btnExpand.setMaxSize(40, 40);
                    btnExpand.setText("+");
                    btnExpand.setId("btnHelp");
                    
                    btnHelp.setLayoutX(primaryStage.getWidth()-60-20-40-40);
                    btnHelp.setLayoutY(0);
                    btnHelp.setMinSize(40, 40);
                    btnHelp.setMaxSize(40, 40);
                    btnHelp.setText("?");
                    btnHelp.setId("btnHelp");
                    
                    
                    btnFullscreen.setLayoutX(primaryStage.getWidth()-60-20);//310
                    btnFullscreen.setLayoutY(0);//175-42
                    btnFullscreen.setMinSize(40, 40);
                    btnFullscreen.setMaxSize(40, 40);
                    btnFullscreen.setText("⚫");//❐
                    btnFullscreen.setId("btnFS");

                    btnClose.setLayoutX(primaryStage.getWidth()-40);
                    btnClose.setLayoutY(0);//175-42
                    btnClose.setMinSize(40, 40);
                    btnClose.setMaxSize(40, 40);
                    btnClose.setText("✘");//✖╳✕
                    btnClose.setId("btnCLOSE");

                    btnMin.setLayoutX(primaryStage.getWidth()-100-20);
                    btnMin.setLayoutY(0);//175-42
                    btnMin.setMinSize(40, 40);
                    btnMin.setMaxSize(40, 40);
                    btnMin.setText("━");//━
                    btnMin.setId("btnMINMAX");

                    btnConsole2.setLayoutX(0);
                    btnConsole2.setLayoutY(135*3+135-100-100);
                    btnConsole2.setMaxSize(1100-razmakXTu, 67.5);
                    btnConsole2.setMinSize(1100-razmakXTu, 67.5);
                    btnConsole2.setId("lightGrayLabelSmallFullscreen");



                    btnMove.setLayoutX(0);
                    btnMove.setLayoutY(0);
                    btnMove.setMaxSize(1800, 40);
                    btnMove.setMinSize(1800, 40);
                    btnMove.setId("lightGrayLabelSmallest");



                    btnConsole.setLayoutX(0);
                    btnConsole.setLayoutY(67.5+135*3+135-100-100);
                    btnConsole.setMaxSize(1100-razmakXTu, 202.5);
                    btnConsole.setMinSize(1100-razmakXTu, 202.5);//58.33333333333333
                    btnConsole.setId("lightGrayLabelFullscreen");

                        windowX = primaryStage.getWidth();
                        windowY = primaryStage.getHeight();
                        
                    
            
            }else{
                    
                primaryStage.setMaximized(false);
                  
                }
            
            }
            else{
               root.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    xOffset = event.getSceneX();
                 yOffset = event.getSceneY();
                }
            });
                root.setOnMouseDragged(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                   primaryStage.setX(event.getScreenX() - xOffset);
                   primaryStage.setY(event.getScreenY() - yOffset);
                }   
                });
                primaryStage.setMaximized(false);
                fullscreenNote=1;
                root.getChildren().removeAll(buttons.btn7,buttons.btn8,buttons.btn9,buttons.btndiv,buttons.btn4,buttons.btn5,buttons.btn6,buttons.btnmult,buttons.btn1,buttons.btn2,buttons.btn3,buttons.btnminus,buttons.btndot,buttons.btn0,buttons.btnequ,buttons.btnadd,buttons.btnCe,buttons.btnClr,buttons.btnClrLast,buttons.btnPlMn,buttons.btnlft,buttons.btnright,buttons.btnkvadrat,buttons.btnkorijen,btnPotencija, btnPi, btnDek, btnHex, btnOct, btnBin, btnDekIndicator, btnHexIndicator, btnOctIndicator, btnBinIndicator);
            
                
                btnExpand.setLayoutX(310-40-40-25-25);
                btnExpand.setLayoutY(0);
                btnExpand.setMinSize(25, 40);
                btnExpand.setMaxSize(20, 40);
                btnExpand.setText("+");
                btnExpand.setId("btnHelp");
                
                btnHelp.setLayoutX(310-40-40-25);
                btnHelp.setLayoutY(0);
                btnHelp.setMinSize(25, 40);
                btnHelp.setMaxSize(20, 40);
                btnHelp.setText("?");
                btnHelp.setId("btnHelp");
                
                
                btnFullscreen.setLayoutX(310-40);//310
                btnFullscreen.setLayoutY(0);//175-42
                btnFullscreen.setMinSize(40, 40);
                btnFullscreen.setMaxSize(40, 40);
                btnFullscreen.setText("⚫");//❐
                btnFullscreen.setId("btnFS");

                btnClose.setLayoutX(310);
                btnClose.setLayoutY(0);//175-42
                btnClose.setMinSize(40, 40);
                btnClose.setMaxSize(40, 40);
                btnClose.setText("✘");//✖╳✕
                btnClose.setId("btnCLOSE");

                btnMin.setLayoutX(310-80);
                btnMin.setLayoutY(0);//175-42
                btnMin.setMinSize(40, 40);
                btnMin.setMaxSize(40, 40);
                btnMin.setText("━");//━
                btnMin.setId("btnMINMAX");
                
                btnConsole2.setLayoutX(0);
                btnConsole2.setLayoutY(0+40);
                btnConsole2.setMaxSize(300, 58.33333333333333);
                btnConsole2.setMinSize(350, 58.33333333333333);
                btnConsole2.setId("lightGrayLabelSmall");
        
        
                btnMove.setLayoutX(0);
                btnMove.setLayoutY(0);
                btnMove.setMaxSize(350-40-40-40, 40);
                btnMove.setMinSize(350-40-40-40,40);
                btnMove.setId("lightGrayLabelSmallest");
        
                
                
                btnConsole.setLayoutX(0);
                btnConsole.setLayoutY(58.33333333333333+40);
                btnConsole.setMaxSize(350, 116.6666666666667);
                btnConsole.setMinSize(350, 116.6666666666667);//58.33333333333333
                btnConsole.setId("lightGrayLabel");
                
                windowX = 0;
                windowY = 0;
        
        
            }
            xek = primaryStage.getWidth();
            ipsek = primaryStage.getHeight();
            
            Buttons runButtonsClass = new Buttons();
            JavaFXApplication1.root.getChildren().addAll(btn7,btn8,btn9,btndiv,btn4,btn5,btn6,btnmult,btn1,btn2,btn3,btnminus,btndot,btn0,btnequ,btnadd,btnCe,btnClr,btnClrLast,btnPlMn,btnlft,btnright,btnkvadrat,btnkorijen,btnPotencija, btnPi, btnDek, btnHex, btnOct, btnBin, btnDekIndicator, btnHexIndicator, btnOctIndicator, btnBinIndicator);
            
            
            }catch (Exception ex){
            System.out.println("Random error on fullscreen...");
            }
        });
        
        btnClose.setOnAction((ActionEvent event) -> {
            
            primaryStage.close();
            
        });
        
        btnMin.setOnAction((ActionEvent event) -> {
            
            primaryStage.setIconified(true);
            
        });
        
        btnHelp.setOnAction((ActionEvent event) -> {
            
            //stage.close();
            
            if(helpIndicator == 0){
            NoFs info = new NoFs(stage);
            helpIndicator++;
            }
            else{
            stage.show();
            }
       
        });
        
        btnExpand.setOnAction((ActionEvent event) -> {
            

            if(fullscreenNote == 1){
                if(btnExpand.getText()=="-"){
                    btnExpand.setText("+");
                    primaryStage.setHeight(690+10+40);
                }
                else{
                    btnExpand.setText("-");
                    primaryStage.setHeight(690+10+40+87.5+87.5);
                }
            }
            else{
            
            }
       
        });
       
        
        
        Scanner sc = new Scanner(System.in);
        
                btnExpand.setLayoutX(310-40-40-25-25);
                btnExpand.setLayoutY(0);
                btnExpand.setMinSize(25, 40);
                btnExpand.setMaxSize(20, 40);
                btnExpand.setText("+");
                btnExpand.setId("btnHelp");
        
        
                btnHelp.setLayoutX(310-40-40-25);
                btnHelp.setLayoutY(0);
                btnHelp.setMinSize(25, 40);
                btnHelp.setMaxSize(20, 40);
                btnHelp.setText("?");
                btnHelp.setId("btnHelp");
        
                btnFullscreen.setLayoutX(310-40);//310
                btnFullscreen.setLayoutY(0);//175-42
                btnFullscreen.setMinSize(40, 40);
                btnFullscreen.setMaxSize(40, 40);
                btnFullscreen.setText("⚫");//❐
                btnFullscreen.setId("btnFS");

                btnClose.setLayoutX(310);
                btnClose.setLayoutY(0);//175-42
                btnClose.setMinSize(40, 40);
                btnClose.setMaxSize(40, 40);
                btnClose.setText("✘");//✖╳✕
                btnClose.setId("btnCLOSE");

                btnMin.setLayoutX(310-80);
                btnMin.setLayoutY(0);//175-42
                btnMin.setMinSize(40, 40);
                btnMin.setMaxSize(40, 40);
                btnMin.setText("━");//━
                btnMin.setId("btnMINMAX");
                
                btnConsole2.setLayoutX(0);
                btnConsole2.setLayoutY(0+40);
                btnConsole2.setMaxSize(350, 58.33333333333333);
                btnConsole2.setMinSize(350, 58.33333333333333);
        
        
                btnMove.setLayoutX(0);
                btnMove.setLayoutY(0);
                btnMove.setMaxSize(350-40-40-40, 40);
                btnMove.setMinSize(350-40-40-40,40);
        
                
                
                btnConsole.setLayoutX(0);
                btnConsole.setLayoutY(58.33333333333333+40);
                btnConsole.setMaxSize(350, 116.6666666666667);
                btnConsole.setMinSize(350, 116.6666666666667);//58.33333333333333
        
        btnConsole.setAlignment(Pos.CENTER_RIGHT);
        btnConsole2.setAlignment(Pos.CENTER_RIGHT);
        
        
        root.getChildren().add(btnConsole2);
       //58.33333333333333
        
        
        root.getChildren().add(btnConsole);
        
        
        root.getChildren().add(btnMove);

        root.getChildren().add(btnHelp);
        
        root.getChildren().add(btnExpand);
        
        
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                btnConsole.setText(btnConsole.getText()+event.getText());
                
                //minusIndicator = 0;
                //kad se stisne enter, spaja se tekst iz prve konzole s drugom i izracunava se pomocu script engine 
                
                if (event.getCode().equals(KeyCode.ENTER))
            {
               izvediJednako(1);
            }
                
                
                if (event.getCode().equals(KeyCode.DIGIT9) || event.getCode().equals(KeyCode.DIGIT8) || event.getCode().equals(KeyCode.DIGIT7) || event.getCode().equals(KeyCode.DIGIT6) || event.getCode().equals(KeyCode.DIGIT5) || event.getCode().equals(KeyCode.DIGIT4) || event.getCode().equals(KeyCode.DIGIT3) || event.getCode().equals(KeyCode.DIGIT2) || event.getCode().equals(KeyCode.DIGIT1) || event.getCode().equals(KeyCode.DIGIT0) || event.getCode().equals(KeyCode.NUMPAD9) || event.getCode().equals(KeyCode.NUMPAD8) || event.getCode().equals(KeyCode.NUMPAD7) || event.getCode().equals(KeyCode.NUMPAD6) || event.getCode().equals(KeyCode.NUMPAD5) || event.getCode().equals(KeyCode.NUMPAD4) || event.getCode().equals(KeyCode.NUMPAD3) || event.getCode().equals(KeyCode.NUMPAD2) || event.getCode().equals(KeyCode.NUMPAD1) || event.getCode().equals(KeyCode.NUMPAD0))
            {
                try {
                        radnjeIndicator=0;
                        minusIndicator = 0;
                    }
                    catch(Exception e) {
                        System.out.println("ERROR: ENTER DIGIT");
            }
            }

                
                if (event.getCode().equals(KeyCode.BACK_SPACE))
            {
                    try {
                        String wholeText = JavaFXApplication1.btnConsole.getText();
                        int lenght=wholeText.length();
                        String newText=wholeText.substring(0, lenght-1);
                        JavaFXApplication1.btnConsole.setText(newText);
                        if(btnConsole.getText().contains(".")){
                            tockaIndicator = 1;
                            tockaIndicatorZaZagradu = 1;
                        }else{
                            tockaIndicator = 0;
                            tockaIndicatorZaZagradu = 0;
                        }
                        
                        if(btnConsole.getText().contains("-")){
                            minusIndicator = 1;
                        }else{
                            minusIndicator = 0;
                        }
                    }
                    catch(Exception e) {
                        System.out.println("ERROR: BACK_SPACE");
            }
            }

                
                //kad se stisne delete izbrise se jedna znamenka
                if (event.getCode().equals(KeyCode.DELETE))
            {
                    try {
                        JavaFXApplication1.btnConsole.setText("");
                        JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole.getText());
                        
                        
                        btnDekIndicator.setId("Indicator");
                        btnHexIndicator.setId("Indicator");
                        btnBinIndicator.setId("Indicator");
                        btnOctIndicator.setId("Indicator");
                        Buttons.radnjeIndicator=0;
                        tockaIndicator = 0;
                        tockaIndicatorZaZagradu = 0;
                        minusIndicator = 0;
                    }
                    catch(Exception e) {
                        System.out.println("ERROR: DELETE");
                    }
            }
                
                
                //probat da se samo jedanput otcka smije stisnut - stavit da kad stisne plus minus il nekaj od tog da se vrati ta vrijednost na nula (nula, mozes koristit tocku) (jedan - nemozes koristit tocku)
                if (event.getText().equals("."))
            {
                    try {
                        
                        if(tockaIndicator == 1){
                            String wholeText = JavaFXApplication1.btnConsole.getText();
                            int lenght=wholeText.length();
                            String newText=wholeText.substring(0, lenght-1);
                            JavaFXApplication1.btnConsole.setText(newText);
                            
                        }else{
                            tockaIndicator = 1;
                            tockaIndicatorZaZagradu = 1;
                        }
                        
                        if(tockaIndicator == 0 && btnConsole.getText().contains(".")){
                            tockaIndicator = 1;
                            tockaIndicatorZaZagradu = 1;
                            String wholeText = JavaFXApplication1.btnConsole.getText();
                            int lenght=wholeText.length();
                            String newText=wholeText.substring(0, lenght-1);
                            JavaFXApplication1.btnConsole.setText(newText);
                        }
                            
                    }
                    catch(Exception e) {
                        System.out.println("ERROR: FULLSTOP");
                    }
            }
                
                if (event.getText().equals("-"))
            {
                    try {
                        
                        if(minusIndicator == 1){
                            String wholeText = JavaFXApplication1.btnConsole.getText();
                            int lenght=wholeText.length();
                            String newText=wholeText.substring(0, lenght-1);
                            JavaFXApplication1.btnConsole.setText(newText);
                            
                        }else{
                            minusIndicator = 1;
                        }
                        
                        if(minusIndicator == 0 && btnConsole.getText().contains("-")){
                            minusIndicator = 1;
                            String wholeText = JavaFXApplication1.btnConsole.getText();
                            int lenght=wholeText.length();
                            String newText=wholeText.substring(0, lenght-1);
                            JavaFXApplication1.btnConsole.setText(newText);
                        }
                            
                    }
                    catch(Exception e) {
                        System.out.println("ERROR: MINUS");
                    }
            }
                
                //kad se stisne neki od tih tipki prebaci se tekst iz prve konzole u drugu tj. iz donje u gornju...
                if (event.getText().equals("/") || event.getCode().equals(KeyCode.DIVIDE) || event.getCode().equals(KeyCode.MULTIPLY) || event.getCode().equals(KeyCode.SUBTRACT) || event.getCode().equals(KeyCode.ADD) || event.getCode().equals(KeyCode.PLUS) || event.getCode().equals(KeyCode.MINUS))
            {
                    try {
                        
                        if((btnConsole.getText().equals(".*")  || btnConsole.getText().equals("./") || btnConsole.getText().equals("(.*")  || btnConsole.getText().equals("(./") || btnConsole.getText().equals("(*")  || btnConsole.getText().equals("(/") || btnConsole.getText().equals("/") || btnConsole.getText().equals("/")) && btnConsole2.getText().isEmpty() && (event.getText().equals("/") || event.getText().equals("*"))){
                            btnConsole.setText(btnConsole.getText().substring(0, btnConsole.getText().length()-1));
                        }else{
                        
                        
                        
                            if(radnjeIndicator==0){
                            JavaFXApplication1.resultNote = 0;
                            JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText() +JavaFXApplication1.btnConsole.getText());
                            JavaFXApplication1.btnConsole.setText("");
                            radnjeIndicator=1;
                            }else if (radnjeIndicator==1){
                                JavaFXApplication1.resultNote = 0; 
                                String test = JavaFXApplication1.btnConsole.getText();
                                String last = test.substring(1, test.length());
                                JavaFXApplication1.btnConsole.setText(last);
                            }
                            tockaIndicator = 0;
                            tockaIndicatorZaZagradu = 0;
                            minusIndicator = 0;
                            }   
                        }
                    catch(Exception e) {
                        System.out.println("ERROR: TRANSFER...");
            }
            }
                
                
                //ako se ikoje slovo stisne osim brojki, automatski se brise, sad rade sva slova, ako sam koja zaobravio moze se dodat, š
                if (event.getText().equals("!") || event.getText().equals("\"") || event.getText().equals("#") || event.getText().equals("$") || event.getText().equals("%") || event.getText().equals("&") || event.getText().equals("?") || event.getText().equals("=") || event.getText().equals("\\") || event.getText().equals("}") || event.getText().equals("{") || event.getText().equals("]") || event.getText().equals("[") || event.getText().equals("ž") || event.getText().equals("ć") || event.getText().equals("č") || event.getText().equals("đ") || event.getCode().equals(KeyCode.Q) || event.getCode().equals(KeyCode.W) || event.getCode().equals(KeyCode.E) || event.getCode().equals(KeyCode.R) || event.getCode().equals(KeyCode.T) || event.getCode().equals(KeyCode.Z) || event.getCode().equals(KeyCode.U) || event.getCode().equals(KeyCode.I) || event.getCode().equals(KeyCode.O) || event.getCode().equals(KeyCode.P) || event.getCode().equals(KeyCode.A) || event.getCode().equals(KeyCode.S) || event.getCode().equals(KeyCode.D) || event.getCode().equals(KeyCode.F) || event.getCode().equals(KeyCode.G) || event.getCode().equals(KeyCode.H) || event.getCode().equals(KeyCode.J) || event.getCode().equals(KeyCode.K) || event.getCode().equals(KeyCode.L) || event.getCode().equals(KeyCode.Y) || event.getCode().equals(KeyCode.X) || event.getCode().equals(KeyCode.C) || event.getCode().equals(KeyCode.V) || event.getCode().equals(KeyCode.B) || event.getCode().equals(KeyCode.N) || event.getCode().equals(KeyCode.M) || event.getCode().equals(KeyCode.COMMA) || event.getCode().equals(KeyCode.EXCLAMATION_MARK) || event.getCode().equals(KeyCode.SEMICOLON) || event.getCode().equals(KeyCode.UNDERSCORE) || event.getCode().equals(KeyCode.POUND) || event.getCode().equals(KeyCode.DOLLAR) || event.getCode().equals(KeyCode.COMMA) || event.getText().equals("'") || event.getText().equals("š"))
            {
                    try {
                        
                        String wholeText = JavaFXApplication1.btnConsole.getText();
                        int lenght=wholeText.length();
                        String newText=wholeText.substring(0, lenght-1);
                        JavaFXApplication1.btnConsole.setText(newText);
                        
                        

                    }catch (Exception e) {
                        System.out.println("ERROR: DELETION");
                    }
            }
                
            }
        });
        
        
        scene.getStylesheets().add(getClass().getResource("david.css").toExternalForm());

        primaryStage.getIcons().add(new Image("image/icon.png"));
        
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage("images\\mylogo.png"));
        
        
        root.getChildren().addAll(btnFullscreen, btnClose, btnMin);
       
        
        
        primaryStage.centerOnScreen();
        
        //root.getChildren().add(imageView);
        
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setFullScreenExitHint("");
        primaryStage.setTitle("Kalkulator");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStageX=primaryStage.getX();
        primaryStageX=primaryStage.getY();
        
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}


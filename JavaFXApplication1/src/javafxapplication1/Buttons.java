/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication1;
import java.lang.Math; 
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import static javafxapplication1.JavaFXApplication1.btnConsole;
import static javafxapplication1.JavaFXApplication1.btnConsole2;
import static javafxapplication1.JavaFXApplication1.minusIndicator;
import static javafxapplication1.JavaFXApplication1.root;
import static javafxapplication1.JavaFXApplication1.scene;
import static javafxapplication1.JavaFXApplication1.tockaIndicator;
import static javafxapplication1.JavaFXApplication1.tockaIndicatorZaZagradu;


//pi = 3.1415926535897932384626433832795‬






/**
 *
 * @author david
 */
public class Buttons {
    
    /*public static double kvadrat(double x, double y){
        
        if(y==0 || x==0) return 1;
        
        y--;
        return kvadrat(x,y)*x;
    }
    */
    public static void setupButton(Button button, double x, double y, double maxMinX, double maxMinY, String ID){
    
    
            button.setLayoutX(x);
            button.setLayoutY(y);
            button.setMaxSize(maxMinX,maxMinY);
            button.setMinSize(maxMinX,maxMinY);
            button.setId(ID);
    
    
    }
    
    
    
    public static int potencijaIndicator = 0;
    public static double prviBroj;
    
    
    public static Button btnlft = new Button();
    public static Button btn = new Button();
    public static Button btn0 = new Button();
    public static Button btn1 = new Button();
    public static Button btn2 = new Button();
    public static Button btn3 = new Button();
    public static Button btn4 = new Button();
    public static Button btn5 = new Button();
    public static Button btn6 = new Button();
    public static Button btn7 = new Button();
    public static Button btn8 = new Button();
    public static Button btn9 = new Button();
    public static Button btnmult = new Button();
    public static Button btndiv = new Button();
    public static Button btnminus = new Button();
    public static Button btnadd = new Button();
    public static Button btnright = new Button();
    public static Button btnCe = new Button();
    public static Button btnClr = new Button();
    public static Button btnClrLast = new Button();
    public static Button btnkorijen = new Button();
    public static Button btnkvadrat = new Button();
    public static Button btnPlMn = new Button();
    public static Button btnequ = new Button();
    public static Button btndot = new Button();
    public static Button btnPotencija = new Button();
    public static Button btnPi = new Button();
    
    
    public static Button btnDek = new Button();//1
    public static Button btnHex = new Button();//2
    public static Button btnOct = new Button();//3
    public static Button btnBin = new Button();//4
    public static Button btnDekIndicator = new Button();
    public static Button btnHexIndicator = new Button();
    public static Button btnOctIndicator = new Button();
    public static Button btnBinIndicator = new Button();
    
    
    public static Button btnSinCosTanIndicator = new Button();
    public static Button btnDegreesToRadians = new Button();
    

    public static Button btnHexA = new Button();
    public static Button btnHexB = new Button();
    public static Button btnHexC = new Button();
    public static Button btnHexD = new Button();
    public static Button btnHexE = new Button();
    public static Button btnHexF = new Button();
    
    public static Button btnSin = new Button();
    public static Button btnCos = new Button();
    public static Button btnTan = new Button();
    
    public static Button btnSin1 = new Button();
    public static Button btnCos1 = new Button();
    public static Button btnTan1 = new Button();
    
    public static String backPosition;
    
    public static int sinCosTanIndicator;
    public static int degreesToRadiansIndicator = 0; //0 = stupnjevi   1 = radijani
    
    public static int indicator = 0;
    
    public static int radnjeIndicator=0;
    
    public static int zagradaIndicator;
    public static int zagradaOpenOrClosedIndicator;
    
    public static int razmakX = 0;
    
    
    
    //gumb PI
    //10 na x
    //x na y, navodenje broja i potencije
    //sin cos tan? hahhaha ne
    
    
    public Buttons(){
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("１");
        numbers.add("２");
        numbers.add("３");
        numbers.add("４");
        numbers.add("５");
        numbers.add("６");
        numbers.add("７");
        numbers.add("８");
        numbers.add("９");
        numbers.add("０");
        numbers.add("÷");
        numbers.add("×");
        numbers.add("+");
        numbers.add("-");
        numbers.add("=");
        numbers.add(".");
        //ᴄᴇ ᴄ + - × = . ÷

        
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        Scanner sc = new Scanner(System.in);
        
        
        //1. gumb
        btn1.setText(numbers.get(0));
        
        btn1.setOnAction((ActionEvent event) -> {
            if(potencijaIndicator==1){
                JavaFXApplication1.root.getChildren().remove(btnminus);
            }
            if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"1");
            radnjeIndicator=0;
        });
        
        //2. gumb
        btn2.setText(numbers.get(1));
        
        btn2.setOnAction((ActionEvent event) -> {
            if(potencijaIndicator==1){
                JavaFXApplication1.root.getChildren().remove(btnminus);
            }
            if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"2");
            radnjeIndicator=0;
        });
        
        
       //3. gumb
        btn3.setText(numbers.get(2));
        
        btn3.setOnAction((ActionEvent event) -> {
            if(potencijaIndicator==1){
                JavaFXApplication1.root.getChildren().remove(btnminus);
            }
            if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"3");
            radnjeIndicator=0;
        });
        
        
        //4. gumb
        btn4.setText(numbers.get(3));
        
        btn4.setOnAction((ActionEvent event) -> {
            if(potencijaIndicator==1){
                JavaFXApplication1.root.getChildren().remove(btnminus);
            }
            if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"4");
            radnjeIndicator=0;
        });
        
        
        //5. gumb
        btn5.setText(numbers.get(4));
        
        btn5.setOnAction((ActionEvent event) -> {
            if(potencijaIndicator==1){
                JavaFXApplication1.root.getChildren().remove(btnminus);
            }
            if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"5");
            radnjeIndicator=0;
        });
        
        
        //6. gumb
        btn6.setText(numbers.get(5));
        
        btn6.setOnAction((ActionEvent event) -> {
            if(potencijaIndicator==1){
                JavaFXApplication1.root.getChildren().remove(btnminus);
            }
            if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"6");
            radnjeIndicator=0;
        });
        
        
        //7. gumb
        btn7.setText(numbers.get(6));
        
        btn7.setOnAction((ActionEvent event) -> {
            if(potencijaIndicator==1){
                JavaFXApplication1.root.getChildren().remove(btnminus);
            }
            if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"7");
            radnjeIndicator=0;
        });
        
        
        //8. gumb
        btn8.setText(numbers.get(7));
        
        btn8.setOnAction((ActionEvent event) -> {
            if(potencijaIndicator==1){
                JavaFXApplication1.root.getChildren().remove(btnminus);
            }
            if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"8");
            radnjeIndicator=0;
        });
        
        
        //9. gumb
        btn9.setText(numbers.get(8));
        
        btn9.setOnAction((ActionEvent event) -> {
            if(potencijaIndicator==1){
                JavaFXApplication1.root.getChildren().remove(btnminus);
            }
            if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"9");
            radnjeIndicator=0;
        });
        
        
        
        //0 gumb
        btn0.setText(numbers.get(9));
        
        btn0.setOnAction((ActionEvent event) -> {
            if(potencijaIndicator==1){
                JavaFXApplication1.root.getChildren().remove(btnminus);
            }
            if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"0");
            radnjeIndicator=0;
        });
        
        
        //divide gumb
        btndiv.setText(numbers.get(10));
        
        btndiv.setOnAction((ActionEvent event) -> {
            if(btnConsole.getText().isEmpty() || btnConsole.getText().substring(btnConsole.getText().length()-1, btnConsole.getText().length()).equals("(")){
                
            }else{
                if(radnjeIndicator==0){
                JavaFXApplication1.resultNote = 0;
                JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"/");
                JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText() +JavaFXApplication1.btnConsole.getText());
                JavaFXApplication1.btnConsole.setText("");
                radnjeIndicator=1;
                }else if(radnjeIndicator==1){
                JavaFXApplication1.resultNote = 0; 
                String test = JavaFXApplication1.btnConsole2.getText();
                String last = test.substring(0, test.length()-1);
                JavaFXApplication1.btnConsole2.setText(last +"/");
                JavaFXApplication1.btnConsole.setText("");

                }
            }
            
        });
        
        
        //multiply gumb
        btnmult.setText(numbers.get(11));
        
        btnmult.setOnAction((ActionEvent event) -> {
            if(btnConsole.getText().isEmpty() || btnConsole.getText().substring(btnConsole.getText().length()-1, btnConsole.getText().length()).equals("(")){
                
            }else{
                if(radnjeIndicator==0){
                JavaFXApplication1.resultNote = 0;
                JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"*");
                JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText() +JavaFXApplication1.btnConsole.getText());
                JavaFXApplication1.btnConsole.setText("");
                radnjeIndicator=1;
                }else if(radnjeIndicator==1){
                JavaFXApplication1.resultNote = 0; 
                String test = JavaFXApplication1.btnConsole2.getText();
                String last = test.substring(0, test.length()-1);
                JavaFXApplication1.btnConsole2.setText(last +"*");
                JavaFXApplication1.btnConsole.setText("");

                }
            }
        });
        
        
        //add gumb
        btnadd.setText(numbers.get(12));
        
        btnadd.setOnAction((ActionEvent event) -> {
            if(radnjeIndicator==0){
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"+");
            JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText() +JavaFXApplication1.btnConsole.getText());
            JavaFXApplication1.btnConsole.setText("");
            radnjeIndicator=1;
            }else if(radnjeIndicator==1){
            JavaFXApplication1.resultNote = 0; 
            String test = JavaFXApplication1.btnConsole2.getText();
            String last = test.substring(0, test.length()-1);
            JavaFXApplication1.btnConsole2.setText(last +"+");
            JavaFXApplication1.btnConsole.setText("");
            
            }
        });
        
        
        //minus gumb
        btnminus.setText(numbers.get(13));
        
        btnminus.setOnAction((ActionEvent event) -> {
            if(radnjeIndicator==0){
            if(potencijaIndicator==0){
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"-");
            JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText() +JavaFXApplication1.btnConsole.getText());
            JavaFXApplication1.btnConsole.setText("");
            }else if(potencijaIndicator==1){
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"-");
  
            }
            radnjeIndicator=1;
            }else if(radnjeIndicator==1){
            JavaFXApplication1.resultNote = 0; 
            String test = JavaFXApplication1.btnConsole2.getText();
            String last = test.substring(0, test.length()-1);
            JavaFXApplication1.btnConsole2.setText(last +"-");
            JavaFXApplication1.btnConsole.setText("");
            
            }
        });
        
        
        //equals gumb
        btnequ.setText(numbers.get(14));
        
        btnequ.setOnAction((ActionEvent event) -> {
            CommonFunctions.izvediJednako(0);
        });
        
        
        //dot gumb
        btndot.setText(numbers.get(15));
        
        btndot.setOnAction((ActionEvent event) -> {
            if(radnjeIndicator==0 && tockaIndicator == 0){
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+".");
            radnjeIndicator=1;
            tockaIndicator = 1;
            }
           
        });
        
        
        
        //clear (CE) gumb
        btnCe.setText("CE");
        
        btnCe.setOnAction((ActionEvent event) -> {
            
            if(indicator==1){
                JavaFXApplication1.root.getChildren().addAll(btnkorijen,btnmult,btnPlMn,btnequ,btndiv,btnadd,btnright,btnminus,btnkvadrat,btndot,btnPotencija,btnPi,btnlft,btnSin,btnCos,btnTan);
                JavaFXApplication1.root.getChildren().add(btnSinCosTanIndicator);
                JavaFXApplication1.root.getChildren().add(btnDegreesToRadians);
            }else if(indicator == 2){
                JavaFXApplication1.root.getChildren().addAll(btnkorijen,btnmult,btnPlMn,btnequ,btndiv,btnadd,btnright,btnminus,btnkvadrat,btndot,btnPotencija,btnPi,btnlft,btnSin,btnCos,btnTan);
                JavaFXApplication1.root.getChildren().removeAll(btnHexA, btnHexB, btnHexC, btnHexD, btnHexE, btnHexF);
                JavaFXApplication1.root.getChildren().add(btnSinCosTanIndicator);
                JavaFXApplication1.root.getChildren().add(btnDegreesToRadians);
            }else if (indicator == 3){
                JavaFXApplication1.root.getChildren().addAll(btn9,btn8,btnkorijen,btnmult,btnPlMn,btnequ,btndiv,btnadd,btnright,btnminus,btnkvadrat,btndot,btnPotencija,btnPi,btnlft,btnSin,btnCos,btnTan);
                JavaFXApplication1.root.getChildren().add(btnSinCosTanIndicator);
                JavaFXApplication1.root.getChildren().add(btnDegreesToRadians);
            }else if (indicator == 4){
                JavaFXApplication1.root.getChildren().addAll(btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnkorijen,btnmult,btnPlMn,btnequ,btndiv,btnadd,btnright,btnminus,btnkvadrat,btndot,btnPotencija,btnPi,btnlft,btnSin,btnCos,btnTan);
                JavaFXApplication1.root.getChildren().add(btnSinCosTanIndicator);
                JavaFXApplication1.root.getChildren().add(btnDegreesToRadians);
            }
            Buttons.indicator=0;
            JavaFXApplication1.resultNote = 1;
            btnDekIndicator.setId("Indicator");
            btnHexIndicator.setId("Indicator");
            btnBinIndicator.setId("Indicator");
            btnOctIndicator.setId("Indicator");
            
            
            
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText("");
            
            if(btnConsole.getText().contains(".")){
                    tockaIndicator = 1;
                    tockaIndicatorZaZagradu = 1;
                }else{
                    tockaIndicator = 0;
                    tockaIndicatorZaZagradu = 0;
                }
                if(btnConsole2.getText().endsWith("-")){
                    minusIndicator = 1;
                }else{
                    minusIndicator = 0;
                }
                
                
                scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    btnConsole.setText(btnConsole.getText()+event.getText());

                    //minusIndicator = 0;



                    //kad se stisne enter, spaja se tekst iz prve konzole s drugom i izracunava se pomocu script engine 

                    if (event.getCode().equals(KeyCode.ENTER))
                {
                    
                    CommonFunctions.izvediJednako(1);
                    
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

                            /*if(btnConsole2.getText().isEmpty()){

                            }else{*/



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
                            /*}*/
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
            });
            
            
            
           zagradaOpenOrClosedIndicator=0; 
           btnright.setText(")");
           
  
        
        
        //clear all gumb
        btnClr.setText("C");
        
        btnClr.setOnAction((ActionEvent event) -> {
            JavaFXApplication1.resultNote = 0;
            JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.btnConsole2.setText("");
            if (potencijaIndicator==1){
            root.getChildren().addAll(btnSin,btnCos,btnTan,btnPotencija,btnmult,btndot,btnadd,btnPlMn,btnlft,btnright,btnkvadrat,btnkorijen,btnDek,btnHex,btnBin,btnOct,btndiv,btnDekIndicator,btnHexIndicator,btnBinIndicator,btnOctIndicator,btnPi);
            root.getChildren().remove(btnSinCosTanIndicator);
            root.getChildren().add(btnSinCosTanIndicator);
            root.getChildren().remove(btnDegreesToRadians);
            root.getChildren().add(btnDegreesToRadians);
           }
            potencijaIndicator=0;
            
            radnjeIndicator=0;
            
            zagradaOpenOrClosedIndicator=0;
            btnright.setText(")");
            tockaIndicator = 0;
            tockaIndicatorZaZagradu = 0;
            minusIndicator = 0;
        });
        
        
       //clr last digit gumb
        btnClrLast.setText("⌫");
        
        btnClrLast.setOnAction((ActionEvent event) -> {
            
            try {
                String wholeText = JavaFXApplication1.btnConsole.getText();
                int lenght=wholeText.length();
                String newText=wholeText.substring(0, lenght-1);
                JavaFXApplication1.btnConsole.setText(newText);
            }
            catch(Exception e) {
                System.out.println("ERROR: btnClrLast");
            }
            
            

        });
        
        
        //+- gumb
        btnPlMn.setText("±");
        
        btnPlMn.setOnAction((ActionEvent event) -> {
            
           
            String currentText=JavaFXApplication1.btnConsole.getText();
            int indexMinus = currentText.lastIndexOf('-');
            if (indexMinus!=0)
            JavaFXApplication1.btnConsole.setText('-' +JavaFXApplication1.btnConsole.getText());
            
            if (indexMinus==0){
                String wholeText = JavaFXApplication1.btnConsole.getText();
                    String newText1=wholeText.substring(0, indexMinus);
                    String newText2=wholeText.substring(indexMinus+1, wholeText.length());
                JavaFXApplication1.btnConsole.setText(newText1    +newText2);
            }
                
            
        });
        
        
        
        //lijeva zagrada
        btnlft.setText("(");
        
        btnlft.setOnAction((ActionEvent event) -> {
            if(zagradaOpenOrClosedIndicator>=1){
                String test = btnConsole.getText();

                test = test.substring(test.length()-1,test.length());

                if(".".equals(test)){

                }else{
                    if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
                    JavaFXApplication1.resultNote = 0;
                    JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"(");
                    zagradaOpenOrClosedIndicator++;
                    btnright.setText(zagradaOpenOrClosedIndicator +")");
                }
            
              
            }else{
                if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
                JavaFXApplication1.resultNote = 0;
                JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"(");
                zagradaOpenOrClosedIndicator++;
                btnright.setText(zagradaOpenOrClosedIndicator +")");
            }
            
            if(JavaFXApplication1.fullscreenNote==1){
                if(zagradaOpenOrClosedIndicator>9){
                    btnright.setId("grayButtonsSmallest2");
                }
            }else if(JavaFXApplication1.fullscreenNote==0){
                if(zagradaOpenOrClosedIndicator>9){
                    btnright.setId("grayButtons");
                }
            }
        });
        
           
        //desna zagrada
        btnright.setText(")");
        
        btnright.setOnAction((ActionEvent event) -> {
            
                
            
                if(zagradaOpenOrClosedIndicator>=1){
                    
                    String test = btnConsole.getText();

                    test = test.substring(test.length()-1,test.length());
                    
                    if(".".equals(test) || "(".equals(test)){
                        
                    
                    }else{
                        if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
                    
                        JavaFXApplication1.resultNote = 0;
                        JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+")");
                        zagradaOpenOrClosedIndicator--;
                        btnright.setText(zagradaOpenOrClosedIndicator +")");
                    }
                        
                }else if(zagradaOpenOrClosedIndicator==1){
                   
                    String test = btnConsole.getText();

                    test = test.substring(test.length()-1,test.length());
                    
                    if(".".equals(test)){
                        
                    
                    
                    }else{
                        if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
                        JavaFXApplication1.resultNote = 0;
                        JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+")");
                        zagradaOpenOrClosedIndicator--;
                        btnright.setText(")");
                    }
                }else if(zagradaOpenOrClosedIndicator<1){

                }

            if(JavaFXApplication1.fullscreenNote==1){
                if(zagradaOpenOrClosedIndicator<=9){
                    btnright.setId("grayButtons");
                }
            }else if(JavaFXApplication1.fullscreenNote==0){
                if(zagradaOpenOrClosedIndicator<=9){
                    btnright.setId("grayButtonsFullscreen");
                }
            }
           
        });
        
        
        //kvadrat gumb
        btnkvadrat.setText("x²");
        
        btnkvadrat.setOnAction((ActionEvent event) -> {
            
            
            try{ 
                Object obj;
                obj = engine.eval(JavaFXApplication1.btnConsole.getText());
                String s = String.valueOf(obj);
                double d = Double.valueOf(s);
                d= d*d;
                s= String.valueOf(d);
            
                JavaFXApplication1.btnConsole.setText(s);
                JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole2.getText() +JavaFXApplication1.btnConsole.getText());
                
            } catch (Exception ex) {
                System.out.println("ERROR: btnKvadrat - najvjerojatnije nema broja");
            }
            
           
        });
        
        
        //korijen gumb
        btnkorijen.setText("√");
        
        btnkorijen.setOnAction((ActionEvent event) -> {
            
            try{ 
                Object obj;
                obj = engine.eval(JavaFXApplication1.btnConsole.getText());
                String s = String.valueOf(obj);
                double d = Double.valueOf(s);
                d= sqrt(d);
                s= String.valueOf(d);
                  
                DecimalFormat df2 = new DecimalFormat("#.##########");
                
                s = df2.format(d);
                s = s.replace(',', '.');
            
                if(JavaFXApplication1.btnConsole2.getText().isEmpty()){
                    JavaFXApplication1.btnConsole.setText(s);
                    JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole2.getText() +JavaFXApplication1.btnConsole.getText());
                    JavaFXApplication1.btnConsole2.setText("");
                }else{
                    JavaFXApplication1.btnConsole.setText(s);
                    JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText() +JavaFXApplication1.btnConsole.getText());
                    JavaFXApplication1.btnConsole.setText("");
                    CommonFunctions.izvediJednako(0);
                }
                
                
                
            } catch (ScriptException ex) {
                //Logger.getLogger(Buttons.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ERROR: btnKorijen");
            }
            
        });
        
        
        
         //potencija gumb
        btnPotencija.setText("xˣ");
        
        btnPotencija.setOnAction((ActionEvent event) -> {
           // if(JavaFXApplication1.btnConsole2.getText().isEmpty()){
                    potencijaIndicator = 1;

                backPosition = JavaFXApplication1.btnConsole2.getText();

                String firstNumber = JavaFXApplication1.btnConsole.getText();

                JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+ "^");
                JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText() +JavaFXApplication1.btnConsole.getText());
                JavaFXApplication1.btnConsole.setText("");

                root.getChildren().removeAll(btnSin,btnCos,btnTan,btnPotencija,btnmult,btndot,btnadd,btnPlMn,btnlft,btnright,btnkvadrat,btnkorijen,btnDek,btnHex,btnBin,btnOct,btndiv,btnDekIndicator,btnHexIndicator,btnBinIndicator,btnOctIndicator,btnPi);
                root.getChildren().remove(btnSinCosTanIndicator);
                root.getChildren().remove(btnDegreesToRadians);

                prviBroj = Double.parseDouble(firstNumber);
                System.out.println("PRVI BROJ:"+prviBroj);


                potencijaIndicator = 1;
           // }else{
                
           // }
            
        });
        
        //pi gumb
        btnPi.setText("𝜋");
        
        btnPi.setOnAction((ActionEvent event) -> {
            if(radnjeIndicator > 0){
                JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"3.14159");
                JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText()+btnConsole.getText());
                JavaFXApplication1.btnConsole.setText("");
            }else
            {
                int sizeOfString = JavaFXApplication1.btnConsole2.getText().length();
                if(JavaFXApplication1.btnConsole.getText().length() >= 1){
                    JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"*3.14159");
                    JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText()+btnConsole.getText());
                    JavaFXApplication1.btnConsole.setText("");
                }else if(JavaFXApplication1.btnConsole2.getText().length() == 0){
                    JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"3.14159");
                    JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText()+btnConsole.getText());
                    JavaFXApplication1.btnConsole.setText("");
                }else if(JavaFXApplication1.btnConsole.getText().isEmpty()  &&
                   JavaFXApplication1.btnConsole2.getText().substring(sizeOfString-2,sizeOfString-1).contains("/") &&
                   JavaFXApplication1.btnConsole2.getText().substring(sizeOfString-2,sizeOfString-1).contains("*") &&
                   JavaFXApplication1.btnConsole2.getText().substring(sizeOfString-2,sizeOfString-1).contains("+") &&
                   JavaFXApplication1.btnConsole2.getText().substring(sizeOfString-2,sizeOfString-1).contains("-"))
                {
                    
                    JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"3.14159");
                    JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText()+btnConsole.getText());
                    JavaFXApplication1.btnConsole.setText("");
                }else{
                    JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"*3.14159");
                    JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText()+btnConsole.getText());
                    JavaFXApplication1.btnConsole.setText("");
                }
                
            }
            
        });
         /* ---------------------------------------------------------------------------------------------------- */
        
        //Dekadski gumb
        btnDek.setText("Dek");
        
        btnDek.setOnAction((ActionEvent event) -> {
            
            if (indicator==1){
                
            if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.resultNote = 0;
                        
            }else if (indicator==2){
                
                PretvorbaBrojevnihSustava.hexToDek();
                JavaFXApplication1.resultNote = 1;
                
                
                }else if (indicator==3){
                
                    PretvorbaBrojevnihSustava.octToDek();
                    JavaFXApplication1.resultNote = 1;
                    
                    }else if (indicator==4){
                
                        PretvorbaBrojevnihSustava.binToDek();
                        JavaFXApplication1.resultNote = 1;
                        
                        
                        }
            
        });
        
        //Heksadekadski gumb
        btnHex.setText("Hex");
        
        btnHex.setOnAction((ActionEvent event) -> {
            
            
            if (indicator==1){
                
                PretvorbaBrojevnihSustava.dekToHex();
                JavaFXApplication1.resultNote = 1;
                        
            }else if (indicator==2){
                
                if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
                JavaFXApplication1.resultNote = 0;
                
                
                }else if (indicator==3){
                
                    PretvorbaBrojevnihSustava.octToHex();
                    JavaFXApplication1.resultNote = 1;
                    
                    
                    }else if (indicator==4){
                
                        
                        PretvorbaBrojevnihSustava.binToHex();
                        JavaFXApplication1.resultNote = 1;
                        
                        }
            
            
            //mali gumb se stisne, ide if do tog broja, onda se u for petlji sve znamenke stavljaju u array, svaka znamenka zasebno, pa se racuna ovisi koji se mali gumbic stisnuo
            
            
        });
        
        //octalni gumb
        btnOct.setText("Oct");
        
        btnOct.setOnAction((ActionEvent event) -> {
            
            
            
            if (indicator==1){
                
                PretvorbaBrojevnihSustava.dekToOct();
                JavaFXApplication1.resultNote = 1;
                        
            }else if (indicator==2){
                
                PretvorbaBrojevnihSustava.hexToOct();
                JavaFXApplication1.resultNote = 1;
                
                
                }else if (indicator==3){
                
                    if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
                    JavaFXApplication1.resultNote = 0;
                    
                    
                    }else if (indicator==4){
                
                        
                        PretvorbaBrojevnihSustava.binToOct();
                        JavaFXApplication1.resultNote = 1;
                        
                        }
            
            
        });
        
        //binarni gumb
        btnBin.setText("Bin");
        
        btnBin.setOnAction((ActionEvent event) -> {
            
            
            
            
            if (indicator==1){
                
                PretvorbaBrojevnihSustava.dekToBin();
                JavaFXApplication1.resultNote = 1;
                        
            }else if (indicator==2){
                
                PretvorbaBrojevnihSustava.hexToBin();
                JavaFXApplication1.resultNote = 1;
                
                
                }else if (indicator==3){
                
                    PretvorbaBrojevnihSustava.octToBin();
                    JavaFXApplication1.resultNote = 1;
                    
                    
                    }else if (indicator==4){
                
                        if(JavaFXApplication1.resultNote == 1) JavaFXApplication1.btnConsole.setText("");
                        JavaFXApplication1.resultNote = 0;
                        
                        
                        }
            
        });
        
        
        /* ---------------------------------------------------------------------------------------------------- */
        
        //Dekadski Indicator gumb
        
        btnDekIndicator.setOnAction((ActionEvent event) -> {
            
            JavaFXApplication1.scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                btnConsole.setText(btnConsole.getText()+event.getText());
                
                //ako se ikoje slovo stisne osim brojki, automatski se brise, ne radi hrvatska posebna slova čćšđž...
                if (event.getText().equals(".") || event.getText().equals("'") ||  event.getText().equals("š") || event.getText().equals("!") || event.getText().equals("\"") || event.getText().equals("#") || event.getText().equals("$") || event.getText().equals("%") || event.getText().equals("&") || event.getText().equals("?") || event.getText().equals("=") || event.getText().equals("\\") || event.getText().equals("}") || event.getText().equals("{") || event.getText().equals("]") || event.getText().equals("[") || event.getText().equals("ž") || event.getText().equals("ć") || event.getText().equals("č") || event.getText().equals("đ") || event.getCode().equals(KeyCode.SUBTRACT) || event.getCode().equals(KeyCode.ADD) || event.getCode().equals(KeyCode.MULTIPLY) || event.getCode().equals(KeyCode.DIVIDE) || event.getCode().equals(KeyCode.MINUS) || event.getCode().equals(KeyCode.PLUS) || event.getCode().equals(KeyCode.Q) || event.getCode().equals(KeyCode.W) || event.getCode().equals(KeyCode.E) || event.getCode().equals(KeyCode.R) || event.getCode().equals(KeyCode.T) || event.getCode().equals(KeyCode.Z) || event.getCode().equals(KeyCode.U) || event.getCode().equals(KeyCode.I) || event.getCode().equals(KeyCode.O) || event.getCode().equals(KeyCode.P) || event.getCode().equals(KeyCode.A) || event.getCode().equals(KeyCode.S) || event.getCode().equals(KeyCode.D) || event.getCode().equals(KeyCode.F) || event.getCode().equals(KeyCode.G) || event.getCode().equals(KeyCode.H) || event.getCode().equals(KeyCode.J) || event.getCode().equals(KeyCode.K) || event.getCode().equals(KeyCode.L) || event.getCode().equals(KeyCode.Y) || event.getCode().equals(KeyCode.X) || event.getCode().equals(KeyCode.C) || event.getCode().equals(KeyCode.V) || event.getCode().equals(KeyCode.B) || event.getCode().equals(KeyCode.N) || event.getCode().equals(KeyCode.M) || event.getCode().equals(KeyCode.COMMA) || event.getCode().equals(KeyCode.EXCLAMATION_MARK) || event.getCode().equals(KeyCode.SEMICOLON) || event.getCode().equals(KeyCode.UNDERSCORE) || event.getCode().equals(KeyCode.POUND) || event.getCode().equals(KeyCode.DOLLAR) || event.getCode().equals(KeyCode.COMMA))
            {
                    try {
                        String wholeText = JavaFXApplication1.btnConsole.getText();
                        int lenght=wholeText.length();
                        String newText=wholeText.substring(0, lenght-1);
                        JavaFXApplication1.btnConsole.setText(newText);
                        

                    }catch (Exception e) {
                        System.out.println("ERROR: btnDekIndicator");
                    }
            }
                
                if (event.getCode().equals(KeyCode.ENTER))
            {
                try{
                            String test = btnConsole.getText();

                            test = test.substring(test.length()-2,test.length()-1);
                            
                            String test2 = btnConsole.getText();
                            test2 = test2.trim();
                            test2.replaceAll("^[\n\r]", "");
                            JavaFXApplication1.btnConsole.setText(test2);
                            
                        }catch(Exception ex){
                        System.out.println("ERROR: Enter kod DEK");
                        }
            }
                
            }
        });
            
            
            JavaFXApplication1.root.getChildren().removeAll(btnkorijen,btnmult,btnPlMn,btnequ,btndiv,btnadd,btnright,btnminus,btnkvadrat,btndot,btnPotencija,btnPi,btnlft,btnSin,btnCos,btnTan,btnSin1,btnCos1,btnTan1,btnSinCosTanIndicator,btnDegreesToRadians);
            if(indicator==3){
                JavaFXApplication1.root.getChildren().addAll(btn8,btn9);
            }else if(indicator == 4){
                JavaFXApplication1.root.getChildren().addAll(btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
            }
            
            
            btnDekIndicator.setId("IndicatorPressed");
            btnHexIndicator.setId("Indicator");
            btnBinIndicator.setId("Indicator");
            btnOctIndicator.setId("Indicator");
            
            indicator=1;
            JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.root.getChildren().removeAll(btnHexA, btnHexB, btnHexC, btnHexD, btnHexE, btnHexF);
            
        });
        
        //Heksadekadski Indicator  gumb
        
        btnHexIndicator.setOnAction((ActionEvent event) -> {
            
            JavaFXApplication1.scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                btnConsole.setText(btnConsole.getText()+event.getText());
                
                //ako se ikoje slovo stisne osim brojki, automatski se brise, ne radi hrvatska posebna slova čćšđž...
                if (event.getText().equals(".") || event.getText().equals("'") ||  event.getText().equals("š") || event.getText().equals("!") || event.getText().equals("\"") || event.getText().equals("#") || event.getText().equals("$") || event.getText().equals("%") || event.getText().equals("&") || event.getText().equals("?") || event.getText().equals("=") || event.getText().equals("\\") || event.getText().equals("}") || event.getText().equals("{") || event.getText().equals("]") || event.getText().equals("[") || event.getText().equals("ž") || event.getText().equals("ć") || event.getText().equals("č") || event.getText().equals("đ") || event.getCode().equals(KeyCode.SUBTRACT) || event.getCode().equals(KeyCode.ADD) || event.getCode().equals(KeyCode.MULTIPLY) || event.getCode().equals(KeyCode.DIVIDE) || event.getCode().equals(KeyCode.MINUS) || event.getCode().equals(KeyCode.PLUS) || event.getCode().equals(KeyCode.Q) || event.getCode().equals(KeyCode.W) || event.getCode().equals(KeyCode.R) || event.getCode().equals(KeyCode.T) || event.getCode().equals(KeyCode.Z) || event.getCode().equals(KeyCode.U) || event.getCode().equals(KeyCode.I) || event.getCode().equals(KeyCode.O) || event.getCode().equals(KeyCode.P) || event.getCode().equals(KeyCode.S) || event.getCode().equals(KeyCode.G) || event.getCode().equals(KeyCode.H) || event.getCode().equals(KeyCode.J) || event.getCode().equals(KeyCode.K) || event.getCode().equals(KeyCode.L) || event.getCode().equals(KeyCode.Y) || event.getCode().equals(KeyCode.X) || event.getCode().equals(KeyCode.V) || event.getCode().equals(KeyCode.N) || event.getCode().equals(KeyCode.M) || event.getCode().equals(KeyCode.COMMA) || event.getCode().equals(KeyCode.EXCLAMATION_MARK) || event.getCode().equals(KeyCode.SEMICOLON) || event.getCode().equals(KeyCode.UNDERSCORE) || event.getCode().equals(KeyCode.POUND) || event.getCode().equals(KeyCode.DOLLAR) || event.getCode().equals(KeyCode.COMMA))
            {
                    try {
                        String wholeText = JavaFXApplication1.btnConsole.getText();
                        int lenght=wholeText.length();
                        String newText=wholeText.substring(0, lenght-1);
                        JavaFXApplication1.btnConsole.setText(newText);
                        

                    }catch (Exception e) {
                        System.out.println("ERROR: btnHexIndicator");
                    }
            }
                
                
                if (event.getCode().equals(KeyCode.ENTER))
            {
                try{
                            String test = btnConsole.getText();

                            test = test.substring(test.length()-2,test.length()-1);
                            
                            String test2 = btnConsole.getText();
                            test2 = test2.trim();
                            test2.replaceAll("^[\n\r]", "");
                            JavaFXApplication1.btnConsole.setText(test2);
                            
                        }catch(Exception ex){
                        System.out.println("ERROR: Enter kod HEX");
                        }
            }
                
            }
        });
            try{
            
            JavaFXApplication1.root.getChildren().removeAll(btnkorijen,btnmult,btnPlMn,btnequ,btndiv,btnadd,btnright,btnminus,btnkvadrat,btndot,btnPotencija,btnPi,btnlft,btnSin,btnCos,btnTan,btnSin1,btnCos1,btnTan1,btnSinCosTanIndicator,btnDegreesToRadians);
            if(indicator==3){
                JavaFXApplication1.root.getChildren().addAll(btn8,btn9);
            }else if(indicator == 4){
                JavaFXApplication1.root.getChildren().addAll(btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
            }
            btnDekIndicator.setId("Indicator");
            btnHexIndicator.setId("IndicatorPressed");
            btnBinIndicator.setId("Indicator");
            btnOctIndicator.setId("Indicator");
            
            
            indicator=2;
            JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.root.getChildren().addAll(btnHexA, btnHexB, btnHexC, btnHexD, btnHexE, btnHexF);
            }catch (Exception ex) {
                //Logger.getLogger(Buttons.class.getName()).log(Level.SEVERE, null, ex);
                //System.out.println("ERROR: btnHexIndicator2: Duplicate Children");
            }
            
            
        });
        
        //octalni Indicator gumb
        
        btnOctIndicator.setOnAction((ActionEvent event) -> {
            
            JavaFXApplication1.scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                btnConsole.setText(btnConsole.getText()+event.getText());
                
                //ako se ikoje slovo stisne osim brojki, automatski se brise, ne radi hrvatska posebna slova čćšđž...
                if (event.getText().equals(".") || event.getText().equals("'") || event.getText().equals("š") || event.getText().equals("!") || event.getText().equals("\"") || event.getText().equals("#") || event.getText().equals("$") || event.getText().equals("%") || event.getText().equals("&") || event.getText().equals("?") || event.getText().equals("=") || event.getText().equals("\\") || event.getText().equals("}") || event.getText().equals("{") || event.getText().equals("]") || event.getText().equals("[") || event.getText().equals("ž") || event.getText().equals("ć") || event.getText().equals("č") || event.getText().equals("đ") || event.getCode().equals(KeyCode.SUBTRACT) || event.getCode().equals(KeyCode.DIGIT9) ||event.getCode().equals(KeyCode.DIGIT8) || event.getCode().equals(KeyCode.ADD) || event.getCode().equals(KeyCode.MULTIPLY) || event.getCode().equals(KeyCode.DIVIDE) || event.getCode().equals(KeyCode.MINUS) || event.getCode().equals(KeyCode.PLUS) || event.getCode().equals(KeyCode.NUMPAD9) || event.getCode().equals(KeyCode.NUMPAD8) || event.getCode().equals(KeyCode.Q) || event.getCode().equals(KeyCode.W) || event.getCode().equals(KeyCode.E) || event.getCode().equals(KeyCode.R) || event.getCode().equals(KeyCode.T) || event.getCode().equals(KeyCode.Z) || event.getCode().equals(KeyCode.U) || event.getCode().equals(KeyCode.I) || event.getCode().equals(KeyCode.O) || event.getCode().equals(KeyCode.P) || event.getCode().equals(KeyCode.A) || event.getCode().equals(KeyCode.S) || event.getCode().equals(KeyCode.D) || event.getCode().equals(KeyCode.F) || event.getCode().equals(KeyCode.G) || event.getCode().equals(KeyCode.H) || event.getCode().equals(KeyCode.J) || event.getCode().equals(KeyCode.K) || event.getCode().equals(KeyCode.L) || event.getCode().equals(KeyCode.Y) || event.getCode().equals(KeyCode.X) || event.getCode().equals(KeyCode.C) || event.getCode().equals(KeyCode.V) || event.getCode().equals(KeyCode.B) || event.getCode().equals(KeyCode.N) || event.getCode().equals(KeyCode.M) || event.getCode().equals(KeyCode.COMMA) || event.getCode().equals(KeyCode.EXCLAMATION_MARK) || event.getCode().equals(KeyCode.SEMICOLON) || event.getCode().equals(KeyCode.UNDERSCORE) || event.getCode().equals(KeyCode.POUND) || event.getCode().equals(KeyCode.DOLLAR) || event.getCode().equals(KeyCode.COMMA))
            {
                    try {
                        String wholeText = JavaFXApplication1.btnConsole.getText();
                        int lenght=wholeText.length();
                        String newText=wholeText.substring(0, lenght-1);
                        JavaFXApplication1.btnConsole.setText(newText);
                        

                    }catch (Exception e) {
                        System.out.println("ERROR: btnOctIndicator");
                    }
            }
                
                if (event.getCode().equals(KeyCode.ENTER))
            {
                try{
                            String test = btnConsole.getText();

                            test = test.substring(test.length()-2,test.length()-1);
                            
                            String test2 = btnConsole.getText();
                            test2 = test2.trim();
                            test2.replaceAll("^[\n\r]", "");
                            JavaFXApplication1.btnConsole.setText(test2);
                            
                        }catch(Exception ex){
                        System.out.println("ERROR: Enter kod OCT");
                        }
            }
                
            }
            });
                 
           
            JavaFXApplication1.root.getChildren().removeAll(btn8,btn9,btnkorijen,btnmult,btnPlMn,btnequ,btndiv,btnadd,btnright,btnminus,btnkvadrat,btndot,btnPotencija,btnPi,btnlft,btnSin,btnCos,btnTan,btnSin1,btnCos1,btnTan1,btnSinCosTanIndicator,btnDegreesToRadians);
            if(indicator==4){
                JavaFXApplication1.root.getChildren().addAll(btn2,btn3,btn4,btn5,btn6,btn7);
            }
            btnDekIndicator.setId("Indicator");
            btnHexIndicator.setId("Indicator");
            btnBinIndicator.setId("Indicator");
            btnOctIndicator.setId("IndicatorPressed");
            
            indicator=3;
            JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.root.getChildren().removeAll(btnHexA, btnHexB, btnHexC, btnHexD, btnHexE, btnHexF);
            
        });
        
        //binarcni Indicator  gumb
        
        btnBinIndicator.setOnAction((ActionEvent event) -> {
    
            JavaFXApplication1.scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                btnConsole.setText(btnConsole.getText()+event.getText());
                
                //ako se ikoje slovo stisne osim brojki, automatski se brise, ne radi hrvatska posebna slova čćšđž...
                if (event.getText().equals(".") || event.getText().equals("'") || event.getText().equals("š") || event.getText().equals("!") || event.getText().equals("\"") || event.getText().equals("#") || event.getText().equals("$") || event.getText().equals("%") || event.getText().equals("&") || event.getText().equals("?") || event.getText().equals("=") || event.getText().equals("\\") || event.getText().equals("}") || event.getText().equals("{") || event.getText().equals("]") || event.getText().equals("[") || event.getText().equals("ž") || event.getText().equals("ć") || event.getText().equals("č") || event.getText().equals("đ") || event.getCode().equals(KeyCode.PERIOD) || event.getCode().equals(KeyCode.SUBTRACT) || event.getCode().equals(KeyCode.DIGIT9) ||event.getCode().equals(KeyCode.DIGIT8) || event.getCode().equals(KeyCode.DIGIT7) || event.getCode().equals(KeyCode.DIGIT6) || event.getCode().equals(KeyCode.DIGIT5) || event.getCode().equals(KeyCode.DIGIT4) || event.getCode().equals(KeyCode.DIGIT3) || event.getCode().equals(KeyCode.DIGIT2) || event.getCode().equals(KeyCode.SEPARATOR) || event.getCode().equals(KeyCode.DECIMAL) || event.getCode().equals(KeyCode.ADD) || event.getCode().equals(KeyCode.MULTIPLY) || event.getCode().equals(KeyCode.DIVIDE) || event.getCode().equals(KeyCode.MINUS) || event.getCode().equals(KeyCode.PLUS) || event.getCode().equals(KeyCode.NUMPAD9) || event.getCode().equals(KeyCode.NUMPAD8) || event.getCode().equals(KeyCode.NUMPAD7) || event.getCode().equals(KeyCode.NUMPAD6) || event.getCode().equals(KeyCode.NUMPAD5) || event.getCode().equals(KeyCode.NUMPAD4) || event.getCode().equals(KeyCode.NUMPAD3) || event.getCode().equals(KeyCode.NUMPAD2) || event.getCode().equals(KeyCode.Q) || event.getCode().equals(KeyCode.W) || event.getCode().equals(KeyCode.E) || event.getCode().equals(KeyCode.R) || event.getCode().equals(KeyCode.T) || event.getCode().equals(KeyCode.Z) || event.getCode().equals(KeyCode.U) || event.getCode().equals(KeyCode.I) || event.getCode().equals(KeyCode.O) || event.getCode().equals(KeyCode.P) || event.getCode().equals(KeyCode.A) || event.getCode().equals(KeyCode.S) || event.getCode().equals(KeyCode.D) || event.getCode().equals(KeyCode.F) || event.getCode().equals(KeyCode.G) || event.getCode().equals(KeyCode.H) || event.getCode().equals(KeyCode.J) || event.getCode().equals(KeyCode.K) || event.getCode().equals(KeyCode.L) || event.getCode().equals(KeyCode.Y) || event.getCode().equals(KeyCode.X) || event.getCode().equals(KeyCode.C) || event.getCode().equals(KeyCode.V) || event.getCode().equals(KeyCode.B) || event.getCode().equals(KeyCode.N) || event.getCode().equals(KeyCode.M) || event.getCode().equals(KeyCode.COMMA) || event.getCode().equals(KeyCode.EXCLAMATION_MARK) || event.getCode().equals(KeyCode.SEMICOLON) || event.getCode().equals(KeyCode.UNDERSCORE) || event.getCode().equals(KeyCode.POUND) || event.getCode().equals(KeyCode.DOLLAR) || event.getCode().equals(KeyCode.COMMA))
            {
                    try {
                        String wholeText = JavaFXApplication1.btnConsole.getText();
                        int lenght=wholeText.length();
                        String newText=wholeText.substring(0, lenght-1);
                        JavaFXApplication1.btnConsole.setText(newText);
                        

                    }catch (Exception e) {
                        System.out.println("ERROR: btnBinIndicator");
                    }
            }
                
                if (event.getCode().equals(KeyCode.ENTER))
            {
                try{
                            String test = btnConsole.getText();

                            test = test.substring(test.length()-2,test.length()-1);
                            
                            String test2 = btnConsole.getText();
                            test2 = test2.trim();
                            test2.replaceAll("^[\n\r]", "");
                            JavaFXApplication1.btnConsole.setText(test2);
                            
                        }catch(Exception ex){
                        System.out.println("ERROR: Enter kod BIN");
                        }
            }
                
            }
        });
            
            JavaFXApplication1.root.getChildren().removeAll(btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnkorijen,btnmult,btnPlMn,btnequ,btndiv,btnadd,btnright,btnminus,btnkvadrat,btndot,btnPotencija,btnPi,btnlft,btnSin,btnCos,btnTan,btnSin1,btnCos1,btnTan1,btnSinCosTanIndicator,btnDegreesToRadians);
            btnDekIndicator.setId("Indicator");
            btnHexIndicator.setId("Indicator");
            btnBinIndicator.setId("IndicatorPressed");
            btnOctIndicator.setId("Indicator");
            
            indicator=4;
            JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.root.getChildren().removeAll(btnHexA, btnHexB, btnHexC, btnHexD, btnHexE, btnHexF);
            
        });

        //gumb za Heksadekadski  "A"
        btnHexA.setText("A");
        btnHexA.setOnAction((ActionEvent event) -> {
            
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"A");
            
        });
        
        //gumb za Heksadekadski  "B"
        btnHexB.setText("B");
        btnHexB.setOnAction((ActionEvent event) -> {
            
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"B");
            
        });
        
        
        //gumb za Heksadekadski  "C"
        btnHexC.setText("C");
        btnHexC.setOnAction((ActionEvent event) -> {
            
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"C");
            
        });
        
        
        //gumb za Heksadekadski  "D"
        btnHexD.setText("D");
        btnHexD.setOnAction((ActionEvent event) -> {
            
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"D");
            
        });
        
        
        
        //gumb za Heksadekadski  "E"
        btnHexE.setText("E");
        btnHexE.setOnAction((ActionEvent event) -> {
            
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"E");
            
        });
        
        //gumb za Heksadekadski  "F"
        btnHexF.setText("F");
        btnHexF.setOnAction((ActionEvent event) -> {
            
            JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText()+"F");
            
        });
        
        
        //gumb SIN
        btnSin.setText("sin(x°)");
        btnSin.setOnAction((ActionEvent event) -> {
            //JavaFXApplication1.root.getChildren().add(btnSinCosTanIndicator);
            String number = JavaFXApplication1.btnConsole.getText();
            
            double a = Double.parseDouble(number);
            double b = a;
            if(degreesToRadiansIndicator == 0){
                b = Math.toRadians(a);
            }
            
             
            double c = Math.sin(b);
            
            String s = String.valueOf(c);
                        
            double d = Double.parseDouble(s);
            s = df.format(d);
            s = s.replace(',', '.');
            
            
            JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.btnConsole.setText(""+s);
        });
        
        //gumb COS
        btnCos.setText("cos(x°)");
        btnCos.setOnAction((ActionEvent event) -> {
            //JavaFXApplication1.root.getChildren().add(btnSinCosTanIndicator);
            String number = JavaFXApplication1.btnConsole.getText();
            
            double a = Double.parseDouble(number);
            double b = a;
            if(degreesToRadiansIndicator == 0){
                b = Math.toRadians(a);
            } 
            double c = Math.cos(b);
            
            String s = String.valueOf(c);
                        
            double d = Double.parseDouble(s);
            s = df.format(d);
            s = s.replace(',', '.');
            
            JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.btnConsole.setText(""+s);
            
        });
        
        
        //gumb TAN
        btnTan.setText("tan(x°)");
        btnTan.setOnAction((ActionEvent event) -> {
            //JavaFXApplication1.root.getChildren().add(btnSinCosTanIndicator);
            String number = JavaFXApplication1.btnConsole.getText();
            
            double a = Double.parseDouble(number);
            double b = a;
            if(degreesToRadiansIndicator == 0){
                b = Math.toRadians(a);
            } 
            double c = Math.tan(b);
            
            String s = String.valueOf(c);
                        
            double d = Double.parseDouble(s);
            s = df.format(d);
            s = s.replace(',', '.');
            
            JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.btnConsole.setText(""+s);
            
            
            
        });
        //gumb sin na -1
        btnSin1.setText("sin(x)⁻¹");
        btnSin1.setOnAction((ActionEvent event) -> {
            //JavaFXApplication1.root.getChildren().add(btnSinCosTanIndicator);
            String number = JavaFXApplication1.btnConsole.getText();
            
            double a = Double.parseDouble(number);
            double c = Math.asin(a);
            double b = c;
            if(degreesToRadiansIndicator == 0){
                b = Math.toDegrees(c);
            } 
            
            String s = String.valueOf(b);
            
            //kasnije napravit da izbaci radijane il stupnjeve
                        
            double e = Double.parseDouble(s);
            s = df.format(e);
            s = s.replace(',', '.');
            
            JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.btnConsole.setText(""+s);
        });
        
        //gumb COS na minus 1
        btnCos1.setText("cos(x)⁻¹");
        btnCos1.setOnAction((ActionEvent event) -> {
            //JavaFXApplication1.root.getChildren().add(btnSinCosTanIndicator);
            String number = JavaFXApplication1.btnConsole.getText();
            
            double a = Double.parseDouble(number);
            double c = Math.acos(a);
            double b = c;
            if(degreesToRadiansIndicator == 0){
                b = Math.toDegrees(c);
            } 
            
            String s = String.valueOf(b);
                        
            double e = Double.parseDouble(s);
            s = df.format(e);
            s = s.replace(',', '.');
            
            JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.btnConsole.setText(""+s);
            
        });
        
        
        //gumb TAN na minus 1
        btnTan1.setText("tan(x)⁻¹");
        btnTan1.setOnAction((ActionEvent event) -> {
            //JavaFXApplication1.root.getChildren().add(btnSinCosTanIndicator);
            String number = JavaFXApplication1.btnConsole.getText();
            
            double a = Double.parseDouble(number);
            double c = Math.atan(a);
            double b = c;
            if(degreesToRadiansIndicator == 0){
                b = Math.toDegrees(c);
            } 
            
            String s = String.valueOf(b);
                        
            double e = Double.parseDouble(s);
            s = df.format(e);
            s = s.replace(',', '.');
            
            JavaFXApplication1.btnConsole.setText("");
            JavaFXApplication1.btnConsole.setText(""+s);
            
            
            
        });
        
        //gumb mjenjanja
        btnSinCosTanIndicator.setText("");
        btnSinCosTanIndicator.setOnAction((ActionEvent event) -> {
            
            if(sinCosTanIndicator==0){
                JavaFXApplication1.root.getChildren().removeAll(btnSin1,btnCos1,btnTan1, btnDegreesToRadians);
                JavaFXApplication1.root.getChildren().removeAll(btnSin,btnCos,btnTan,btnSinCosTanIndicator);
                JavaFXApplication1.root.getChildren().addAll(btnSin1,btnCos1,btnTan1,btnSinCosTanIndicator, btnDegreesToRadians);
                sinCosTanIndicator=1;
                
            }else{
                JavaFXApplication1.root.getChildren().removeAll(btnSin,btnCos,btnTan, btnDegreesToRadians);
                JavaFXApplication1.root.getChildren().removeAll(btnSin1,btnCos1,btnTan1,btnSinCosTanIndicator);
                JavaFXApplication1.root.getChildren().addAll(btnSin,btnCos,btnTan,btnSinCosTanIndicator, btnDegreesToRadians);
                sinCosTanIndicator=0;
                
            }
            
            
        });
        
        //gumb koji mijenja stupnjeve u radijane i vice versa
        btnDegreesToRadians.setText("D");
        btnDegreesToRadians.setOnAction((ActionEvent event) -> {
            
            if(degreesToRadiansIndicator==0){
               
                btnSin.setText("sin(xR)");
                btnCos.setText("cos(xR)");
                btnTan.setText("tan(xR)");
                btnDegreesToRadians.setText("R");
                degreesToRadiansIndicator = 1;
                
            }else{
                btnSin.setText("sin(x°)");
                btnCos.setText("cos(x°)");
                btnTan.setText("tan(x°)");
                btnDegreesToRadians.setText("D");
                degreesToRadiansIndicator = 0;
                
            }
            
            
        });
        
        
        
        
        
        
//58.3333
        try{
        if(JavaFXApplication1.fullscreenNote==1){
            //kad nije zagrada
            System.out.println("2");
            //btn left zagrada
            setupButton(btnlft,0,215,87.5,87.5,"grayButtons");
            //desna zagrada
            setupButton(btnright,87.5,215,87.5,87.5,"grayButtons");
            //kvadrat gumb config
            setupButton(btnkvadrat,175,215,87.5,87.5,"grayButtons");
            //korijen button config
            setupButton(btnkorijen,262.5,215,87.5,87.5,"grayButtons");
            
            //Clear zadnji red (CE) gumb config
            setupButton(btnCe,0,302.5,87.5,87.5,"grayButtonsSmall");
            //Clear ALL gumb config
            setupButton(btnClr,87.5,302.5,87.5,87.5,"grayButtonsSmall");
            //delete zadnji unos gumb config
            setupButton(btnClrLast,175,302.5,87.5,87.5,"grayButtonsSmall");
            //divide button config
            setupButton(btndiv,262.5,302.5,87.5,87.5,"grayButtons");

            //7 gumb config
            setupButton(btn7,0,390,87.5,87.5,"blackButtons");
            //8 gumb config
            setupButton(btn8,87.5,390,87.5,87.5,"blackButtons");
            //9 gumb config
            setupButton(btn9,175,390,87.5,87.5,"blackButtons");
            //multiply button config
            setupButton(btnmult,262.5,390,87.5,87.5,"grayButtons");
            
            //4 gumb config
            setupButton(btn4,0,477.5,87.5,87.5,"blackButtons");
            //5 gumb config
            setupButton(btn5,87.5,477.5,87.5,87.5,"blackButtons");
            //6 gumb config
            setupButton(btn6,175,477.5,87.5,87.5,"blackButtons");
            //minus button config
            setupButton(btnminus,262.5,477.5,87.5,87.5,"grayButtons");

            //1 gumb config
            setupButton(btn1,0,565,87.5,87.5,"blackButtons"); 
            //2 gumb config
            setupButton(btn2,87.5,565,87.5,87.5,"blackButtons");
            //3 gumb config
            setupButton(btn3,175,565,87.5,87.5,"blackButtons");
            //add button config
            setupButton(btnadd,262.5,565,87.5,87.5,"grayButtons");
            
            //plus / minus gumb config
            setupButton(btnPlMn,0,652.5,87.5,87.5,"grayButtons");
            //0 gumb config
            setupButton(btn0,87.5,652.5,87.5,87.5,"blackButtons");
            //dot gumb config
            setupButton(btndot,175,652.5,87.5,87.5,"grayButtons");
            //equ button config
            setupButton(btnequ,262.5,652.5,87.5,87.5,"grayButtons");

            
            //potencije custom gumb config
            setupButton(btnPotencija,175,827.5,87.5,87.5,"grayButtonsSmall");
            root.getChildren().add(btnPotencija);
            //Pi  gumb config
            setupButton(btnPi,175,740,87.5,87.5,"grayButtonsSmall");
            root.getChildren().add(btnPi);


                //DEKADSKI gumb config
                btnDek.setLayoutX(87.5);
                btnDek.setLayoutY(87.5*2+412.5+87.5+25+87.5+40);
                btnDek.setMaxSize(87.5, 87.5);
                btnDek.setMinSize(87.5, 87.5);
                btnDek.setId("grayButtonsSmall");
                 root.getChildren().add(btnDek);

                //HEXADEKADSKI  gumb config
                btnHex.setLayoutX(87.5);
                btnHex.setLayoutY(87.5+412.5+87.5+25+87.5+40);
                btnHex.setMaxSize(87.5, 87.5);
                btnHex.setMinSize(87.5, 87.5);
                btnHex.setId("grayButtonsSmall");
                 root.getChildren().add(btnHex);



                //OCTALNI gumb config
                btnOct.setLayoutX(0);
                btnOct.setLayoutY(87.5*2+412.5+87.5+25+87.5+40);
                btnOct.setMaxSize(87.5, 87.5);
                btnOct.setMinSize(87.5, 87.5);
                btnOct.setId("grayButtonsSmall");
                 root.getChildren().add(btnOct);

                //BINARNI  gumb config
                btnBin.setLayoutX(0);
                btnBin.setLayoutY(87.5+412.5+87.5+25+87.5+40);
                btnBin.setMaxSize(87.5, 87.5);
                btnBin.setMinSize(87.5, 87.5);
                btnBin.setId("grayButtonsSmall");
                 root.getChildren().add(btnBin);


                //DEKADSKI gumb config
                btnDekIndicator.setLayoutX(87.5);
                btnDekIndicator.setLayoutY(87.5*2+412.5+87.5+25+87.5+40);
                btnDekIndicator.setMaxSize(15, 15);
                btnDekIndicator.setMinSize(15, 15);
                btnDekIndicator.setId("Indicator");
                 root.getChildren().add(btnDekIndicator);

                //HEXADEKADSKI  gumb config
                btnHexIndicator.setLayoutX(87.5);
                btnHexIndicator.setLayoutY(87.5+412.5+87.5+25+87.5+40);
                btnHexIndicator.setMaxSize(15, 15);
                btnHexIndicator.setMinSize(15, 15);
                btnHexIndicator.setId("Indicator");
                 root.getChildren().add(btnHexIndicator);



                //OCTALNI gumb config
                btnOctIndicator.setLayoutX(0);
                btnOctIndicator.setLayoutY(87.5*2+412.5+87.5+25+87.5+40);
                btnOctIndicator.setMaxSize(15, 15);
                btnOctIndicator.setMinSize(15, 15);
                btnOctIndicator.setId("Indicator");
                 root.getChildren().add(btnOctIndicator);

                //BINARNI  gumb config
                btnBinIndicator.setLayoutX(0);
                btnBinIndicator.setLayoutY(87.5+412.5+87.5+25+87.5+40);
                btnBinIndicator.setMaxSize(15, 15);
                btnBinIndicator.setMinSize(15, 15);
                btnBinIndicator.setId("Indicator");
                 root.getChildren().add(btnBinIndicator);
                 
                 
                 //x 43.75
                 //y 58.33
                 
                 
                  //Heksadekadski "A" gumb config
            btnHexA.setLayoutX(87.5+87.5+43.75*2);
            btnHexA.setLayoutY(412.5+87.5+25+87.5+40+87.5);
            btnHexA.setMaxSize(43.75, 58.33);
            btnHexA.setMinSize(43.75, 58.33);
            btnHexA.setId("grayButtonsSmallest");
            
            //Heksadekadski "B" gumb config
            btnHexB.setLayoutX(87.5+87.5+43.75*3);
            btnHexB.setLayoutY(412.5+87.5+25+87.5+40+87.5);
            btnHexB.setMaxSize(43.75, 58.33);
            btnHexB.setMinSize(43.75, 58.33);
            btnHexB.setId("grayButtonsSmallest");
            
            //Heksadekadski "C" gumb config
            btnHexC.setLayoutX(87.5+87.5+43.75*2);
            btnHexC.setLayoutY(412.5+87.5+25+87.5+40+87.5+58.33);
            btnHexC.setMaxSize(43.75, 58.33);
            btnHexC.setMinSize(43.75, 58.33);
            btnHexC.setId("grayButtonsSmallest");
            
            
            //Heksadekadski "D" gumb config
            btnHexD.setLayoutX(87.5+87.5+43.75*3);
            btnHexD.setLayoutY(412.5+87.5+25+87.5+40+87.5+58.33);
            btnHexD.setMaxSize(43.75, 58.33);
            btnHexD.setMinSize(43.75, 58.33);
            btnHexD.setId("grayButtonsSmallest");
            
            
            //Heksadekadski "E" gumb config
            btnHexE.setLayoutX(87.5+87.5+43.75*2);
            btnHexE.setLayoutY(412.5+87.5+25+87.5+40+87.5+58.33*2);
            btnHexE.setMaxSize(43.75, 58.33);
            btnHexE.setMinSize(43.75, 58.33);
            btnHexE.setId("grayButtonsSmallest");

            
            //Heksadekadski "F" gumb config
            btnHexF.setLayoutX(87.5+87.5+43.75*3);
            btnHexF.setLayoutY(412.5+87.5+25+87.5+40+87.5+58.33*2);
            btnHexF.setMaxSize(43.75, 58.33);
            btnHexF.setMinSize(43.75, 58.33);
            btnHexF.setId("grayButtonsSmallest");
            
            
            
            //btn SIN
            btnSin.setLayoutX(87.5+87.5+43.75*2);
            btnSin.setLayoutY(412.5+87.5+25+87.5+40+87.5);
            btnSin.setMaxSize(87.5, 58.33);
            btnSin.setMinSize(87.5, 58.33);
            btnSin.setId("grayButtonsSmallest");
            
            //btn COS
            btnCos.setLayoutX(87.5+87.5+43.75*2);
            btnCos.setLayoutY(412.5+87.5+25+87.5+40+87.5+58.33);
            btnCos.setMaxSize(87.5, 58.33);
            btnCos.setMinSize(87.5, 58.33);
            btnCos.setId("grayButtonsSmallest");
            
            //btn TAN
            btnTan.setLayoutX(87.5+87.5+43.75*2);
            btnTan.setLayoutY(412.5+87.5+25+87.5+40+87.5+58.33*2);
            btnTan.setMaxSize(87.5, 58.33);
            btnTan.setMinSize(87.5, 58.33);
            btnTan.setId("grayButtonsSmallest");
            
            
            //btn SIN-1
            btnSin1.setLayoutX(87.5+87.5+43.75*2);
            btnSin1.setLayoutY(412.5+87.5+25+87.5+40+87.5);
            btnSin1.setMaxSize(87.5, 58.33);
            btnSin1.setMinSize(87.5, 58.33);
            btnSin1.setId("grayButtonsSmallest");
            
            //btn COS-1
            btnCos1.setLayoutX(87.5+87.5+43.75*2);
            btnCos1.setLayoutY(412.5+87.5+25+87.5+40+87.5+58.33);
            btnCos1.setMaxSize(87.5, 58.33);
            btnCos1.setMinSize(87.5, 58.33);
            btnCos1.setId("grayButtonsSmallest");
            
            //btn TAN-1
            btnTan1.setLayoutX(87.5+87.5+43.75*2);
            btnTan1.setLayoutY(412.5+87.5+25+87.5+40+87.5+58.33*2);
            btnTan1.setMaxSize(87.5, 58.33);
            btnTan1.setMinSize(87.5, 58.33);
            btnTan1.setId("grayButtonsSmallest");
            
            //btn sincostan indicator
            btnSinCosTanIndicator.setLayoutX(87.5+87.5+43.75*2);
            btnSinCosTanIndicator.setLayoutY(412.5+87.5+25+87.5+40+87.5);
            btnSinCosTanIndicator.setMaxSize(15, 15);
            btnSinCosTanIndicator.setMinSize(15, 15);
            btnSinCosTanIndicator.setId("Indicator");
            
            //btn sincostan indicator
            btnDegreesToRadians.setLayoutX(87.5+87.5+43.75*2+87.5-20);
            btnDegreesToRadians.setLayoutY(412.5+87.5+25+87.5+40+87.5);
            btnDegreesToRadians.setMaxSize(20, 20);
            btnDegreesToRadians.setMinSize(20, 20);
            btnDegreesToRadians.setId("IndicatorRad");

                
                
            
            JavaFXApplication1.root.getChildren().removeAll(btnPotencija, btnPi, btnDek, btnHex, btnOct, btnBin, btnDekIndicator, btnHexIndicator, btnOctIndicator, btnBinIndicator,btnCos,btnSin,btnTan,btnSinCosTanIndicator, btnDegreesToRadians);
            JavaFXApplication1.root.getChildren().addAll(btnPotencija, btnPi, btnDek, btnHex, btnOct, btnBin, btnDekIndicator, btnHexIndicator, btnOctIndicator, btnBinIndicator,btnCos,btnSin,btnTan,btnSinCosTanIndicator, btnDegreesToRadians);
            
            /* 
            
            -------------------------------------------------------------------------------------------------------
            OVJDE IDE OD WINDOWED DO FULLSCREENA
            -------------------------------------------------------------------------------------------------------
            
            */
 
            
        }else if (JavaFXApplication1.windowX>1300 && JavaFXApplication1.windowY>700){
            //kad je fullscreen
            //replaceALL 
            //btn left zagrada
            System.out.println("1");
            
            double windowXC = JavaFXApplication1.windowX;
            double windowYC = JavaFXApplication1.windowY;
            
            razmakX = 0;
            
            if(windowXC > 1300 && windowXC < 1900) razmakX = 0;
            else if (windowXC > 1900 && windowXC < 2000) razmakX = 250;
            else if (windowXC >= 2000 && windowXC < 3800) razmakX = 900;
            else if (windowXC >= 3800) razmakX = 1100;
            
            
            
            btnlft.setLayoutX(1110+100-100+razmakX);
            btnlft.setLayoutY(135+135-100);
            btnlft.setMaxSize(135, 135);
            btnlft.setMinSize(135, 135);
            btnlft.setId("grayButtonsFullscreen");
            
            //desna zagrada
            btnright.setLayoutX(1110+135+100-100+razmakX);
            btnright.setLayoutY(135+135-100);
            btnright.setMaxSize(135, 135);
            btnright.setMinSize(135, 135);
            btnright.setId("grayButtonsFullscreen");
            //kvadrat gumb config
            btnkvadrat.setLayoutX(1110+135*2+100-100+razmakX);
            btnkvadrat.setLayoutY(135+135-100);
            btnkvadrat.setMaxSize(135, 135);
            btnkvadrat.setMinSize(135, 135);
            btnkvadrat.setId("grayButtonsFullscreen");
            //korijen button config
            btnkorijen.setLayoutX(1110+135*3+100-100+razmakX);
            btnkorijen.setLayoutY(135+135-100);
            btnkorijen.setMaxSize(135, 135);
            btnkorijen.setMinSize(135, 135);
            btnkorijen.setId("grayButtonsFullscreen");






            //Clear zadnji red (CE) gumb config
            btnCe.setLayoutX(1110+100-100+razmakX);
            btnCe.setLayoutY(135*2+135-100);
            btnCe.setMaxSize(135, 135);
            btnCe.setMinSize(135, 135);
            btnCe.setId("grayButtonsSmallFullscreen");
            //Clear ALL gumb config
            btnClr.setLayoutX(1110+135+100-100+razmakX);
            btnClr.setLayoutY(135*2+135-100);
            btnClr.setMaxSize(135, 135);
            btnClr.setMinSize(135, 135);
            btnClr.setId("grayButtonsSmallFullscreen");
            //delete zadnji unos gumb config
            btnClrLast.setLayoutX(1110+135*2+100-100+razmakX);
            btnClrLast.setLayoutY(135*2+135-100);
            btnClrLast.setMaxSize(135, 135);
            btnClrLast.setMinSize(135, 135);
            btnClrLast.setId("grayButtonsSmallFullscreen");
            //divide button config
            btndiv.setLayoutX(1110+135*3+100-100+razmakX);
            btndiv.setLayoutY(135*2+135-100);
            btndiv.setMaxSize(135, 135);
            btndiv.setMinSize(135, 135);
            btndiv.setId("grayButtonsFullscreen");



            //7 gumb config
            btn7.setLayoutX(1110+100-100+razmakX);
            btn7.setLayoutY(135*3+135-100);
            btn7.setMaxSize(135, 135);
            btn7.setMinSize(135, 135);
            btn7.setId("blackButtonsFullscreen");
            //8 gumb config
            btn8.setLayoutX(1110+135+100-100+razmakX);
            btn8.setLayoutY(135*3+135-100);
            btn8.setMaxSize(135, 135);
            btn8.setMinSize(135, 135);
            btn8.setId("blackButtonsFullscreen");
            //9 gumb config
            btn9.setLayoutX(1110+135*2+100-100+razmakX);
            btn9.setLayoutY(135*3+135-100);
            btn9.setMaxSize(135, 135);
            btn9.setMinSize(135, 135);
            btn9.setId("blackButtonsFullscreen");
            //multiply button config
            btnmult.setLayoutX(1110+135*3+100-100+razmakX);
            btnmult.setLayoutY(135*3+135-100);
            btnmult.setMaxSize(135, 135);
            btnmult.setMinSize(135, 135);
            btnmult.setId("grayButtonsFullscreen");

            //4 gumb config
            btn4.setLayoutX(1110+100-100+razmakX);
            btn4.setLayoutY(135*4+135-100);
            btn4.setMaxSize(135, 135);
            btn4.setMinSize(135, 135);
            btn4.setId("blackButtonsFullscreen");
            //5 gumb config
            btn5.setLayoutX(1110+135+100-100+razmakX);
            btn5.setLayoutY(135*4+135-100);
            btn5.setMaxSize(135, 135);
            btn5.setMinSize(135, 135);
            btn5.setId("blackButtonsFullscreen");
            //6 gumb config
            btn6.setLayoutX(1110+135*2+100-100+razmakX);
            btn6.setLayoutY(135*4+135-100);
            btn6.setMaxSize(135, 135);
            btn6.setMinSize(135, 135);
            btn6.setId("blackButtonsFullscreen");
            //minus button config
            btnminus.setLayoutX(1110+135*3+100-100+razmakX);
            btnminus.setLayoutY(135*4+135-100);
            btnminus.setMaxSize(135, 135);
            btnminus.setMinSize(135, 135);
            btnminus.setId("grayButtonsFullscreen");

            //1 gumb config
            btn1.setLayoutX(1110+100-100+razmakX);
            btn1.setLayoutY(135*5+135-100);
            btn1.setMaxSize(135, 135);
            btn1.setMinSize(135, 135);
            btn1.setId("blackButtonsFullscreen");
            //2 gumb config
            btn2.setLayoutX(1110+135+100-100+razmakX);
            btn2.setLayoutY(135*5+135-100);
            btn2.setMaxSize(135, 135);
            btn2.setMinSize(135, 135);
            btn2.setId("blackButtonsFullscreen");
            //3 gumb config
            btn3.setLayoutX(1110+135*2+100-100+razmakX);
            btn3.setLayoutY(135*5+135-100);
            btn3.setMaxSize(135, 135);
            btn3.setMinSize(135, 135);
            btn3.setId("blackButtonsFullscreen");
            //add button config
            btnadd.setLayoutX(1110+135*3+100-100+razmakX);
            btnadd.setLayoutY(135*5+135-100);
            btnadd.setMaxSize(135, 135);
            btnadd.setMinSize(135, 135);
            btnadd.setId("grayButtonsFullscreen");


            //plus / minus gumb config
            btnPlMn.setLayoutX(1110+100-100+razmakX);
            btnPlMn.setLayoutY(135*6+135-100);
            btnPlMn.setMaxSize(135, 135);
            btnPlMn.setMinSize(135, 135);
            btnPlMn.setId("grayButtonsFullscreen");
            //0 gumb config
            btn0.setLayoutX(1110+135+100-100+razmakX);
            btn0.setLayoutY(135*6+135-100);
            btn0.setMaxSize(135, 135);
            btn0.setMinSize(135, 135);
            btn0.setId("blackButtonsFullscreen");
            //dot gumb config
            btndot.setLayoutX(1110+135*2+100-100+razmakX);
            btndot.setLayoutY(135*6+135-100);
            btndot.setMaxSize(135, 135);
            btndot.setMinSize(135, 135);
            btndot.setId("grayButtonsFullscreen");
            //equ button config
            btnequ.setLayoutX(1110+135*3+100-100+razmakX);
            btnequ.setLayoutY(135*6+135-100);
            btnequ.setMaxSize(135, 135);
            btnequ.setMinSize(135, 135);
            btnequ.setId("grayButtonsFullscreen");
           
            
            
            //potencije custom gumb config
            btnPotencija.setLayoutX(1110+100-135-100+razmakX);
            btnPotencija.setLayoutY(135*6+135-100);
            btnPotencija.setMaxSize(135, 135);
            btnPotencija.setMinSize(135, 135);
            btnPotencija.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnPotencija);
            
            //Pi  gumb config
            btnPi.setLayoutX(1110+100-135-100+razmakX);
            btnPi.setLayoutY(135*6+135-100-135);
            btnPi.setMaxSize(135, 135);
            btnPi.setMinSize(135, 135);
            btnPi.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnPi);
            
            
            //DEKADSKI gumb config
            btnDek.setLayoutX(1110+100-135-135-100+razmakX);
            btnDek.setLayoutY(135*6+135-100);
            btnDek.setMaxSize(135, 135);
            btnDek.setMinSize(135, 135);
            btnDek.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnDek);
            
            //HEXADEKADSKI  gumb config
            btnHex.setLayoutX(1110+100-135-135-100+razmakX);
            btnHex.setLayoutY(135*6+135-100-135);
            btnHex.setMaxSize(135, 135);
            btnHex.setMinSize(135, 135);
            btnHex.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnHex);
            
            
            
            //OCTALNI gumb config
            btnOct.setLayoutX(1110+100-135-135-135-100+razmakX);
            btnOct.setLayoutY(135*6+135-100);
            btnOct.setMaxSize(135, 135);
            btnOct.setMinSize(135, 135);
            btnOct.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnOct);
            
            //BINARNI  gumb config
            btnBin.setLayoutX(1110+100-135-135-135-100+razmakX);
            btnBin.setLayoutY(135*6+135-100-135);
            btnBin.setMaxSize(135, 135);
            btnBin.setMinSize(135, 135);
            btnBin.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnBin);
            
            
            //DEKADSKI INDICATOR gumb config
            btnDekIndicator.setLayoutX(1110+100-135-135-100+razmakX);
            btnDekIndicator.setLayoutY(135*6+135-100);
            btnDekIndicator.setMaxSize(20, 20);
            btnDekIndicator.setMinSize(20, 20);
            btnDekIndicator.setId("Indicator");
            JavaFXApplication1.root.getChildren().add(btnDekIndicator);
            
            //HEXADEKADSKI INDICATOR gumb config
            btnHexIndicator.setLayoutX(1110+100-135-135-100+razmakX);
            btnHexIndicator.setLayoutY(135*6+135-100-135);
            btnHexIndicator.setMaxSize(20, 20);
            btnHexIndicator.setMinSize(20, 20);
            btnHexIndicator.setId("Indicator");
            JavaFXApplication1.root.getChildren().add(btnHexIndicator);
            
            
            
            //OCTALNI  INDICATOR gumb config
            btnOctIndicator.setLayoutX(1110+100-135-135-135-100+razmakX);
            btnOctIndicator.setLayoutY(135*6+135-100);
            btnOctIndicator.setMaxSize(20, 20);
            btnOctIndicator.setMinSize(20, 20);
            btnOctIndicator.setId("Indicator");
            JavaFXApplication1.root.getChildren().add(btnOctIndicator);
            
            //BINARNI   INDICATOR gumb config
            btnBinIndicator.setLayoutX(1110+100-135-135-135-100+razmakX);
            btnBinIndicator.setLayoutY(135*6+135-100-135);
            btnBinIndicator.setMaxSize(20, 20);
            btnBinIndicator.setMinSize(20, 20);
            btnBinIndicator.setId("Indicator");
            JavaFXApplication1.root.getChildren().add(btnBinIndicator);
            
            
            
            
            
            
            
            
            
            
            
            
            
            //Heksadekadski "A" gumb config
            btnHexA.setLayoutX(1110+100-135-135-135-100+razmakX);
            btnHexA.setLayoutY(135*6+135-100-135-67.5);
            btnHexA.setMaxSize(67.5, 67.5);
            btnHexA.setMinSize(67.5, 67.5);
            btnHexA.setId("grayButtonsSmall");
            
            //Heksadekadski "B" gumb config
            btnHexB.setLayoutX(1110+100-135-135+67.5-135-100+razmakX);
            btnHexB.setLayoutY(135*6+135-100-135-67.5);
            btnHexB.setMaxSize(67.5, 67.5);
            btnHexB.setMinSize(67.5, 67.5);
            btnHexB.setId("grayButtonsSmall");
            
            //Heksadekadski "C" gumb config
            btnHexC.setLayoutX(1110+100-135-135+67.5+67.5-135-100+razmakX);
            btnHexC.setLayoutY(135*6+135-100-135-67.5);
            btnHexC.setMaxSize(67.5, 67.5);
            btnHexC.setMinSize(67.5, 67.5);
            btnHexC.setId("grayButtonsSmall");
            
            
            //Heksadekadski "D" gumb config
            btnHexD.setLayoutX(1110+100-135-135+67.5+67.5+67.5-135-100+razmakX);
            btnHexD.setLayoutY(135*6+135-100-135-67.5);
            btnHexD.setMaxSize(67.5, 67.5);
            btnHexD.setMinSize(67.5, 67.5);
            btnHexD.setId("grayButtonsSmall");
            
            
            //Heksadekadski "E" gumb config
            btnHexE.setLayoutX(1110+100-135-135+67.5+67.5+67.5+67.5-135-100+razmakX);
            btnHexE.setLayoutY(135*6+135-100-135-67.5);
            btnHexE.setMaxSize(67.5, 67.5);
            btnHexE.setMinSize(67.5, 67.5);
            btnHexE.setId("grayButtonsSmall");

            
            //Heksadekadski "F" gumb config
            btnHexF.setLayoutX(1110+100-135-135+67.5+67.5+67.5+67.5+67.5-135-100+razmakX);
            btnHexF.setLayoutY(135*6+135-100-135-67.5);
            btnHexF.setMaxSize(67.5, 67.5);
            btnHexF.setMinSize(67.5, 67.5);
            btnHexF.setId("grayButtonsSmall");
            
            
            
            
            //btn SIN
            btnSin.setLayoutX(1110+100-135-135-135-135-135-100+razmakX);
            btnSin.setLayoutY(135*6+135-100-135);
            btnSin.setMaxSize(135, 135);
            btnSin.setMinSize(135, 135);
            btnSin.setId("grayButtonsSmallFullscreen");
            
            //btn COS
            btnCos.setLayoutX(1110+100-135-135-135-135-100+razmakX);
            btnCos.setLayoutY(135*6+135-100-135);
            btnCos.setMaxSize(135, 135);
            btnCos.setMinSize(135, 135);
            btnCos.setId("grayButtonsSmallFullscreen");
            
            //btn TAN
            btnTan.setLayoutX(1110+100-135-135-135-135-100+razmakX);
            btnTan.setLayoutY(135*6+135-100-135+135);
            btnTan.setMaxSize(135, 135);
            btnTan.setMinSize(135, 135);
            btnTan.setId("grayButtonsSmallFullscreen");
            
            
            //btn SIN-1
            btnSin1.setLayoutX(1110+100-135-135-135-135-135-100+razmakX);
            btnSin1.setLayoutY(135*6+135-100-135);
            btnSin1.setMaxSize(135, 135);
            btnSin1.setMinSize(135, 135);
            btnSin1.setId("grayButtonsSmallFullscreen");
            
            //btn COS-1
            btnCos1.setLayoutX(1110+100-135-135-135-135-100+razmakX);
            btnCos1.setLayoutY(135*6+135-100-135);
            btnCos1.setMaxSize(135, 135);
            btnCos1.setMinSize(135, 135);
            btnCos1.setId("grayButtonsSmallFullscreen");
            
            //btn TAN-1
            btnTan1.setLayoutX(1110+100-135-135-135-135-100+razmakX);
            btnTan1.setLayoutY(135*6+135-100-135+135);
            btnTan1.setMaxSize(135, 135);
            btnTan1.setMinSize(135, 135);
            btnTan1.setId("grayButtonsSmallFullscreen");
            
            //btn sincostan indicator
            btnSinCosTanIndicator.setLayoutX(1110+100-135-135-135-135-135-100+razmakX);
            btnSinCosTanIndicator.setLayoutY(135*6+135-100-135);
            btnSinCosTanIndicator.setMaxSize(20, 20);
            btnSinCosTanIndicator.setMinSize(20, 20);
            btnSinCosTanIndicator.setId("Indicator");
            
            //btn btnDegreesToRadians
            btnDegreesToRadians.setLayoutX(1110+100-135-135-135-135-135-100+razmakX+135-20);
            btnDegreesToRadians.setLayoutY(135*6+135-100-135);
            btnDegreesToRadians.setMaxSize(20, 20);
            btnDegreesToRadians.setMinSize(20, 20);
            btnDegreesToRadians.setId("IndicatorRad");
            
            
            
        }else if (JavaFXApplication1.windowX<1300){
            //kad je fullscreen
            //replaceALL 
            //btn left zagrada
            double windowXC = JavaFXApplication1.windowX;
            double windowYC = JavaFXApplication1.windowY;
            
            razmakX = 0;
            
            if(windowXC > 1100) razmakX = 400;
            else if (windowXC > 900) razmakX = 400;
            else if (windowXC > 600) razmakX = 500;
            else if (windowXC > 200) razmakX = 600;
            else if (windowXC > 0) razmakX = 700;
            
            
            System.out.println("1");
            
            
            btnlft.setLayoutX(1110+100-100-razmakX);
            btnlft.setLayoutY(135+135-100);
            btnlft.setMaxSize(135, 135);
            btnlft.setMinSize(135, 135);
            btnlft.setId("grayButtonsFullscreen");
            
            //desna zagrada
            btnright.setLayoutX(1110+135+100-100-razmakX);
            btnright.setLayoutY(135+135-100);
            btnright.setMaxSize(135, 135);
            btnright.setMinSize(135, 135);
            btnright.setId("grayButtonsFullscreen");
            //kvadrat gumb config
            btnkvadrat.setLayoutX(1110+135*2+100-100-razmakX);
            btnkvadrat.setLayoutY(135+135-100);
            btnkvadrat.setMaxSize(135, 135);
            btnkvadrat.setMinSize(135, 135);
            btnkvadrat.setId("grayButtonsFullscreen");
            //korijen button config
            btnkorijen.setLayoutX(1110+135*3+100-100-razmakX);
            btnkorijen.setLayoutY(135+135-100);
            btnkorijen.setMaxSize(135, 135);
            btnkorijen.setMinSize(135, 135);
            btnkorijen.setId("grayButtonsFullscreen");






            //Clear zadnji red (CE) gumb config
            btnCe.setLayoutX(1110+100-100-razmakX);
            btnCe.setLayoutY(135*2+135-100);
            btnCe.setMaxSize(135, 135);
            btnCe.setMinSize(135, 135);
            btnCe.setId("grayButtonsSmallFullscreen");
            //Clear ALL gumb config
            btnClr.setLayoutX(1110+135+100-100-razmakX);
            btnClr.setLayoutY(135*2+135-100);
            btnClr.setMaxSize(135, 135);
            btnClr.setMinSize(135, 135);
            btnClr.setId("grayButtonsSmallFullscreen");
            //delete zadnji unos gumb config
            btnClrLast.setLayoutX(1110+135*2+100-100-razmakX);
            btnClrLast.setLayoutY(135*2+135-100);
            btnClrLast.setMaxSize(135, 135);
            btnClrLast.setMinSize(135, 135);
            btnClrLast.setId("grayButtonsSmallFullscreen");
            //divide button config
            btndiv.setLayoutX(1110+135*3+100-100-razmakX);
            btndiv.setLayoutY(135*2+135-100);
            btndiv.setMaxSize(135, 135);
            btndiv.setMinSize(135, 135);
            btndiv.setId("grayButtonsFullscreen");



            //7 gumb config
            btn7.setLayoutX(1110+100-100-razmakX);
            btn7.setLayoutY(135*3+135-100);
            btn7.setMaxSize(135, 135);
            btn7.setMinSize(135, 135);
            btn7.setId("blackButtonsFullscreen");
            //8 gumb config
            btn8.setLayoutX(1110+135+100-100-razmakX);
            btn8.setLayoutY(135*3+135-100);
            btn8.setMaxSize(135, 135);
            btn8.setMinSize(135, 135);
            btn8.setId("blackButtonsFullscreen");
            //9 gumb config
            btn9.setLayoutX(1110+135*2+100-100-razmakX);
            btn9.setLayoutY(135*3+135-100);
            btn9.setMaxSize(135, 135);
            btn9.setMinSize(135, 135);
            btn9.setId("blackButtonsFullscreen");
            //multiply button config
            btnmult.setLayoutX(1110+135*3+100-100-razmakX);
            btnmult.setLayoutY(135*3+135-100);
            btnmult.setMaxSize(135, 135);
            btnmult.setMinSize(135, 135);
            btnmult.setId("grayButtonsFullscreen");

            //4 gumb config
            btn4.setLayoutX(1110+100-100-razmakX);
            btn4.setLayoutY(135*4+135-100);
            btn4.setMaxSize(135, 135);
            btn4.setMinSize(135, 135);
            btn4.setId("blackButtonsFullscreen");
            //5 gumb config
            btn5.setLayoutX(1110+135+100-100-razmakX);
            btn5.setLayoutY(135*4+135-100);
            btn5.setMaxSize(135, 135);
            btn5.setMinSize(135, 135);
            btn5.setId("blackButtonsFullscreen");
            //6 gumb config
            btn6.setLayoutX(1110+135*2+100-100-razmakX);
            btn6.setLayoutY(135*4+135-100);
            btn6.setMaxSize(135, 135);
            btn6.setMinSize(135, 135);
            btn6.setId("blackButtonsFullscreen");
            //minus button config
            btnminus.setLayoutX(1110+135*3+100-100-razmakX);
            btnminus.setLayoutY(135*4+135-100);
            btnminus.setMaxSize(135, 135);
            btnminus.setMinSize(135, 135);
            btnminus.setId("grayButtonsFullscreen");

            //1 gumb config
            btn1.setLayoutX(1110+100-100-razmakX);
            btn1.setLayoutY(135*5+135-100);
            btn1.setMaxSize(135, 135);
            btn1.setMinSize(135, 135);
            btn1.setId("blackButtonsFullscreen");
            //2 gumb config
            btn2.setLayoutX(1110+135+100-100-razmakX);
            btn2.setLayoutY(135*5+135-100);
            btn2.setMaxSize(135, 135);
            btn2.setMinSize(135, 135);
            btn2.setId("blackButtonsFullscreen");
            //3 gumb config
            btn3.setLayoutX(1110+135*2+100-100-razmakX);
            btn3.setLayoutY(135*5+135-100);
            btn3.setMaxSize(135, 135);
            btn3.setMinSize(135, 135);
            btn3.setId("blackButtonsFullscreen");
            //add button config
            btnadd.setLayoutX(1110+135*3+100-100-razmakX);
            btnadd.setLayoutY(135*5+135-100);
            btnadd.setMaxSize(135, 135);
            btnadd.setMinSize(135, 135);
            btnadd.setId("grayButtonsFullscreen");


            //plus / minus gumb config
            btnPlMn.setLayoutX(1110+100-100-razmakX);
            btnPlMn.setLayoutY(135*6+135-100);
            btnPlMn.setMaxSize(135, 135);
            btnPlMn.setMinSize(135, 135);
            btnPlMn.setId("grayButtonsFullscreen");
            //0 gumb config
            btn0.setLayoutX(1110+135+100-100-razmakX);
            btn0.setLayoutY(135*6+135-100);
            btn0.setMaxSize(135, 135);
            btn0.setMinSize(135, 135);
            btn0.setId("blackButtonsFullscreen");
            //dot gumb config
            btndot.setLayoutX(1110+135*2+100-100-razmakX);
            btndot.setLayoutY(135*6+135-100);
            btndot.setMaxSize(135, 135);
            btndot.setMinSize(135, 135);
            btndot.setId("grayButtonsFullscreen");
            //equ button config
            btnequ.setLayoutX(1110+135*3+100-100-razmakX);
            btnequ.setLayoutY(135*6+135-100);
            btnequ.setMaxSize(135, 135);
            btnequ.setMinSize(135, 135);
            btnequ.setId("grayButtonsFullscreen");
           
            
            
            //potencije custom gumb config
            btnPotencija.setLayoutX(1110+100-135-100-razmakX);
            btnPotencija.setLayoutY(135*6+135-100);
            btnPotencija.setMaxSize(135, 135);
            btnPotencija.setMinSize(135, 135);
            btnPotencija.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnPotencija);
            
            //Pi  gumb config
            btnPi.setLayoutX(1110+100-135-100-razmakX);
            btnPi.setLayoutY(135*6+135-100-135);
            btnPi.setMaxSize(135, 135);
            btnPi.setMinSize(135, 135);
            btnPi.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnPi);
            
            
            //DEKADSKI gumb config
            btnDek.setLayoutX(1110+100-135-135-100-razmakX);
            btnDek.setLayoutY(135*6+135-100);
            btnDek.setMaxSize(135, 135);
            btnDek.setMinSize(135, 135);
            btnDek.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnDek);
            
            //HEXADEKADSKI  gumb config
            btnHex.setLayoutX(1110+100-135-135-100-razmakX);
            btnHex.setLayoutY(135*6+135-100-135);
            btnHex.setMaxSize(135, 135);
            btnHex.setMinSize(135, 135);
            btnHex.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnHex);
            
            
            
            //OCTALNI gumb config
            btnOct.setLayoutX(1110+100-135-135-135-100-razmakX);
            btnOct.setLayoutY(135*6+135-100);
            btnOct.setMaxSize(135, 135);
            btnOct.setMinSize(135, 135);
            btnOct.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnOct);
            
            //BINARNI  gumb config
            btnBin.setLayoutX(1110+100-135-135-135-100-razmakX);
            btnBin.setLayoutY(135*6+135-100-135);
            btnBin.setMaxSize(135, 135);
            btnBin.setMinSize(135, 135);
            btnBin.setId("grayButtonsSmallFullscreen");
            JavaFXApplication1.root.getChildren().add(btnBin);
            
            
            //DEKADSKI INDICATOR gumb config
            btnDekIndicator.setLayoutX(1110+100-135-135-100-razmakX);
            btnDekIndicator.setLayoutY(135*6+135-100);
            btnDekIndicator.setMaxSize(20, 20);
            btnDekIndicator.setMinSize(20, 20);
            btnDekIndicator.setId("Indicator");
            JavaFXApplication1.root.getChildren().add(btnDekIndicator);
            
            //HEXADEKADSKI INDICATOR gumb config
            btnHexIndicator.setLayoutX(1110+100-135-135-100-razmakX);
            btnHexIndicator.setLayoutY(135*6+135-100-135);
            btnHexIndicator.setMaxSize(20, 20);
            btnHexIndicator.setMinSize(20, 20);
            btnHexIndicator.setId("Indicator");
            JavaFXApplication1.root.getChildren().add(btnHexIndicator);
            
            
            
            //OCTALNI  INDICATOR gumb config
            btnOctIndicator.setLayoutX(1110+100-135-135-135-100-razmakX);
            btnOctIndicator.setLayoutY(135*6+135-100);
            btnOctIndicator.setMaxSize(20, 20);
            btnOctIndicator.setMinSize(20, 20);
            btnOctIndicator.setId("Indicator");
            JavaFXApplication1.root.getChildren().add(btnOctIndicator);
            
            //BINARNI   INDICATOR gumb config
            btnBinIndicator.setLayoutX(1110+100-135-135-135-100-razmakX);
            btnBinIndicator.setLayoutY(135*6+135-100-135);
            btnBinIndicator.setMaxSize(20, 20);
            btnBinIndicator.setMinSize(20, 20);
            btnBinIndicator.setId("Indicator");
            JavaFXApplication1.root.getChildren().add(btnBinIndicator);
            
            
            
            
            
            
            
            
            
            
            
            
            
            //Heksadekadski "A" gumb config
            btnHexA.setLayoutX(1110+100-135-135-135-100-razmakX);
            btnHexA.setLayoutY(135*6+135-100-135-67.5);
            btnHexA.setMaxSize(67.5, 67.5);
            btnHexA.setMinSize(67.5, 67.5);
            btnHexA.setId("grayButtonsSmall");
            
            //Heksadekadski "B" gumb config
            btnHexB.setLayoutX(1110+100-135-135+67.5-135-100-razmakX);
            btnHexB.setLayoutY(135*6+135-100-135-67.5);
            btnHexB.setMaxSize(67.5, 67.5);
            btnHexB.setMinSize(67.5, 67.5);
            btnHexB.setId("grayButtonsSmall");
            
            //Heksadekadski "C" gumb config
            btnHexC.setLayoutX(1110+100-135-135+67.5+67.5-135-100-razmakX);
            btnHexC.setLayoutY(135*6+135-100-135-67.5);
            btnHexC.setMaxSize(67.5, 67.5);
            btnHexC.setMinSize(67.5, 67.5);
            btnHexC.setId("grayButtonsSmall");
            
            
            //Heksadekadski "D" gumb config
            btnHexD.setLayoutX(1110+100-135-135+67.5+67.5+67.5-135-100-razmakX);
            btnHexD.setLayoutY(135*6+135-100-135-67.5);
            btnHexD.setMaxSize(67.5, 67.5);
            btnHexD.setMinSize(67.5, 67.5);
            btnHexD.setId("grayButtonsSmall");
            
            
            //Heksadekadski "E" gumb config
            btnHexE.setLayoutX(1110+100-135-135+67.5+67.5+67.5+67.5-135-100-razmakX);
            btnHexE.setLayoutY(135*6+135-100-135-67.5);
            btnHexE.setMaxSize(67.5, 67.5);
            btnHexE.setMinSize(67.5, 67.5);
            btnHexE.setId("grayButtonsSmall");

            
            //Heksadekadski "F" gumb config
            btnHexF.setLayoutX(1110+100-135-135+67.5+67.5+67.5+67.5+67.5-135-100-razmakX);
            btnHexF.setLayoutY(135*6+135-100-135-67.5);
            btnHexF.setMaxSize(67.5, 67.5);
            btnHexF.setMinSize(67.5, 67.5);
            btnHexF.setId("grayButtonsSmall");
            
            
            
            
            //btn SIN
            btnSin.setLayoutX(1110+100-135-135-135-135-135-100-razmakX);
            btnSin.setLayoutY(135*6+135-100-135);
            btnSin.setMaxSize(135, 135);
            btnSin.setMinSize(135, 135);
            btnSin.setId("grayButtonsSmallFullscreen");
            
            //btn COS
            btnCos.setLayoutX(1110+100-135-135-135-135-100-razmakX);
            btnCos.setLayoutY(135*6+135-100-135);
            btnCos.setMaxSize(135, 135);
            btnCos.setMinSize(135, 135);
            btnCos.setId("grayButtonsSmallFullscreen");
            
            //btn TAN
            btnTan.setLayoutX(1110+100-135-135-135-135-100-razmakX);
            btnTan.setLayoutY(135*6+135-100-135+135);
            btnTan.setMaxSize(135, 135);
            btnTan.setMinSize(135, 135);
            btnTan.setId("grayButtonsSmallFullscreen");
            
            
            //btn SIN-1
            btnSin1.setLayoutX(1110+100-135-135-135-135-135-100-razmakX);
            btnSin1.setLayoutY(135*6+135-100-135);
            btnSin1.setMaxSize(135, 135);
            btnSin1.setMinSize(135, 135);
            btnSin1.setId("grayButtonsSmallFullscreen");
            
            //btn COS-1
            btnCos1.setLayoutX(1110+100-135-135-135-135-100-razmakX);
            btnCos1.setLayoutY(135*6+135-100-135);
            btnCos1.setMaxSize(135, 135);
            btnCos1.setMinSize(135, 135);
            btnCos1.setId("grayButtonsSmallFullscreen");
            
            //btn TAN-1
            btnTan1.setLayoutX(1110+100-135-135-135-135-100-razmakX);
            btnTan1.setLayoutY(135*6+135-100-135+135);
            btnTan1.setMaxSize(135, 135);
            btnTan1.setMinSize(135, 135);
            btnTan1.setId("grayButtonsSmallFullscreen");
            
            //btn sincostan indicator
            btnSinCosTanIndicator.setLayoutX(1110+100-135-135-135-135-135-100-razmakX);
            btnSinCosTanIndicator.setLayoutY(135*6+135-100-135);
            btnSinCosTanIndicator.setMaxSize(20, 20);
            btnSinCosTanIndicator.setMinSize(20, 20);
            btnSinCosTanIndicator.setId("Indicator");
            
            btnDegreesToRadians.setLayoutX(1110+100-135-135-135-135-135-100-razmakX+135-20);
            btnDegreesToRadians.setLayoutY(135*6+135-100-135);
            btnDegreesToRadians.setMaxSize(20, 20);
            btnDegreesToRadians.setMinSize(20, 20);
            btnDegreesToRadians.setId("IndicatorRad");
            
            
            
        }else JavaFXApplication1.root.getChildren().removeAll(btnPotencija, btnPi, btnDek, btnHex, btnOct, btnBin, btnDekIndicator, btnHexIndicator, btnOctIndicator, btnBinIndicator,btnCos,btnSin,btnTan,btnSinCosTanIndicator,btnDegreesToRadians);
        

        
        JavaFXApplication1.root.getChildren().addAll(btn7,btn8,btn9,btndiv,btn4,btn5,btn6,btnmult,btn1,btn2,btn3,btnminus,btndot,btn0,btnequ,btnadd,btnCe,btnClr,btnClrLast,btnPlMn,btnlft,btnright,btnkvadrat,btnkorijen);
        
    }catch (Exception ex){
            System.out.println("ERROR");
    }
        
    }
    
}

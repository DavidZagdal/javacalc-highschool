/*
 * DavidZagdal
 * 
 * 
 */
package javafxapplication1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import static javafxapplication1.Buttons.backPosition;
import static javafxapplication1.Buttons.btnBin;
import static javafxapplication1.Buttons.btnBinIndicator;
import static javafxapplication1.Buttons.btnCos;
import static javafxapplication1.Buttons.btnDek;
import static javafxapplication1.Buttons.btnDekIndicator;
import static javafxapplication1.Buttons.btnHex;
import static javafxapplication1.Buttons.btnHexIndicator;
import static javafxapplication1.Buttons.btnOct;
import static javafxapplication1.Buttons.btnOctIndicator;
import static javafxapplication1.Buttons.btnPi;
import static javafxapplication1.Buttons.btnPlMn;
import static javafxapplication1.Buttons.btnPotencija;
import static javafxapplication1.Buttons.btnSin;
import static javafxapplication1.Buttons.btnSinCosTanIndicator;
import static javafxapplication1.Buttons.btnTan;
import static javafxapplication1.Buttons.btnadd;
import static javafxapplication1.Buttons.btndiv;
import static javafxapplication1.Buttons.btndot;
import static javafxapplication1.Buttons.btnkorijen;
import static javafxapplication1.Buttons.btnkvadrat;
import static javafxapplication1.Buttons.btnlft;
import static javafxapplication1.Buttons.btnminus;
import static javafxapplication1.Buttons.btnmult;
import static javafxapplication1.Buttons.btnright;
import static javafxapplication1.Buttons.potencijaIndicator;
import static javafxapplication1.Buttons.zagradaOpenOrClosedIndicator;
import static javafxapplication1.JavaFXApplication1.btnConsole;
import static javafxapplication1.JavaFXApplication1.btnConsole2;
import static javafxapplication1.JavaFXApplication1.minusIndicator;
import static javafxapplication1.JavaFXApplication1.root;
import static javafxapplication1.JavaFXApplication1.tockaIndicator;
import static javafxapplication1.JavaFXApplication1.tockaIndicatorZaZagradu;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 *
 * @author David
 */
public class CommonFunctions {
    public static void izvediJednako(int linija){
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        Scanner sc = new Scanner(System.in);
        if (potencijaIndicator==0 || linija == 3){
                        try{
                            if(zagradaOpenOrClosedIndicator >= 1){
                                JavaFXApplication1.btnConsole.setText(JavaFXApplication1.btnConsole.getText().substring(0,JavaFXApplication1.btnConsole.getText().length()-1));
                            }else{
                                JavaFXApplication1.resultNote = 1;
                                JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText() +JavaFXApplication1.btnConsole.getText());
                                String test = JavaFXApplication1.btnConsole2.getText();
                                
                                if(linija == 1){
                                    test = test.substring(test.length()-2,test.length()-1); //ova linija je kad se enter stisne onda se pojavi znak /r kao sljedeci red...
                                }
                                

                                if(test.endsWith("-") || test.endsWith("\n ") || test.endsWith("+") || test.endsWith("/") || test.endsWith("*") || test.endsWith(".")){

                                    String test2 = JavaFXApplication1.btnConsole2.getText();
                                    test2 = test2.trim();
                                    test2.replaceAll("^[\n\r]", "").replaceAll("[\n\r]$", "");

                                    if(test.endsWith(".")){
                                        JavaFXApplication1.btnConsole2.setText(test2.substring(0,test2.length()-1));
                                    }
                                    else {
                                        JavaFXApplication1.btnConsole2.setText(test2.substring(0,test2.length()-1));
                                    }


                                }
                            }
                        }catch(Exception ex){
                        System.out.println("ERROR: Vjv samo stavljen znak /");
                        }
                        try {
                            if(zagradaOpenOrClosedIndicator >= 1){
                                btnConsole.setText(btnConsole.getText().substring(0,btnConsole.getText().length()-1));
                                zagradaOpenOrClosedIndicator--;
                            }else{
                                String test3 = btnConsole2.getText();
                                    test3 = test3.replaceAll("0[(]", "0*(");
                                    test3 = test3.replaceAll("1[(]", "1*(");
                                    test3 = test3.replaceAll("2[(]", "2*(");
                                    test3 = test3.replaceAll("3[(]", "3*(");
                                    test3 = test3.replaceAll("4[(]", "4*(");
                                    test3 = test3.replaceAll("5[(]", "5*(");
                                    test3 = test3.replaceAll("6[(]", "6*(");
                                    test3 = test3.replaceAll("7[(]", "7*(");
                                    test3 = test3.replaceAll("8[(]", "8*(");
                                    test3 = test3.replaceAll("9[(]", "9*(");
                                    test3 = test3.replaceAll("[)][(]", ")*(");
                                    
                                    test3 = test3.replaceAll("[)]0", ")*0");
                                    test3 = test3.replaceAll("[)]1", ")*1");
                                    test3 = test3.replaceAll("[)]2", ")*2");
                                    test3 = test3.replaceAll("[)]3", ")*3");
                                    test3 = test3.replaceAll("[)]4", ")*4");
                                    test3 = test3.replaceAll("[)]5", ")*5");
                                    test3 = test3.replaceAll("[)]6", ")*6");
                                    test3 = test3.replaceAll("[)]7", ")*7");
                                    test3 = test3.replaceAll("[)]8", ")*8");
                                    test3 = test3.replaceAll("[)]9", ")*9");
                                    
                                   
                                    
                                    


                                JavaFXApplication1.btnConsole2.setText(test3);

                                Object obj = engine.eval(JavaFXApplication1.btnConsole2.getText());
                                System.out.println(obj);
                                String s = String.valueOf(obj);
                                double d = 0;
                                try{
                                    d = Double.parseDouble(s);
                                }catch (Exception e){
                                    System.out.println("Double parse double 610 linija");
                                }
                                
                                s = df.format(d);
                                s = s.replace(',', '.');

                                JavaFXApplication1.btnConsole.setText(s);
                                JavaFXApplication1.btnConsole2.setText("");
                        
                        
                            }
                    } catch (Exception ex) {
                        //Logger.getLogger(Buttons.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("ERROR: Code 3-funkcija");
                    }
                }else if(potencijaIndicator==1){
                    if(linija == 3){
                        
                    }else{
                        izvediPotenciju();
                    }
                    
                }
                Buttons.radnjeIndicator=0;
                
                if(btnConsole.getText().contains(".")){
                    tockaIndicator = 1;
                    tockaIndicatorZaZagradu = 1;
                }else{
                    tockaIndicator = 0;
                    tockaIndicatorZaZagradu = 0;
                }
                
                minusIndicator = 0;
    
    }
    
    
    public static void izvediPotenciju(){
                    
                    
                    DecimalFormat df = new DecimalFormat("#.####");
                    df.setRoundingMode(RoundingMode.CEILING);
                    JavaFXApplication1.btnConsole2.setText(JavaFXApplication1.btnConsole2.getText() +JavaFXApplication1.btnConsole.getText());
                    JavaFXApplication1.btnConsole.setText("");
                    
                    String secondNumber = JavaFXApplication1.btnConsole2.getText();
                    int razdijeli = secondNumber.indexOf("^");
                    secondNumber = secondNumber.substring(razdijeli+1,secondNumber.length());
                    System.out.println(secondNumber);
                    double drugiBroj = Double.parseDouble(secondNumber);
                    
                    double rezultat = Math.pow(Buttons.prviBroj, drugiBroj);
                    
                    String s = Double.toString(rezultat);
                    
                    double d = Double.parseDouble(s);
                    s = df.format(d);
                    s = s.replace(',', '.');
                    
                    if(backPosition.isEmpty()){
                       JavaFXApplication1.btnConsole.setText(backPosition +s);
                       JavaFXApplication1.btnConsole2.setText("");
                       
                    }else{
                        JavaFXApplication1.btnConsole2.setText(backPosition +s);
                    JavaFXApplication1.btnConsole.setText("");
                    izvediJednako(3);
                    }
                    
                    try{
                        root.getChildren().addAll(btnSin,btnCos,btnTan,btnPotencija,btnmult,btndot,btnadd,btnPlMn,btnlft,btnright,btnkvadrat,btnkorijen,btnDek,btnHex,btnBin,btnOct,btndiv,btnDekIndicator,btnHexIndicator,btnBinIndicator,btnOctIndicator,btnPi);
                        root.getChildren().add(btnSinCosTanIndicator);
                    }catch(Exception ex){
                    System.out.println("ERROR: potencija");
                    }
                   potencijaIndicator = 0;
                   
                   
                    JavaFXApplication1.root.getChildren().add(btnminus);
            
                
    }
    
}

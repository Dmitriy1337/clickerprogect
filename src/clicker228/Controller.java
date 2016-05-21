package clicker228;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Controller extends Application {
	
	@FXML Label lbl;
	@FXML Label lbl2;
	@FXML Label lbl3;
	int i;
	
	Image image = new Image("pct/dogeclicked.png");
	ImageView iv1 = new ImageView();
	int a=1;
	int b =40;
	int lvl =1;
	public void enter(ActionEvent evt){
		
		iv1.setImage(image);
		iv1.setOpacity(1.0F);
		 i=i+a;
	   
		
	lbl.setText("          "+i); 
	lbl3.setText("SWEG POINTS "+lvl);
	lbl2.setText("DogeCoin Invest.Cost-"+b);
	iv1.setOpacity(1);
	if (i > 1000){
		lvl=2;
		}
		if (i > 1000){
			lvl=lvl+1;
			lbl3.setText("SWEG LVL "+lvl);
		}
		if (i > 2000){
			lvl=lvl+1;
			lbl3.setText("SWEG LVL "+lvl);	
		}
		if (i > 5000){
			lvl=lvl+1;
			lbl3.setText("SWEG LVL "+lvl);	
		}
		if (i > 10000){
			lvl=lvl+1;
			}
		if (i > 20000){
			lvl=lvl+1;
			lbl3.setText("SWEG LVL "+lvl);	
		}
		if (i > 50000){
			lvl=lvl+1;
			lbl3.setText("SWEG LVL "+lvl);	
		}
		if (i > 100000){
			lvl=lvl+1;
			lbl3.setText("SWEG LVL "+lvl);	
		}
		if (i > 500000){
			lvl=lvl+1;
			lbl3.setText("SWEG LVL "+lvl);	
		}
		if (i > 1000000){
			lvl=lvl+1;
		
			lbl3.setText("SWEG LVL "+lvl);
		}
		if (i > 10000000){
			lvl=lvl+1;
			lbl3.setText("SWEG LVL "+lvl);	
		}
	}
	public void enter2(ActionEvent evt2){
		
		if (i > b ){
			
			i=i-b;
		b=b*2;
		a=a*2;
			lbl.setText("        "+i); 
		
		
		
		
		}
	}
public void enter3(ActionEvent evt3){
		  
		
	}
public void enter4(ActionEvent evt4){
	  
	
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
	
	}

}

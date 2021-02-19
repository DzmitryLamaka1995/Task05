package by.htp.appliance.main;

import by.htp.appliance.view.ApplianceView;
import by.htp.applianceForFood.bean.Oven;
import by.htp.applianceForFood.bean.Refrigerator;
import by.htp.applianceWithoutMains.bean.Laptop;
import by.htp.applianceWithoutMains.bean.TabletPC;
import by.htp.otherAppliance.bean.Speakers;
import by.htp.otherAppliance.bean.VacuumCleaner;

public class Main {

	public static void main(String[] args) {
		ApplianceView applianceView = new ApplianceView();
		
		Oven ov1  =  new Oven(1000,10,32,60,45.5,59.5);
		Oven ov2 = new Oven(1500,12,33,60,45,68);
		Oven ov3 = new Oven(2000,11,33,60,40,70);
		
		Laptop lt1 = new Laptop(1,"Windows",4000,1000,1.2,18);
		Laptop lt2 = new Laptop(1.5,"Linux",8000,1000,2.2,19);
		Laptop lt3 = new Laptop(3,"Windows",8000,1500,3.2,22);
		
		Refrigerator ref1 = new Refrigerator(100,20,10,300,200,70);
		Refrigerator ref2 = new Refrigerator(200,30,15,300,180,80);
		Refrigerator ref3 = new Refrigerator(150,35,20,350.5,250,75);
		
		VacuumCleaner vc1 = new VacuumCleaner(100,'A',"A2","all-in-one",3000,20);
		VacuumCleaner vc2 = new VacuumCleaner(110,'B',"AA-89","all-in-one",2900,25);
		VacuumCleaner vc3 = new VacuumCleaner(90,'C',"XXoo","all-in-one",2950,30);
		
		TabletPC tab1 = new TabletPC(3,14,8000,2,"blue");
		TabletPC tab2 = new TabletPC(4,15,8000,6,"red");
		TabletPC tab3 = new TabletPC(5,16,16000,8,"green");
		
		Speakers sp1 = new Speakers(15,2,"2-4",2);
		Speakers sp2 = new Speakers(20,3,"3-4",3);
		Speakers sp3 = new Speakers(17,4,"2-3.5",4);
		
		System.out.println("*******  Oven  *******");
        applianceView.print(ov1);
        applianceView.print(ov2);
        applianceView.print(ov3);
        
        System.out.println("*******  Laptop  *******");
        applianceView.print(lt1);
        applianceView.print(lt2);
        applianceView.print(lt3);
        
        System.out.println("*******  Refrigerator  *******");
        applianceView.print(ref1);
        applianceView.print(ref2);
        applianceView.print(ref3);
        
        System.out.println("*******  Vacuum Cleaner  *******");
        applianceView.print(vc1);
        applianceView.print(vc2);
        applianceView.print(vc3);
        
        System.out.println("*******  TabletPC  *******");
        applianceView.print(tab1);
        applianceView.print(tab2);
        applianceView.print(tab3);
        
        System.out.println("*******  Speakers  *******");
        applianceView.print(sp1);
        applianceView.print(sp2);
        applianceView.print(sp3);
	} 

}

package Patient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<PatientList> list = new ArrayList<PatientList>();
		list.add(new PatientList(1,"Ronaldo","10 Dec","15 Dec",5,"Fever",2000));
		list.add(new PatientList(2,"Messi","20 Jan","11 Dec",8,"Hamstring",20000));
		list.add(new PatientList(3,"Neymar","12 Mar","12 Dec",10,"Fracture",10000));
		list.add(new PatientList(4,"Kaka","25 Oct","25 Dec",2,"Back Injury",12000));

//		System.out.println("Sorted by Name using Comparable");
//		Collections.sort(list);
//		for(PatientList pl:list) {
//			pl.display();
//		}
		
		System.out.println("Sorted by Bill using Comparable");
		Collections.sort(list,(PatientList o1, PatientList o2)-> {
				if(o1.getBill() > o2.getBill()) {
					return -1;
				}else if(o1.getBill() < o2.getBill()) {
					return 1;
				}else {
					return 0;
				}
			}
		);
		for(PatientList pl:list) {
			pl.display();
		}
		
		System.out.println("Sorted by Disease using Comparable");
		Collections.sort(list, (PatientList o1, PatientList o2)-> {
				return o1.getDisease().compareTo(o2.getDisease());
			}
		);
//		for(PatientList pl:list) {
//			pl.display();
//		}
	}
}

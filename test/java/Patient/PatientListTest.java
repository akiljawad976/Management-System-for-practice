package Patient;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PatientListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}
//	class Areacompare implements Comparator<PatientList>{
//
//		public int compare(PatientList o1, PatientList o2) {
//			if(o1.getBill() > o2.getBill()) {
//				return -1;
//			}else if(o1.getBill() < o2.getBill()) {
//				return 1;
//			}else {
//				return 0;
//			}
//		}
//		
//	}
	
	@Test
	public void testPatientList() {
		List<PatientList> list = new ArrayList<PatientList>();
		//assertNotNull(list.add(new PatientList(1,"Ronaldo","10 Dec","15 Dec",5,"Fever",2000)));
//		PatientList pl1 = new PatientList(2,"Messi","20 Jan","11 Dec",8,"Hamstring",20000);
//		PatientList pl2 = new PatientList(1,"Ronaldo","10 Dec","15 Dec",5,"Fever",2000);
//		Areacompare ac = new Areacompare();
//		int result = ac.compare(pl1, pl2);
//		assertTrue("Expected -1", result==1);
		list.add(new PatientList(1,"Ronaldo","10 Dec","15 Dec",5,"Fever",2000));
		list.add(new PatientList(2,"Messi","20 Jan","11 Dec",8,"Hamstring",20000));
		list.add(new PatientList(3,"Neymar","12 Mar","12 Dec",10,"Fracture",10000));
		list.add(new PatientList(4,"Kaka","25 Oct","25 Dec",2,"Back Injury",12000));
		Collections.sort(list);
		
		PatientList pat =new PatientList();
//		ListIterator lt = list.listIterator();
//		ListIterator ut = pat.sortedList().listIterator();
//		while(lt.hasNext()) {
//			assertEquals(lt.next(),ut.next()); 
//		}
		assertEquals(list,pat.sortedList());
		
	}

}

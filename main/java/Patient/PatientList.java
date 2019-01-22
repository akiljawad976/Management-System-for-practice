package Patient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class PatientList implements Comparable<PatientList>{
	@NonNull
	int id;
	@NonNull
	String name;
	@NonNull
	String admitDate;
	@NonNull
	String releaseDate;
	@NonNull
	int docId;
	@NonNull
	String disease;
	@NonNull
	int bill;
	
	void display() {
		System.out.println("ID : "+getId()+"; Name : "+getName()+";\nAdmit Date : "+getAdmitDate()+"; Release Date : "+getReleaseDate()+";\nAssociated Doctor's ID : "+getDocId()+";\nDiseases : "+getDisease()+"; Bill : "+getBill());
	}

	public int compareTo(PatientList o) {
		return this.getName().compareTo(o.getName());
		//return this.getName() - o.getName();
	}
	
	public List<PatientList> sortedList() {
		List<PatientList> list = new ArrayList<PatientList>();
		list.add(new PatientList(1,"Ronaldo","10 Dec","15 Dec",5,"Fever",2000));
		list.add(new PatientList(2,"Messi","20 Jan","11 Dec",8,"Hamstring",20000));
		list.add(new PatientList(3,"Neymar","12 Mar","12 Dec",10,"Fracture",10000));
		list.add(new PatientList(4,"Kaka","25 Oct","25 Dec",2,"Back Injury",12000));

		
		Collections.sort(list);
		return list;
	}

}

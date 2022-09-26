package coreJavaLearnings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashmapJ {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("MH", "Mumbai");
		capitalMap.put("BH","Patna");
		capitalMap.put("WB","Kolkatta");
		capitalMap.put(null, "TBD");
		
		System.out.println(capitalMap);
		System.out.println(capitalMap.get("BH"));
		
		//Iterator over key
		Iterator <String>itr = capitalMap.keySet().iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			String value =capitalMap.get(key);
			System.out.println("Key: " +key +" Value: " +value);
		}
		
		//Iterator over Set
		Iterator<Entry<String,String>> itrset = capitalMap.entrySet().iterator();
	//	Iterator itrset = capitalMap.entrySet().iterator();
		
		while (itrset.hasNext()){
			Entry<String, String> entry = itrset.next();
		//	Map.Entry entry = (Map.Entry)itrset.next();
			System.out.println("key:- " +entry.getKey() +"Value:- "+entry.getValue());
			
		}
	
		//================ Map comparison ===============//
		
		HashMap<String, String> subcapMap = new HashMap<String, String>();
		subcapMap.put("MH", "Mumbai");
		subcapMap.put("BH","Patna");
		subcapMap.put("WB","Kolkatta");
			
		System.out.println(capitalMap.equals(subcapMap));
		System.out.println(capitalMap.keySet().equals(subcapMap.keySet()));
		
		// convert Map to ArrayList
		ArrayList<String> ar = new ArrayList<String>(subcapMap.keySet());
		System.out.println(ar);
	
		
		//=================
		
		Map<String,Integer> zmap= new HashMap<String,Integer>();
		 zmap.put("Bosch", 4000);
		 zmap.put("Nike", 4700);
		 zmap.put("Dorman", 1900);
		 zmap.put(" ALM", 1800);
		 
		 Map<String,Integer> nhmap= new HashMap<String,Integer>();
		 
		 // Filter map using values
		 nhmap = zmap.entrySet().stream().filter(e->e.getValue()>1800).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		 System.out.println("Filtered Map: " +nhmap);
		 
		 // Sort map using values
		 nhmap = zmap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
	                LinkedHashMap::new));;		 
		 System.out.println("SOrted Map: "+nhmap);
		 nhmap = zmap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
	                LinkedHashMap::new));;		 
		 System.out.println("SOrted Map Aplhbetically: "+nhmap);
		
	}

}

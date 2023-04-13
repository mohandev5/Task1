package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Branch {
	int marks;
	String name, branches;

	public Branch(int marks, String name, String branches) {
		super();
		this.marks = marks;
		this.name = name;
		this.branches = branches;
	}



	public static void main(String[] args) {

	//	int sum = 0, sum1 = 0, sum2 = 0;
		Map<String, Map<String, Integer>> map = new HashMap<>();

		Map<String, Integer> innerMap = new HashMap<>();
		innerMap.put("mohan", 80);
		innerMap.put("santhosh", 75);
		map.put("mechanical", innerMap);
		Map<String, Integer> innerMap1 = new HashMap<>();
		innerMap1.put("raju", 80);
		innerMap1.put("ramu", 75);
		map.put("civil", innerMap1);
		Map<String, Integer> innerMap2 = new HashMap<>();
		innerMap2.put("ramesh", 80);
		innerMap2.put("raghav", 75);
		map.put("ece", innerMap2);
//		for (String branch : map.keySet()) {
			
//	ArrayList<Branch> branches = new ArrayList<Branch>();
		
			
//			if (branch.equalsIgnoreCase("mechanical")) {
//				System.out.println("branchname :" + branch);
//				for (String mech : innerMap.keySet()) {
//					System.out.println(mech);
//				}
//				for (double z : innerMap.values()) {
//					sum2 += z;
//				}
//				System.out.println("average marks:" + sum2 / innerMap.size());
//			}
//			
//			
//			if (branch.equalsIgnoreCase("civil")) {
//				System.out.println("branchname :" + branch);
//				for (String civil : innerMap1.keySet()) {
//					System.out.println(civil);
//				}
//				for (double z : innerMap.values()) {
//					sum1 += z;
//				}
//				System.out.println("average marks:" + sum1 / innerMap1.size());
//			}
//			
//
//			if (branch.equalsIgnoreCase("ece")) {
//				System.out.println("branchname :" + branch);
//				for (String ece : innerMap2.keySet()) {
//					System.out.println(ece);
//				}
//				for (double z : innerMap2.values()) {
//					sum += z;
//				}
//				System.out.println("average marks:" + sum / innerMap2.size());
//			}
//		}
//
			for(String branch:map.keySet()) {
				int sum=0;
			   	ArrayList<String> studentslist=new ArrayList<>();
				Map<String,Integer> studentmap=map.get(branch);
				for(String students:studentmap.keySet()) {
				int marks=studentmap.get(students);
				sum+=marks;
				studentslist.add(students);
				}
				double avgmarks=sum/studentmap.size();
				System.out.println("Branch: " +branch);
				System.out.println("Average Branch Marks: " +avgmarks);
				System.out.println("Students " +studentslist);
				System.out.println();
				}
	
	}

}

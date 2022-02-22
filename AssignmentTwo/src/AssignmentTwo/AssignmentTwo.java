package AssignmentTwo;
import java.util.*;

public class AssignmentTwo {
	
	public void problem1(String[] S1) {
		Map<String,Integer> msk = new LinkedHashMap<>();
		for(int a=0;a<S1.length;a++) {
			if(msk.containsKey(S1[a])) {
				msk.put(S1[a], msk.get(S1[a])+1);
			}
			else {
				msk.put(S1[a], 1);
			}
		}
		for(Map.Entry<String, Integer> entry : msk.entrySet()) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
			//System.out.print(",");
		}
		System.out.println();
	}
	
	public Map<String,String> problem2(String[] S1) {
		Map<String,String> msk = new LinkedHashMap<>();
		for(int a=0;a<S1.length;a++) {
			String b = "" + S1[a].charAt(0);
			if(msk.containsKey(b)) {
				//System.out.println(map.get("" + arr[a].charAt(0)));
				 msk.put(b, msk.get(b).concat(S1[a]));
			}
			else {
				//String b = "" + arr[a].charAt(0);
				msk.put(b, S1[a]);
			}
		}
		/*for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}*/
		return msk;
	}
	
	public Set<Integer> problem3(int[] A1) {
		Set<Integer> M = new LinkedHashSet<>();
		for(int a=0;a<A1.length;a++) {
			if(!M.contains(A1[a])) {
				M.add(A1[a]);
			}
			else {
				for(int b=A1[a]+1;b<Integer.MAX_VALUE;b++) {
					if(!M.contains(b)) {
						A1[a]=b;
						M.add(b);
						break;
					}
				}
			}
		}
		return M;
	}
	
	public ArrayList<String> problem4(ArrayList<String> A1) {
		ArrayList<String> M2 = new ArrayList<>();
		
		for(int a=0;a<A1.size();a++) {
			String str = new String();
			for(int b=0;b<A1.get(a).length();b++) {
				char c = A1.get(a).charAt(b);
				if(str.indexOf(c) < 0) {
					str+=c;
				}
			}
			M2.add(str);
		}
		return M2;
	}
	
	public Map<String,String> problem5(ArrayList<String> A) {
		Map<String,String> M3 = new LinkedHashMap<>();
		for(int a=0;a<A.size();a++) {
			String str = "" + A.get(a).charAt(0);
			String lastInd = "" + A.get(a).charAt(A.get(a).length()-1);
			if(M3.containsKey(str)) {
				M3.put(str, lastInd);
			}
			else {
				M3.put(str, lastInd);
			}
		}
		return M3;
	}
	public Map<String,Boolean> problem6(ArrayList<String> S1) {
		Map<String,Boolean> M4 = new LinkedHashMap<>();
		for(int a=0;a<S1.size();a++) {
			int count = 1;
			String str = S1.get(a);
			if(M4.containsKey(str)) {
				count++;
				M4.put(str, true);
			}
			else {
				M4.put(str, false);
			}
		}
		return M4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ms = new Scanner(System.in);
		AssignmentTwo at = new AssignmentTwo();
		System.out.println("Enter number of elements in array: ");
		int n = ms.nextInt();
		String[] S1 = new String[n];
		for(int i=0;i<n;i++) {
			S1[i] = ms.next();
		}
		at.problem1(S1);
	
		System.out.println("Enter number of elements in array: ");
		int a = ms.nextInt();
		String[] arr = new String[a];
		for(int i=0;i<a;i++) {
			arr[i] = ms.next();
		}
		System.out.println(at.problem2(arr));
		
		System.out.println("Enter number of elements in array: ");
		int b = ms.nextInt();
		int[] A1 = new int[b];
		for(int i=0;i<b;i++) {
			A1[i] = ms.nextInt();
		}
		System.out.println(at.problem3(A1));
		
		System.out.println("Enter number of elements in arrayList: ");
		int n1 = ms.nextInt();
		ArrayList<String> Arr = new ArrayList<>();
		for(int i=0;i<n1;i++) {
			Arr.add(ms.next()); 
		}
		System.out.println(at.problem4(Arr));
		
		System.out.println("Enter number of elements in arrayList: ");
		int n2 = ms.nextInt();
		ArrayList<String> A = new ArrayList<>();
		for(int i=0;i<n2;i++) {
			A.add(ms.next()); 
		}
		System.out.println(at.problem5(A));
		
		System.out.println("Enter number of elements in arrayList: ");
		int n3 = ms.nextInt();
		ArrayList<String> al = new ArrayList<>();
		for(int i=0;i<n3;i++) {
			al.add(ms.next()); 
		}
		System.out.println(at.problem6(al));
	}

}

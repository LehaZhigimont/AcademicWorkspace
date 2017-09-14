package tree;

import java.util.Comparator;

public class TreeApplication {
	static int random(){
		return (int)(Math.random()*30);
	}

	public static void main(String[] args) {
		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		};

		ShagoSet<Integer> set = new TreeShagoSet<Integer>(comp);
		/*set.add(10);
		set.add(8);
		set.add(12);
		set.add(6);
		set.add(8);
		set.add(9);*/
		
		
		
		
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		set.add(random());
		System.out.println(set);
	}

}

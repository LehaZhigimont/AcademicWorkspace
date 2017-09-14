package zoo;

import zoo.domain.Elephant;

public class ElephantSet implements BeastSet<Elephant> {

	private Elephant[] stado = new Elephant[1000];
	private int lastRetornElephantIndex = -1;
	private int size = 0;

	@Override
	public void add(Elephant element) {
		if (contains(element)) {
			System.out.println("Такой слон уже есть");
			return;
		}
		for (int i = 0; i < stado.length; i++) {
			if (stado[i] == null) {
				stado[i] = element;
				System.out.println("Слон "+element.getName()+" куплен");
				size++;
				return;
			}
			
		}
		System.out.println("Столько слонов в одну клетку не влазит");
	}

	@Override
	public void remove(Elephant element) {
		if (element == null) {
			return;
		}
		for (int i = 0; i < stado.length; i++) {
			if (stado[i] != null && stado[i].equals(element)) {
				stado[i]=null;
				size--;
				return;
			}
		}

	}

	@Override
	public boolean contains(Elephant element) {
		if (element == null) {
			return true;
		}

		for (Elephant s : stado) {
			if (s != null && s.equals(element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Elephant next() {
		for(int i = lastRetornElephantIndex+1; i< stado.length; i++){
			if(stado[i]!=null){
				lastRetornElephantIndex = i;
				return stado[i];
			}
		}
		
		for(int i = 0; i<=lastRetornElephantIndex; i++){
			if(stado[i]!=null){
				lastRetornElephantIndex = i;
				return stado[i];
			}
		}		
		return null;
	}
	public int getSize(){
		return size;
		
	}
	
}

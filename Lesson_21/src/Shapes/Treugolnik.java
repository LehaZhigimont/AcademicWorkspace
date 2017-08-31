package Shapes;

public class Treugolnik extends Shape {
	
	@Override
	public String toString() {
		return "I'm " + getName() 
		+ " color is " + getColor() 
		+ " area is " + getArea() 
		+ " perimetr " + getPerimetr();
	}
	
	@Override
	public boolean equals(Object o){
		//o.getClass().getName();
		
		
		if (o instanceof Treugolnik) {//слева объект являеться экземпляром класса справа(с учетом наследования)
			//return true;	
		}
		
		
		if(! o.getClass().equals(this.getClass())){
			return false;
		}
		Treugolnik oAsTreugolnik = (Treugolnik)o;
		if(oAsTreugolnik.getName() != this.getName()) {
			return false;
		}
		else{
			if(oAsTreugolnik.getColor() != this.getColor()){
				return false;
			}
			else{
				if(oAsTreugolnik.getArea() != getArea()){
					return false;
				}
				else{
					if(oAsTreugolnik.getPerimetr() != getPerimetr()){
						return false;
					}
					else{
						return true;
					}
				}
			}
		}		
	}
	
	@Override
	public double getPerimetr() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}

package javafundamentosAulaClaudio006Extends;
class Animal {   
	void emitirSom() { System.out.println("Som genérico");  }
}
class Cachorro extends Animal {    
	@Override    
	void emitirSom() { System.out.println("Au Au!"); 	}
}
class Gato extends Animal {    
	@Override    
	void emitirSom() { System.out.println("Miau!"); }
}

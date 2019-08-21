package lesson10_38lesson10nasledovanie.lesson15;

public interface ISomeIterface extends IOtherInter {
	// б юаярпюйрмнл хмрептеияе мекэгъ охяюрэ лерндш я рекнл 
	//хмрептеия хяонкэгсеряъ дкъ нохяюмхъ онбедемхъ 
	//БЯЕ ОЕПЕЛЕМШЕ Б ХМРЕПТЕИЯЮУ public static final
	int SOME_VAR = 6;
	void add(int one , int two);
}
interface IOtherInter{
	void someMethod();
}	
interface IBancable {
	void bounce();
}
class Example implements ISomeIterface, IBancable{
	@Override
	public void add(int one , int two) {
		
	}
	public void someMethod(){
		
	}
	public void bounce() {
		
	}
}
 

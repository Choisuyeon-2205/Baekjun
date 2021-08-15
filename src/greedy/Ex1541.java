package greedy;

import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Ex1541 {
	public static void main(String[] args) throws ScriptException {
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		
		String result="";
		boolean onoff= false;
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			if(c=='-'&&onoff==false) {
				result+= c;
				result+='(';
				onoff= true;
			}else if(c=='-'&&onoff==true) {
				result+=')'+ c+'(';
			}else {
				result+= c;
			}
		}
		
		if(onoff==true) result+=')';
		
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");

		System.out.println(engine.eval(result));
	}
}

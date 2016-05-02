package homework7;

import java.util.ArrayList;


public class Subtract implements Expression {
	Expression e1;
	Expression e2;
	public Subtract(Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public Polinom evaluate() {
		Polinom a = e1.evaluate();
		Polinom b = e2.evaluate();
		if (a.isAtom() && b.isAtom()) {
			if (a.p.x.compareTo(b.p.x) < 0) {
				return new Polinom(new ArrayList<Mpair>(), new Const(0));
			}
			return new Polinom(new ArrayList<Mpair>(), new Const(a.p.x - b.p.x));
		}
		int exp = a.getExp().compare(b.getExp());
		if (exp < 0) return new Polinom(new ArrayList<Mpair>(), new Const(0));
		if (exp == 0) {
			return new Polinom(a);
		}
		int cnst = a.getCnst().compare(b.getCnst());
		if (cnst < 0) {
			return new Polinom(new ArrayList<Mpair>(), new Const(0));
		}
		Polinom p = new Polinom();
		if (cnst > 0) {
			p.push(a.getExp(), new Const(a.getCnst().x - b.getCnst().x));
			return p.add(a.rest());
		}
		return (new Subtract(a.rest(), b.rest())).evaluate();
	}

	public int compare(Expression b) {
		Polinom a = evaluate();
		Polinom bb = b.evaluate();
		return a.compare(bb);
	}
	
	public String printExp() {
		return "(" + e1.printExp() + "-" + e2.printExp() + ")";
	}

}
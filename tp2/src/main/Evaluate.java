package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import tp6.analysis.Analysis;
import tp6.node.AAssignment;
import tp6.node.ABinexpression;
import tp6.node.ABinexpressionExpression;
import tp6.node.ABlock;
import tp6.node.AConditional;
import tp6.node.ADiviserOperatorarith;
import tp6.node.AEqualOperatorlogique;
import tp6.node.AInfOperatorlogique;
import tp6.node.AIntegervalue;
import tp6.node.AMinusOperatorarith;
import tp6.node.AModuloOperatorarith;
import tp6.node.AMultiplierOperatorarith;
import tp6.node.APlusOperatorarith;
import tp6.node.APrintS;
import tp6.node.AReadS;
import tp6.node.ASupOperatorlogique;
import tp6.node.AVariableref;
import tp6.node.AWhileS;
import tp6.node.POperator;
import tp6.node.Switchable;

public class Evaluate  extends AbstractInterpreter implements Analysis
{
	private final Map<String, Integer> variables = new HashMap<String, Integer>();

	private Object lastValue;
	@Override
	public void caseAAssignment(AAssignment node) {
		int value = evalToInt(node.getRhs());
		String variable = repr(node.getVar());
		variables.put(variable, value);
	}
	
	@Override
	public void caseABinexpression(ABinexpression node) {
		boolean operatorHasPrecedence = Set.of("*", "/").contains(repr(node.getOperator()));
		boolean rhsIsBinaryExpression = node.getRExp() instanceof ABinexpressionExpression;
		if (operatorHasPrecedence && rhsIsBinaryExpression)
		{
			ABinexpressionExpression rhsExpr = (ABinexpressionExpression) node.getRExp();
			ABinexpression rhsExprNode = (ABinexpression) rhsExpr.getBinexpression();
			int lhs = evalToInt(node.getLExp());
			int rhs = evalToInt(rhsExprNode.getLExp());
			lhs = (int) eval(node.getOperator(), lhs, rhs);
			rhs = evalToInt(rhsExprNode.getRExp());
			lastValue = eval(rhsExprNode.getOperator(), lhs, rhs);
		}
		else
		{
			int lhs = evalToInt(node.getLExp());
			int rhs = evalToInt(node.getRExp());
			lastValue = eval(node.getOperator(), lhs, rhs);
		}
	}

	@Override
	public void caseABlock(ABlock node) {
		node.getStatement().forEach(child -> child.apply(this));
	}

	@Override
	public void caseAConditional(AConditional node) {
		if(evalToBool(node.getCond()))
		{
			node.getThenpart().apply(this);
		}
		else if(node.getElsepart() != null)
		{
			node.getElsepart().apply(this);
		}
	}

	@Override
	public void caseAEqualOperatorlogique(AEqualOperatorlogique node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caseAInfOperatorlogique(AInfOperatorlogique node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caseAIntegervalue(AIntegervalue node) {
		lastValue = Integer.parseInt(node.getNumber().getText());
	}

	@Override
	public void caseAMinusOperatorarith(AMinusOperatorarith node) {
		lastValue = Integer.parseInt(node.getMinus().getText());
	}

	@Override
	public void caseAMultiplierOperatorarith(AMultiplierOperatorarith node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caseAPlusOperatorarith(APlusOperatorarith node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caseAPrintS(APrintS node) {
		node.getValue().apply(this);
		System.out.println(lastValue);
	}

	@Override
	@SuppressWarnings("resource")
	public void caseAReadS(AReadS node) {
		System.out.print(repr(node.getVar())+ " ? ");
		Integer value = new Scanner(System.in).nextInt();
		variables.put(repr(node.getVar()), value);
		}

	@Override
	public void caseADiviserOperatorarith(ADiviserOperatorarith node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caseAModuloOperatorarith(AModuloOperatorarith node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caseASupOperatorlogique(ASupOperatorlogique node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caseAVariableref(AVariableref node) {
		lastValue = variables.get(repr(node.getIdentifier()));
	}

	@Override
	public void caseAWhileS(AWhileS node) {
		while(evalToBool(node.getCond()))
		{
			node.getBody().apply(this);
		}
	}
	
	
	private int evalToInt(Switchable node)
	{
		node.apply(this);
		return (Integer) lastValue;
	}
	
	private boolean evalToBool(Switchable node)
	{
		node.apply(this);
		return lastValueAsBool();
	}
	
	private boolean lastValueAsBool()
	{
		if( Objects.equals(lastValue, true))
		{
			return true;
		}
		if( Objects.equals(lastValue,1))
		{ 
			return true;
		}
		return false;
	}
	
	private static String repr(Object object )
	{
		return String.valueOf(object).trim();
	}
	
	private static Object eval(POperator operator, int lhs, int rhs)
	{
		switch(repr(operator))
		{
			case ">" : return lhs > rhs;
			case "<" : return lhs < rhs;
			case "+" : return lhs + rhs;
			case "-" : return lhs - rhs;
			case "%" : return lhs % rhs;
			case "*" : return lhs * rhs;
			case "/" : return lhs / rhs;
			case "==" : return lhs == rhs;
			default: return null;





		}
	}
}

package main;

import java.util.Collections;

import tp6.analysis.Analysis;
import tp6.node.AAssignment;
import tp6.node.ABinexpression;
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

public class PrettyPrint extends AbstractInterpreter implements Analysis
{

	private static final int INDENT_SIZE = 2;
	
	private int indent = -1;
	@Override
	public void caseAAssignment(AAssignment node) {
		printIndented(node);
	}

	@Override
	public void caseABinexpression(ABinexpression node) {
		printIndented(node);
	}

	@Override
	public void caseABlock(ABlock node) {
		++indent;
		node.getStatement().forEach(child -> child.apply(this));
		--indent;
	}

	@Override
	public void caseAConditional(AConditional node) {
		printIndented("if ( " + node.getCond() + " ) ");
		node.getThenpart().apply(this);
		if(node.getElse() != null)
		{
			printIndented(node.getElse());
			node.getElsepart().apply(this);
		}
	}

	@Override
	public void caseAEqualOperatorlogique(AEqualOperatorlogique node) {
		printIndented(node);
		
	}

	@Override
	public void caseAInfOperatorlogique(AInfOperatorlogique node) {
		printIndented(node);
	}

	@Override
	public void caseAIntegervalue(AIntegervalue node) {
		printIndented(node);		
	}

	@Override
	public void caseAMinusOperatorarith(AMinusOperatorarith node) {
		printIndented(node);		
	}

	@Override
	public void caseAMultiplierOperatorarith(AMultiplierOperatorarith node) {
		printIndented(node);		
	}

	@Override
	public void caseAPlusOperatorarith(APlusOperatorarith node) {
		printIndented(node);		
	}

	@Override
	public void caseAPrintS(APrintS node) {
		printIndented(node);		
	}

	@Override
	public void caseAReadS(AReadS node) {
		printIndented(node);		
	}

	@Override
	public void caseADiviserOperatorarith(ADiviserOperatorarith node) {
		printIndented(node);		
	}

	@Override
	public void caseAModuloOperatorarith(AModuloOperatorarith node) {
		printIndented(node);		
	}

	@Override
	public void caseASupOperatorlogique(ASupOperatorlogique node) {
		printIndented(node);		
	}

	@Override
	public void caseAVariableref(AVariableref node) {
		printIndented(node);		
	}

	@Override
	public void caseAWhileS(AWhileS node) {
		printIndented(node.getWhile() + "" + node.getLPar() + node.getCond() + node.getRPar());
		node.getBody().apply(this);
	}
	
	private void printIndented(Object object)
	{
		String spaces = String.join("", Collections.nCopies(indent * INDENT_SIZE, ""));
		System.out.println(spaces + object);
	}
}

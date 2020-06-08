package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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
import tp6.node.PStatement;


public class Interpreter extends AbstractInterpreter implements Analysis {

	private int nbIndent = 0;
	private void print(String str) {
		for(int i = 0; i < nbIndent; i++) {
			System.out.print("\t");
		}
		System.out.println(str);
	}
	@Override
	public void caseAAssignment(AAssignment node) {
		print(node.getVar() +" " +node.getAssign() +" " + node.getRhs() + node.getSemi());
	}



	@Override
	public void caseABinexpression(ABinexpression node) {
		
		
	}


	@Override
	public void caseABlock(ABlock node) {
		print("{");
		nbIndent++;
		for(PStatement s: node.getStatement()) {
			s.apply(this);
		}
		nbIndent--;
		print("}");
	}


	

	@Override
	public void caseAConditional(AConditional node) {
		print(node.getIf() +" " +node.getLPar() +node.getCond() +node.getRPar());
		node.getThenpart().apply(this);
		print("" + node.getElse());
		node.getElsepart().apply(this);
	}


	@Override
	public void caseAEqualOperatorlogique(AEqualOperatorlogique node) {
	
	
	}



	@Override
	public void caseAInfOperatorlogique(AInfOperatorlogique node) {

	
	}

	@Override
	public void caseAIntegervalue(AIntegervalue node) {
	
	
	}



	@Override
	public void caseAMinusOperatorarith(AMinusOperatorarith node) {
	
	
	}

	@Override
	public void caseAMultiplierOperatorarith(AMultiplierOperatorarith node) {
		
	}



	@Override
	public void caseAPlusOperatorarith(APlusOperatorarith node) {

		
	}

	@Override
	public void caseAPrintS(APrintS node) {
		print(node.getPrint() +" " +node.getValue() +node.getSemi());
		
	}


	@Override
	public void caseAReadS(AReadS node) {
		print(node.getRead() +" " +node.getVar() +node.getSemi());
	}



	@Override
	public void caseASupOperatorlogique(ASupOperatorlogique node) {

	
	}

	

	@Override
	public void caseAVariableref(AVariableref node) {

	
	}


	@Override
	public void caseAWhileS(AWhileS node) {
		print(node.getWhile() +" " +node.getLPar() + node.getCond() +node.getRPar());
		node.getBody().apply(this);
	
	}


	@Override
	public void caseADiviserOperatorarith(ADiviserOperatorarith node) {

	
	}

	@Override
	public void caseAModuloOperatorarith(AModuloOperatorarith node) {

	
	}



}
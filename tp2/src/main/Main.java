package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PushbackReader;

import tp6.lexer.Lexer;
import tp6.node.Start;
import tp6.parser.Parser;


public class Main {
    public static void main(String[] args) {
    	if( args.length<1 )
    	{
    		System.out.println("Usage:");
    		System.out.println(" java main.Main <filename>");
    		System.exit(-1);
    	}
    	try
    	{
    		Lexer lexer = new Lexer(new PushbackReader(new BufferedReader(new FileReader(args[0])),1024));
    		Parser parser = new Parser(lexer);
    		Start ast = parser.parse();
    		ast.apply(new PrettyPrint());
    		System.out.println("................");
    		ast.apply(new Evaluate());
    	}
    	catch(Exception exception)
    	{
    		exception.printStackTrace();
    	}
    }
}
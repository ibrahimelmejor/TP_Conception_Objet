/* This file was generated by SableCC (http://www.sablecc.org/). */

package tp6.analysis;

import java.util.*;
import tp6.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAGrammar(AGrammar node)
    {
        defaultCase(node);
    }

    public void caseABlock(ABlock node)
    {
        defaultCase(node);
    }

    public void caseAAssignmentStatement(AAssignmentStatement node)
    {
        defaultCase(node);
    }

    public void caseAConditionalStatement(AConditionalStatement node)
    {
        defaultCase(node);
    }

    public void caseAPrintSStatement(APrintSStatement node)
    {
        defaultCase(node);
    }

    public void caseAReadSStatement(AReadSStatement node)
    {
        defaultCase(node);
    }

    public void caseAWhileSStatement(AWhileSStatement node)
    {
        defaultCase(node);
    }

    public void caseABlockStatement(ABlockStatement node)
    {
        defaultCase(node);
    }

    public void caseABinexpressionExpression(ABinexpressionExpression node)
    {
        defaultCase(node);
    }

    public void caseAUniexpressionExpression(AUniexpressionExpression node)
    {
        defaultCase(node);
    }

    public void caseAAssignment(AAssignment node)
    {
        defaultCase(node);
    }

    public void caseAConditional(AConditional node)
    {
        defaultCase(node);
    }

    public void caseAPrintS(APrintS node)
    {
        defaultCase(node);
    }

    public void caseAReadS(AReadS node)
    {
        defaultCase(node);
    }

    public void caseAWhileS(AWhileS node)
    {
        defaultCase(node);
    }

    public void caseABinexpression(ABinexpression node)
    {
        defaultCase(node);
    }

    public void caseAOperatorarithOperator(AOperatorarithOperator node)
    {
        defaultCase(node);
    }

    public void caseAOperatorlogiqueOperator(AOperatorlogiqueOperator node)
    {
        defaultCase(node);
    }

    public void caseAPlusOperatorarith(APlusOperatorarith node)
    {
        defaultCase(node);
    }

    public void caseAMinusOperatorarith(AMinusOperatorarith node)
    {
        defaultCase(node);
    }

    public void caseAMultiplierOperatorarith(AMultiplierOperatorarith node)
    {
        defaultCase(node);
    }

    public void caseAModuloOperatorarith(AModuloOperatorarith node)
    {
        defaultCase(node);
    }

    public void caseADiviserOperatorarith(ADiviserOperatorarith node)
    {
        defaultCase(node);
    }

    public void caseASupOperatorlogique(ASupOperatorlogique node)
    {
        defaultCase(node);
    }

    public void caseAInfOperatorlogique(AInfOperatorlogique node)
    {
        defaultCase(node);
    }

    public void caseAEqualOperatorlogique(AEqualOperatorlogique node)
    {
        defaultCase(node);
    }

    public void caseAIntegervalueUniexpression(AIntegervalueUniexpression node)
    {
        defaultCase(node);
    }

    public void caseAVariablerefUniexpression(AVariablerefUniexpression node)
    {
        defaultCase(node);
    }

    public void caseAIntegervalue(AIntegervalue node)
    {
        defaultCase(node);
    }

    public void caseAVariableref(AVariableref node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTMultiplier(TMultiplier node)
    {
        defaultCase(node);
    }

    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    public void caseTModulo(TModulo node)
    {
        defaultCase(node);
    }

    public void caseTSup(TSup node)
    {
        defaultCase(node);
    }

    public void caseTInf(TInf node)
    {
        defaultCase(node);
    }

    public void caseTEqual(TEqual node)
    {
        defaultCase(node);
    }

    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    public void caseTRead(TRead node)
    {
        defaultCase(node);
    }

    public void caseTPrint(TPrint node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    public void caseTNewLine(TNewLine node)
    {
        defaultCase(node);
    }

    public void caseTObrace(TObrace node)
    {
        defaultCase(node);
    }

    public void caseTCbrace(TCbrace node)
    {
        defaultCase(node);
    }

    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    public void caseTComa(TComa node)
    {
        defaultCase(node);
    }

    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}

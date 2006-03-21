/* Generated By:JJTree: Do not edit this line. ASTBitwiseAndNode.java */

package org.apache.commons.jexl.parser;

import org.apache.commons.jexl.JexlContext;
import org.apache.commons.jexl.util.Coercion;

/**
 * Bitwise And. Syntax:
 *      a & b
 * Result is a Long
 * @author Dion Gillard
 * @since 1.0.1
 */
public class ASTBitwiseAndNode extends SimpleNode {
  public ASTBitwiseAndNode(int id) {
    super(id);
  }

  public ASTBitwiseAndNode(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
  
  /**
   * @return a {@link Long} which is the bitwise and of the two operands.
   */
  public Object value(JexlContext context) throws Exception
  {
      Object left = ((SimpleNode) jjtGetChild(0)).value(context);
      Object right = ((SimpleNode) jjtGetChild(1)).value(context);
    
      Long l = left == null ? new Long(0) : Coercion.coerceLong(left);
      Long r = right == null ? new Long(0) : Coercion.coerceLong(right);
      return new Long(l.longValue() & r.longValue());
  }
}

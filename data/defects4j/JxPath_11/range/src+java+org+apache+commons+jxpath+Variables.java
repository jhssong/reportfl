{
  "filepath": "/tmp/JxPath-11b/src/java/org/apache/commons/jxpath/Variables.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Variables",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 54,
      "comment": "\n * Variables provide access to a global set of values accessible via XPath.\n * XPath can reference variables using the \u003ccode\u003e\"$varname\"\u003c/code\u003e syntax.\n * To use a custom implementation of this interface, pass it to\n * {@link JXPathContext#setVariables JXPathContext.setVariables()}\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Variables.isDeclaredVariable(java.lang.String)",
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Returns true if the specified variable is declared.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Variables.getVariable(java.lang.String)",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Returns the value of the specified variable.\n     * Throws IllegalArgumentException if there is no such variable.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Variables.declareVariable(java.lang.String, java.lang.Object)",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Defines a new variable with the specified value or modifies\n     * the value of an existing variable.\n     * May throw UnsupportedOperationException.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Variables.undeclareVariable(java.lang.String)",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Removes an existing variable. May throw UnsupportedOperationException.\n     *\n     * @param varName is a variable name without the \"$\" sign\n     ",
      "child_ranges": []
    }
  ]
}
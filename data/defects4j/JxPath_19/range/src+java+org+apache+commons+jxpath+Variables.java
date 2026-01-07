{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/Variables.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Variables",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 62,
      "comment": "\n * Variables provide access to a global set of values accessible via XPath.\n * XPath can reference variables using the \u003ccode\u003e\"$varname\"\u003c/code\u003e syntax.\n * To use a custom implementation of this interface, pass it to\n * {@link JXPathContext#setVariables JXPathContext.setVariables()}\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Variables.isDeclaredVariable(java.lang.String)",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Returns true if the specified variable is declared.\n     * @param varName variable name\n     * @return boolean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Variables.getVariable(java.lang.String)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Returns the value of the specified variable.\n     * @param varName variable name\n     * @return Object value\n     * @throws IllegalArgumentException if there is no such variable.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Variables.declareVariable(java.lang.String, java.lang.Object)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Defines a new variable with the specified value or modifies\n     * the value of an existing variable.\n     * May throw UnsupportedOperationException.\n     * @param varName variable name\n     * @param value to declare\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Variables.undeclareVariable(java.lang.String)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Removes an existing variable. May throw UnsupportedOperationException.\n     *\n     * @param varName is a variable name without the \"$\" sign\n     ",
      "child_ranges": []
    }
  ]
}
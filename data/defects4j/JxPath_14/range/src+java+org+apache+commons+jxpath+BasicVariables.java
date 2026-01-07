{
  "filepath": "/tmp/JxPath-14b/src/java/org/apache/commons/jxpath/BasicVariables.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicVariables",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Variables"
      ],
      "begin_line": 27,
      "end_line": 88,
      "comment": "\n * A basic implementation of the Variables interface that uses a HashMap.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "vars"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Contains the values of declared variables\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicVariables.isDeclaredVariable(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Returns true if the variable has been defined, even if the\n     * value of the variable is null.\n     *\n     * @param varName is a variable name without the \"$\" sign\n     *\n     * @return true if the variable is declared\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicVariables.getVariable(java.lang.String)",
      "begin_line": 54,
      "end_line": 63,
      "comment": "\n     * Returns the value of the variable if it is defined,\n     * otherwise, throws IllegalArgumentException\n     *\n     * @param varName is a variable name without the \"$\" sign\n     *\n     * @return the value of the variable\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 59,col 9)",
        "(line 61,col 9)-(line 62,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicVariables.declareVariable(java.lang.String, java.lang.Object)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Defines a new variable with the specified value or modifies\n     * the value of an existing variable.\n     *\n     * @param varName is a variable name without the \"$\" sign\n     * @param value is the new value for the variable, which can be null\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicVariables.undeclareVariable(java.lang.String)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Removes an existing variable. May throw UnsupportedOperationException.\n     *\n     * @param varName is a variable name without the \"$\" sign\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicVariables.toString()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 31)"
      ]
    }
  ]
}
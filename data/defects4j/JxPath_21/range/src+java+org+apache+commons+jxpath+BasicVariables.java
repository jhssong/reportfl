{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/BasicVariables.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicVariables",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Variables"
      ],
      "begin_line": 27,
      "end_line": 89,
      "comment": "\n * A basic implementation of the Variables interface that uses a HashMap.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vars"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Contains the values of declared variables\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicVariables.isDeclaredVariable(java.lang.String)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Returns true if the variable has been defined, even if the\n     * value of the variable is null.\n     *\n     * @param varName is a variable name without the \"$\" sign\n     *\n     * @return true if the variable is declared\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicVariables.getVariable(java.lang.String)",
      "begin_line": 55,
      "end_line": 64,
      "comment": "\n     * Returns the value of the variable if it is defined,\n     * otherwise, throws IllegalArgumentException\n     *\n     * @param varName is a variable name without the \"$\" sign\n     *\n     * @return the value of the variable\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 60,col 9)",
        "(line 62,col 9)-(line 63,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicVariables.declareVariable(java.lang.String, java.lang.Object)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Defines a new variable with the specified value or modifies\n     * the value of an existing variable.\n     *\n     * @param varName is a variable name without the \"$\" sign\n     * @param value is the new value for the variable, which can be null\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicVariables.undeclareVariable(java.lang.String)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Removes an existing variable. May throw UnsupportedOperationException.\n     *\n     * @param varName is a variable name without the \"$\" sign\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicVariables.toString()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 31)"
      ]
    }
  ]
}
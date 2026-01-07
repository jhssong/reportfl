{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/UnknownParameterException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnknownParameterException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalArgumentException"
      ],
      "begin_line": 28,
      "end_line": 53,
      "comment": "\n * Exception to be thrown when a parameter is unknown.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Parameter name. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.UnknownParameterException.UnknownParameterException(java.lang.String)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Construct an exception from the unknown parameter.\n     *\n     * @param name parameter name.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 50)",
        "(line 43,col 9)-(line 43,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.UnknownParameterException.getName()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * @return the name of the unknown parameter.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 20)"
      ]
    }
  ]
}
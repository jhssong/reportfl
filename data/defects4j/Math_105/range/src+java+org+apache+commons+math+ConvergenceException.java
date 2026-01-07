{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/ConvergenceException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergenceException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException",
        "java.io.Serializable"
      ],
      "begin_line": 26,
      "end_line": 62,
      "comment": "\n * Error thrown when a numerical computation can not be performed because the\n * numerical result failed to converge to a finite value.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException()",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Construct an exception with the given message.\n     * @param message descriptive error message. \n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.String, java.lang.Throwable)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Construct an exception with the given message and root cause.\n     * @param message descriptive error message.\n     * @param cause root cause.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.Throwable)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param throwable caught exception causing this problem\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 30)"
      ]
    }
  ]
}
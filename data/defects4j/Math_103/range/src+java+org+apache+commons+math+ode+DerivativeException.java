{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/DerivativeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DerivativeException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 28,
      "end_line": 49,
      "comment": "\n * This exception is made available to users to report\n * the error conditions that are trigegred while computing\n * the differential equations.\n * @version $Id: DerivativeException.java 1705 2006-09-17 19:57:39Z luc $\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DerivativeException.DerivativeException(java.lang.String, java.lang.String[])",
      "begin_line": 36,
      "end_line": 38,
      "comment": " Simple constructor.\n   * Build an exception by translating and formating a message\n   * @param specifier format specifier (to be translated)\n   * @param parts to insert in the format (no translation)\n   ",
      "child_ranges": [
        "(line 37,col 5)-(line 37,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DerivativeException.DerivativeException(java.lang.Throwable)",
      "begin_line": 43,
      "end_line": 45,
      "comment": " Build an instance from an underlying cause.\n   * @param cause cause for the exception\n   ",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    }
  ]
}
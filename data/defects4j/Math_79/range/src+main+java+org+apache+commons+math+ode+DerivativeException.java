{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/DerivativeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DerivativeException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 29,
      "end_line": 51,
      "comment": "\n * This exception is made available to users to report\n * the error conditions that are triggered while computing\n * the differential equations.\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DerivativeException.DerivativeException(java.lang.String, java.lang.Object...)",
      "begin_line": 40,
      "end_line": 42,
      "comment": " Simple constructor.\n   * Build an exception by translating and formating a message\n   * @param specifier format specifier (to be translated)\n   * @param parts to insert in the format (no translation)\n   ",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DerivativeException.DerivativeException(java.lang.Throwable)",
      "begin_line": 47,
      "end_line": 49,
      "comment": " Build an instance from an underlying cause.\n   * @param cause cause for the exception\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 17)"
      ]
    }
  ]
}
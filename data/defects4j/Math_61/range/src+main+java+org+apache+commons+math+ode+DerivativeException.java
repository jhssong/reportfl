{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/ode/DerivativeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DerivativeException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 31,
      "end_line": 65,
      "comment": "\n * This exception is made available to users to report\n * the error conditions that are triggered while computing\n * the differential equations.\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DerivativeException.DerivativeException(java.lang.String, java.lang.Object...)",
      "begin_line": 43,
      "end_line": 46,
      "comment": " Simple constructor.\n   * Build an exception by translating and formating a message\n   * @param specifier format specifier (to be translated)\n   * @param parts to insert in the format (no translation)\n   * @deprecated as of 2.2 replaced by {@link #DerivativeException(Localizable, Object...)}\n   ",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DerivativeException.DerivativeException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 54,
      "end_line": 56,
      "comment": " Simple constructor.\n   * Build an exception by translating and formating a message\n   * @param specifier format specifier (to be translated)\n   * @param parts to insert in the format (no translation)\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DerivativeException.DerivativeException(java.lang.Throwable)",
      "begin_line": 61,
      "end_line": 63,
      "comment": " Build an instance from an underlying cause.\n   * @param cause cause for the exception\n   ",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 17)"
      ]
    }
  ]
}
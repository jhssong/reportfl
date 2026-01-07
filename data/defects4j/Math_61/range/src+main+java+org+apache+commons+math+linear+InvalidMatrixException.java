{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/linear/InvalidMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvalidMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathRuntimeException"
      ],
      "begin_line": 32,
      "end_line": 67,
      "comment": "\n * Thrown when a system attempts an operation on a matrix, and\n * that matrix does not satisfy the preconditions for the\n * aforementioned operation.\n * @version $Revision$ $Date$\n * @deprecated since 2.2. Please use the classes in the\n * {@link org.apache.commons.math.exception} package.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.InvalidMatrixException.InvalidMatrixException(java.lang.String, java.lang.Object...)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Construct an exception with the given message.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.InvalidMatrixException.InvalidMatrixException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Construct an exception with the given message.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.InvalidMatrixException.InvalidMatrixException(java.lang.Throwable)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Construct an exception with the given message.\n     * @param cause the exception or error that caused this exception\n     * to be thrown.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 21)"
      ]
    }
  ]
}
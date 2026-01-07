{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/InvalidMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvalidMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathRuntimeException"
      ],
      "begin_line": 28,
      "end_line": 53,
      "comment": "\n * Thrown when a system attempts an operation on a matrix, and\n * that matrix does not satisfy the preconditions for the\n * aforementioned operation.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.InvalidMatrixException.InvalidMatrixException(java.lang.String, java.lang.Object...)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Construct an exception with the given message.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.InvalidMatrixException.InvalidMatrixException(java.lang.Throwable)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Construct an exception with the given message.\n     * @param cause the exception or error that caused this exception\n     * to be thrown.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 21)"
      ]
    }
  ]
}
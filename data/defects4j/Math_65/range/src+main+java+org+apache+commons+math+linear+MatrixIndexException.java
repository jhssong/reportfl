{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/linear/MatrixIndexException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixIndexException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathRuntimeException"
      ],
      "begin_line": 29,
      "end_line": 55,
      "comment": "\n * Thrown when an operation addresses a matrix coordinate (row, col)\n * which is outside of the dimensions of a matrix.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixIndexException.MatrixIndexException(java.lang.String, java.lang.Object...)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     * Constructs a new instance with specified formatted detail message.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @deprecated as of 2.2 replaced by {@link #MatrixIndexException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 42,col 7)-(line 42,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixIndexException.MatrixIndexException(org.apache.commons.math.exception.Localizable, java.lang.Object...)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Constructs a new instance with specified formatted detail message.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 52,col 7)-(line 52,col 32)"
      ]
    }
  ]
}
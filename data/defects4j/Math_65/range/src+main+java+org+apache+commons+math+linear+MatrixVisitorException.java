{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/linear/MatrixVisitorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixVisitorException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathRuntimeException"
      ],
      "begin_line": 27,
      "end_line": 53,
      "comment": "\n * Thrown when a visitor encounters an error while processing a matrix entry.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixVisitorException.MatrixVisitorException(java.lang.String, java.lang.Object[])",
      "begin_line": 38,
      "end_line": 41,
      "comment": "\n     * Constructs a new instance with specified formatted detail message.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @deprecated as of 2.2 replaced by {@link #MatrixVisitorException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 40,col 7)-(line 40,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixVisitorException.MatrixVisitorException(org.apache.commons.math.exception.Localizable, java.lang.Object[])",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Constructs a new instance with specified formatted detail message.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 50,col 7)-(line 50,col 32)"
      ]
    }
  ]
}
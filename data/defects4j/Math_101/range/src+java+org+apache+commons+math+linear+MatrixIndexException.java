{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/linear/MatrixIndexException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixIndexException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 25,
      "end_line": 46,
      "comment": "\n * Thrown when an operation addresses a matrix coordinate (row,col)\n * which is outside of the dimensions of a matrix.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixIndexException.MatrixIndexException()",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Default constructor.\n     * @deprecated as of 1.2 replaced by #MatrixIndexException(String)\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixIndexException.MatrixIndexException(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Construct an exception with the given message and root cause.\n     * @param message descriptive error message.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 23)"
      ]
    }
  ]
}
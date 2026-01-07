{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/exception/MathParseException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathParseException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathRuntimeException"
      ],
      "begin_line": 27,
      "end_line": 55,
      "comment": "\n * Class to signal parse failures.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Serializable version Id. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathParseException.MathParseException(java.lang.String, int, java.lang.Class\u003c?\u003e)",
      "begin_line": 38,
      "end_line": 43,
      "comment": "\n     * @param wrong Bad string representation of the object.\n     * @param position Index, in the {@code wrong} string, that caused the\n     * parsing to fail.\n     * @param type Class of the object supposedly represented by the\n     * {@code wrong} string.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 42,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathParseException.MathParseException(java.lang.String, int)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * @param wrong Bad string representation of the object.\n     * @param position Index, in the {@code wrong} string, that caused the\n     * parsing to fail.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 53,col 53)"
      ]
    }
  ]
}
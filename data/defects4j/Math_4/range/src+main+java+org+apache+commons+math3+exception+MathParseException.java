{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/MathParseException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathParseException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalStateException",
        "org.apache.commons.math3.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 28,
      "end_line": 57,
      "comment": "\n * Class to signal parse failures.\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version Id. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MathParseException.MathParseException(java.lang.String, int, java.lang.Class\u003c?\u003e)",
      "begin_line": 40,
      "end_line": 45,
      "comment": "\n     * @param wrong Bad string representation of the object.\n     * @param position Index, in the {@code wrong} string, that caused the\n     * parsing to fail.\n     * @param type Class of the object supposedly represented by the\n     * {@code wrong} string.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 44,col 82)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MathParseException.MathParseException(java.lang.String, int)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * @param wrong Bad string representation of the object.\n     * @param position Index, in the {@code wrong} string, that caused the\n     * parsing to fail.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 55,col 66)"
      ]
    }
  ]
}
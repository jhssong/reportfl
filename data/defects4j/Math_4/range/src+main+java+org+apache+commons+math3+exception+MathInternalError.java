{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/MathInternalError.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathInternalError",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalStateException"
      ],
      "begin_line": 28,
      "end_line": 58,
      "comment": "\n * Exception triggered when something that shouldn\u0027t happen does happen.\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "REPORT_URL"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " URL for reporting problems. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MathInternalError.MathInternalError()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Simple constructor.\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MathInternalError.MathInternalError(java.lang.Throwable)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Simple constructor.\n     * @param cause root cause\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MathInternalError.MathInternalError(org.apache.commons.math3.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Constructor accepting a localized message.\n     *\n     * @param pattern Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 29)"
      ]
    }
  ]
}
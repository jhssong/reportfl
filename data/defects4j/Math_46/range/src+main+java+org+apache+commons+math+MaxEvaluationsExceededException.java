{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/MaxEvaluationsExceededException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaxEvaluationsExceededException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergenceException"
      ],
      "begin_line": 30,
      "end_line": 68,
      "comment": "\n * Error thrown when a numerical computation exceeds its allowed\n * number of functions evaluations.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxEvaluationsExceededException.MaxEvaluationsExceededException(int)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Constructs an exception with a default detail message.\n     * @param maxEvaluations maximal number of evaluations allowed\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 73)",
        "(line 44,col 9)-(line 44,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxEvaluationsExceededException.MaxEvaluationsExceededException(int, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxEvaluations the exceeded maximal number of evaluations\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 34)",
        "(line 58,col 9)-(line 58,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MaxEvaluationsExceededException.getMaxEvaluations()",
      "begin_line": 64,
      "end_line": 66,
      "comment": " Get the maximal number of evaluations allowed.\n     * @return maximal number of evaluations allowed\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 30)"
      ]
    }
  ]
}
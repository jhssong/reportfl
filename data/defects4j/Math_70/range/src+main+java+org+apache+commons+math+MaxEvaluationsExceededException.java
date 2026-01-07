{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/MaxEvaluationsExceededException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaxEvaluationsExceededException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergenceException"
      ],
      "begin_line": 29,
      "end_line": 67,
      "comment": "\n * Error thrown when a numerical computation exceeds its allowed\n * number of functions evaluations.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxEvaluationsExceededException.MaxEvaluationsExceededException(int)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxEvaluations maximal number of evaluations allowed\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 78)",
        "(line 44,col 9)-(line 44,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxEvaluationsExceededException.MaxEvaluationsExceededException(int, java.lang.String, java.lang.Object...)",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxEvaluations the exceeded maximal number of evaluations\n     * @param pattern format specifier\n     * @param arguments format arguments\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 34)",
        "(line 57,col 9)-(line 57,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MaxEvaluationsExceededException.getMaxEvaluations()",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Get the maximal number of evaluations allowed.\n     * @return maximal number of evaluations allowed\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 30)"
      ]
    }
  ]
}
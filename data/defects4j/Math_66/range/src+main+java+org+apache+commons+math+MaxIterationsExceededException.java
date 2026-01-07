{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/MaxIterationsExceededException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaxIterationsExceededException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergenceException"
      ],
      "begin_line": 32,
      "end_line": 84,
      "comment": "\n * Error thrown when a numerical computation exceeds its allowed\n * number of iterations.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Constructs an exception with a default detail message.\n     * @param maxIterations maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 71)",
        "(line 46,col 9)-(line 46,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int, java.lang.String, java.lang.Object...)",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxIterations the exceeded maximal number of iterations\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @deprecated as of 2.2 replaced by {@link #MaxIterationsExceededException(int, Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int, org.apache.commons.math.util.Localizable, java.lang.Object...)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxIterations the exceeded maximal number of iterations\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)",
        "(line 74,col 9)-(line 74,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.getMaxIterations()",
      "begin_line": 80,
      "end_line": 82,
      "comment": " Get the maximal number of iterations allowed.\n     * @return maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 29)"
      ]
    }
  ]
}
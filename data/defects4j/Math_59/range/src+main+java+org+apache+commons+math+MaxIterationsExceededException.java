{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/MaxIterationsExceededException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaxIterationsExceededException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergenceException"
      ],
      "begin_line": 35,
      "end_line": 88,
      "comment": "\n * Error thrown when a numerical computation exceeds its allowed\n * number of iterations.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n * @deprecated in 2.2 (to be removed in 3.0). Please use\n * {@link org.apache.commons.math.exception.MaxCountExceededException}\n * instead.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Constructs an exception with a default detail message.\n     * @param maxIterations maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 71)",
        "(line 50,col 9)-(line 50,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int, java.lang.String, java.lang.Object...)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxIterations the exceeded maximal number of iterations\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @deprecated as of 2.2 replaced by {@link #MaxIterationsExceededException(int, Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxIterations the exceeded maximal number of iterations\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 34)",
        "(line 78,col 9)-(line 78,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.getMaxIterations()",
      "begin_line": 84,
      "end_line": 86,
      "comment": " Get the maximal number of iterations allowed.\n     * @return maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 29)"
      ]
    }
  ]
}
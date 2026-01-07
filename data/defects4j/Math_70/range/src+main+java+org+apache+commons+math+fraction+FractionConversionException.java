{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/fraction/FractionConversionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FractionConversionException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergenceException"
      ],
      "begin_line": 29,
      "end_line": 55,
      "comment": "\n * Error thrown when a double value cannot be converted to a fraction\n * in the allowed number of iterations.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionConversionException.FractionConversionException(double, int)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param value double value to convert\n     * @param maxIterations maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 94)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionConversionException.FractionConversionException(double, long, long)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param value double value to convert\n     * @param p current numerator\n     * @param q current denominator\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 83)"
      ]
    }
  ]
}
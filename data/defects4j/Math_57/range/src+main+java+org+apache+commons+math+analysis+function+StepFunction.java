{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/analysis/function/StepFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 34,
      "end_line": 89,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Step_function\"\u003e\n *  Step function\u003c/a\u003e.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "abscissa"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Abscissae. "
    },
    {
      "type": "field",
      "varNames": [
        "ordinate"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Ordinates. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.StepFunction.StepFunction(double[], double[])",
      "begin_line": 51,
      "end_line": 68,
      "comment": "\n     * Builds a step function from a list of abscissae and the corresponding\n     * ordinates.\n     *\n     * @param x Abscissae.\n     * @param y Ordinates.\n     * @throws org.apache.commons.math.exception.NonMonotonousSequenceException\n     * if the {@code x} array is not sorted in strictly increasing order.\n     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.\n     * @throws NoDataException if {@code x} or {@code y} are zero-length.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 32)",
        "(line 66,col 9)-(line 66,col 39)",
        "(line 67,col 9)-(line 67,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.StepFunction.value(double)",
      "begin_line": 71,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 53)",
        "(line 73,col 9)-(line 73,col 22)",
        "(line 75,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 18)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/analysis/function/StepFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 34,
      "end_line": 96,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Step_function\"\u003e\n *  Step function\u003c/a\u003e.\n *\n * @version $Id$\n * @since 3.0\n "
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
      "begin_line": 58,
      "end_line": 75,
      "comment": "\n     * Builds a step function from a list of arguments and the corresponding\n     * values. Specifically, returns the function h(x) defined by \u003cpre\u003e\u003ccode\u003e\n     * h(x) \u003d y[0] for all x \u003c x[1]\n     *        y[1] for x[1] \u003c\u003d x \u003c x[2]\n     *        ...\n     *        y[y.length] for x \u003e\u003d x[x.length]\n     * \u003c/code\u003e\u003c/pre\u003e\n     * The value of x[0] is ignored, but it must be strictly less than x[1].\n     *\n     * @param x domain values where the function changes value.\n     * @param y values of the function.\n     * @throws org.apache.commons.math.exception.NonMonotonicSequenceException\n     * if the {@code x} array is not sorted in strictly increasing order.\n     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.\n     * @throws NoDataException if {@code x} or {@code y} are zero-length.\n     * @throws DimensionMismatchException if x and y do not have the same length\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 32)",
        "(line 73,col 9)-(line 73,col 39)",
        "(line 74,col 9)-(line 74,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.StepFunction.value(double)",
      "begin_line": 78,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 53)",
        "(line 80,col 9)-(line 80,col 22)",
        "(line 82,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 18)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/analysis/function/StepFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateFunction"
      ],
      "begin_line": 34,
      "end_line": 98,
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
      "begin_line": 60,
      "end_line": 77,
      "comment": "\n     * Builds a step function from a list of arguments and the corresponding\n     * values. Specifically, returns the function h(x) defined by \u003cpre\u003e\u003ccode\u003e\n     * h(x) \u003d y[0] for all x \u003c x[1]\n     *        y[1] for x[1] \u003c\u003d x \u003c x[2]\n     *        ...\n     *        y[y.length - 1] for x \u003e\u003d x[x.length - 1]\n     * \u003c/code\u003e\u003c/pre\u003e\n     * The value of {@code x[0]} is ignored, but it must be strictly less than\n     * {@code x[1]}.\n     *\n     * @param x Domain values where the function changes value.\n     * @param y Values of the function.\n     * @throws org.apache.commons.math.exception.NonMonotonicSequenceException\n     * if the {@code x} array is not sorted in strictly increasing order.\n     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.\n     * @throws NoDataException if {@code x} or {@code y} are zero-length.\n     * @throws DimensionMismatchException if {@code x} and {@code y} do not\n     * have the same length.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 33)",
        "(line 75,col 9)-(line 75,col 40)",
        "(line 76,col 9)-(line 76,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.StepFunction.value(double)",
      "begin_line": 80,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 53)",
        "(line 82,col 9)-(line 82,col 22)",
        "(line 84,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 18)"
      ]
    }
  ]
}
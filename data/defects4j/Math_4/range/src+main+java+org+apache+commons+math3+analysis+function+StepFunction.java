{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/StepFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 35,
      "end_line": 101,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Step_function\"\u003e\n *  Step function\u003c/a\u003e.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "abscissa"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Abscissae. "
    },
    {
      "type": "field",
      "varNames": [
        "ordinate"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Ordinates. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.StepFunction.StepFunction(double[], double[])",
      "begin_line": 61,
      "end_line": 80,
      "comment": "\n     * Builds a step function from a list of arguments and the corresponding\n     * values. Specifically, returns the function h(x) defined by \u003cpre\u003e\u003ccode\u003e\n     * h(x) \u003d y[0] for all x \u003c x[1]\n     *        y[1] for x[1] \u003c\u003d x \u003c x[2]\n     *        ...\n     *        y[y.length - 1] for x \u003e\u003d x[x.length - 1]\n     * \u003c/code\u003e\u003c/pre\u003e\n     * The value of {@code x[0]} is ignored, but it must be strictly less than\n     * {@code x[1]}.\n     *\n     * @param x Domain values where the function changes value.\n     * @param y Values of the function.\n     * @throws NonMonotonicSequenceException\n     * if the {@code x} array is not sorted in strictly increasing order.\n     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.\n     * @throws NoDataException if {@code x} or {@code y} are zero-length.\n     * @throws DimensionMismatchException if {@code x} and {@code y} do not\n     * have the same length.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 33)",
        "(line 78,col 9)-(line 78,col 40)",
        "(line 79,col 9)-(line 79,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.StepFunction.value(double)",
      "begin_line": 83,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 53)",
        "(line 85,col 9)-(line 85,col 22)",
        "(line 87,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 18)"
      ]
    }
  ]
}
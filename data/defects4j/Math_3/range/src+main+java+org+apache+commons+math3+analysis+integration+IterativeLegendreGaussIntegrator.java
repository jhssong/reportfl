{
  "filepath": "/tmp/Math-3b/src/main/java/org/apache/commons/math3/analysis/integration/IterativeLegendreGaussIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterativeLegendreGaussIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator"
      ],
      "begin_line": 48,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": " Factory that computes the points and weights. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfPoints"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Number of integration points (per interval). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.IterativeLegendreGaussIntegrator(int, double, double, int, int)",
      "begin_line": 69,
      "end_line": 80,
      "comment": "\n     * Builds an integrator with given accuracies and iterations counts.\n     *\n     * @param n Number of integration points.\n     * @param relativeAccuracy Relative accuracy of the result.\n     * @param absoluteAccuracy Absolute accuracy of the result.\n     * @param minimalIterationCount Minimum number of iterations.\n     * @param maximalIterationCount Maximum number of iterations.\n     * @throws NotStrictlyPositiveException if minimal number of iterations\n     * or number of points are not strictly positive.\n     * @throws NumberIsTooSmallException if maximal number of iterations\n     * is smaller than or equal to the minimal number of iterations.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 96)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 8)-(line 79,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.IterativeLegendreGaussIntegrator(int, double, double)",
      "begin_line": 90,
      "end_line": 96,
      "comment": "\n     * Builds an integrator with given accuracies.\n     *\n     * @param n Number of integration points.\n     * @param relativeAccuracy Relative accuracy of the result.\n     * @param absoluteAccuracy Absolute accuracy of the result.\n     * @throws NotStrictlyPositiveException if {@code n \u003c 1}.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 95,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.IterativeLegendreGaussIntegrator(int, int, int)",
      "begin_line": 110,
      "end_line": 116,
      "comment": "\n     * Builds an integrator with given iteration counts.\n     *\n     * @param n Number of integration points.\n     * @param minimalIterationCount Minimum number of iterations.\n     * @param maximalIterationCount Maximum number of iterations.\n     * @throws NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive.\n     * @throws NumberIsTooSmallException if maximal number of iterations\n     * is smaller than or equal to the minimal number of iterations.\n     * @throws NotStrictlyPositiveException if {@code n \u003c 1}.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 115,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.doIntegrate()",
      "begin_line": 119,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 31)",
        "(line 125,col 9)-(line 125,col 18)",
        "(line 126,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.stage(int)",
      "begin_line": 158,
      "end_line": 182,
      "comment": "\n     * Compute the n-th stage integral.\n     *\n     * @param n Number of steps.\n     * @return the value of n-th stage integral.\n     * @throws TooManyEvaluationsException if the maximum number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 166,col 14)",
        "(line 168,col 9)-(line 168,col 36)",
        "(line 169,col 9)-(line 169,col 36)",
        "(line 170,col 9)-(line 170,col 44)",
        "(line 172,col 9)-(line 172,col 23)",
        "(line 173,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.Anonymous-0c31a39a-37d1-4fef-9ec7-569dd9511a42.value(double)",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 21)-(line 164,col 52)"
      ]
    }
  ]
}
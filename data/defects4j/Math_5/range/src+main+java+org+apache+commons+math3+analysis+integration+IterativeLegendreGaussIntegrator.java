{
  "filepath": "/tmp/Math-5b/src/main/java/org/apache/commons/math3/analysis/integration/IterativeLegendreGaussIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterativeLegendreGaussIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator"
      ],
      "begin_line": 40,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": " Factory that computes the points and weights. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfPoints"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Number of integration points (per interval). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.IterativeLegendreGaussIntegrator(int, double, double, int, int)",
      "begin_line": 61,
      "end_line": 72,
      "comment": "\n     * Builds an integrator with given accuracies and iterations counts.\n     *\n     * @param n Number of integration points.\n     * @param relativeAccuracy Relative accuracy of the result.\n     * @param absoluteAccuracy Absolute accuracy of the result.\n     * @param minimalIterationCount Minimum number of iterations.\n     * @param maximalIterationCount Maximum number of iterations.\n     * @throws NotStrictlyPositiveException if minimal number of iterations\n     * or number of points are not strictly positive.\n     * @throws NumberIsTooSmallException if maximal number of iterations\n     * is smaller than or equal to the minimal number of iterations.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 96)",
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 8)-(line 71,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.IterativeLegendreGaussIntegrator(int, double, double)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "\n     * Builds an integrator with given accuracies.\n     *\n     * @param n Number of integration points.\n     * @param relativeAccuracy Relative accuracy of the result.\n     * @param absoluteAccuracy Absolute accuracy of the result.\n     * @throws NotStrictlyPositiveException if {@code n \u003c 1}.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 87,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.IterativeLegendreGaussIntegrator(int, int, int)",
      "begin_line": 102,
      "end_line": 108,
      "comment": "\n     * Builds an integrator with given iteration counts.\n     *\n     * @param n Number of integration points.\n     * @param minimalIterationCount Minimum number of iterations.\n     * @param maximalIterationCount Maximum number of iterations.\n     * @throws NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive.\n     * @throws NumberIsTooSmallException if maximal number of iterations\n     * is smaller than or equal to the minimal number of iterations.\n     * @throws NotStrictlyPositiveException if {@code n \u003c 1}.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.doIntegrate()",
      "begin_line": 111,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 31)",
        "(line 117,col 9)-(line 117,col 18)",
        "(line 118,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.stage(int)",
      "begin_line": 150,
      "end_line": 174,
      "comment": "\n     * Compute the n-th stage integral.\n     *\n     * @param n Number of steps.\n     * @return the value of n-th stage integral.\n     * @throws TooManyEvaluationsException if the maximum number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 158,col 14)",
        "(line 160,col 9)-(line 160,col 36)",
        "(line 161,col 9)-(line 161,col 36)",
        "(line 162,col 9)-(line 162,col 44)",
        "(line 164,col 9)-(line 164,col 23)",
        "(line 165,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.Anonymous-79c4cf7d-ee24-4303-a5ce-5b6ec525a19f.value(double)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 21)-(line 156,col 52)"
      ]
    }
  ]
}
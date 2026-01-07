{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/analysis/integration/IterativeLegendreGaussIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterativeLegendreGaussIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator"
      ],
      "begin_line": 38,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": " Factory that computes the points and weights. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfPoints"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Number of integration points (per interval). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.IterativeLegendreGaussIntegrator(int, double, double, int, int)",
      "begin_line": 59,
      "end_line": 67,
      "comment": "\n     * Builds an integrator with given accuracies and iterations counts.\n     *\n     * @param n Number of integration points.\n     * @param relativeAccuracy Relative accuracy of the result.\n     * @param absoluteAccuracy Absolute accuracy of the result.\n     * @param minimalIterationCount Minimum number of iterations.\n     * @param maximalIterationCount Maximum number of iterations.\n     * @throws NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive.\n     * @throws NumberIsTooSmallException if maximal number of iterations\n     * is smaller than or equal to the minimal number of iterations.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 96)",
        "(line 66,col 9)-(line 66,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.IterativeLegendreGaussIntegrator(int, double, double)",
      "begin_line": 76,
      "end_line": 81,
      "comment": "\n     * Builds an integrator with given accuracies.\n     *\n     * @param n Number of integration points.\n     * @param relativeAccuracy Relative accuracy of the result.\n     * @param absoluteAccuracy Absolute accuracy of the result.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 80,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.IterativeLegendreGaussIntegrator(int, int, int)",
      "begin_line": 94,
      "end_line": 99,
      "comment": "\n     * Builds an integrator with given iteration counts.\n     *\n     * @param n Number of integration points.\n     * @param minimalIterationCount Minimum number of iterations.\n     * @param maximalIterationCount Maximum number of iterations.\n     * @throws NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive.\n     * @throws NumberIsTooSmallException if maximal number of iterations\n     * is smaller than or equal to the minimal number of iterations.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 98,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.doIntegrate()",
      "begin_line": 102,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 31)",
        "(line 108,col 9)-(line 108,col 18)",
        "(line 109,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.stage(int)",
      "begin_line": 141,
      "end_line": 164,
      "comment": "\n     * Compute the n-th stage integral.\n     *\n     * @param n Number of steps.\n     * @return the value of n-th stage integral.\n     * @throws TooManyEvaluationsException if the maximum number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 148,col 14)",
        "(line 150,col 9)-(line 150,col 36)",
        "(line 151,col 9)-(line 151,col 36)",
        "(line 152,col 9)-(line 152,col 44)",
        "(line 154,col 9)-(line 154,col 23)",
        "(line 155,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.Anonymous-1be2d32a-537c-4ea7-b62b-8195ce3ae6df.value(double)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 21)-(line 146,col 52)"
      ]
    }
  ]
}
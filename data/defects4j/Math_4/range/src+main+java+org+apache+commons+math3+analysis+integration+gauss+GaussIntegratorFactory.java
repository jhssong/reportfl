{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/GaussIntegratorFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussIntegratorFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 145,
      "comment": "\n * Class that provides different ways to compute the nodes and weights to be\n * used by the {@link GaussIntegrator Gaussian integration rule}.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "legendre"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Generator of Gauss-Legendre integrators. "
    },
    {
      "type": "field",
      "varNames": [
        "legendreHighPrecision"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Generator of Gauss-Legendre integrators. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendre(int)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Creates an integrator of the given order, and whose call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the natural interval\n     * {@code [-1 , 1]}.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @return a Gauss-Legendre integrator.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendre(int, double, double)",
      "begin_line": 62,
      "end_line": 68,
      "comment": "\n     * Creates an integrator of the given order, and whose call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the given interval.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @param lowerBound Lower bound of the integration interval.\n     * @param upperBound Upper bound of the integration interval.\n     * @return a Gauss-Legendre integrator.\n     * @throws NotStrictlyPositiveException if number of points is not positive\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 67,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendreHighPrecision(int)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Creates an integrator of the given order, and whose call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the natural interval\n     * {@code [-1 , 1]}.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @return a Gauss-Legendre integrator.\n     * @throws NotStrictlyPositiveException if number of points is not positive\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendreHighPrecision(int, double, double)",
      "begin_line": 96,
      "end_line": 102,
      "comment": "\n     * Creates an integrator of the given order, and whose call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the given interval.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @param lowerBound Lower bound of the integration interval.\n     * @param upperBound Upper bound of the integration interval.\n     * @return a Gauss-Legendre integrator.\n     * @throws NotStrictlyPositiveException if number of points is not positive\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 101,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.getRule(org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory\u003c? extends java.lang.Number\u003e, int)",
      "begin_line": 112,
      "end_line": 116,
      "comment": "\n     * @param factory Integration rule factory.\n     * @param numberOfPoints Order of the integration rule.\n     * @return the integration nodes and weights.\n     * @throws NotStrictlyPositiveException if number of points is not positive\n     * @throws DimensionMismatchException if the elements of the rule pair do not\n     * have the same length.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.transform(org.apache.commons.math3.util.Pair\u003cdouble[], double[]\u003e, double, double)",
      "begin_line": 128,
      "end_line": 144,
      "comment": "\n     * Performs a change of variable so that the integration can be performed\n     * on an arbitrary interval {@code [a, b]}.\n     * It is assumed that the natural interval is {@code [-1, 1]}.\n     *\n     * @param rule Original points and weights.\n     * @param a Lower bound of the integration interval.\n     * @param b Lower bound of the integration interval.\n     * @return the points and weights adapted to the new interval.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 48)",
        "(line 132,col 9)-(line 132,col 50)",
        "(line 135,col 9)-(line 135,col 41)",
        "(line 136,col 9)-(line 136,col 39)",
        "(line 138,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 61)"
      ]
    }
  ]
}
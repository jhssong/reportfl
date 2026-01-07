{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/GaussIntegratorFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussIntegratorFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 133,
      "comment": "\n * Class that provides different ways to compute the nodes and weights to be\n * used by the {@link GaussIntegrator Gaussian integration rule}.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "legendre"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Generator of Gauss-Legendre integrators. "
    },
    {
      "type": "field",
      "varNames": [
        "legendreHighPrecision"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Generator of Gauss-Legendre integrators. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendre(int)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Creates an integrator of the given order, and whose call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the natural interval\n     * {@code [-1 , 1]}.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @return a Gauss-Legendre integrator.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendre(int, double, double)",
      "begin_line": 59,
      "end_line": 64,
      "comment": "\n     * Creates an integrator of the given order, and whose call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the given interval.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @param lowerBound Lower bound of the integration interval.\n     * @param upperBound Upper bound of the integration interval.\n     * @return a Gauss-Legendre integrator.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 63,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendreHighPrecision(int)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Creates an integrator of the given order, and whose call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the natural interval\n     * {@code [-1 , 1]}.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @return a Gauss-Legendre integrator.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendreHighPrecision(int, double, double)",
      "begin_line": 89,
      "end_line": 94,
      "comment": "\n     * Creates an integrator of the given order, and whose call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the given interval.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @param lowerBound Lower bound of the integration interval.\n     * @param upperBound Upper bound of the integration interval.\n     * @return a Gauss-Legendre integrator.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 93,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.getRule(org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory\u003c? extends java.lang.Number\u003e, int)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * @param factory Integration rule factory.\n     * @param numberOfPoints Order of the integration rule.\n     * @return the integration nodes and weights.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.transform(org.apache.commons.math3.util.Pair\u003cdouble[], double[]\u003e, double, double)",
      "begin_line": 116,
      "end_line": 132,
      "comment": "\n     * Performs a change of variable so that the integration can be performed\n     * on an arbitrary interval {@code [a, b]}.\n     * It is assumed that the natural interval is {@code [-1, 1]}.\n     *\n     * @param rule Original points and weights.\n     * @param a Lower bound of the integration interval.\n     * @param b Lower bound of the integration interval.\n     * @return the points and weights adapted to the new interval.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 48)",
        "(line 120,col 9)-(line 120,col 50)",
        "(line 123,col 9)-(line 123,col 41)",
        "(line 124,col 9)-(line 124,col 39)",
        "(line 126,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 61)"
      ]
    }
  ]
}
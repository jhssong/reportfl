{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/GaussIntegratorFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussIntegratorFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 170,
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
      "type": "field",
      "varNames": [
        "hermite"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Generator of Gauss-Hermite integrators. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendre(int)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Creates a Gauss-Legendre integrator of the given order.\n     * The call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the natural interval\n     * {@code [-1 , 1]}.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @return a Gauss-Legendre integrator.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendre(int, double, double)",
      "begin_line": 66,
      "end_line": 72,
      "comment": "\n     * Creates a Gauss-Legendre integrator of the given order.\n     * The call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the given interval.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @param lowerBound Lower bound of the integration interval.\n     * @param upperBound Upper bound of the integration interval.\n     * @return a Gauss-Legendre integrator.\n     * @throws NotStrictlyPositiveException if number of points is not positive\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 71,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendreHighPrecision(int)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Creates a Gauss-Legendre integrator of the given order.\n     * The call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the natural interval\n     * {@code [-1 , 1]}.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @return a Gauss-Legendre integrator.\n     * @throws NotStrictlyPositiveException if number of points is not positive\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.legendreHighPrecision(int, double, double)",
      "begin_line": 101,
      "end_line": 107,
      "comment": "\n     * Creates an integrator of the given order, and whose call to the\n     * {@link GaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform an integration on the given interval.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @param lowerBound Lower bound of the integration interval.\n     * @param upperBound Upper bound of the integration interval.\n     * @return a Gauss-Legendre integrator.\n     * @throws NotStrictlyPositiveException if number of points is not positive\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 106,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.hermite(int)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Creates a Gauss-Hermite integrator of the given order.\n     * The call to the\n     * {@link SymmetricGaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method will perform a weighted integration on the interval\n     * {@code [-\u0026inf;, +\u0026inf;]}: the computed value is the improper integral of\n     * \u003ccode\u003e\n     *  e\u003csup\u003e-x\u003csup\u003e2\u003c/sup\u003e\u003c/sup\u003e f(x)\n     * \u003c/code\u003e\n     * where {@code f(x)} is the function passed to the\n     * {@link SymmetricGaussIntegrator#integrate(org.apache.commons.math3.analysis.UnivariateFunction)\n     * integrate} method.\n     *\n     * @param numberOfPoints Order of the integration rule.\n     * @return a Gauss-Hermite integrator.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.getRule(org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory\u003c? extends java.lang.Number\u003e, int)",
      "begin_line": 137,
      "end_line": 141,
      "comment": "\n     * @param factory Integration rule factory.\n     * @param numberOfPoints Order of the integration rule.\n     * @return the integration nodes and weights.\n     * @throws NotStrictlyPositiveException if number of points is not positive\n     * @throws DimensionMismatchException if the elements of the rule pair do not\n     * have the same length.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory.transform(org.apache.commons.math3.util.Pair\u003cdouble[], double[]\u003e, double, double)",
      "begin_line": 153,
      "end_line": 169,
      "comment": "\n     * Performs a change of variable so that the integration can be performed\n     * on an arbitrary interval {@code [a, b]}.\n     * It is assumed that the natural interval is {@code [-1, 1]}.\n     *\n     * @param rule Original points and weights.\n     * @param a Lower bound of the integration interval.\n     * @param b Lower bound of the integration interval.\n     * @return the points and weights adapted to the new interval.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 48)",
        "(line 157,col 9)-(line 157,col 50)",
        "(line 160,col 9)-(line 160,col 41)",
        "(line 161,col 9)-(line 161,col 39)",
        "(line 163,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 61)"
      ]
    }
  ]
}
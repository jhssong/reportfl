{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/analysis/integration/gauss/GaussianQuadratureAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianQuadratureAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 116,
      "comment": "\n * Base class for standard testing of Gaussian quadrature rules,\n * which are exact for polynomials up to a certain degree. In this test, each\n * monomial in turn is tested against the specified quadrature rule.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "eps"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * The maximum absolute error (for zero testing).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numUlps"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * The maximum relative error (in ulps).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "integrator"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * The quadrature rule under test.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxDegree"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Maximum degree of monomials to be tested.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussianQuadratureAbstractTest.GaussianQuadratureAbstractTest(org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator, int, double, double)",
      "begin_line": 64,
      "end_line": 72,
      "comment": "\n     * Creates a new instance of this abstract test with the specified\n     * quadrature rule.\n     * If the expected value is non-zero, equality of actual and expected values\n     * is checked in the relative sense \u003ccenter\u003e\n     * |x\u003csub\u003eact\u003c/sub\u003e\u0026nbsp;-\u0026nbsp;x\u003csub\u003eexp\u003c/sub\u003e|\u0026nbsp;\u0026le;\u0026nbsp; n\u0026nbsp;\n     * \u003ccode\u003eMath.ulp(\u003c/code\u003ex\u003csub\u003eexp\u003c/sub\u003e\u003ccode\u003e)\u003c/code\u003e, \u003c/center\u003e where n is\n     * the maximum relative error (in ulps). If the expected value is zero, the\n     * test checks that \u003ccenter\u003e |x\u003csub\u003eact\u003c/sub\u003e|\u0026nbsp;\u0026le;\u0026nbsp;\u0026epsilon;,\n     * \u003c/center\u003e where \u0026epsilon; is the maximum absolute error.\n     *\n     * @param integrator Quadrature rule under test.\n     * @param maxDegree Maximum degree of monomials to be tested.\n     * @param eps \u0026epsilon;.\n     * @param numUlps Value of the maximum relative error (in ulps).\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 37)",
        "(line 69,col 9)-(line 69,col 35)",
        "(line 70,col 9)-(line 70,col 23)",
        "(line 71,col 9)-(line 71,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussianQuadratureAbstractTest.getExpectedValue(int)",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Returns the expected value of the integral of the specified monomial.\n     * The integration is carried out on the natural interval of the quadrature\n     * rule under test.\n     *\n     * @param n Degree of the monomial.\n     * @return the expected value of the integral of x\u003csup\u003en\u003c/sup\u003e.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussianQuadratureAbstractTest.testAllMonomials()",
      "begin_line": 92,
      "end_line": 115,
      "comment": "\n\t * Checks that the value of the integral of each monomial\n     *   \u003ccode\u003ex\u003csup\u003e0\u003c/sup\u003e, ... , x\u003csup\u003ep\u003c/sup\u003e\u003c/code\u003e\n     * returned by the quadrature rule under test conforms with the expected\n     * value.\n     * Here {@code p} denotes the degree of the highest polynomial for which\n     * exactness is to be expected.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 114,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-1b/src/test/java/org/apache/commons/math3/analysis/integration/gauss/HermiteParametricTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HermiteParametricTest",
      "is_interface": false,
      "parent_types": [
        "GaussianQuadratureAbstractTest"
      ],
      "begin_line": 36,
      "end_line": 97,
      "comment": "\n * Test of the {@link HermiteRuleFactory}.\n * This parameterized test extends the standard test for Gaussian quadrature\n * rule, where each monomial is tested in turn.\n * Parametrization allows to test automatically 0, 1, ... , {@link #MAX_NUM_POINTS}\n * quadrature rules.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT_PI"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NUM_POINTS"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * The highest order quadrature rule to be tested.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.HermiteParametricTest.HermiteParametricTest(int, int, double, double)",
      "begin_line": 55,
      "end_line": 61,
      "comment": "\n     * Creates a new instance of this test, with the specified number of nodes\n     * for the Gauss-Hermite quadrature rule.\n     *\n     * @param numberOfPoints Order of integration rule.\n     * @param maxDegree Maximum degree of monomials to be tested.\n     * @param eps Value of \u0026epsilon;.\n     * @param numUlps Value of the maximum relative error (in ulps).\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 60,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.HermiteParametricTest.getParameters()",
      "begin_line": 71,
      "end_line": 79,
      "comment": "\n     * Returns the collection of parameters to be passed to the constructor of\n     * this class.\n     * Gauss-Hermite quadrature rules of order 1, ..., {@link #MAX_NUM_POINTS}\n     * will be constructed.\n     *\n     * @return the collection of parameters for this parameterized test.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 73)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.HermiteParametricTest.getExpectedValue(int)",
      "begin_line": 81,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 31)",
        "(line 88,col 9)-(line 88,col 21)",
        "(line 89,col 9)-(line 89,col 21)",
        "(line 90,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 95,col 31)"
      ]
    }
  ]
}
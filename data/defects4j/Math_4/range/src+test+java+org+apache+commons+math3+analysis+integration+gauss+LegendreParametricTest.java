{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/analysis/integration/gauss/LegendreParametricTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendreParametricTest",
      "is_interface": false,
      "parent_types": [
        "GaussianQuadratureAbstractTest"
      ],
      "begin_line": 35,
      "end_line": 85,
      "comment": "\n * Test of the {@link LegendreRuleFactory}.\n * This parameterized test extends the standard test for Gaussian quadrature\n * rule, where each monomial is tested in turn.\n * Parametrization allows to test automatically 0, 1, ... , {@link #MAX_NUM_POINTS}\n * quadrature rules.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NUM_POINTS"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * The highest order quadrature rule to be tested.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.LegendreParametricTest.LegendreParametricTest(int, int, double, double)",
      "begin_line": 53,
      "end_line": 59,
      "comment": "\n     * Creates a new instance of this test, with the specified number of nodes\n     * for the Gauss-Legendre quadrature rule.\n     *\n     * @param numberOfPoints Order of integration rule.\n     * @param maxDegree Maximum degree of monomials to be tested.\n     * @param eps Value of \u0026epsilon;.\n     * @param numUlps Value of the maximum relative error (in ulps).\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 58,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.LegendreParametricTest.getParameters()",
      "begin_line": 69,
      "end_line": 76,
      "comment": "\n     * Returns the collection of parameters to be passed to the constructor of\n     * this class.\n     * Gauss-Legendre quadrature rules of order 1, ..., {@link #MAX_NUM_POINTS}\n     * will be constructed.\n     *\n     * @return the collection of parameters for this parameterized test.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 73)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.LegendreParametricTest.getExpectedValue(int)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 28)"
      ]
    }
  ]
}
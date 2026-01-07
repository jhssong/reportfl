{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/analysis/integration/UnivariateRealIntegratorImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegratorImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl",
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator"
      ],
      "begin_line": 30,
      "end_line": 177,
      "comment": "\n * Provide a default implementation for several generic functions.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "minimalIterationCount"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMinimalIterationCount"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " default minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " indicates whether an integral has been computed "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " the last computed integral "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": " The integrand functione.\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int)",
      "begin_line": 58,
      "end_line": 78,
      "comment": "\n      * Construct an integrator with given iteration count and accuracy.\n      *\n      * @param f the integrand function\n      * @param defaultMaximalIterationCount maximum number of iterations\n      * @throws IllegalArgumentException if f is null or the iteration\n      * limits are not valid\n      * @deprecated as of 2.0 the integrand function is passed as an argument\n      * to the {@link #integrate(UnivariateRealFunction, double, double)}method.\n      ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 63)",
        "(line 64,col 9)-(line 64,col 37)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 70,col 19)",
        "(line 73,col 9)-(line 73,col 36)",
        "(line 74,col 9)-(line 74,col 46)",
        "(line 75,col 9)-(line 75,col 66)",
        "(line 77,col 9)-(line 77,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(int)",
      "begin_line": 87,
      "end_line": 98,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     *\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the iteration\n     * limits are not valid\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 63)",
        "(line 91,col 9)-(line 91,col 37)",
        "(line 93,col 9)-(line 93,col 36)",
        "(line 94,col 9)-(line 94,col 46)",
        "(line 95,col 9)-(line 95,col 66)",
        "(line 97,col 9)-(line 97,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getResult()",
      "begin_line": 106,
      "end_line": 112,
      "comment": "\n     * Access the last computed integral.\n     *\n     * @return the last computed integral\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setResult(double, int)",
      "begin_line": 120,
      "end_line": 124,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param newResult the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 40)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 123,col 9)-(line 123,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.clearResult()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 32)",
        "(line 131,col 9)-(line 131,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setMinimalIterationCount(int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getMinimalIterationCount()",
      "begin_line": 140,
      "end_line": 142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.resetMinimalIterationCount()",
      "begin_line": 145,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.verifyInterval(double, double)",
      "begin_line": 156,
      "end_line": 163,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     *\n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.verifyIterationCount()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     * Verifies that the upper and lower limits of iterations are valid.\n     *\n     * @throws IllegalArgumentException if not valid\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 175,col 9)"
      ]
    }
  ]
}
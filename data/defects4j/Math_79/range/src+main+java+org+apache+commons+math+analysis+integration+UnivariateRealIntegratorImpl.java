{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/integration/UnivariateRealIntegratorImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegratorImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator"
      ],
      "begin_line": 29,
      "end_line": 178,
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
      "begin_line": 36,
      "end_line": 36,
      "comment": " minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMinimalIterationCount"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " default minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " indicates whether an integral has been computed "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " the last computed integral "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 50,
      "end_line": 51,
      "comment": " The integrand functione.\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int)",
      "begin_line": 63,
      "end_line": 80,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     *\n     * @param f the integrand function\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the iteration\n     * limits are not valid\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 53)",
        "(line 68,col 9)-(line 70,col 9)",
        "(line 72,col 9)-(line 72,col 19)",
        "(line 75,col 9)-(line 75,col 36)",
        "(line 76,col 9)-(line 76,col 46)",
        "(line 77,col 9)-(line 77,col 66)",
        "(line 79,col 9)-(line 79,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(int)",
      "begin_line": 89,
      "end_line": 99,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     *\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the iteration\n     * limits are not valid\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 53)",
        "(line 94,col 9)-(line 94,col 36)",
        "(line 95,col 9)-(line 95,col 46)",
        "(line 96,col 9)-(line 96,col 66)",
        "(line 98,col 9)-(line 98,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getResult()",
      "begin_line": 107,
      "end_line": 113,
      "comment": "\n     * Access the last computed integral.\n     *\n     * @return the last computed integral\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setResult(double, int)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param newResult the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 40)",
        "(line 123,col 9)-(line 123,col 45)",
        "(line 124,col 9)-(line 124,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.clearResult()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 32)",
        "(line 132,col 9)-(line 132,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setMinimalIterationCount(int)",
      "begin_line": 136,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getMinimalIterationCount()",
      "begin_line": 141,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.resetMinimalIterationCount()",
      "begin_line": 146,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.verifyInterval(double, double)",
      "begin_line": 157,
      "end_line": 164,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     *\n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.verifyIterationCount()",
      "begin_line": 171,
      "end_line": 177,
      "comment": "\n     * Verifies that the upper and lower limits of iterations are valid.\n     *\n     * @throws IllegalArgumentException if not valid\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 176,col 9)"
      ]
    }
  ]
}
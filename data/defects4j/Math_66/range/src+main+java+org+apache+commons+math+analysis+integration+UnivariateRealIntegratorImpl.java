{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/analysis/integration/UnivariateRealIntegratorImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegratorImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator"
      ],
      "begin_line": 30,
      "end_line": 179,
      "comment": "\n * Provide a default implementation for several generic functions.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "minimalIterationCount"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMinimalIterationCount"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " default minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " indicates whether an integral has been computed "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " the last computed integral "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": " The integrand functione.\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int)",
      "begin_line": 64,
      "end_line": 81,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     *\n     * @param f the integrand function\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the iteration\n     * limits are not valid\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 53)",
        "(line 69,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 73,col 19)",
        "(line 76,col 9)-(line 76,col 36)",
        "(line 77,col 9)-(line 77,col 46)",
        "(line 78,col 9)-(line 78,col 66)",
        "(line 80,col 9)-(line 80,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(int)",
      "begin_line": 90,
      "end_line": 100,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     *\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the iteration\n     * limits are not valid\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 53)",
        "(line 95,col 9)-(line 95,col 36)",
        "(line 96,col 9)-(line 96,col 46)",
        "(line 97,col 9)-(line 97,col 66)",
        "(line 99,col 9)-(line 99,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getResult()",
      "begin_line": 108,
      "end_line": 114,
      "comment": "\n     * Access the last computed integral.\n     *\n     * @return the last computed integral\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setResult(double, int)",
      "begin_line": 122,
      "end_line": 126,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param newResult the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 40)",
        "(line 124,col 9)-(line 124,col 45)",
        "(line 125,col 9)-(line 125,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.clearResult()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 32)",
        "(line 133,col 9)-(line 133,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setMinimalIterationCount(int)",
      "begin_line": 137,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getMinimalIterationCount()",
      "begin_line": 142,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.resetMinimalIterationCount()",
      "begin_line": 147,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.verifyInterval(double, double)",
      "begin_line": 158,
      "end_line": 165,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     *\n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.verifyIterationCount()",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n     * Verifies that the upper and lower limits of iterations are valid.\n     *\n     * @throws IllegalArgumentException if not valid\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 177,col 9)"
      ]
    }
  ]
}
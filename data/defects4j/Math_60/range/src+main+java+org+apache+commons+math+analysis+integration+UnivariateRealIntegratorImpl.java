{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/analysis/integration/UnivariateRealIntegratorImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegratorImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator"
      ],
      "begin_line": 31,
      "end_line": 180,
      "comment": "\n * Provide a default implementation for several generic functions.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "minimalIterationCount"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMinimalIterationCount"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " default minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " indicates whether an integral has been computed "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " the last computed integral "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": " The integrand functione.\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int)",
      "begin_line": 65,
      "end_line": 82,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     *\n     * @param f the integrand function\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the iteration\n     * limits are not valid\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 53)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 74,col 19)",
        "(line 77,col 9)-(line 77,col 36)",
        "(line 78,col 9)-(line 78,col 46)",
        "(line 79,col 9)-(line 79,col 66)",
        "(line 81,col 9)-(line 81,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(int)",
      "begin_line": 91,
      "end_line": 101,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     *\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the iteration\n     * limits are not valid\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 53)",
        "(line 96,col 9)-(line 96,col 36)",
        "(line 97,col 9)-(line 97,col 46)",
        "(line 98,col 9)-(line 98,col 66)",
        "(line 100,col 9)-(line 100,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getResult()",
      "begin_line": 109,
      "end_line": 115,
      "comment": "\n     * Access the last computed integral.\n     *\n     * @return the last computed integral\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setResult(double, int)",
      "begin_line": 123,
      "end_line": 127,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param newResult the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 40)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.clearResult()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 32)",
        "(line 134,col 9)-(line 134,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setMinimalIterationCount(int)",
      "begin_line": 138,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getMinimalIterationCount()",
      "begin_line": 143,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.resetMinimalIterationCount()",
      "begin_line": 148,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.verifyInterval(double, double)",
      "begin_line": 159,
      "end_line": 166,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     *\n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.verifyIterationCount()",
      "begin_line": 173,
      "end_line": 179,
      "comment": "\n     * Verifies that the upper and lower limits of iterations are valid.\n     *\n     * @throws IllegalArgumentException if not valid\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 178,col 9)"
      ]
    }
  ]
}
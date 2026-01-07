{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/analysis/integration/UnivariateRealIntegratorImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegratorImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator"
      ],
      "begin_line": 29,
      "end_line": 198,
      "comment": "\n * Provide a default implementation for several generic functions.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "minimalIterationCount"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMinimalIterationCount"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " default minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The last iteration count. "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " indicates whether an integral has been computed "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " the last computed integral "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(int)",
      "begin_line": 63,
      "end_line": 71,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     *\n     * @param maximalIterationCount maximum number of iterations\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 56)",
        "(line 66,col 9)-(line 66,col 37)",
        "(line 67,col 9)-(line 67,col 36)",
        "(line 68,col 9)-(line 68,col 36)",
        "(line 70,col 9)-(line 70,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setMaximalIterationCount(int)",
      "begin_line": 74,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getMaximalIterationCount()",
      "begin_line": 79,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setAbsoluteAccuracy(double)",
      "begin_line": 84,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getAbsoluteAccuracy()",
      "begin_line": 89,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setRelativeAccuracy(double)",
      "begin_line": 94,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getRelativeAccuracy()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getResult()",
      "begin_line": 104,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setResult(double, int)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param newResult the result to set\n     * @param newCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 40)",
        "(line 120,col 9)-(line 120,col 39)",
        "(line 121,col 9)-(line 121,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.clearResult()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)",
        "(line 129,col 9)-(line 129,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.setMinimalIterationCount(int)",
      "begin_line": 133,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.getMinimalIterationCount()",
      "begin_line": 138,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.resetMinimalIterationCount()",
      "begin_line": 143,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.verifyInterval(double, double)",
      "begin_line": 154,
      "end_line": 161,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     *\n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.verifyIterationCount()",
      "begin_line": 168,
      "end_line": 174,
      "comment": "\n     * Verifies that the upper and lower limits of iterations are valid.\n     *\n     * @throws IllegalArgumentException if not valid\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.resetIterationsCounter()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Reset the iterations counter to 0.\n     *\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.incrementIterationsCounter()",
      "begin_line": 192,
      "end_line": 196,
      "comment": "\n     * Increment the iterations counter by 1.\n     *\n     * @throws MaxCountExceededException if the maximal number\n     * of iterations is exceeded.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/analysis/UnivariateRealIntegratorImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegratorImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealIntegrator",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 258,
      "comment": "\n * Provide a default implementation for several generic functions.\n *  \n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " maximum relative error "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " maximum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "minimalIterationCount"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRelativeAccuracy"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " default maximum relative error "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " default maximum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMinimalIterationCount"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " default minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " indicates whether an integral has been computed "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " the last computed integral "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " the last iteration count "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " the integrand function "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int)",
      "begin_line": 73,
      "end_line": 92,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     * \n     * @param f the integrand function\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the iteration\n     * limits are not valid\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 19)",
        "(line 83,col 9)-(line 83,col 73)",
        "(line 84,col 9)-(line 84,col 66)",
        "(line 86,col 9)-(line 86,col 44)",
        "(line 87,col 9)-(line 87,col 56)",
        "(line 88,col 9)-(line 88,col 46)",
        "(line 89,col 9)-(line 89,col 66)",
        "(line 91,col 9)-(line 91,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getResult()",
      "begin_line": 100,
      "end_line": 106,
      "comment": "\n     * Access the last computed integral.\n     * \n     * @return the last computed integral\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getIterationCount()",
      "begin_line": 114,
      "end_line": 120,
      "comment": "\n     * Access the last iteration count.\n     * \n     * @return the last iteration count\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setResult(double, int)",
      "begin_line": 128,
      "end_line": 132,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 29)",
        "(line 130,col 9)-(line 130,col 45)",
        "(line 131,col 9)-(line 131,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.clearResult()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setMaximalIterationCount(int)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Set the upper limit for the number of iterations.\n     * \n     * @param count maximum number of iterations\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getMaximalIterationCount()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     * \n     * @return the actual upper limit\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetMaximalIterationCount()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Reset the upper limit for the number of iterations to the default.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setMinimalIterationCount(int)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Set the lower limit for the number of iterations.\n     * \n     * @param count minimum number of iterations\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getMinimalIterationCount()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Get the lower limit for the number of iterations.\n     * \n     * @return the actual lower limit\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetMinimalIterationCount()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Reset the lower limit for the number of iterations to the default.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setRelativeAccuracy(double)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Set the relative accuracy.\n     * \n     * @param accuracy the relative accuracy\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the integrator or is otherwise deemed unreasonable\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getRelativeAccuracy()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Get the actual relative accuracy.\n     *\n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetRelativeAccuracy()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Reset the relative accuracy to the default.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.isSequence(double, double, double)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     * \n     * @param start first number\n     * @param mid second number\n     * @param end third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.verifyInterval(double, double)",
      "begin_line": 237,
      "end_line": 244,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     * \n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.verifyIterationCount()",
      "begin_line": 251,
      "end_line": 257,
      "comment": "\n     * Verifies that the upper and lower limits of iterations are valid.\n     * \n     * @throws IllegalArgumentException if not valid\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 256,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/analysis/UnivariateRealIntegratorImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegratorImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealIntegrator",
        "java.io.Serializable"
      ],
      "begin_line": 27,
      "end_line": 256,
      "comment": "\n * Provide a default implementation for several generic functions.\n *  \n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " maximum relative error "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " maximum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "minimalIterationCount"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRelativeAccuracy"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " default maximum relative error "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " default maximum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMinimalIterationCount"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " default minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " indicates whether an integral has been computed "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " the last computed integral "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " the last iteration count "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " the integrand function "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int)",
      "begin_line": 71,
      "end_line": 90,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     * \n     * @param f the integrand function\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the iteration\n     * limits are not valid\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 19)",
        "(line 81,col 9)-(line 81,col 73)",
        "(line 82,col 9)-(line 82,col 66)",
        "(line 84,col 9)-(line 84,col 44)",
        "(line 85,col 9)-(line 85,col 56)",
        "(line 86,col 9)-(line 86,col 46)",
        "(line 87,col 9)-(line 87,col 66)",
        "(line 89,col 9)-(line 89,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getResult()",
      "begin_line": 98,
      "end_line": 104,
      "comment": "\n     * Access the last computed integral.\n     * \n     * @return the last computed integral\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getIterationCount()",
      "begin_line": 112,
      "end_line": 118,
      "comment": "\n     * Access the last iteration count.\n     * \n     * @return the last iteration count\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setResult(double, int)",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 29)",
        "(line 128,col 9)-(line 128,col 45)",
        "(line 129,col 9)-(line 129,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.clearResult()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setMaximalIterationCount(int)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Set the upper limit for the number of iterations.\n     * \n     * @param count maximum number of iterations\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getMaximalIterationCount()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     * \n     * @return the actual upper limit\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetMaximalIterationCount()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Reset the upper limit for the number of iterations to the default.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setMinimalIterationCount(int)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Set the lower limit for the number of iterations.\n     * \n     * @param count minimum number of iterations\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getMinimalIterationCount()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Get the lower limit for the number of iterations.\n     * \n     * @return the actual lower limit\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetMinimalIterationCount()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Reset the lower limit for the number of iterations to the default.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setRelativeAccuracy(double)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Set the relative accuracy.\n     * \n     * @param accuracy the relative accuracy\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the integrator or is otherwise deemed unreasonable\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getRelativeAccuracy()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Get the actual relative accuracy.\n     *\n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetRelativeAccuracy()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Reset the relative accuracy to the default.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.isSequence(double, double, double)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     * \n     * @param start first number\n     * @param mid second number\n     * @param end third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.verifyInterval(double, double)",
      "begin_line": 235,
      "end_line": 242,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     * \n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.verifyIterationCount()",
      "begin_line": 249,
      "end_line": 255,
      "comment": "\n     * Verifies that the upper and lower limits of iterations are valid.\n     * \n     * @throws IllegalArgumentException if not valid\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 254,col 9)"
      ]
    }
  ]
}
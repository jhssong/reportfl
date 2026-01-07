{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/analysis/UnivariateRealIntegratorImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegratorImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealIntegrator",
        "java.io.Serializable"
      ],
      "begin_line": 26,
      "end_line": 255,
      "comment": "\n * Provide a default implementation for several generic functions.\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " maximum relative error "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " maximum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "minimalIterationCount"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRelativeAccuracy"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " default maximum relative error "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " default maximum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMinimalIterationCount"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " default minimum number of iterations "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " indicates whether an integral has been computed "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " the last computed integral "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " the last iteration count "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " the integrand function "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int)",
      "begin_line": 70,
      "end_line": 89,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     * \n     * @param f the integrand function\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the iteration\n     * limits are not valid\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 19)",
        "(line 80,col 9)-(line 80,col 73)",
        "(line 81,col 9)-(line 81,col 66)",
        "(line 83,col 9)-(line 83,col 44)",
        "(line 84,col 9)-(line 84,col 56)",
        "(line 85,col 9)-(line 85,col 46)",
        "(line 86,col 9)-(line 86,col 66)",
        "(line 88,col 9)-(line 88,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getResult()",
      "begin_line": 97,
      "end_line": 103,
      "comment": "\n     * Access the last computed integral.\n     * \n     * @return the last computed integral\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getIterationCount()",
      "begin_line": 111,
      "end_line": 117,
      "comment": "\n     * Access the last iteration count.\n     * \n     * @return the last iteration count\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setResult(double, int)",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 29)",
        "(line 127,col 9)-(line 127,col 45)",
        "(line 128,col 9)-(line 128,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.clearResult()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setMaximalIterationCount(int)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Set the upper limit for the number of iterations.\n     * \n     * @param count maximum number of iterations\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getMaximalIterationCount()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     * \n     * @return the actual upper limit\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetMaximalIterationCount()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Reset the upper limit for the number of iterations to the default.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setMinimalIterationCount(int)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Set the lower limit for the number of iterations.\n     * \n     * @param count minimum number of iterations\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getMinimalIterationCount()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Get the lower limit for the number of iterations.\n     * \n     * @return the actual lower limit\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetMinimalIterationCount()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Reset the lower limit for the number of iterations to the default.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setRelativeAccuracy(double)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Set the relative accuracy.\n     * \n     * @param accuracy the relative accuracy\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the integrator or is otherwise deemed unreasonable\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getRelativeAccuracy()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Get the actual relative accuracy.\n     *\n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetRelativeAccuracy()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Reset the relative accuracy to the default.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.isSequence(double, double, double)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     * \n     * @param start first number\n     * @param mid second number\n     * @param end third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.verifyInterval(double, double)",
      "begin_line": 234,
      "end_line": 241,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     * \n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.verifyIterationCount()",
      "begin_line": 248,
      "end_line": 254,
      "comment": "\n     * Verifies that the upper and lower limits of iterations are valid.\n     * \n     * @throws IllegalArgumentException if not valid\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 253,col 9)"
      ]
    }
  ]
}
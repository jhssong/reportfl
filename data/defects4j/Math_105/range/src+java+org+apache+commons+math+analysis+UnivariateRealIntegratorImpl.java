{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/analysis/UnivariateRealIntegratorImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegratorImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealIntegrator",
        "java.io.Serializable"
      ],
      "begin_line": 25,
      "end_line": 254,
      "comment": "\n * Provide a default implementation for several generic functions.\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " maximum relative error "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " maximum number of iterations "
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
        "defaultRelativeAccuracy"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " default maximum relative error "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " default maximum number of iterations "
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
        "resultComputed"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " indicates whether an integral has been computed "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " the last computed integral "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " the last iteration count "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " the integrand function "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.UnivariateRealIntegratorImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int)",
      "begin_line": 69,
      "end_line": 88,
      "comment": "\n     * Construct an integrator with given iteration count and accuracy.\n     * \n     * @param f the integrand function\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the iteration\n     * limits are not valid\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 19)",
        "(line 79,col 9)-(line 79,col 73)",
        "(line 80,col 9)-(line 80,col 66)",
        "(line 82,col 9)-(line 82,col 44)",
        "(line 83,col 9)-(line 83,col 56)",
        "(line 84,col 9)-(line 84,col 46)",
        "(line 85,col 9)-(line 85,col 66)",
        "(line 87,col 9)-(line 87,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getResult()",
      "begin_line": 96,
      "end_line": 102,
      "comment": "\n     * Access the last computed integral.\n     * \n     * @return the last computed integral\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getIterationCount()",
      "begin_line": 110,
      "end_line": 116,
      "comment": "\n     * Access the last iteration count.\n     * \n     * @return the last iteration count\n     * @throws IllegalStateException if no integral has been computed\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setResult(double, int)",
      "begin_line": 124,
      "end_line": 128,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 29)",
        "(line 126,col 9)-(line 126,col 45)",
        "(line 127,col 9)-(line 127,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.clearResult()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setMaximalIterationCount(int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Set the upper limit for the number of iterations.\n     * \n     * @param count maximum number of iterations\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getMaximalIterationCount()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     * \n     * @return the actual upper limit\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetMaximalIterationCount()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Reset the upper limit for the number of iterations to the default.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setMinimalIterationCount(int)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Set the lower limit for the number of iterations.\n     * \n     * @param count minimum number of iterations\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getMinimalIterationCount()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Get the lower limit for the number of iterations.\n     * \n     * @return the actual lower limit\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetMinimalIterationCount()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Reset the lower limit for the number of iterations to the default.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.setRelativeAccuracy(double)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Set the relative accuracy.\n     * \n     * @param accuracy the relative accuracy\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the integrator or is otherwise deemed unreasonable\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.getRelativeAccuracy()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Get the actual relative accuracy.\n     *\n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.resetRelativeAccuracy()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Reset the relative accuracy to the default.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.isSequence(double, double, double)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     * \n     * @param start first number\n     * @param mid second number\n     * @param end third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.verifyInterval(double, double)",
      "begin_line": 233,
      "end_line": 240,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     * \n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.verifyIterationCount()",
      "begin_line": 247,
      "end_line": 253,
      "comment": "\n     * Verifies that the upper and lower limits of iterations are valid.\n     * \n     * @throws IllegalArgumentException if not valid\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 252,col 9)"
      ]
    }
  ]
}
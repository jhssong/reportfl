{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/distribution/AbstractContinuousDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractContinuousDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractDistribution",
        "org.apache.commons.math.distribution.ContinuousDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 145,
      "comment": "\n * Base class for continuous distributions.  Default implementations are\n * provided for some of the methods that do not vary from distribution to\n * distribution.\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.AbstractContinuousDistribution()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.inverseCumulativeProbability(double)",
      "begin_line": 60,
      "end_line": 112,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 65,col 9)",
        "(line 69,col 9)-(line 79,col 10)",
        "(line 82,col 9)-(line 82,col 51)",
        "(line 83,col 9)-(line 83,col 51)",
        "(line 84,col 9)-(line 84,col 32)",
        "(line 85,col 9)-(line 106,col 9)",
        "(line 109,col 9)-(line 110,col 39)",
        "(line 111,col 9)-(line 111,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.Anonymous-1f4e57d3-180c-44dd-a07b-0f3eeb674496.value(double)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 73,col 17)-(line 77,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getInitialDomain(double)",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainLowerBound(double)",
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractContinuousDistribution.getDomainUpperBound(double)",
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": []
    }
  ]
}
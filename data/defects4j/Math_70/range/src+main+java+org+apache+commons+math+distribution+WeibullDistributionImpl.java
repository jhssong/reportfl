{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/WeibullDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeibullDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.WeibullDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 260,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.WeibullDistribution}.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.WeibullDistributionImpl(double, double)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Creates weibull distribution with the given shape and scale and a\n     * location equal to zero.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.WeibullDistributionImpl(double, double, double)",
      "begin_line": 71,
      "end_line": 76,
      "comment": "\n     * Creates weibull distribution with the given shape, scale and inverse\n     * cumulative probability accuracy and a location equal to zero.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 16)",
        "(line 73,col 9)-(line 73,col 32)",
        "(line 74,col 9)-(line 74,col 31)",
        "(line 75,col 9)-(line 75,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.cumulativeProbability(double)",
      "begin_line": 83,
      "end_line": 91,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 19)",
        "(line 85,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getShape()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Access the shape parameter.\n     * @return the shape parameter.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getScale()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Access the scale parameter.\n     * @return the scale parameter.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.density(double)",
      "begin_line": 116,
      "end_line": 133,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 122,col 40)",
        "(line 123,col 9)-(line 123,col 61)",
        "(line 130,col 9)-(line 130,col 57)",
        "(line 132,col 9)-(line 132,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 147,
      "end_line": 161,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 19)",
        "(line 150,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setShape(double)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * Modify the shape parameter.\n     * @param alpha the new shape parameter value.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setShapeInternal(double)",
      "begin_line": 176,
      "end_line": 183,
      "comment": "\n     * Modify the shape parameter.\n     * @param alpha the new shape parameter value.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setScale(double)",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Modify the scale parameter.\n     * @param beta the new scale parameter value.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setScaleInternal(double)",
      "begin_line": 198,
      "end_line": 205,
      "comment": "\n     * Modify the scale parameter.\n     * @param beta the new scale parameter value.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 230,
      "end_line": 233,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getInitialDomain(double)",
      "begin_line": 243,
      "end_line": 247,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 38)"
      ]
    }
  ]
}
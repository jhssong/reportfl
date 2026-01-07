{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/optimization/univariate/AbstractUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.optimization.UnivariateRealOptimizer"
      ],
      "begin_line": 31,
      "end_line": 115,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * optimizers.\n *  \n * @version $Revision$ $Date$\n * @since 2.0\n "
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
        "resultComputed"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Indicates where a root has been computed. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValue"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Value of the function at the last computed result. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.AbstractUnivariateRealOptimizer(int, double)",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * \n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 69)",
        "(line 57,col 9)-(line 57,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.checkResultComputed()",
      "begin_line": 63,
      "end_line": 67,
      "comment": " Check if a result has been computed.\n     * @exception IllegalStateException if no result has been computed\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getResult()",
      "begin_line": 70,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 30)",
        "(line 72,col 9)-(line 72,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getFunctionValue()",
      "begin_line": 76,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 30)",
        "(line 78,col 9)-(line 78,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setResult(double, int)",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 37)",
        "(line 89,col 9)-(line 89,col 45)",
        "(line 90,col 9)-(line 90,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setResult(double, double, int)",
      "begin_line": 100,
      "end_line": 106,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param x the result to set\n     * @param fx the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 32)",
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 45)",
        "(line 105,col 9)-(line 105,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.clearResult()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 36)"
      ]
    }
  ]
}
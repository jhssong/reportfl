{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/analysis/minimization/UnivariateRealMinimizerImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealMinimizerImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizer"
      ],
      "begin_line": 30,
      "end_line": 112,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * minimizers.\n *  \n * @version $Revision$ $Date$\n * @since 2.0\n "
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
        "resultComputed"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Indicates where a root has been computed. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValue"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Value of the function at the last computed result. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.UnivariateRealMinimizerImpl(int, double)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * \n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.checkResultComputed()",
      "begin_line": 61,
      "end_line": 65,
      "comment": " Check if a result has been computed.\n     * @exception IllegalStateException if no result has been computed\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.getResult()",
      "begin_line": 68,
      "end_line": 71,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 30)",
        "(line 70,col 9)-(line 70,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.getFunctionValue()",
      "begin_line": 74,
      "end_line": 77,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 30)",
        "(line 76,col 9)-(line 76,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.setResult(double, int)",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 29)",
        "(line 87,col 9)-(line 87,col 45)",
        "(line 88,col 9)-(line 88,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.setResult(double, double, int)",
      "begin_line": 98,
      "end_line": 103,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param x the result to set\n     * @param fx the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 24)",
        "(line 100,col 9)-(line 100,col 32)",
        "(line 101,col 9)-(line 101,col 45)",
        "(line 102,col 9)-(line 102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.clearResult()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 36)"
      ]
    }
  ]
}
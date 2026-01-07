{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/regression/MultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultipleLinearRegression",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 70,
      "comment": "\n * The multiple linear regression can be represented in matrix-notation.\n * \u003cpre\u003e\n *  y\u003dX*b+u\n * \u003c/pre\u003e\n * where y is an \u003ccode\u003en-vector\u003c/code\u003e \u003cb\u003eregressand\u003c/b\u003e, X is a \u003ccode\u003e[n,k]\u003c/code\u003e matrix whose \u003ccode\u003ek\u003c/code\u003e columns are called\n * \u003cb\u003eregressors\u003c/b\u003e, b is \u003ccode\u003ek-vector\u003c/code\u003e of \u003cb\u003eregression parameters\u003c/b\u003e and \u003ccode\u003eu\u003c/code\u003e is an \u003ccode\u003en-vector\u003c/code\u003e\n * of \u003cb\u003eerror terms\u003c/b\u003e or \u003cb\u003eresiduals\u003c/b\u003e.\n *\n * The notation is quite standard in literature,\n * cf eg \u003ca href\u003d\"http://www.econ.queensu.ca/ETM\"\u003eDavidson and MacKinnon, Econometrics Theory and Methods, 2004\u003c/a\u003e.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MultipleLinearRegression.estimateRegressionParameters()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Estimates the regression parameters b.\n     *\n     * @return The [k,1] array representing b\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MultipleLinearRegression.estimateRegressionParametersVariance()",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Estimates the variance of the regression parameters, ie Var(b).\n     *\n     * @return The [k,k] array representing the variance of b\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MultipleLinearRegression.estimateResiduals()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Estimates the residuals, ie u \u003d y - X*b.\n     *\n     * @return The [n,1] array representing the residuals\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MultipleLinearRegression.estimateRegressandVariance()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Returns the variance of the regressand, ie Var(y).\n     *\n     * @return The double representing the variance of y\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MultipleLinearRegression.estimateRegressionParametersStandardErrors()",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Returns the standard errors of the regression parameters.\n     *\n     * @return standard errors of estimated regression parameters\n     ",
      "child_ranges": []
    }
  ]
}
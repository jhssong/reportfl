{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/differentiation/UnivariateDifferentiableFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateDifferentiableFunction",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 31,
      "end_line": 44,
      "comment": " Interface for univariate functions derivatives.\n * \u003cp\u003eThis interface represents a simple function which computes\n * both the value and the first derivative of a mathematical function.\n * The derivative is computed with respect to the input variable.\u003c/p\u003e\n * @see UnivariateDifferentiableFunction\n * @see UnivariateFunctionDifferentiator\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 41,
      "end_line": 42,
      "comment": " Simple mathematical function.\n     * \u003cp\u003e{@link UnivariateDifferentiableFunction} classes compute both the\n     * value and the first derivative of the function.\u003c/p\u003e\n     * @param t function input value\n     * @return function result\n     * @exception DimensionMismatchException if t is inconsistent with the\n     * function\u0027s free parameters or order\n     ",
      "child_ranges": []
    }
  ]
}
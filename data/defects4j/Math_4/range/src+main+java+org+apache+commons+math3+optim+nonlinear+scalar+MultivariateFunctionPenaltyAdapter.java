{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/MultivariateFunctionPenaltyAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateFunctionPenaltyAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateFunction"
      ],
      "begin_line": 68,
      "end_line": 187,
      "comment": "\n * \u003cp\u003eAdapter extending bounded {@link MultivariateFunction} to an unbouded\n * domain using a penalty function.\u003c/p\u003e\n *\n * \u003cp\u003e\n * This adapter can be used to wrap functions subject to simple bounds on\n * parameters so they can be used by optimizers that do \u003cem\u003enot\u003c/em\u003e directly\n * support simple bounds.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The principle is that the user function that will be wrapped will see its\n * parameters bounded as required, i.e when its {@code value} method is called\n * with argument array {@code point}, the elements array will fulfill requirement\n * {@code lower[i] \u003c\u003d point[i] \u003c\u003d upper[i]} for all i. Some of the components\n * may be unbounded or bounded only on one side if the corresponding bound is\n * set to an infinite value. The optimizer will not manage the user function by\n * itself, but it will handle this adapter and it is this adapter that will take\n * care the bounds are fulfilled. The adapter {@link #value(double[])} method will\n * be called by the optimizer with unbound parameters, and the adapter will check\n * if the parameters is within range or not. If it is in range, then the underlying\n * user function will be called, and if it is not the value of a penalty function\n * will be returned instead.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This adapter is only a poor-man\u0027s solution to simple bounds optimization\n * constraints that can be used with simple optimizers like\n * {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer\n * SimplexOptimizer}.\n * A better solution is to use an optimizer that directly supports simple bounds like\n * {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer\n * CMAESOptimizer} or\n * {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer\n * BOBYQAOptimizer}.\n * One caveat of this poor-man\u0027s solution is that if start point or start simplex\n * is completely outside of the allowed range, only the penalty function is used,\n * and the optimizer may converge without ever entering the range.\n * \u003c/p\u003e\n *\n * @see MultivariateFunctionMappingAdapter\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "bounded"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Underlying bounded function. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Upper bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Penalty offset. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Penalty scales. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapter.MultivariateFunctionPenaltyAdapter(org.apache.commons.math3.analysis.MultivariateFunction, double[], double[], double, double[])",
      "begin_line": 123,
      "end_line": 149,
      "comment": "\n     * Simple constructor.\n     * \u003cp\u003e\n     * When the optimizer provided points are out of range, the value of the\n     * penalty function will be used instead of the value of the underlying\n     * function. In order for this penalty to be effective in rejecting this\n     * point during the optimization process, the penalty function value should\n     * be defined with care. This value is computed as:\n     * \u003cpre\u003e\n     *   penalty(point) \u003d offset + \u0026sum;\u003csub\u003ei\u003c/sub\u003e[scale[i] * \u0026radic;|point[i]-boundary[i]|]\n     * \u003c/pre\u003e\n     * where indices i correspond to all the components that violates their boundaries.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * So when attempting a function minimization, offset should be larger than\n     * the maximum expected value of the underlying function and scale components\n     * should all be positive. When attempting a function maximization, offset\n     * should be lesser than the minimum expected value of the underlying function\n     * and scale components should all be negative.\n     * minimization, and lesser than the minimum expected value of the underlying\n     * function when attempting maximization.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * These choices for the penalty function have two properties. First, all out\n     * of range points will return a function value that is worse than the value\n     * returned by any in range point. Second, the penalty is worse for large\n     * boundaries violation than for small violations, so the optimizer has an hint\n     * about the direction in which it should search for acceptable points.\n     * \u003c/p\u003e\n     * @param bounded bounded function\n     * @param lower lower bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.NEGATIVE_INFINITY} for\n     * unbounded values)\n     * @param upper upper bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.POSITIVE_INFINITY} for\n     * unbounded values)\n     * @param offset base offset of the penalty function\n     * @param scale scale of the penalty function\n     * @exception DimensionMismatchException if lower bounds, upper bounds and\n     * scales are not consistent, either according to dimension or to bounadary\n     * values\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 38)",
        "(line 129,col 9)-(line 129,col 38)",
        "(line 130,col 9)-(line 130,col 38)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 31)",
        "(line 145,col 9)-(line 145,col 37)",
        "(line 146,col 9)-(line 146,col 37)",
        "(line 147,col 9)-(line 147,col 30)",
        "(line 148,col 9)-(line 148,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapter.value(double[])",
      "begin_line": 162,
      "end_line": 186,
      "comment": "\n     * Computes the underlying function value from an unbounded point.\n     * \u003cp\u003e\n     * This method simply returns the value of the underlying function\n     * if the unbounded point already fulfills the bounds, and compute\n     * a replacement value using the offset and scale if bounds are\n     * violated, without calling the function at all.\n     * \u003c/p\u003e\n     * @param point unbounded point\n     * @return either underlying function value or penalty function value\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 181,col 9)",
        "(line 185,col 9)-(line 185,col 36)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/direct/MultivariateFunctionPenaltyAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateFunctionPenaltyAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateFunction"
      ],
      "begin_line": 66,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bounded"
      ],
      "begin_line": 70,
      "end_line": 70,
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
      "begin_line": 76,
      "end_line": 76,
      "comment": " Upper bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Penalty offset. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Penalty scales. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapter.MultivariateFunctionPenaltyAdapter(org.apache.commons.math3.analysis.MultivariateFunction, double[], double[], double, double[])",
      "begin_line": 125,
      "end_line": 152,
      "comment": " Simple constructor.\n     * \u003cp\u003e\n     * When the optimizer provided points are out of range, the value of the\n     * penalty function will be used instead of the value of the underlying\n     * function. In order for this penalty to be effective in rejecting this\n     * point during the optimization process, the penalty function value should\n     * be defined with care. This value is computed as:\n     * \u003cpre\u003e\n     *   penalty(point) \u003d offset + \u0026sum;\u003csub\u003ei\u003c/sub\u003e[scale[i] * \u0026radic;|point[i]-boundary[i]|]\n     * \u003c/pre\u003e\n     * where indices i correspond to all the components that violates their boundaries.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * So when attempting a function minimization, offset should be larger than\n     * the maximum expected value of the underlying function and scale components\n     * should all be positive. When attempting a function maximization, offset\n     * should be lesser than the minimum expected value of the underlying function\n     * and scale components should all be negative.\n     * minimization, and lesser than the minimum expected value of the underlying\n     * function when attempting maximization.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * These choices for the penalty function have two properties. First, all out\n     * of range points will return a function value that is worse than the value\n     * returned by any in range point. Second, the penalty is worse for large\n     * boundaries violation than for small violations, so the optimizer has an hint\n     * about the direction in which it should search for acceptable points.\n     * \u003c/p\u003e\n     * @param bounded bounded function\n     * @param lower lower bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.NEGATIVE_INFINITY} for\n     * unbounded values)\n     * @param upper upper bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.POSITIVE_INFINITY} for\n     * unbounded values)\n     * @param offset base offset of the penalty function\n     * @param scale scale of the penalty function\n     * @exception DimensionMismatchException if lower bounds, upper bounds and\n     * scales are not consistent, either according to dimension or to bounadary\n     * values\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 38)",
        "(line 131,col 9)-(line 131,col 38)",
        "(line 132,col 9)-(line 132,col 38)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 146,col 31)",
        "(line 147,col 9)-(line 147,col 37)",
        "(line 148,col 9)-(line 148,col 37)",
        "(line 149,col 9)-(line 149,col 30)",
        "(line 150,col 9)-(line 150,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapter.value(double[])",
      "begin_line": 164,
      "end_line": 189,
      "comment": " Compute the underlying function value from an unbounded point.\n     * \u003cp\u003e\n     * This method simply returns the value of the underlying function\n     * if the unbounded point already fulfills the bounds, and compute\n     * a replacement value using the offset and scale if bounds are\n     * violated, without calling the function at all.\n     * \u003c/p\u003e\n     * @param point unbounded point\n     * @return either underlying function value or penalty function value\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 183,col 9)",
        "(line 187,col 9)-(line 187,col 36)"
      ]
    }
  ]
}
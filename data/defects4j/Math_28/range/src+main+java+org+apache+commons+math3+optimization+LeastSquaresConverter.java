{
  "filepath": "/tmp/Math-28b/src/main/java/org/apache/commons/math3/optimization/LeastSquaresConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LeastSquaresConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateFunction"
      ],
      "begin_line": 56,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Underlying vectorial function. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Observations to be compared to objective function to compute residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Optional weights for the residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Optional scaling matrix (weight and correlations) for the residuals. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math3.analysis.MultivariateVectorFunction, double[])",
      "begin_line": 74,
      "end_line": 80,
      "comment": " Build a simple converter for uncorrelated residuals with the same weight.\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 37)",
        "(line 77,col 9)-(line 77,col 49)",
        "(line 78,col 9)-(line 78,col 33)",
        "(line 79,col 9)-(line 79,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math3.analysis.MultivariateVectorFunction, double[], double[])",
      "begin_line": 110,
      "end_line": 119,
      "comment": " Build a simple converter for uncorrelated residuals with the specific weights.\n     * \u003cp\u003e\n     * The scalar objective function value is computed as:\n     * \u003cpre\u003e\n     * objective \u003d \u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(observation\u003csub\u003ei\u003c/sub\u003e-objective\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Weights can be used for example to combine residuals with different standard\n     * deviations. As an example, consider a residuals array in which even elements\n     * are angular measurements in degrees with a 0.01\u0026deg; standard deviation and\n     * odd elements are distance measurements in meters with a 15m standard deviation.\n     * In this case, the weights array should be initialized with value\n     * 1.0/(0.01\u003csup\u003e2\u003c/sup\u003e) in the even elements and 1.0/(15.0\u003csup\u003e2\u003c/sup\u003e) in the\n     * odd elements (i.e. reciprocals of variances).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The array computed by the objective function, the observations array and the\n     * weights array must have consistent sizes or a {@link DimensionMismatchException}\n     * will be triggered while computing the scalar objective.\n     * \u003c/p\u003e\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     * @param weights weights to apply to the residuals\n     * @exception DimensionMismatchException if the observations vector and the weights\n     * vector dimensions do not match (objective function dimension is checked only when\n     * the {@link #value(double[])} method is called)\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 37)",
        "(line 116,col 9)-(line 116,col 49)",
        "(line 117,col 9)-(line 117,col 44)",
        "(line 118,col 9)-(line 118,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math3.analysis.MultivariateVectorFunction, double[], org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 140,
      "end_line": 149,
      "comment": " Build a simple converter for correlated residuals with the specific weights.\n     * \u003cp\u003e\n     * The scalar objective function value is computed as:\n     * \u003cpre\u003e\n     * objective \u003d y\u003csup\u003eT\u003c/sup\u003ey with y \u003d scale\u0026times;(observation-objective)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The array computed by the objective function, the observations array and the\n     * the scaling matrix must have consistent sizes or a {@link DimensionMismatchException}\n     * will be triggered while computing the scalar objective.\n     * \u003c/p\u003e\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     * @param scale scaling matrix\n     * @throws DimensionMismatchException if the observations vector and the scale\n     * matrix dimensions do not match (objective function dimension is checked only when\n     * the {@link #value(double[])} method is called)\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 37)",
        "(line 146,col 9)-(line 146,col 49)",
        "(line 147,col 9)-(line 147,col 33)",
        "(line 148,col 9)-(line 148,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.LeastSquaresConverter.value(double[])",
      "begin_line": 152,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 57)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 163,col 9)-(line 163,col 30)",
        "(line 164,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 26)"
      ]
    }
  ]
}
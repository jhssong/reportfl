{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/LeastSquaresConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LeastSquaresConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateFunction"
      ],
      "begin_line": 55,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Underlying vectorial function. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Observations to be compared to objective function to compute residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Optional weights for the residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Optional scaling matrix (weight and correlations) for the residuals. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math3.analysis.MultivariateVectorFunction, double[])",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\n     * Builds a simple converter for uncorrelated residuals with identical\n     * weights.\n     *\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 37)",
        "(line 75,col 9)-(line 75,col 49)",
        "(line 76,col 9)-(line 76,col 33)",
        "(line 77,col 9)-(line 77,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math3.analysis.MultivariateVectorFunction, double[], double[])",
      "begin_line": 111,
      "end_line": 121,
      "comment": "\n     * Builds a simple converter for uncorrelated residuals with the\n     * specified weights.\n     * \u003cp\u003e\n     * The scalar objective function value is computed as:\n     * \u003cpre\u003e\n     * objective \u003d \u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(observation\u003csub\u003ei\u003c/sub\u003e-objective\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Weights can be used for example to combine residuals with different standard\n     * deviations. As an example, consider a residuals array in which even elements\n     * are angular measurements in degrees with a 0.01\u0026deg; standard deviation and\n     * odd elements are distance measurements in meters with a 15m standard deviation.\n     * In this case, the weights array should be initialized with value\n     * 1.0/(0.01\u003csup\u003e2\u003c/sup\u003e) in the even elements and 1.0/(15.0\u003csup\u003e2\u003c/sup\u003e) in the\n     * odd elements (i.e. reciprocals of variances).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The array computed by the objective function, the observations array and the\n     * weights array must have consistent sizes or a {@link DimensionMismatchException}\n     * will be triggered while computing the scalar objective.\n     * \u003c/p\u003e\n     *\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     * @param weights weights to apply to the residuals\n     * @throws DimensionMismatchException if the observations vector and the weights\n     * vector dimensions do not match (objective function dimension is checked only when\n     * the {@link #value(double[])} method is called)\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 37)",
        "(line 118,col 9)-(line 118,col 49)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math3.analysis.MultivariateVectorFunction, double[], org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 145,
      "end_line": 155,
      "comment": "\n     * Builds a simple converter for correlated residuals with the\n     * specified weights.\n     * \u003cp\u003e\n     * The scalar objective function value is computed as:\n     * \u003cpre\u003e\n     * objective \u003d y\u003csup\u003eT\u003c/sup\u003ey with y \u003d scale\u0026times;(observation-objective)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The array computed by the objective function, the observations array and the\n     * the scaling matrix must have consistent sizes or a {@link DimensionMismatchException}\n     * will be triggered while computing the scalar objective.\n     * \u003c/p\u003e\n     *\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     * @param scale scaling matrix\n     * @throws DimensionMismatchException if the observations vector and the scale\n     * matrix dimensions do not match (objective function dimension is checked only when\n     * the {@link #value(double[])} method is called)\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 37)",
        "(line 152,col 9)-(line 152,col 49)",
        "(line 153,col 9)-(line 153,col 33)",
        "(line 154,col 9)-(line 154,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.LeastSquaresConverter.value(double[])",
      "begin_line": 158,
      "end_line": 186,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 57)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 169,col 9)-(line 169,col 30)",
        "(line 170,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 26)"
      ]
    }
  ]
}
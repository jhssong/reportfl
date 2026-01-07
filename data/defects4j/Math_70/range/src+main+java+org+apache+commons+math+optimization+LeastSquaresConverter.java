{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/LeastSquaresConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LeastSquaresConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.MultivariateRealFunction"
      ],
      "begin_line": 57,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Underlying vectorial function. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Observations to be compared to objective function to compute residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Optional weights for the residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Optional scaling matrix (weight and correlations) for the residuals. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math.analysis.MultivariateVectorialFunction, double[])",
      "begin_line": 75,
      "end_line": 81,
      "comment": " Build a simple converter for uncorrelated residuals with the same weight.\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 37)",
        "(line 78,col 9)-(line 78,col 49)",
        "(line 79,col 9)-(line 79,col 33)",
        "(line 80,col 9)-(line 80,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math.analysis.MultivariateVectorialFunction, double[], double[])",
      "begin_line": 111,
      "end_line": 123,
      "comment": " Build a simple converter for uncorrelated residuals with the specific weights.\n     * \u003cp\u003e\n     * The scalar objective function value is computed as:\n     * \u003cpre\u003e\n     * objective \u003d \u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(observation\u003csub\u003ei\u003c/sub\u003e-objective\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Weights can be used for example to combine residuals with different standard\n     * deviations. As an example, consider a residuals array in which even elements\n     * are angular measurements in degrees with a 0.01\u0026deg; standard deviation and\n     * odd elements are distance measurements in meters with a 15m standard deviation.\n     * In this case, the weights array should be initialized with value\n     * 1.0/(0.01\u003csup\u003e2\u003c/sup\u003e) in the even elements and 1.0/(15.0\u003csup\u003e2\u003c/sup\u003e) in the\n     * odd elements (i.e. reciprocals of variances).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The array computed by the objective function, the observations array and the\n     * weights array must have consistent sizes or a {@link FunctionEvaluationException} will be\n     * triggered while computing the scalar objective.\n     * \u003c/p\u003e\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     * @param weights weights to apply to the residuals\n     * @exception IllegalArgumentException if the observations vector and the weights\n     * vector dimensions don\u0027t match (objective function dimension is checked only when\n     * the {@link #value(double[])} method is called)\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 120,col 9)-(line 120,col 49)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math.analysis.MultivariateVectorialFunction, double[], org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 144,
      "end_line": 156,
      "comment": " Build a simple converter for correlated residuals with the specific weights.\n     * \u003cp\u003e\n     * The scalar objective function value is computed as:\n     * \u003cpre\u003e\n     * objective \u003d y\u003csup\u003eT\u003c/sup\u003ey with y \u003d scale\u0026times;(observation-objective)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The array computed by the objective function, the observations array and the\n     * the scaling matrix must have consistent sizes or a {@link FunctionEvaluationException}\n     * will be triggered while computing the scalar objective.\n     * \u003c/p\u003e\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     * @param scale scaling matrix\n     * @exception IllegalArgumentException if the observations vector and the scale\n     * matrix dimensions don\u0027t match (objective function dimension is checked only when\n     * the {@link #value(double[])} method is called)\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 37)",
        "(line 153,col 9)-(line 153,col 49)",
        "(line 154,col 9)-(line 154,col 33)",
        "(line 155,col 9)-(line 155,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.LeastSquaresConverter.value(double[])",
      "begin_line": 159,
      "end_line": 190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 57)",
        "(line 163,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 172,col 9)-(line 172,col 30)",
        "(line 173,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 26)"
      ]
    }
  ]
}
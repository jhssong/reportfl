{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/optimization/LeastSquaresConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LeastSquaresConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.MultivariateRealFunction"
      ],
      "begin_line": 58,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Underlying vectorial function. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Observations to be compared to objective function to compute residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Optional weights for the residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Optional scaling matrix (weight and correlations) for the residuals. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math.analysis.MultivariateVectorialFunction, double[])",
      "begin_line": 76,
      "end_line": 82,
      "comment": " Build a simple converter for uncorrelated residuals with the same weight.\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 37)",
        "(line 79,col 9)-(line 79,col 49)",
        "(line 80,col 9)-(line 80,col 33)",
        "(line 81,col 9)-(line 81,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math.analysis.MultivariateVectorialFunction, double[], double[])",
      "begin_line": 112,
      "end_line": 124,
      "comment": " Build a simple converter for uncorrelated residuals with the specific weights.\n     * \u003cp\u003e\n     * The scalar objective function value is computed as:\n     * \u003cpre\u003e\n     * objective \u003d \u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(observation\u003csub\u003ei\u003c/sub\u003e-objective\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Weights can be used for example to combine residuals with different standard\n     * deviations. As an example, consider a residuals array in which even elements\n     * are angular measurements in degrees with a 0.01\u0026deg; standard deviation and\n     * odd elements are distance measurements in meters with a 15m standard deviation.\n     * In this case, the weights array should be initialized with value\n     * 1.0/(0.01\u003csup\u003e2\u003c/sup\u003e) in the even elements and 1.0/(15.0\u003csup\u003e2\u003c/sup\u003e) in the\n     * odd elements (i.e. reciprocals of variances).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The array computed by the objective function, the observations array and the\n     * weights array must have consistent sizes or a {@link FunctionEvaluationException} will be\n     * triggered while computing the scalar objective.\n     * \u003c/p\u003e\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     * @param weights weights to apply to the residuals\n     * @exception IllegalArgumentException if the observations vector and the weights\n     * vector dimensions don\u0027t match (objective function dimension is checked only when\n     * the {@link #value(double[])} method is called)\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 37)",
        "(line 121,col 9)-(line 121,col 49)",
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.LeastSquaresConverter.LeastSquaresConverter(org.apache.commons.math.analysis.MultivariateVectorialFunction, double[], org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 145,
      "end_line": 157,
      "comment": " Build a simple converter for correlated residuals with the specific weights.\n     * \u003cp\u003e\n     * The scalar objective function value is computed as:\n     * \u003cpre\u003e\n     * objective \u003d y\u003csup\u003eT\u003c/sup\u003ey with y \u003d scale\u0026times;(observation-objective)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The array computed by the objective function, the observations array and the\n     * the scaling matrix must have consistent sizes or a {@link FunctionEvaluationException}\n     * will be triggered while computing the scalar objective.\n     * \u003c/p\u003e\n     * @param function vectorial residuals function to wrap\n     * @param observations observations to be compared to objective function to compute residuals\n     * @param scale scaling matrix\n     * @exception IllegalArgumentException if the observations vector and the scale\n     * matrix dimensions don\u0027t match (objective function dimension is checked only when\n     * the {@link #value(double[])} method is called)\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 37)",
        "(line 154,col 9)-(line 154,col 49)",
        "(line 155,col 9)-(line 155,col 33)",
        "(line 156,col 9)-(line 156,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.LeastSquaresConverter.value(double[])",
      "begin_line": 160,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 57)",
        "(line 164,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 173,col 9)-(line 173,col 30)",
        "(line 174,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 26)"
      ]
    }
  ]
}
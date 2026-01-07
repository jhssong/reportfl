{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/optimization/fitting/GaussianFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 120,
      "comment": "\n * Fits points to a Gaussian function (that is, a {@link GaussianFunction}).\n * \u003cp\u003e\n * Usage example:\n * \u003cpre\u003e\n *   GaussianFitter fitter \u003d new GaussianFitter(\n *     new LevenbergMarquardtOptimizer());\n *   fitter.addObservedPoint(4.0254623,  531026.0);\n *   fitter.addObservedPoint(4.03128248, 984167.0);\n *   fitter.addObservedPoint(4.03839603, 1887233.0);\n *   fitter.addObservedPoint(4.04421621, 2687152.0);\n *   fitter.addObservedPoint(4.05132976, 3461228.0);\n *   fitter.addObservedPoint(4.05326982, 3580526.0);\n *   fitter.addObservedPoint(4.05779662, 3439750.0);\n *   fitter.addObservedPoint(4.0636168,  2877648.0);\n *   fitter.addObservedPoint(4.06943698, 2175960.0);\n *   fitter.addObservedPoint(4.07525716, 1447024.0);\n *   fitter.addObservedPoint(4.08237071, 717104.0);\n *   fitter.addObservedPoint(4.08366408, 620014.0);\n *  GaussianFunction fitFunction \u003d fitter.fit();\n * \u003c/pre\u003e\n *\n * @see ParametricGaussianFunction\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "fitter"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Fitter used for fitting. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.GaussianFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Constructs an instance using the specified optimizer.\n     *\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.addObservedPoint(double, double)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Adds point (\u003ccode\u003ex\u003c/code\u003e, \u003ccode\u003ey\u003c/code\u003e) to list of observed points\n     * with a weight of 1.0.\n     *\n     * @param x \u003ctt\u003ex\u003c/tt\u003e point value\n     * @param y \u003ctt\u003ey\u003c/tt\u003e point value\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.addObservedPoint(double, double, double)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Adds point (\u003ccode\u003ex\u003c/code\u003e, \u003ccode\u003ey\u003c/code\u003e) to list of observed points\n     * with a weight of \u003ccode\u003eweight\u003c/code\u003e.\n     *\n     * @param weight weight assigned to point\n     * @param x \u003ctt\u003ex\u003c/tt\u003e point value\n     * @param y \u003ctt\u003ey\u003c/tt\u003e point value\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.fit()",
      "begin_line": 102,
      "end_line": 106,
      "comment": "\n     * Fits Gaussian function to the observed points.\n     *\n     * @return Gaussian function best fitting the observed points\n     *\n     * @throws FunctionEvaluationException if \u003ccode\u003eCurveFitter.fit\u003c/code\u003e\n     *         throws it\n     * @throws OptimizationException if \u003ccode\u003eCurveFitter.fit\u003c/code\u003e throws it\n     * @throws IllegalArgumentException if \u003ccode\u003eCurveFitter.fit\u003c/code\u003e throws\n     *         it\n     *\n     * @see CurveFitter\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 105,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.createParametersGuesser(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Factory method to create a \u003ccode\u003eGaussianParametersGuesser\u003c/code\u003e\n     * instance initialized with the specified observations.\n     *\n     * @param observations points used to initialize the created\n     *        \u003ccode\u003eGaussianParametersGuesser\u003c/code\u003e instance\n     *\n     * @return new \u003ccode\u003eGaussianParametersGuesser\u003c/code\u003e instance\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 59)"
      ]
    }
  ]
}
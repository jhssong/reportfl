{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/optimization/fitting/GaussianFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 110,
      "comment": "\n * Fits points to a Gaussian function (that is, a {@link GaussianFunction}).\n * \u003cp\u003e\n * Usage example:\n * \u003cpre\u003e\n *   GaussianFitter fitter \u003d new GaussianFitter(\n *     new LevenbergMarquardtOptimizer());\n *   fitter.addObservedPoint(4.0254623,  531026.0);\n *   fitter.addObservedPoint(4.03128248, 984167.0);\n *   fitter.addObservedPoint(4.03839603, 1887233.0);\n *   fitter.addObservedPoint(4.04421621, 2687152.0);\n *   fitter.addObservedPoint(4.05132976, 3461228.0);\n *   fitter.addObservedPoint(4.05326982, 3580526.0);\n *   fitter.addObservedPoint(4.05779662, 3439750.0);\n *   fitter.addObservedPoint(4.0636168,  2877648.0);\n *   fitter.addObservedPoint(4.06943698, 2175960.0);\n *   fitter.addObservedPoint(4.07525716, 1447024.0);\n *   fitter.addObservedPoint(4.08237071, 717104.0);\n *   fitter.addObservedPoint(4.08366408, 620014.0);\n *   GaussianFunction fitFunction \u003d fitter.fit();\n * \u003c/pre\u003e\n *\n * @see ParametricGaussianFunction\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "fitter"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Fitter used for fitting. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.GaussianFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Constructs an instance using the specified optimizer.\n     *\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.addObservedPoint(double, double)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Adds point ({@code x}, {@code y}) to list of observed points\n     * with a weight of 1.\n     *\n     * @param x Abscissa value.\n     * @param y Ordinate value.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.addObservedPoint(double, double, double)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Adds point ({@code x}, {@code y}) to list of observed points\n     * with a weight of {@code weight}.\n     *\n     * @param weight Weight assigned to the given point.\n     * @param x Abscissa value.\n     * @param y Ordinate value.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.fit()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Fits Gaussian function to the observed points.\n     * It will call the base class\n     * {@link CurveFitter#fit(ParametricRealFunction,double[]) fit} method.\n     *\n     * @return the Gaussian function that best fits the observed points.\n     * @see CurveFitter\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 96,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.createParametersGuesser(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Factory method to create a {@code GaussianParametersGuesser}\n     * instance initialized with the specified observations.\n     *\n     * @param observations points used to initialize the created\n     * {@code GaussianParametersGuesser} instance.\n     * @return a new {@code GaussianParametersGuesser} instance.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 59)"
      ]
    }
  ]
}
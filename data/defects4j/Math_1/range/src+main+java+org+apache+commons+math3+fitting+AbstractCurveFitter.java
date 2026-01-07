{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/fitting/AbstractCurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCurveFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 135,
      "comment": "\n * Base class that contains common code for fitting parametric univariate\n * real functions \u003ccode\u003ey \u003d f(p\u003csub\u003ei\u003c/sub\u003e;x)\u003c/code\u003e, where {@code x} is\n * the independent variable and the \u003ccode\u003ep\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e are the\n * \u003cem\u003eparameters\u003c/em\u003e.\n * \u003cbr/\u003e\n * A fitter will find the optimal values of the parameters by\n * \u003cem\u003efitting\u003c/em\u003e the curve so it remains very close to a set of\n * {@code N} observed points \u003ccode\u003e(x\u003csub\u003ek\u003c/sub\u003e, y\u003csub\u003ek\u003c/sub\u003e)\u003c/code\u003e,\n * {@code 0 \u003c\u003d k \u003c N}.\n * \u003cbr/\u003e\n * An algorithm usually performs the fit by finding the parameter\n * values that minimizes the objective function\n * \u003cpre\u003e\u003ccode\u003e\n *  \u0026sum;y\u003csub\u003ek\u003c/sub\u003e - f(x\u003csub\u003ek\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e,\n * \u003c/code\u003e\u003c/pre\u003e\n * which is actually a least-squares problem.\n * This class contains boilerplate code for calling the\n * {@link #fit(Collection)} method for obtaining the parameters.\n * The problem setup, such as the choice of optimization algorithm\n * for fitting a specific function is delegated to subclasses.\n *\n * @param \u003cOPTIM\u003e Optimizer to use for the fit.\n *\n * @version $Id$\n * @since 3.3\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.AbstractCurveFitter.fit(java.util.Collection\u003corg.apache.commons.math3.fitting.WeightedObservedPoint\u003e)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Fits a curve.\n     * This method computes the coefficients of the curve that best\n     * fit the sample of observed points.\n     *\n     * @param points Observations.\n     * @return the fitted parameters.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.AbstractCurveFitter.getOptimizer(java.util.Collection\u003corg.apache.commons.math3.fitting.WeightedObservedPoint\u003e)",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Creates an optimizer set up to fit the appropriate curve.\n     *\n     * @param points Sample points.\n     * @return the optimizer to use for fitting the curve to the\n     * given {@code points}.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "TheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 79,
      "end_line": 134,
      "comment": "\n     * Vector function for computing function theoretical values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Function to fit. "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Observations. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.AbstractCurveFitter.TheoreticalValuesFunction.TheoreticalValuesFunction(org.apache.commons.math3.analysis.ParametricUnivariateFunction, java.util.Collection\u003corg.apache.commons.math3.fitting.WeightedObservedPoint\u003e)",
      "begin_line": 89,
      "end_line": 99,
      "comment": "\n         * @param f function to fit.\n         * @param observations Observations.\n         ",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 23)",
        "(line 93,col 13)-(line 93,col 48)",
        "(line 94,col 13)-(line 94,col 42)",
        "(line 95,col 13)-(line 95,col 22)",
        "(line 96,col 13)-(line 98,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.AbstractCurveFitter.TheoreticalValuesFunction.getModelFunction()",
      "begin_line": 104,
      "end_line": 117,
      "comment": "\n         * @return the model function values.\n         ",
      "child_ranges": [
        "(line 105,col 13)-(line 116,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.AbstractCurveFitter.TheoreticalValuesFunction.Anonymous-a651aa5f-a3e3-4eba-ae64-330f9235140d.value(double[])",
      "begin_line": 107,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 21)-(line 108,col 50)",
        "(line 109,col 21)-(line 109,col 60)",
        "(line 110,col 21)-(line 112,col 21)",
        "(line 114,col 21)-(line 114,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.AbstractCurveFitter.TheoreticalValuesFunction.getModelFunctionJacobian()",
      "begin_line": 122,
      "end_line": 133,
      "comment": "\n         * @return the model function Jacobian.\n         ",
      "child_ranges": [
        "(line 123,col 13)-(line 132,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.AbstractCurveFitter.TheoreticalValuesFunction.Anonymous-9f45940d-1fb7-48f0-af6f-de189620987c.value(double[])",
      "begin_line": 124,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 125,col 21)-(line 125,col 50)",
        "(line 126,col 21)-(line 126,col 66)",
        "(line 127,col 21)-(line 129,col 21)",
        "(line 130,col 21)-(line 130,col 36)"
      ]
    }
  ]
}
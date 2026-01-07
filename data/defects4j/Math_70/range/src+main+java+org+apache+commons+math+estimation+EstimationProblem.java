{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/estimation/EstimationProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EstimationProblem",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 68,
      "comment": "\n * This interface represents an estimation problem.\n *\n * \u003cp\u003eThis interface should be implemented by all real estimation\n * problems before they can be handled by the estimators through the\n * {@link Estimator#estimate Estimator.estimate} method.\u003c/p\u003e\n *\n * \u003cp\u003eAn estimation problem, as seen by a solver is a set of\n * parameters and a set of measurements. The parameters are adjusted\n * during the estimation through the {@link #getUnboundParameters\n * getUnboundParameters} and {@link EstimatedParameter#setEstimate\n * EstimatedParameter.setEstimate} methods. The measurements both have\n * a measured value which is generally fixed at construction and a\n * theoretical value which depends on the model and hence varies as\n * the parameters are adjusted. The purpose of the solver is to reduce\n * the residual between these values, it can retrieve the measurements\n * through the {@link #getMeasurements getMeasurements} method.\u003c/p\u003e\n *\n * @see Estimator\n * @see WeightedMeasurement\n *\n * @version $Revision$ $Date$\n * @since 1.2\n * @deprecated as of 2.0, everything in package org.apache.commons.math.estimation has\n * been deprecated and replaced by package org.apache.commons.math.optimization.general\n *\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimationProblem.getMeasurements()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Get the measurements of an estimation problem.\n     * @return measurements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimationProblem.getUnboundParameters()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Get the unbound parameters of the problem.\n     * @return unbound parameters\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimationProblem.getAllParameters()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Get all the parameters of the problem.\n     * @return parameters\n     ",
      "child_ranges": []
    }
  ]
}
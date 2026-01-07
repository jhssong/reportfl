{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/estimation/SimpleEstimationProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleEstimationProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 44,
      "end_line": 111,
      "comment": "\n * Simple implementation of the {@link EstimationProblem\n * EstimationProblem} interface for boilerplate data handling.\n * \u003cp\u003eThis class \u003cem\u003eonly\u003c/em\u003e handles parameters and measurements\n * storage and unbound parameters filtering. It does not compute\n * anything by itself. It should either be used with measurements\n * implementation that are smart enough to know about the\n * various parameters in order to compute the partial derivatives\n * appropriately. Since the problem-specific logic is mainly related to\n * the various measurements models, the simplest way to use this class\n * is by extending it and using one internal class extending\n * {@link WeightedMeasurement WeightedMeasurement} for each measurement\n * type. The instances of the internal classes would have access to the\n * various parameters and their current estimate.\u003c/p\u003e\n\n * @version $Revision$ $Date$\n * @since 1.2\n * @deprecated as of 2.0, everything in package org.apache.commons.math.estimation has\n * been deprecated and replaced by package org.apache.commons.math.optimization.general\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Estimated parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Measurements. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.SimpleEstimationProblem()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Build an empty instance without parameters nor measurements.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 59)",
        "(line 58,col 9)-(line 58,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getAllParameters()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Get all the parameters of the problem.\n     * @return parameters\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getUnboundParameters()",
      "begin_line": 73,
      "end_line": 86,
      "comment": "\n     * Get the unbound parameters of the problem.\n     * @return unbound parameters\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 96)",
        "(line 77,col 9)-(line 81,col 9)",
        "(line 84,col 9)-(line 84,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getMeasurements()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Get the measurements of an estimation problem.\n     * @return measurements\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.addParameter(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 99,
      "end_line": 101,
      "comment": " Add a parameter to the problem.\n     * @param p parameter to add\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.addMeasurement(org.apache.commons.math.estimation.WeightedMeasurement)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Add a new measurement to the set.\n     * @param m measurement to add\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 28)"
      ]
    }
  ]
}
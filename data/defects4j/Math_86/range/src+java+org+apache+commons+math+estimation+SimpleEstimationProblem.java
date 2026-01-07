{
  "filepath": "/tmp/Math-86b/src/java/org/apache/commons/math/estimation/SimpleEstimationProblem.java",
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
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.SimpleEstimationProblem()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Build an empty instance without parameters nor measurements.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 59)",
        "(line 52,col 9)-(line 52,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getAllParameters()",
      "begin_line": 59,
      "end_line": 61,
      "comment": " \n     * Get all the parameters of the problem.\n     * @return parameters\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getUnboundParameters()",
      "begin_line": 67,
      "end_line": 80,
      "comment": " \n     * Get the unbound parameters of the problem.\n     * @return unbound parameters\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 96)",
        "(line 71,col 9)-(line 75,col 9)",
        "(line 78,col 9)-(line 78,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getMeasurements()",
      "begin_line": 86,
      "end_line": 88,
      "comment": " \n     * Get the measurements of an estimation problem.\n     * @return measurements\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.addParameter(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 93,
      "end_line": 95,
      "comment": " Add a parameter to the problem.\n     * @param p parameter to add\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.addMeasurement(org.apache.commons.math.estimation.WeightedMeasurement)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Add a new measurement to the set.\n     * @param m measurement to add\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Estimated parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Measurements. "
    }
  ]
}
{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/estimation/SimpleEstimationProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleEstimationProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 42,
      "end_line": 108,
      "comment": "\n * Simple implementation of the {@link EstimationProblem\n * EstimationProblem} interface for boilerplate data handling.\n * \u003cp\u003eThis class \u003cem\u003eonly\u003c/em\u003e handles parameters and measurements\n * storage and unbound parameters filtering. It does not compute\n * anything by itself. It should either be used with measurements\n * implementation that are smart enough to know about the\n * various parameters in order to compute the partial derivatives\n * appropriately. Since the problem-specific logic is mainly related to\n * the various measurements models, the simplest way to use this class\n * is by extending it and using one internal class extending\n * {@link WeightedMeasurement WeightedMeasurement} for each measurement\n * type. The instances of the internal classes would have access to the\n * various parameters and their current estimate.\u003c/p\u003e\n\n * @version $Revision$ $Date$\n * @since 1.2\n\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.SimpleEstimationProblem()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Build an empty instance without parameters nor measurements.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 59)",
        "(line 49,col 9)-(line 49,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getAllParameters()",
      "begin_line": 56,
      "end_line": 58,
      "comment": " \n     * Get all the parameters of the problem.\n     * @return parameters\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getUnboundParameters()",
      "begin_line": 64,
      "end_line": 77,
      "comment": " \n     * Get the unbound parameters of the problem.\n     * @return unbound parameters\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 96)",
        "(line 68,col 9)-(line 72,col 9)",
        "(line 75,col 9)-(line 75,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getMeasurements()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " \n     * Get the measurements of an estimation problem.\n     * @return measurements\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.addParameter(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 90,
      "end_line": 92,
      "comment": " Add a parameter to the problem.\n     * @param p parameter to add\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.addMeasurement(org.apache.commons.math.estimation.WeightedMeasurement)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Add a new measurement to the set.\n     * @param m measurement to add\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Estimated parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Measurements. "
    }
  ]
}
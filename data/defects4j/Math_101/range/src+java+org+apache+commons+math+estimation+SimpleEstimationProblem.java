{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/estimation/SimpleEstimationProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleEstimationProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 43,
      "end_line": 110,
      "comment": "\n * Simple implementation of the {@link EstimationProblem\n * EstimationProblem} interface for boilerplate data handling.\n * \u003cp\u003eThis class \u003cem\u003eonly\u003c/em\u003e handles parameters and measurements\n * storage and unbound parameters filtering. It does not compute\n * anything by itself. It should either be used with measurements\n * implementation that are smart enough to know about the\n * various parameters in order to compute the partial derivatives\n * appropriately. Since the problem-specific logic is mainly related to\n * the various measurements models, the simplest way to use this class\n * is by extending it and using one internal class extending\n * {@link WeightedMeasurement WeightedMeasurement} for each measurement\n * type. The instances of the internal classes would have access to the\n * various parameters and their current estimate.\u003c/p\u003e\n\n * @version $Revision$ $Date$\n * @since 1.2\n\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.SimpleEstimationProblem()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Build an empty instance without parameters nor measurements.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 39)",
        "(line 50,col 9)-(line 50,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getAllParameters()",
      "begin_line": 57,
      "end_line": 59,
      "comment": " \n     * Get all the parameters of the problem.\n     * @return parameters\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getUnboundParameters()",
      "begin_line": 65,
      "end_line": 79,
      "comment": " \n     * Get the unbound parameters of the problem.\n     * @return unbound parameters\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 56)",
        "(line 69,col 9)-(line 74,col 9)",
        "(line 77,col 9)-(line 77,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getMeasurements()",
      "begin_line": 85,
      "end_line": 87,
      "comment": " \n     * Get the measurements of an estimation problem.\n     * @return measurements\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.addParameter(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 92,
      "end_line": 94,
      "comment": " Add a parameter to the problem.\n     * @param p parameter to add\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.addMeasurement(org.apache.commons.math.estimation.WeightedMeasurement)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Add a new measurement to the set.\n     * @param m measurement to add\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Estimated parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Measurements. "
    }
  ]
}
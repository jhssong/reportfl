{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/estimation/SimpleEstimationProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleEstimationProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 38,
      "end_line": 90,
      "comment": "\n * Simple implementation of the {@link EstimationProblem\n * EstimationProblem} interface for boilerplate data handling.\n * \u003cp\u003eThis class \u003cem\u003eonly\u003c/em\u003e handles parameters and measurements\n * storage and unbound parameters filtering. It does not compute\n * anything by itself. It should either be used with measurements\n * implementation that are smart enough to know about the\n * various parameters in order to compute the partial derivatives\n * appropriately. Since the problem-specific logic is mainly related to\n * the various measurements models, the simplest way to use this class\n * is by extending it and using one internal class extending\n * {@link WeightedMeasurement WeightedMeasurement} for each measurement\n * type. The instances of the internal classes would have access to the\n * various parameters and their current estimate.\u003c/p\u003e\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.SimpleEstimationProblem()",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Build an empty instance without parameters nor measurements.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 39)",
        "(line 45,col 9)-(line 45,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getAllParameters()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getUnboundParameters()",
      "begin_line": 52,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 61)",
        "(line 56,col 9)-(line 61,col 9)",
        "(line 64,col 9)-(line 64,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.getMeasurements()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.addParameter(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.SimpleEstimationProblem.addMeasurement(org.apache.commons.math.estimation.WeightedMeasurement)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Add a new measurement to the set.\n     * @param m measurement to add\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Estimated parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Measurements. "
    }
  ]
}
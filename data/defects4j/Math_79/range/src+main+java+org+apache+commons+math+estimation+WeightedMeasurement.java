{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/estimation/WeightedMeasurement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeightedMeasurement",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Measurement weight. "
    },
    {
      "type": "field",
      "varNames": [
        "measuredValue"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Value of the measurements. "
    },
    {
      "type": "field",
      "varNames": [
        "ignored"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Ignore measurement indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.WeightedMeasurement(double, double)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n   * Simple constructor.\n   * Build a measurement with the given parameters, and set its ignore\n   * flag to false.\n   * @param weight weight of the measurement in the least squares problem\n   * (two common choices are either to use 1.0 for all measurements, or to\n   * use a value proportional to the inverse of the variance of the measurement\n   * type)\n   *\n   * @param measuredValue measured value\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 32)",
        "(line 81,col 5)-(line 81,col 39)",
        "(line 82,col 5)-(line 82,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.WeightedMeasurement(double, double, boolean)",
      "begin_line": 93,
      "end_line": 98,
      "comment": " Simple constructor.\n   *\n   * Build a measurement with the given parameters\n   *\n   * @param weight weight of the measurement in the least squares problem\n   * @param measuredValue measured value\n   * @param ignored true if the measurement should be ignored\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 32)",
        "(line 96,col 5)-(line 96,col 39)",
        "(line 97,col 5)-(line 97,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.getWeight()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n   * Get the weight of the measurement in the least squares problem\n   *\n   * @return weight\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.getMeasuredValue()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n   * Get the measured value\n   *\n   * @return measured value\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.getResidual()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n   * Get the residual for this measurement\n   * The residual is the measured value minus the theoretical value.\n   *\n   * @return residual\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.getTheoreticalValue()",
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n   * Get the theoretical value expected for this measurement\n   * \u003cp\u003eThe theoretical value is the value expected for this measurement\n   * if the model and its parameter were all perfectly known.\u003c/p\u003e\n   * \u003cp\u003eThe value must be computed using the current estimate of the parameters\n   * set by the solver in the problem.\u003c/p\u003e\n   *\n   * @return theoretical value\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n   * Get the partial derivative of the {@link #getTheoreticalValue\n   * theoretical value} according to the parameter.\n   * \u003cp\u003eThe value must be computed using the current estimate of the parameters\n   * set by the solver in the problem.\u003c/p\u003e\n   *\n   * @param parameter parameter against which the partial derivative\n   * should be computed\n   * @return partial derivative of the {@link #getTheoreticalValue\n   * theoretical value}\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.setIgnored(boolean)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n   * Set the ignore flag to the specified value\n   * Setting the ignore flag to true allow to reject wrong\n   * measurements, which sometimes can be detected only rather late.\n   *\n   * @param ignored value for the ignore flag\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.isIgnored()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n   * Check if this measurement should be ignored\n   *\n   * @return true if the measurement should be ignored\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 19)"
      ]
    }
  ]
}
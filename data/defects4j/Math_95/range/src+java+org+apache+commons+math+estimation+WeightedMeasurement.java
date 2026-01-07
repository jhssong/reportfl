{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/estimation/WeightedMeasurement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeightedMeasurement",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.WeightedMeasurement(double, double)",
      "begin_line": 65,
      "end_line": 69,
      "comment": " \n   * Simple constructor.\n   * Build a measurement with the given parameters, and set its ignore\n   * flag to false.\n   * @param weight weight of the measurement in the least squares problem\n   * (two common choices are either to use 1.0 for all measurements, or to\n   * use a value proportional to the inverse of the variance of the measurement\n   * type)\n   * \n   * @param measuredValue measured value\n   ",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 32)",
        "(line 67,col 5)-(line 67,col 39)",
        "(line 68,col 5)-(line 68,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.WeightedMeasurement(double, double, boolean)",
      "begin_line": 79,
      "end_line": 84,
      "comment": " Simple constructor.\n   * \n   * Build a measurement with the given parameters\n   * \n   * @param weight weight of the measurement in the least squares problem\n   * @param measuredValue measured value\n   * @param ignored true if the measurement should be ignored\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 32)",
        "(line 82,col 5)-(line 82,col 39)",
        "(line 83,col 5)-(line 83,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.getWeight()",
      "begin_line": 91,
      "end_line": 93,
      "comment": " \n   * Get the weight of the measurement in the least squares problem\n   * \n   * @return weight\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.getMeasuredValue()",
      "begin_line": 100,
      "end_line": 102,
      "comment": " \n   * Get the measured value\n   * \n   * @return measured value\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.getResidual()",
      "begin_line": 110,
      "end_line": 112,
      "comment": " \n   * Get the residual for this measurement\n   * The residual is the measured value minus the theoretical value.\n   * \n   * @return residual\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.getTheoreticalValue()",
      "begin_line": 123,
      "end_line": 123,
      "comment": " \n   * Get the theoretical value expected for this measurement\n   * \u003cp\u003eThe theoretical value is the value expected for this measurement\n   * if the model and its parameter were all perfectly known.\u003c/p\u003e\n   * \u003cp\u003eThe value must be computed using the current estimate of the parameters\n   * set by the solver in the problem.\u003c/p\u003e\n   * \n   * @return theoretical value\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 136,
      "end_line": 136,
      "comment": " \n   * Get the partial derivative of the {@link #getTheoreticalValue\n   * theoretical value} according to the parameter.\n   * \u003cp\u003eThe value must be computed using the current estimate of the parameters\n   * set by the solver in the problem.\u003c/p\u003e\n   * \n   * @param parameter parameter against which the partial derivative\n   * should be computed\n   * @return partial derivative of the {@link #getTheoreticalValue\n   * theoretical value}\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.setIgnored(boolean)",
      "begin_line": 145,
      "end_line": 147,
      "comment": " \n   * Set the ignore flag to the specified value\n   * Setting the ignore flag to true allow to reject wrong\n   * measurements, which sometimes can be detected only rather late.\n   * \n   * @param ignored value for the ignore flag\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.WeightedMeasurement.isIgnored()",
      "begin_line": 154,
      "end_line": 156,
      "comment": " \n   * Check if this measurement should be ignored\n   * \n   * @return true if the measurement should be ignored\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " Measurement weight. "
    },
    {
      "type": "field",
      "varNames": [
        "measuredValue"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " Value of the measurements. "
    },
    {
      "type": "field",
      "varNames": [
        "ignored"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " Ignore measurement indicator. "
    }
  ]
}
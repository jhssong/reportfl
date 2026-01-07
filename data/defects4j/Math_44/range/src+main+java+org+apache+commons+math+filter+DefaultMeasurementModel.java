{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/filter/DefaultMeasurementModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultMeasurementModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.filter.MeasurementModel"
      ],
      "begin_line": 28,
      "end_line": 84,
      "comment": "\n * Default implementation of a {@link MeasurementModel} for the use with a\n * {@link KalmanFilter}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "measurementMatrix"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * The measurement matrix, used to associate the measurement vector to the\n     * internal state estimation vector.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "measurementNoise"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * The measurement noise covariance matrix.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.filter.DefaultMeasurementModel.DefaultMeasurementModel(double[][], double[][])",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Create a new {@link MeasurementModel}, taking double arrays as input\n     * parameters for the respective measurement matrix and noise.\n     *\n     * @param measMatrix\n     *            the measurement matrix\n     * @param measNoise\n     *            the measurement noise matrix\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 53,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.filter.DefaultMeasurementModel.DefaultMeasurementModel(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Create a new {@link MeasurementModel}, taking {@link RealMatrix} objects\n     * as input parameters for the respective measurement matrix and noise.\n     *\n     * @param measMatrix\n     *            the measurement matrix\n     * @param measNoise\n     *            the measurement noise matrix\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 44)",
        "(line 68,col 9)-(line 68,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.DefaultMeasurementModel.getMeasurementMatrix()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.DefaultMeasurementModel.getMeasurementNoise()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 32)"
      ]
    }
  ]
}
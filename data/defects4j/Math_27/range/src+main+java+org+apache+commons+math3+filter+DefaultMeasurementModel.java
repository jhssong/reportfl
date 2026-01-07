{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/filter/DefaultMeasurementModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultMeasurementModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.filter.MeasurementModel"
      ],
      "begin_line": 29,
      "end_line": 77,
      "comment": "\n * Default implementation of a {@link MeasurementModel} for the use with a\n * {@link KalmanFilter}.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "measurementMatrix"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * The measurement matrix, used to associate the measurement vector to the\n     * internal state estimation vector.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "measurementNoise"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * The measurement noise covariance matrix.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.filter.DefaultMeasurementModel.DefaultMeasurementModel(double[][], double[][])",
      "begin_line": 49,
      "end_line": 53,
      "comment": "\n     * Create a new {@link MeasurementModel}, taking double arrays as input\n     * parameters for the respective measurement matrix and noise.\n     *\n     * @param measMatrix the measurement matrix\n     * @param measNoise the measurement noise matrix\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 52,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.filter.DefaultMeasurementModel.DefaultMeasurementModel(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n     * Create a new {@link MeasurementModel}, taking {@link RealMatrix} objects\n     * as input parameters for the respective measurement matrix and noise.\n     *\n     * @param measMatrix the measurement matrix\n     * @param measNoise the measurement noise matrix\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 44)",
        "(line 65,col 9)-(line 65,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultMeasurementModel.getMeasurementMatrix()",
      "begin_line": 69,
      "end_line": 71,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultMeasurementModel.getMeasurementNoise()",
      "begin_line": 74,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 32)"
      ]
    }
  ]
}
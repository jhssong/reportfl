{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/filter/MeasurementModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MeasurementModel",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 45,
      "comment": "\n * Defines the measurement model for the use with a {@link KalmanFilter}.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.MeasurementModel.getMeasurementMatrix()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Returns the measurement matrix.\n     *\n     * @return the measurement matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.MeasurementModel.getMeasurementNoise()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Returns the measurement noise matrix. This method is called by the\n     * {@link KalmanFilter} every correct step, so implementations of this\n     * interface may return a modified measurement noise depending on current\n     * iteration step.\n     *\n     * @return the measurement noise matrix\n     * @see KalmanFilter#correct(double[])\n     * @see KalmanFilter#correct(org.apache.commons.math.linear.RealVector)\n     ",
      "child_ranges": []
    }
  ]
}
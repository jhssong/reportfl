{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/filter/MeasurementModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MeasurementModel",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 45,
      "comment": "\n * Defines the measurement model for the use with a {@link KalmanFilter}.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.MeasurementModel.getMeasurementMatrix()",
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Returns the measurement matrix.\n     *\n     * @return the measurement matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.MeasurementModel.getMeasurementNoise()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Returns the measurement noise matrix. This method is called by the {@link KalmanFilter} every\n     * correction step, so implementations of this interface may return a modified measurement noise\n     * depending on the current iteration step.\n     *\n     * @return the measurement noise matrix\n     * @see KalmanFilter#correct(double[])\n     * @see KalmanFilter#correct(org.apache.commons.math3.linear.RealVector)\n     ",
      "child_ranges": []
    }
  ]
}
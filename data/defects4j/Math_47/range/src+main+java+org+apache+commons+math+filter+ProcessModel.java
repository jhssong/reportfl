{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/filter/ProcessModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProcessModel",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 76,
      "comment": "\n * Defines the process dynamics model for the use with a {@link KalmanFilter}.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.ProcessModel.getStateTransitionMatrix()",
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Returns the state transition matrix.\n     *\n     * @return the state transition matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.ProcessModel.getControlMatrix()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Returns the control matrix.\n     *\n     * @return the control matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.ProcessModel.getProcessNoise()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Returns the process noise matrix. This method is called by the\n     * {@link KalmanFilter} every predict step, so implementations of this\n     * interface may return a modified process noise depending on current\n     * iteration step.\n     *\n     * @return the process noise matrix\n     * @see KalmanFilter#predict()\n     * @see KalmanFilter#predict(double[])\n     * @see KalmanFilter#predict(RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.ProcessModel.getInitialStateEstimate()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Returns the initial state estimation vector.\n     * \u003cp\u003e\n     * Note: if the return value is zero, the Kalman filter will initialize the\n     * state estimation with a zero vector.\n     * \u003c/p\u003e\n     *\n     * @return the initial state estimation vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.ProcessModel.getInitialErrorCovariance()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Returns the initial error covariance matrix.\n     * \u003cp\u003e\n     * Note: if the return value is zero, the Kalman filter will initialize the\n     * error covariance with the process noise matrix.\n     * \u003c/p\u003e\n     *\n     * @return the initial error covariance matrix\n     ",
      "child_ranges": []
    }
  ]
}
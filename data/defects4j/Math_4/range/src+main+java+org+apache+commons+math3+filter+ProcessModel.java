{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/filter/ProcessModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProcessModel",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 74,
      "comment": "\n * Defines the process dynamics model for the use with a {@link KalmanFilter}.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.ProcessModel.getStateTransitionMatrix()",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Returns the state transition matrix.\n     *\n     * @return the state transition matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.ProcessModel.getControlMatrix()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Returns the control matrix.\n     *\n     * @return the control matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.ProcessModel.getProcessNoise()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Returns the process noise matrix. This method is called by the {@link KalmanFilter} every\n     * prediction step, so implementations of this interface may return a modified process noise\n     * depending on the current iteration step.\n     *\n     * @return the process noise matrix\n     * @see KalmanFilter#predict()\n     * @see KalmanFilter#predict(double[])\n     * @see KalmanFilter#predict(RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.ProcessModel.getInitialStateEstimate()",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Returns the initial state estimation vector.\n     * \u003cp\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e if the return value is zero, the Kalman filter will initialize the\n     * state estimation with a zero vector.\n     *\n     * @return the initial state estimation vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.ProcessModel.getInitialErrorCovariance()",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Returns the initial error covariance matrix.\n     * \u003cp\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e if the return value is zero, the Kalman filter will initialize the\n     * error covariance with the process noise matrix.\n     *\n     * @return the initial error covariance matrix\n     ",
      "child_ranges": []
    }
  ]
}
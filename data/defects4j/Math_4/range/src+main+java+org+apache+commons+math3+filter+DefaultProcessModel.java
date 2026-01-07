{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/filter/DefaultProcessModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultProcessModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.filter.ProcessModel"
      ],
      "begin_line": 33,
      "end_line": 166,
      "comment": "\n * Default implementation of a {@link ProcessModel} for the use with a {@link KalmanFilter}.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "stateTransitionMatrix"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * The state transition matrix, used to advance the internal state estimation each time-step.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "controlMatrix"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * The control matrix, used to integrate a control input into the state estimation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "processNoiseCovMatrix"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The process noise covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStateEstimateVector"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The initial state estimation of the observed process. "
    },
    {
      "type": "field",
      "varNames": [
        "initialErrorCovMatrix"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The initial error covariance matrix of the observed process. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.DefaultProcessModel(double[][], double[][], double[][], double[], double[][])",
      "begin_line": 73,
      "end_line": 85,
      "comment": "\n     * Create a new {@link ProcessModel}, taking double arrays as input parameters.\n     *\n     * @param stateTransition\n     *            the state transition matrix\n     * @param control\n     *            the control matrix\n     * @param processNoise\n     *            the process noise matrix\n     * @param initialStateEstimate\n     *            the initial state estimate vector\n     * @param initialErrorCovariance\n     *            the initial error covariance matrix\n     * @throws NullArgumentException\n     *             if any of the input arrays is {@code null}\n     * @throws NoDataException\n     *             if any row / column dimension of the input matrices is zero\n     * @throws DimensionMismatchException\n     *             if any of the input matrices is non-rectangular\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 84,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.DefaultProcessModel(double[][], double[][], double[][])",
      "begin_line": 106,
      "end_line": 114,
      "comment": "\n     * Create a new {@link ProcessModel}, taking double arrays as input parameters.\n     * \u003cp\u003e\n     * The initial state estimate and error covariance are omitted and will be initialized by the\n     * {@link KalmanFilter} to default values.\n     *\n     * @param stateTransition\n     *            the state transition matrix\n     * @param control\n     *            the control matrix\n     * @param processNoise\n     *            the process noise matrix\n     * @throws NullArgumentException\n     *             if any of the input arrays is {@code null}\n     * @throws NoDataException\n     *             if any row / column dimension of the input matrices is zero\n     * @throws DimensionMismatchException\n     *             if any of the input matrices is non-rectangular\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.DefaultProcessModel(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 130,
      "end_line": 140,
      "comment": "\n     * Create a new {@link ProcessModel}, taking double arrays as input parameters.\n     *\n     * @param stateTransition\n     *            the state transition matrix\n     * @param control\n     *            the control matrix\n     * @param processNoise\n     *            the process noise matrix\n     * @param initialStateEstimate\n     *            the initial state estimate vector\n     * @param initialErrorCovariance\n     *            the initial error covariance matrix\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 53)",
        "(line 136,col 9)-(line 136,col 37)",
        "(line 137,col 9)-(line 137,col 50)",
        "(line 138,col 9)-(line 138,col 63)",
        "(line 139,col 9)-(line 139,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.getStateTransitionMatrix()",
      "begin_line": 143,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.getControlMatrix()",
      "begin_line": 148,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.getProcessNoise()",
      "begin_line": 153,
      "end_line": 155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.getInitialStateEstimate()",
      "begin_line": 158,
      "end_line": 160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.getInitialErrorCovariance()",
      "begin_line": 163,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 37)"
      ]
    }
  ]
}
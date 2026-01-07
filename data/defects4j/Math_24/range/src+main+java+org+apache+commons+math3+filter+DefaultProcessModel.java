{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/filter/DefaultProcessModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultProcessModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.filter.ProcessModel"
      ],
      "begin_line": 31,
      "end_line": 138,
      "comment": "\n * Default implementation of a {@link ProcessModel} for the use with a\n * {@link KalmanFilter}.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "stateTransitionMatrix"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * The state transition matrix, used to advance the internal state\n     * estimation each time-step.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "controlMatrix"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * The control matrix, used to integrate a control input into the state\n     * estimation.\n     "
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
      "begin_line": 63,
      "end_line": 73,
      "comment": "\n     * Create a new {@link ProcessModel}, taking double arrays as input\n     * parameters.\n     *\n     * @param stateTransition the state transition matrix\n     * @param control the control matrix\n     * @param processNoise the process noise matrix\n     * @param initialStateEstimate the initial state estimate vector\n     * @param initialErrorCovariance the initial error covariance matrix\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 72,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.DefaultProcessModel(double[][], double[][], double[][])",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * Create a new {@link ProcessModel}, taking double arrays as input\n     * parameters. The initial state estimate and error covariance are omitted\n     * and will be initialized by the {@link KalmanFilter} to default values.\n     *\n     * @param stateTransition the state transition matrix\n     * @param control the control matrix\n     * @param processNoise the process noise matrix\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.DefaultProcessModel(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 102,
      "end_line": 112,
      "comment": "\n     * Create a new {@link ProcessModel}, taking double arrays as input\n     * parameters.\n     *\n     * @param stateTransition the state transition matrix\n     * @param control the control matrix\n     * @param processNoise the process noise matrix\n     * @param initialStateEstimate the initial state estimate vector\n     * @param initialErrorCovariance the initial error covariance matrix\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 53)",
        "(line 108,col 9)-(line 108,col 37)",
        "(line 109,col 9)-(line 109,col 50)",
        "(line 110,col 9)-(line 110,col 63)",
        "(line 111,col 9)-(line 111,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.getStateTransitionMatrix()",
      "begin_line": 115,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.getControlMatrix()",
      "begin_line": 120,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.getProcessNoise()",
      "begin_line": 125,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.getInitialStateEstimate()",
      "begin_line": 130,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultProcessModel.getInitialErrorCovariance()",
      "begin_line": 135,
      "end_line": 137,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 37)"
      ]
    }
  ]
}
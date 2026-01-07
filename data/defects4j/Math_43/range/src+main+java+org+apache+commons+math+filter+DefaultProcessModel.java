{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/filter/DefaultProcessModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultProcessModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.filter.ProcessModel"
      ],
      "begin_line": 30,
      "end_line": 163,
      "comment": "\n * Default implementation of a {@link ProcessModel} for the use with a\n * {@link KalmanFilter}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "stateTransitionMatrix"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * The state transition matrix, used to advance the internal state\n     * estimation each time-step.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "controlMatrix"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * The control matrix, used to integrate a control input into the state\n     * estimation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "processNoiseCovMatrix"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * The process noise covariance matrix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialStateEstimateVector"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * The initial state estimation of the observed process.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialErrorCovMatrix"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * The initial error covariance matrix of the observed process.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.filter.DefaultProcessModel.DefaultProcessModel(double[][], double[][], double[][], double[], double[][])",
      "begin_line": 73,
      "end_line": 82,
      "comment": "\n     * Create a new {@link ProcessModel}, taking double arrays as input\n     * parameters.\n     *\n     * @param stateTransition\n     *            the state transition matrix\n     * @param control\n     *            the control matrix\n     * @param processNoise\n     *            the process noise matrix\n     * @param initialStateEstimate\n     *            the initial state estimate vector\n     * @param initialErrorCovariance\n     *            the initial error covariance matrix\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 81,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.filter.DefaultProcessModel.DefaultProcessModel(double[][], double[][], double[][])",
      "begin_line": 96,
      "end_line": 101,
      "comment": "\n     * Create a new {@link ProcessModel}, taking double arrays as input\n     * parameters. The initial state estimate and error covariance are omitted\n     * and will be initialized by the {@link KalmanFilter} to default values.\n     *\n     * @param stateTransition\n     *            the state transition matrix\n     * @param control\n     *            the control matrix\n     * @param processNoise\n     *            the process noise matrix\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.filter.DefaultProcessModel.DefaultProcessModel(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 118,
      "end_line": 127,
      "comment": "\n     * Create a new {@link ProcessModel}, taking double arrays as input\n     * parameters.\n     *\n     * @param stateTransition\n     *            the state transition matrix\n     * @param control\n     *            the control matrix\n     * @param processNoise\n     *            the process noise matrix\n     * @param initialStateEstimate\n     *            the initial state estimate vector\n     * @param initialErrorCovariance\n     *            the initial error covariance matrix\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 53)",
        "(line 123,col 9)-(line 123,col 37)",
        "(line 124,col 9)-(line 124,col 50)",
        "(line 125,col 9)-(line 125,col 63)",
        "(line 126,col 9)-(line 126,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.DefaultProcessModel.getStateTransitionMatrix()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.DefaultProcessModel.getControlMatrix()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.DefaultProcessModel.getProcessNoise()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.DefaultProcessModel.getInitialStateEstimate()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.DefaultProcessModel.getInitialErrorCovariance()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 37)"
      ]
    }
  ]
}
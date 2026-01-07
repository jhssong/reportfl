{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/filter/KalmanFilter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KalmanFilter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 83,
      "end_line": 378,
      "comment": "\n * Implementation of a Kalman filter to estimate the state \u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e\n * of a discrete-time controlled process that is governed by the linear\n * stochastic difference equation:\n *\n * \u003cpre\u003e\n * \u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e \u003d \u003cb\u003eA\u003c/b\u003e\u003ci\u003ex\u003csub\u003ek-1\u003c/sub\u003e\u003c/i\u003e + \u003cb\u003eB\u003c/b\u003e\u003ci\u003eu\u003csub\u003ek-1\u003c/sub\u003e\u003c/i\u003e + \u003ci\u003ew\u003csub\u003ek-1\u003c/sub\u003e\u003c/i\u003e\n * \u003c/pre\u003e\n *\n * with a measurement \u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e that is\n *\n * \u003cpre\u003e\n * \u003ci\u003ez\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e \u003d \u003cb\u003eH\u003c/b\u003e\u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e + \u003ci\u003ev\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e.\n * \u003c/pre\u003e\n *\n * The random variables \u003ci\u003ew\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e and \u003ci\u003ev\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e represent\n * the process and measurement noise and are assumed to be independent of each\n * other and distributed with normal probability (white noise).\n * \u003cp\u003e\n * The Kalman filter cycle involves the following steps:\n * \u003col\u003e\n * \u003cli\u003epredict: project the current state estimate ahead in time\u003c/li\u003e\n * \u003cli\u003ecorrect: adjust the projected estimate by an actual measurement\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003c/p\u003e\n * \u003cbr/\u003e\n * \u003cp\u003e\n * The Kalman filter is initialized with a {@link ProcessModel} and a\n * {@link MeasurementModel}, which contain the corresponding transformation and\n * noise covariance matrices. The parameter names used in the respective models\n * correspond to the following names commonly used in the mathematical\n * literature:\n * \u003cul\u003e\n * \u003cli\u003eA - state transition matrix\u003c/li\u003e\n * \u003cli\u003eB - control input matrix\u003c/li\u003e\n * \u003cli\u003eH - measurement matrix\u003c/li\u003e\n * \u003cli\u003eQ - process noise covariance matrix\u003c/li\u003e\n * \u003cli\u003eR - measurement noise covariance matrix\u003c/li\u003e\n * \u003cli\u003eP - error covariance matrix\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://www.cs.unc.edu/~welch/kalman/\"\u003eKalman filter\n *      resources\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.cs.unc.edu/~welch/media/pdf/kalman_intro.pdf\"\u003eAn\n *      introduction to the Kalman filter by Greg Welch and Gary Bishop\u003c/a\u003e\n * @see \u003ca href\u003d\"http://academic.csuohio.edu/simond/courses/eec644/kalman.pdf\"\u003e\n *      Kalman filter example by Dan Simon\u003c/a\u003e\n * @see ProcessModel\n * @see MeasurementModel\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "processModel"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The process model used by this filter instance. "
    },
    {
      "type": "field",
      "varNames": [
        "measurementModel"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The measurement model used by this filter instance. "
    },
    {
      "type": "field",
      "varNames": [
        "transitionMatrix"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The transition matrix, equivalent to A. "
    },
    {
      "type": "field",
      "varNames": [
        "transitionMatrixT"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The transposed transition matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "controlMatrix"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The control matrix, equivalent to B. "
    },
    {
      "type": "field",
      "varNames": [
        "measurementMatrix"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The measurement matrix, equivalent to H. "
    },
    {
      "type": "field",
      "varNames": [
        "measurementMatrixT"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The transposed measurement matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "stateEstimation"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The internal state estimation vector, equivalent to x hat. "
    },
    {
      "type": "field",
      "varNames": [
        "errorCovariance"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The error covariance matrix, equivalent to P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.filter.KalmanFilter.KalmanFilter(org.apache.commons.math.filter.ProcessModel, org.apache.commons.math.filter.MeasurementModel)",
      "begin_line": 119,
      "end_line": 211,
      "comment": "\n     * Creates a new Kalman filter with the given process and measurement\n     * models.\n     *\n     * @param process\n     *            the model defining the underlying process dynamics\n     * @param measurement\n     *            the model defining the given measurement characteristics\n     * @throws org.apache.commons.math.exception.NullArgumentException\n     *             if any of the given inputs is null (except for the control\n     *             matrix)\n     * @throws NonSquareMatrixException\n     *             if the transition matrix is non square\n     * @throws MatrixDimensionMismatchException\n     *             if the matrix dimensions do not fit together\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 40)",
        "(line 123,col 9)-(line 123,col 44)",
        "(line 125,col 9)-(line 125,col 36)",
        "(line 126,col 9)-(line 126,col 44)",
        "(line 128,col 9)-(line 128,col 67)",
        "(line 129,col 9)-(line 129,col 49)",
        "(line 130,col 9)-(line 130,col 57)",
        "(line 133,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 68)",
        "(line 140,col 9)-(line 140,col 50)",
        "(line 141,col 9)-(line 141,col 59)",
        "(line 146,col 9)-(line 146,col 65)",
        "(line 147,col 9)-(line 147,col 45)",
        "(line 148,col 9)-(line 148,col 70)",
        "(line 149,col 9)-(line 149,col 42)",
        "(line 153,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 163,col 9)",
        "(line 167,col 9)-(line 171,col 9)",
        "(line 176,col 9)-(line 180,col 9)",
        "(line 183,col 9)-(line 191,col 9)",
        "(line 194,col 9)-(line 194,col 76)",
        "(line 197,col 9)-(line 202,col 9)",
        "(line 205,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.KalmanFilter.getStateDimension()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Returns the dimension of the state estimation vector.\n     *\n     * @return the state dimension\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.KalmanFilter.getMeasurementDimension()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * Returns the dimension of the measurement vector.\n     *\n     * @return the measurement vector dimension\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.KalmanFilter.getStateEstimation()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Returns the current state estimation vector.\n     *\n     * @return the state estimation vector\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.KalmanFilter.getStateEstimationVector()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Returns a copy of the current state estimation vector.\n     *\n     * @return the state estimation vector\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.KalmanFilter.getErrorCovariance()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Returns the current error covariance matrix.\n     *\n     * @return the error covariance matrix\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.KalmanFilter.getErrorCovarianceMatrix()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Returns a copy of the current error covariance matrix.\n     *\n     * @return the error covariance matrix\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.KalmanFilter.predict()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Predict the internal state estimation one time step ahead.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.KalmanFilter.predict(double[])",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Predict the internal state estimation one time step ahead.\n     *\n     * @param u\n     *            the control vector\n     * @throws DimensionMismatchException\n     *             if the dimension of the control vector does not fit\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.KalmanFilter.predict(org.apache.commons.math.linear.RealVector)",
      "begin_line": 294,
      "end_line": 316,
      "comment": "\n     * Predict the internal state estimation one time step ahead.\n     *\n     * @param u\n     *            the control vector\n     * @throws DimensionMismatchException\n     *             if the dimension of the control vector does not fit\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 300,col 9)",
        "(line 304,col 9)-(line 304,col 68)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 313,col 9)-(line 315,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.KalmanFilter.correct(double[])",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * Correct the current state estimate with an actual measurement.\n     *\n     * @param z\n     *            the measurement vector\n     * @throws DimensionMismatchException\n     *             if the dimension of the measurement vector does not fit\n     * @throws org.apache.commons.math.linear.SingularMatrixException\n     *             if the covariance matrix could not be inverted\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.filter.KalmanFilter.correct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 342,
      "end_line": 377,
      "comment": "\n     * Correct the current state estimate with an actual measurement.\n     *\n     * @param z\n     *            the measurement vector\n     * @throws DimensionMismatchException\n     *             if the dimension of the measurement vector does not fit\n     * @throws org.apache.commons.math.linear.SingularMatrixException\n     *             if the covariance matrix could not be inverted\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 34)",
        "(line 345,col 9)-(line 348,col 9)",
        "(line 351,col 9)-(line 353,col 57)",
        "(line 358,col 9)-(line 358,col 82)",
        "(line 359,col 9)-(line 359,col 51)",
        "(line 362,col 9)-(line 362,col 87)",
        "(line 367,col 9)-(line 367,col 97)",
        "(line 371,col 9)-(line 371,col 78)",
        "(line 375,col 9)-(line 375,col 97)",
        "(line 376,col 9)-(line 376,col 110)"
      ]
    }
  ]
}
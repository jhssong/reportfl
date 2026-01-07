{
  "filepath": "/tmp/Math-28b/src/main/java/org/apache/commons/math3/filter/KalmanFilter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KalmanFilter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 84,
      "end_line": 376,
      "comment": "\n * Implementation of a Kalman filter to estimate the state \u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e\n * of a discrete-time controlled process that is governed by the linear\n * stochastic difference equation:\n *\n * \u003cpre\u003e\n * \u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e \u003d \u003cb\u003eA\u003c/b\u003e\u003ci\u003ex\u003csub\u003ek-1\u003c/sub\u003e\u003c/i\u003e + \u003cb\u003eB\u003c/b\u003e\u003ci\u003eu\u003csub\u003ek-1\u003c/sub\u003e\u003c/i\u003e + \u003ci\u003ew\u003csub\u003ek-1\u003c/sub\u003e\u003c/i\u003e\n * \u003c/pre\u003e\n *\n * with a measurement \u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e that is\n *\n * \u003cpre\u003e\n * \u003ci\u003ez\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e \u003d \u003cb\u003eH\u003c/b\u003e\u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e + \u003ci\u003ev\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e.\n * \u003c/pre\u003e\n *\n * The random variables \u003ci\u003ew\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e and \u003ci\u003ev\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e represent\n * the process and measurement noise and are assumed to be independent of each\n * other and distributed with normal probability (white noise).\n * \u003cp\u003e\n * The Kalman filter cycle involves the following steps:\n * \u003col\u003e\n * \u003cli\u003epredict: project the current state estimate ahead in time\u003c/li\u003e\n * \u003cli\u003ecorrect: adjust the projected estimate by an actual measurement\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003c/p\u003e\n * \u003cbr/\u003e\n * \u003cp\u003e\n * The Kalman filter is initialized with a {@link ProcessModel} and a\n * {@link MeasurementModel}, which contain the corresponding transformation and\n * noise covariance matrices. The parameter names used in the respective models\n * correspond to the following names commonly used in the mathematical\n * literature:\n * \u003cul\u003e\n * \u003cli\u003eA - state transition matrix\u003c/li\u003e\n * \u003cli\u003eB - control input matrix\u003c/li\u003e\n * \u003cli\u003eH - measurement matrix\u003c/li\u003e\n * \u003cli\u003eQ - process noise covariance matrix\u003c/li\u003e\n * \u003cli\u003eR - measurement noise covariance matrix\u003c/li\u003e\n * \u003cli\u003eP - error covariance matrix\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://www.cs.unc.edu/~welch/kalman/\"\u003eKalman filter\n *      resources\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.cs.unc.edu/~welch/media/pdf/kalman_intro.pdf\"\u003eAn\n *      introduction to the Kalman filter by Greg Welch and Gary Bishop\u003c/a\u003e\n * @see \u003ca href\u003d\"http://academic.csuohio.edu/simond/courses/eec644/kalman.pdf\"\u003e\n *      Kalman filter example by Dan Simon\u003c/a\u003e\n * @see ProcessModel\n * @see MeasurementModel\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "processModel"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The process model used by this filter instance. "
    },
    {
      "type": "field",
      "varNames": [
        "measurementModel"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The measurement model used by this filter instance. "
    },
    {
      "type": "field",
      "varNames": [
        "transitionMatrix"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The transition matrix, equivalent to A. "
    },
    {
      "type": "field",
      "varNames": [
        "transitionMatrixT"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The transposed transition matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "controlMatrix"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The control matrix, equivalent to B. "
    },
    {
      "type": "field",
      "varNames": [
        "measurementMatrix"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The measurement matrix, equivalent to H. "
    },
    {
      "type": "field",
      "varNames": [
        "measurementMatrixT"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The transposed measurement matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "stateEstimation"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The internal state estimation vector, equivalent to x hat. "
    },
    {
      "type": "field",
      "varNames": [
        "errorCovariance"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The error covariance matrix, equivalent to P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.KalmanFilter(org.apache.commons.math3.filter.ProcessModel, org.apache.commons.math3.filter.MeasurementModel)",
      "begin_line": 120,
      "end_line": 212,
      "comment": "\n     * Creates a new Kalman filter with the given process and measurement\n     * models.\n     *\n     * @param process\n     *            the model defining the underlying process dynamics\n     * @param measurement\n     *            the model defining the given measurement characteristics\n     * @throws org.apache.commons.math3.exception.NullArgumentException\n     *             if any of the given inputs is null (except for the control\n     *             matrix)\n     * @throws NonSquareMatrixException\n     *             if the transition matrix is non square\n     * @throws MatrixDimensionMismatchException\n     *             if the matrix dimensions do not fit together\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 40)",
        "(line 124,col 9)-(line 124,col 44)",
        "(line 126,col 9)-(line 126,col 36)",
        "(line 127,col 9)-(line 127,col 44)",
        "(line 129,col 9)-(line 129,col 67)",
        "(line 130,col 9)-(line 130,col 49)",
        "(line 131,col 9)-(line 131,col 57)",
        "(line 134,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 140,col 68)",
        "(line 141,col 9)-(line 141,col 50)",
        "(line 142,col 9)-(line 142,col 59)",
        "(line 147,col 9)-(line 147,col 65)",
        "(line 148,col 9)-(line 148,col 45)",
        "(line 149,col 9)-(line 149,col 70)",
        "(line 150,col 9)-(line 150,col 42)",
        "(line 154,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 164,col 9)",
        "(line 168,col 9)-(line 172,col 9)",
        "(line 177,col 9)-(line 181,col 9)",
        "(line 184,col 9)-(line 192,col 9)",
        "(line 195,col 9)-(line 195,col 76)",
        "(line 198,col 9)-(line 203,col 9)",
        "(line 206,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getStateDimension()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Returns the dimension of the state estimation vector.\n     *\n     * @return the state dimension\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getMeasurementDimension()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Returns the dimension of the measurement vector.\n     *\n     * @return the measurement vector dimension\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getStateEstimation()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Returns the current state estimation vector.\n     *\n     * @return the state estimation vector\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getStateEstimationVector()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Returns a copy of the current state estimation vector.\n     *\n     * @return the state estimation vector\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getErrorCovariance()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Returns the current error covariance matrix.\n     *\n     * @return the error covariance matrix\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getErrorCovarianceMatrix()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Returns a copy of the current error covariance matrix.\n     *\n     * @return the error covariance matrix\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.predict()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * Predict the internal state estimation one time step ahead.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.predict(double[])",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Predict the internal state estimation one time step ahead.\n     *\n     * @param u\n     *            the control vector\n     * @throws DimensionMismatchException\n     *             if the dimension of the control vector does not fit\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.predict(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 294,
      "end_line": 316,
      "comment": "\n     * Predict the internal state estimation one time step ahead.\n     *\n     * @param u the control vector\n     * @throws DimensionMismatchException if the dimension of the control\n     * vector does not fit\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 300,col 9)",
        "(line 304,col 9)-(line 304,col 68)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 313,col 9)-(line 315,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.correct(double[])",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Correct the current state estimate with an actual measurement.\n     *\n     * @param z the measurement vector\n     * @throws DimensionMismatchException\n     * if the dimension of the measurement vector does not fit\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix could not be inverted\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.correct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 340,
      "end_line": 375,
      "comment": "\n     * Correct the current state estimate with an actual measurement.\n     *\n     * @param z the measurement vector\n     * @throws DimensionMismatchException if the dimension of the\n     * measurement vector does not fit\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix could not be inverted\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 34)",
        "(line 343,col 9)-(line 346,col 9)",
        "(line 349,col 9)-(line 351,col 57)",
        "(line 356,col 9)-(line 356,col 78)",
        "(line 357,col 9)-(line 357,col 51)",
        "(line 360,col 9)-(line 360,col 87)",
        "(line 365,col 9)-(line 365,col 97)",
        "(line 369,col 9)-(line 369,col 78)",
        "(line 373,col 9)-(line 373,col 97)",
        "(line 374,col 9)-(line 374,col 110)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/filter/KalmanFilter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KalmanFilter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 84,
      "end_line": 387,
      "comment": "\n * Implementation of a Kalman filter to estimate the state \u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e\n * of a discrete-time controlled process that is governed by the linear\n * stochastic difference equation:\n *\n * \u003cpre\u003e\n * \u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e \u003d \u003cb\u003eA\u003c/b\u003e\u003ci\u003ex\u003csub\u003ek-1\u003c/sub\u003e\u003c/i\u003e + \u003cb\u003eB\u003c/b\u003e\u003ci\u003eu\u003csub\u003ek-1\u003c/sub\u003e\u003c/i\u003e + \u003ci\u003ew\u003csub\u003ek-1\u003c/sub\u003e\u003c/i\u003e\n * \u003c/pre\u003e\n *\n * with a measurement \u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e that is\n *\n * \u003cpre\u003e\n * \u003ci\u003ez\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e \u003d \u003cb\u003eH\u003c/b\u003e\u003ci\u003ex\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e + \u003ci\u003ev\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e.\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * The random variables \u003ci\u003ew\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e and \u003ci\u003ev\u003csub\u003ek\u003c/sub\u003e\u003c/i\u003e represent\n * the process and measurement noise and are assumed to be independent of each\n * other and distributed with normal probability (white noise).\n * \u003cp\u003e\n * The Kalman filter cycle involves the following steps:\n * \u003col\u003e\n * \u003cli\u003epredict: project the current state estimate ahead in time\u003c/li\u003e\n * \u003cli\u003ecorrect: adjust the projected estimate by an actual measurement\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003cp\u003e\n * The Kalman filter is initialized with a {@link ProcessModel} and a\n * {@link MeasurementModel}, which contain the corresponding transformation and\n * noise covariance matrices. The parameter names used in the respective models\n * correspond to the following names commonly used in the mathematical\n * literature:\n * \u003cul\u003e\n * \u003cli\u003eA - state transition matrix\u003c/li\u003e\n * \u003cli\u003eB - control input matrix\u003c/li\u003e\n * \u003cli\u003eH - measurement matrix\u003c/li\u003e\n * \u003cli\u003eQ - process noise covariance matrix\u003c/li\u003e\n * \u003cli\u003eR - measurement noise covariance matrix\u003c/li\u003e\n * \u003cli\u003eP - error covariance matrix\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://www.cs.unc.edu/~welch/kalman/\"\u003eKalman filter\n *      resources\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.cs.unc.edu/~welch/media/pdf/kalman_intro.pdf\"\u003eAn\n *      introduction to the Kalman filter by Greg Welch and Gary Bishop\u003c/a\u003e\n * @see \u003ca href\u003d\"http://academic.csuohio.edu/simond/courses/eec644/kalman.pdf\"\u003e\n *      Kalman filter example by Dan Simon\u003c/a\u003e\n * @see ProcessModel\n * @see MeasurementModel\n * @since 3.0\n * @version $Id$\n "
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
      "begin_line": 121,
      "end_line": 213,
      "comment": "\n     * Creates a new Kalman filter with the given process and measurement models.\n     *\n     * @param process\n     *            the model defining the underlying process dynamics\n     * @param measurement\n     *            the model defining the given measurement characteristics\n     * @throws NullArgumentException\n     *             if any of the given inputs is null (except for the control matrix)\n     * @throws NonSquareMatrixException\n     *             if the transition matrix is non square\n     * @throws DimensionMismatchException\n     *             if the column dimension of the transition matrix does not match the dimension of the\n     *             initial state estimation vector\n     * @throws MatrixDimensionMismatchException\n     *             if the matrix dimensions do not fit together\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 40)",
        "(line 126,col 9)-(line 126,col 44)",
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 129,col 44)",
        "(line 131,col 9)-(line 131,col 67)",
        "(line 132,col 9)-(line 132,col 49)",
        "(line 133,col 9)-(line 133,col 57)",
        "(line 136,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 142,col 68)",
        "(line 143,col 9)-(line 143,col 50)",
        "(line 144,col 9)-(line 144,col 59)",
        "(line 149,col 9)-(line 149,col 65)",
        "(line 150,col 9)-(line 150,col 45)",
        "(line 151,col 9)-(line 151,col 70)",
        "(line 152,col 9)-(line 152,col 42)",
        "(line 156,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 165,col 9)",
        "(line 169,col 9)-(line 173,col 9)",
        "(line 178,col 9)-(line 182,col 9)",
        "(line 185,col 9)-(line 193,col 9)",
        "(line 196,col 9)-(line 196,col 76)",
        "(line 199,col 9)-(line 204,col 9)",
        "(line 207,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getStateDimension()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Returns the dimension of the state estimation vector.\n     *\n     * @return the state dimension\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getMeasurementDimension()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Returns the dimension of the measurement vector.\n     *\n     * @return the measurement vector dimension\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getStateEstimation()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Returns the current state estimation vector.\n     *\n     * @return the state estimation vector\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getStateEstimationVector()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Returns a copy of the current state estimation vector.\n     *\n     * @return the state estimation vector\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getErrorCovariance()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Returns the current error covariance matrix.\n     *\n     * @return the error covariance matrix\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.getErrorCovarianceMatrix()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Returns a copy of the current error covariance matrix.\n     *\n     * @return the error covariance matrix\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.predict()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Predict the internal state estimation one time step ahead.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.predict(double[])",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Predict the internal state estimation one time step ahead.\n     *\n     * @param u\n     *            the control vector\n     * @throws DimensionMismatchException\n     *             if the dimension of the control vector does not fit\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.predict(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 296,
      "end_line": 318,
      "comment": "\n     * Predict the internal state estimation one time step ahead.\n     *\n     * @param u\n     *            the control vector\n     * @throws DimensionMismatchException\n     *             if the dimension of the control vector does not match\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 302,col 9)",
        "(line 306,col 9)-(line 306,col 68)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 315,col 9)-(line 317,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.correct(double[])",
      "begin_line": 332,
      "end_line": 335,
      "comment": "\n     * Correct the current state estimate with an actual measurement.\n     *\n     * @param z\n     *            the measurement vector\n     * @throws NullArgumentException\n     *             if the measurement vector is {@code null}\n     * @throws DimensionMismatchException\n     *             if the dimension of the measurement vector does not fit\n     * @throws SingularMatrixException\n     *             if the covariance matrix could not be inverted\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.KalmanFilter.correct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 349,
      "end_line": 386,
      "comment": "\n     * Correct the current state estimate with an actual measurement.\n     *\n     * @param z\n     *            the measurement vector\n     * @throws NullArgumentException\n     *             if the measurement vector is {@code null}\n     * @throws DimensionMismatchException\n     *             if the dimension of the measurement vector does not fit\n     * @throws SingularMatrixException\n     *             if the covariance matrix could not be inverted\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 34)",
        "(line 354,col 9)-(line 357,col 9)",
        "(line 360,col 9)-(line 362,col 57)",
        "(line 367,col 9)-(line 367,col 78)",
        "(line 368,col 9)-(line 368,col 51)",
        "(line 371,col 9)-(line 371,col 87)",
        "(line 376,col 9)-(line 376,col 97)",
        "(line 380,col 9)-(line 380,col 78)",
        "(line 384,col 9)-(line 384,col 97)",
        "(line 385,col 9)-(line 385,col 110)"
      ]
    }
  ]
}
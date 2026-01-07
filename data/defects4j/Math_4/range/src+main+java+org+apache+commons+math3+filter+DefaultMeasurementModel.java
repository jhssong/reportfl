{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/filter/DefaultMeasurementModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultMeasurementModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.filter.MeasurementModel"
      ],
      "begin_line": 31,
      "end_line": 85,
      "comment": "\n * Default implementation of a {@link MeasurementModel} for the use with a {@link KalmanFilter}.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "measurementMatrix"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * The measurement matrix, used to associate the measurement vector to the\n     * internal state estimation vector.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "measurementNoise"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * The measurement noise covariance matrix.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.filter.DefaultMeasurementModel.DefaultMeasurementModel(double[][], double[][])",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Create a new {@link MeasurementModel}, taking double arrays as input parameters for the\n     * respective measurement matrix and noise.\n     *\n     * @param measMatrix\n     *            the measurement matrix\n     * @param measNoise\n     *            the measurement noise matrix\n     * @throws NullArgumentException\n     *             if any of the input matrices is {@code null}\n     * @throws NoDataException\n     *             if any row / column dimension of the input matrices is zero\n     * @throws DimensionMismatchException\n     *             if any of the input matrices is non-rectangular\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 88)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.filter.DefaultMeasurementModel.DefaultMeasurementModel(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Create a new {@link MeasurementModel}, taking {@link RealMatrix} objects\n     * as input parameters for the respective measurement matrix and noise.\n     *\n     * @param measMatrix the measurement matrix\n     * @param measNoise the measurement noise matrix\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 44)",
        "(line 73,col 9)-(line 73,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultMeasurementModel.getMeasurementMatrix()",
      "begin_line": 77,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.filter.DefaultMeasurementModel.getMeasurementNoise()",
      "begin_line": 82,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 32)"
      ]
    }
  ]
}
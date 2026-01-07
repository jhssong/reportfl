{
  "filepath": "/tmp/Math-2b/src/main/java/org/apache/commons/math3/fitting/leastsquares/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer\u003corg.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer\u003e"
      ],
      "begin_line": 47,
      "end_line": 169,
      "comment": "\n * Gauss-Newton least-squares solver.\n *\n * \u003cp\u003e\n * This class solve a least-square problem by solving the normal equations\n * of the linearized problem at each iteration. Either LU decomposition or\n * QR decomposition can be used to solve the normal equations. LU decomposition\n * is faster but QR decomposition is more robust for difficult problems.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 3.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "useLU"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Indicator for using LU decomposition. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer.create()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Creates a bare-bones instance.\n     * Several calls to {@code withXxx} methods are necessary to obtain\n     * an object with all necessary fields set to sensible values.\n     * \u003cbr/\u003e\n     * The default for the algorithm is to solve the normal equations\n     * using LU decomposition.\n     *\n     * @return an instance of this class.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer.withLU(boolean)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * @param useLU Whether to use LU decomposition.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 27)",
        "(line 71,col 9)-(line 71,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 75,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 78,col 38)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 50)",
        "(line 86,col 9)-(line 86,col 43)",
        "(line 88,col 9)-(line 88,col 52)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 97,col 9)-(line 97,col 57)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 49)",
        "(line 103,col 9)-(line 103,col 43)",
        "(line 106,col 9)-(line 106,col 44)",
        "(line 107,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 38)"
      ]
    }
  ]
}
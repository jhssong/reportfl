{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/fitting/leastsquares/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer\u003corg.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer\u003e"
      ],
      "begin_line": 47,
      "end_line": 198,
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
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer.GaussNewtonOptimizer()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer.GaussNewtonOptimizer(org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * Copy constructor.\n     *\n     * @param other object to copy.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 21)",
        "(line 64,col 9)-(line 64,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer.create()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Creates a bare-bones instance.\n     * Several calls to {@code withXxx} methods are necessary to obtain\n     * an object with all necessary fields set to sensible values.\n     * \u003cbr/\u003e\n     * The default for the algorithm is to solve the normal equations\n     * using LU decomposition.\n     *\n     * @return an instance of this class.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer.shallowCopy()",
      "begin_line": 82,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer.withLU(boolean)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * @param newUseLU Whether to use LU decomposition.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 30)",
        "(line 93,col 9)-(line 93,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer.getLU()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * @return {@code true} if LU decomposition is used.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 104,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 38)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 50)",
        "(line 115,col 9)-(line 115,col 43)",
        "(line 117,col 9)-(line 117,col 52)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 126,col 9)-(line 126,col 57)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 49)",
        "(line 132,col 9)-(line 132,col 43)",
        "(line 135,col 9)-(line 135,col 44)",
        "(line 136,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 38)"
      ]
    }
  ]
}
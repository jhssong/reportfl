{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/RandomCirclePointGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomCirclePointGenerator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 91,
      "comment": "\n * Factory for generating a cloud of points that approximate a circle.\n "
    },
    {
      "type": "field",
      "varNames": [
        "cX"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " RNG for the x-coordinate of the center. "
    },
    {
      "type": "field",
      "varNames": [
        "cY"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " RNG for the y-coordinate of the center. "
    },
    {
      "type": "field",
      "varNames": [
        "tP"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " RNG for the parametric position of the point. "
    },
    {
      "type": "field",
      "varNames": [
        "radius"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Radius of the circle. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.RandomCirclePointGenerator.RandomCirclePointGenerator(double, double, double, double, double, long)",
      "begin_line": 49,
      "end_line": 63,
      "comment": "\n     * @param x Abscissa of the circle center.\n     * @param y Ordinate of the circle center.\n     * @param radius Radius of the circle.\n     * @param xSigma Error on the x-coordinate of the circumference points.\n     * @param ySigma Error on the y-coordinate of the circumference points.\n     * @param seed RNG seed.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 57)",
        "(line 56,col 9)-(line 56,col 29)",
        "(line 57,col 9)-(line 58,col 90)",
        "(line 59,col 9)-(line 60,col 90)",
        "(line 61,col 9)-(line 62,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.RandomCirclePointGenerator.generate(int)",
      "begin_line": 71,
      "end_line": 77,
      "comment": "\n     * Point generator.\n     *\n     * @param n Number of points to create.\n     * @return the cloud of {@code n} points.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 49)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.RandomCirclePointGenerator.create()",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * Create one point.\n     *\n     * @return a point.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 37)",
        "(line 86,col 9)-(line 86,col 65)",
        "(line 87,col 9)-(line 87,col 65)",
        "(line 89,col 9)-(line 89,col 36)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/optimization/general/RandomCirclePointGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomCirclePointGenerator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 92,
      "comment": "\n * Factory for generating a cloud of points that approximate a circle.\n "
    },
    {
      "type": "field",
      "varNames": [
        "cX"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " RNG for the x-coordinate of the center. "
    },
    {
      "type": "field",
      "varNames": [
        "cY"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " RNG for the y-coordinate of the center. "
    },
    {
      "type": "field",
      "varNames": [
        "tP"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " RNG for the parametric position of the point. "
    },
    {
      "type": "field",
      "varNames": [
        "radius"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Radius of the circle. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.RandomCirclePointGenerator.RandomCirclePointGenerator(double, double, double, double, double, long)",
      "begin_line": 50,
      "end_line": 64,
      "comment": "\n     * @param x Abscissa of the circle center.\n     * @param y Ordinate of the circle center.\n     * @param radius Radius of the circle.\n     * @param xSigma Error on the x-coordinate of the circumference points.\n     * @param ySigma Error on the y-coordinate of the circumference points.\n     * @param seed RNG seed.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 57)",
        "(line 57,col 9)-(line 57,col 29)",
        "(line 58,col 9)-(line 59,col 90)",
        "(line 60,col 9)-(line 61,col 90)",
        "(line 62,col 9)-(line 63,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.RandomCirclePointGenerator.generate(int)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\n     * Point generator.\n     *\n     * @param n Number of points to create.\n     * @return the cloud of {@code n} points.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 49)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.RandomCirclePointGenerator.create()",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * Create one point.\n     *\n     * @return a point.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 37)",
        "(line 87,col 9)-(line 87,col 65)",
        "(line 88,col 9)-(line 88,col 65)",
        "(line 90,col 9)-(line 90,col 36)"
      ]
    }
  ]
}
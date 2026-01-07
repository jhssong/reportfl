{
  "filepath": "/tmp/Math-27b/src/test/java/org/apache/commons/math3/optimization/general/RandomCirclePointGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomCirclePointGenerator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 95,
      "comment": "\n * Factory for generating a cloud of points that approximate a circle.\n "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " RNG. "
    },
    {
      "type": "field",
      "varNames": [
        "radius"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Radius of the circle. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " x-coordinate of the circle center. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " y-coordinate of the circle center. "
    },
    {
      "type": "field",
      "varNames": [
        "xSigma"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Error on the x-coordinate of the center. "
    },
    {
      "type": "field",
      "varNames": [
        "ySigma"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Error on the y-coordinate of the center. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.RandomCirclePointGenerator.RandomCirclePointGenerator(double, double, double, double, double, long)",
      "begin_line": 52,
      "end_line": 64,
      "comment": "\n     * @param x Abscissa of the circle center.\n     * @param y Ordinate of the circle center.\n     * @param radius Radius of the circle.\n     * @param xSigma Error on the x-coordinate of the circumference points.\n     * @param ySigma Error on the y-coordinate of the circumference points.\n     * @param seed RNG seed.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 60)",
        "(line 59,col 9)-(line 59,col 29)",
        "(line 60,col 9)-(line 60,col 19)",
        "(line 61,col 9)-(line 61,col 19)",
        "(line 62,col 9)-(line 62,col 29)",
        "(line 63,col 9)-(line 63,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.RandomCirclePointGenerator.generate(int)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\n     * Point generator.\n     *\n     * @param n Number of points to create.\n     * @return the cloud of {@code n} points.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 61)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.RandomCirclePointGenerator.create()",
      "begin_line": 85,
      "end_line": 94,
      "comment": "\n     * Create one point.\n     *\n     * @return a point.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 57)",
        "(line 87,col 9)-(line 87,col 57)",
        "(line 88,col 9)-(line 88,col 65)",
        "(line 90,col 9)-(line 90,col 56)",
        "(line 91,col 9)-(line 91,col 56)",
        "(line 93,col 9)-(line 93,col 42)"
      ]
    }
  ]
}
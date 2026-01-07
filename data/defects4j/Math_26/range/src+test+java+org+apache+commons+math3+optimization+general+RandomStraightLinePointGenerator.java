{
  "filepath": "/tmp/Math-26b/src/test/java/org/apache/commons/math3/optimization/general/RandomStraightLinePointGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomStraightLinePointGenerator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 101,
      "comment": "\n * Factory for generating a cloud of points that approximate a straight line.\n "
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
        "slope"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Slope. "
    },
    {
      "type": "field",
      "varNames": [
        "intercept"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Intercept. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Error on the y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Lowest value of the x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Highest value of the x-coordinate. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.RandomStraightLinePointGenerator.RandomStraightLinePointGenerator(double, double, double, double, double, long)",
      "begin_line": 61,
      "end_line": 73,
      "comment": "\n     * The generator will create a cloud of points whose x-coordinates\n     * will be randomly sampled between {@code xLo} and {@code xHi}, and\n     * the correspoding y-coordinates will be computed as\n     * \u003cpre\u003e\u003ccode\u003e\n     *  y \u003d a x + b + N(0, error)\n     * \u003c/code\u003e\u003c/pre\u003e\n     * where {@code N(mean, sigma)} is a Gaussian distribution with the\n     * given mean and standard deviation.\n     *\n     * @param a Slope.\n     * @param b Intercept.\n     * @param error Error on the y-coordinate of the point.\n     * @param xLo Lowest value of the x-coordinate.\n     * @param xHi Highest value of the x-coordinate.\n     * @param seed RNG seed.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 60)",
        "(line 68,col 9)-(line 68,col 18)",
        "(line 69,col 9)-(line 69,col 22)",
        "(line 70,col 9)-(line 70,col 22)",
        "(line 71,col 9)-(line 71,col 17)",
        "(line 72,col 9)-(line 72,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.RandomStraightLinePointGenerator.generate(int)",
      "begin_line": 81,
      "end_line": 87,
      "comment": "\n     * Point generator.\n     *\n     * @param n Number of points to create.\n     * @return the cloud of {@code n} points.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 61)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.RandomStraightLinePointGenerator.create()",
      "begin_line": 94,
      "end_line": 100,
      "comment": "\n     * Create one point.\n     *\n     * @return a point.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 52)",
        "(line 96,col 9)-(line 96,col 52)",
        "(line 97,col 9)-(line 97,col 64)",
        "(line 99,col 9)-(line 99,col 40)"
      ]
    }
  ]
}
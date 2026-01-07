{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/optimization/general/RandomStraightLinePointGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomStraightLinePointGenerator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 98,
      "comment": "\n * Factory for generating a cloud of points that approximate a straight line.\n "
    },
    {
      "type": "field",
      "varNames": [
        "slope"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Slope. "
    },
    {
      "type": "field",
      "varNames": [
        "intercept"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Intercept. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " RNG for the x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "error"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " RNG for the error on the y-coordinate. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.RandomStraightLinePointGenerator.RandomStraightLinePointGenerator(double, double, double, double, double, long)",
      "begin_line": 57,
      "end_line": 70,
      "comment": "\n     * The generator will create a cloud of points whose x-coordinates\n     * will be randomly sampled between {@code xLo} and {@code xHi}, and\n     * the corresponding y-coordinates will be computed as\n     * \u003cpre\u003e\u003ccode\u003e\n     *  y \u003d a x + b + N(0, error)\n     * \u003c/code\u003e\u003c/pre\u003e\n     * where {@code N(mean, sigma)} is a Gaussian distribution with the\n     * given mean and standard deviation.\n     *\n     * @param a Slope.\n     * @param b Intercept.\n     * @param sigma Standard deviation on the y-coordinate of the point.\n     * @param lo Lowest value of the x-coordinate.\n     * @param hi Highest value of the x-coordinate.\n     * @param seed RNG seed.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 57)",
        "(line 64,col 9)-(line 64,col 18)",
        "(line 65,col 9)-(line 65,col 22)",
        "(line 66,col 9)-(line 67,col 93)",
        "(line 68,col 9)-(line 69,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.RandomStraightLinePointGenerator.generate(int)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "\n     * Point generator.\n     *\n     * @param n Number of points to create.\n     * @return the cloud of {@code n} points.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 61)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.RandomStraightLinePointGenerator.create()",
      "begin_line": 91,
      "end_line": 97,
      "comment": "\n     * Create one point.\n     *\n     * @return a point.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 43)",
        "(line 93,col 9)-(line 93,col 59)",
        "(line 94,col 9)-(line 94,col 56)",
        "(line 96,col 9)-(line 96,col 54)"
      ]
    }
  ]
}
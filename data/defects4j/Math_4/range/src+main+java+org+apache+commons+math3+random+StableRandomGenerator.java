{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/StableRandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StableRandomGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.NormalizedRandomGenerator"
      ],
      "begin_line": 35,
      "end_line": 135,
      "comment": "\n * \u003cp\u003eThis class provides a stable normalized random generator. It samples from a stable\n * distribution with location parameter 0 and scale 1.\u003c/p\u003e\n *\n * \u003cp\u003eThe implementation uses the Chambers-Mallows-Stuck method as described in\n * \u003ci\u003eHandbook of computational statistics: concepts and methods\u003c/i\u003e by\n * James E. Gentle, Wolfgang H\u0026auml;rdle, Yuichi Mori.\u003c/p\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Underlying generator. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " stability parameter "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " skewness parameter "
    },
    {
      "type": "field",
      "varNames": [
        "zeta"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " cache of expression value used in generation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.StableRandomGenerator.StableRandomGenerator(org.apache.commons.math3.random.RandomGenerator, double, double)",
      "begin_line": 58,
      "end_line": 83,
      "comment": "\n     * Create a new generator.\n     *\n     * @param generator underlying random generator to use\n     * @param alpha Stability parameter. Must be in range (0, 2]\n     * @param beta Skewness parameter. Must be in range [-1, 1]\n     * @throws NullArgumentException if generator is null\n     * @throws OutOfRangeException if {@code alpha \u003c\u003d 0} or {@code alpha \u003e 2}\n     * or {@code beta \u003c -1} or {@code beta \u003e 1}\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 65,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 75,col 35)",
        "(line 76,col 9)-(line 76,col 27)",
        "(line 77,col 9)-(line 77,col 25)",
        "(line 78,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.StableRandomGenerator.nextNormalizedDouble()",
      "begin_line": 90,
      "end_line": 134,
      "comment": "\n     * Generate a random scalar with zero location and unit scale.\n     *\n     * @return a random scalar with zero location and unit scale\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 61)",
        "(line 93,col 9)-(line 93,col 66)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 17)",
        "(line 103,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 17)"
      ]
    }
  ]
}
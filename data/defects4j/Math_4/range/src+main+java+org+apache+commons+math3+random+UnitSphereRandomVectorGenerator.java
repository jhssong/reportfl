{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/UnitSphereRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnitSphereRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomVectorGenerator"
      ],
      "begin_line": 30,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rand"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * RNG used for generating the individual components of the vectors.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Space dimension.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.UnitSphereRandomVectorGenerator.UnitSphereRandomVectorGenerator(int, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "\n     * @param dimension Space dimension.\n     * @param rand RNG for the individual components of the vectors.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 35)",
        "(line 48,col 9)-(line 48,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.UnitSphereRandomVectorGenerator.UnitSphereRandomVectorGenerator(int)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Create an object that will use a default RNG ({@link MersenneTwister}),\n     * in order to generate the individual components.\n     *\n     * @param dimension Space dimension.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.UnitSphereRandomVectorGenerator.nextVector()",
      "begin_line": 61,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 49)",
        "(line 67,col 9)-(line 67,col 26)",
        "(line 68,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 74,col 51)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 17)"
      ]
    }
  ]
}
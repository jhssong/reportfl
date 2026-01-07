{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/random/UnitSphereRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnitSphereRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomVectorGenerator"
      ],
      "begin_line": 27,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rand"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * RNG used for generating the individual components of the vectors.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Space dimension.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UnitSphereRandomVectorGenerator.UnitSphereRandomVectorGenerator(int, org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 42,
      "end_line": 46,
      "comment": "\n     * @param dimension Space dimension.\n     * @param rand RNG for the individual components of the vectors.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 35)",
        "(line 45,col 9)-(line 45,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UnitSphereRandomVectorGenerator.UnitSphereRandomVectorGenerator(int)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Create an object that will use a default RNG ({@link MersenneTwister}),\n     * in order to generate the individual components.\n     *\n     * @param dimension Space dimension.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.UnitSphereRandomVectorGenerator.nextVector()",
      "begin_line": 58,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 49)",
        "(line 62,col 9)-(line 62,col 22)",
        "(line 63,col 9)-(line 70,col 29)",
        "(line 72,col 9)-(line 72,col 47)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 17)"
      ]
    }
  ]
}
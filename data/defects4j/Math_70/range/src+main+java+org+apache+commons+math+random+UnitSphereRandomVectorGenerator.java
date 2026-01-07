{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/random/UnitSphereRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnitSphereRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomVectorGenerator"
      ],
      "begin_line": 28,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rand"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * RNG used for generating the individual components of the vectors.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Space dimension.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UnitSphereRandomVectorGenerator.UnitSphereRandomVectorGenerator(int, org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 43,
      "end_line": 47,
      "comment": "\n     * @param dimension Space dimension.\n     * @param rand RNG for the individual components of the vectors.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 35)",
        "(line 46,col 9)-(line 46,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UnitSphereRandomVectorGenerator.UnitSphereRandomVectorGenerator(int)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Create an object that will use a default RNG ({@link MersenneTwister}),\n     * in order to generate the individual components.\n     *\n     * @param dimension Space dimension.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.UnitSphereRandomVectorGenerator.nextVector()",
      "begin_line": 59,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 49)",
        "(line 63,col 9)-(line 63,col 22)",
        "(line 64,col 9)-(line 71,col 29)",
        "(line 73,col 9)-(line 73,col 47)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 17)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/random/UniformRandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformRandomGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.NormalizedRandomGenerator"
      ],
      "begin_line": 30,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UniformRandomGenerator.UniformRandomGenerator(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 35,
      "end_line": 37,
      "comment": " Create a new generator.\n     * @param generator underlying random generator to use\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.UniformRandomGenerator.nextNormalizedDouble()",
      "begin_line": 44,
      "end_line": 46,
      "comment": " Generate a random scalar with null mean and unit standard deviation.\n     * \u003cp\u003eThe number generated is uniformly distributed between -\u0026sqrt;(3)\n     * and +\u0026sqrt;(3).\u003c/p\u003e\n     * @return a random scalar with null mean and unit standard deviation\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 58)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Underlying generator. "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT3"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    }
  ]
}
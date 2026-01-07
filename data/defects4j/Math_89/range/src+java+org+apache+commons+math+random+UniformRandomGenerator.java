{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/random/UniformRandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformRandomGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.NormalizedRandomGenerator"
      ],
      "begin_line": 32,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UniformRandomGenerator.UniformRandomGenerator(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 40,
      "end_line": 42,
      "comment": " Create a new generator.\n     * @param generator underlying random generator to use\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.UniformRandomGenerator.nextNormalizedDouble()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Generate a random scalar with null mean and unit standard deviation.\n     * \u003cp\u003eThe number generated is uniformly distributed between -\u0026sqrt;(3)\n     * and +\u0026sqrt;(3).\u003c/p\u003e\n     * @return a random scalar with null mean and unit standard deviation\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 58)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Underlying generator. "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT3"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Square root of three. "
    }
  ]
}
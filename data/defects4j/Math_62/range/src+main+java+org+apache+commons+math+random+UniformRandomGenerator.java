{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/random/UniformRandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformRandomGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.NormalizedRandomGenerator"
      ],
      "begin_line": 34,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT3"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Square root of three. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Underlying generator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UniformRandomGenerator.UniformRandomGenerator(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 48,
      "end_line": 50,
      "comment": " Create a new generator.\n     * @param generator underlying random generator to use\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.UniformRandomGenerator.nextNormalizedDouble()",
      "begin_line": 57,
      "end_line": 59,
      "comment": " Generate a random scalar with null mean and unit standard deviation.\n     * \u003cp\u003eThe number generated is uniformly distributed between -\u0026sqrt;(3)\n     * and +\u0026sqrt;(3).\u003c/p\u003e\n     * @return a random scalar with null mean and unit standard deviation\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 58)"
      ]
    }
  ]
}